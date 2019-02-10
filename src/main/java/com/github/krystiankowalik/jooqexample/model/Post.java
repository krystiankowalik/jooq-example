package com.github.krystiankowalik.jooqexample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post
{
    private Integer id;
    private String title;
    private String content;
    private Timestamp createdOn;
    private List<Comment> comments = new ArrayList<>();

    public void addComment(Comment comment){
        comments.add(comment);
    }

    public Post(Integer id, String title, String content, Timestamp createdOn) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createdOn = createdOn;
    }
}