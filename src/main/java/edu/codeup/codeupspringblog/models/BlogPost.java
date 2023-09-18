package edu.codeup.codeupspringblog.models;

import jakarta.persistence.*;


@Entity
@Table(name = "blog_posts")
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String title;
    @Column(columnDefinition = "TEXT")
    private String body;

    public BlogPost(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public BlogPost() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}