package com.github.krystiankowalik.jooqexample.db;

import com.github.krystiankowalik.jooqexample.domain.tables.Comments;
import com.github.krystiankowalik.jooqexample.model.Comment;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import static com.github.krystiankowalik.jooqexample.domain.Tables.COMMENTS;

@Repository
public class TestDbDAO {

    @Autowired
    private DSLContext dsl;

    public List<Comment> getComments() {
        List<Comment> comments = new ArrayList<>();
        dsl.select().from(COMMENTS).fetch().forEach(record -> {
                    comments.add(getCommentEntity(record));
                }
        );
        return comments;

    }

    private Comment getCommentEntity(Record r) {
        Integer id = r.getValue(Comments.COMMENTS.ID, Integer.class);
        Integer postId = r.getValue(Comments.COMMENTS.POST_ID, Integer.class);
        String name = r.getValue(Comments.COMMENTS.NAME, String.class);
        String email = r.getValue(Comments.COMMENTS.EMAIL, String.class);
        String content = r.getValue(Comments.COMMENTS.CONTENT, String.class);
        Timestamp createdOn = r.getValue(Comments.COMMENTS.CREATED_ON, Timestamp.class);
        return new Comment(id, postId, name, email, content, createdOn);
    }

}
