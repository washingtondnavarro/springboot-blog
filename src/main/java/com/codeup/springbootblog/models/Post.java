package com.codeup.springbootblog.models;
//git push production master


import javax.persistence.*;

// properties
@Entity
// we have to create a primary key


@Table(name = "posts")

public class Post {
//    automatic increment
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private  String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String body;

//    @OneToOne(cascade = CascadeType.ALL)
//    private User user;
    @ManyToOne
    private User user;
//
    public Post(String title, String body, User user) {
        this.title = title;
        this.body = body;
        this.user = user;
    }


    public Post() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
