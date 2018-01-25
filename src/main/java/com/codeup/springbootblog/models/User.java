package com.codeup.springbootblog.models;

import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.persistence.*;
import java.util.List;

@Entity

@Table(name = "users")


//this is the Model and the model contain properties

public class User {

    @javax.persistence.Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String lastName;

    //    @Column(unique = true, nullable = false)
//    @Column(nullable = false, unique = true)
//    private String userName;
//
//    @Column(nullable = false, unique = true)
//    private String eMail;
//
//    @Column(nullable = false)
//    private String passWord;
//
//    @Column(nullable = false)
//    private String industry;
////        this will be a list
//
//    @Column(nullable = false)
//    private String speciality;
////        this will have a list
//
//    @Column(nullable = false)
//    private String interest;
////        this will be a list
//
//    @Column(nullable = false, columnDefinition = "TEXT")
//    private String bio;
////         this will be text

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    protected List<Post> posts;

    public User(long id, String name, String lastName/*, String userName, String eMail, String passWord, String speciality, String interest, String bio, String industry, String speciality1, List<Post> posts*/) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
//        this.userName = userName;
//        this.eMail = eMail;
//        this.passWord = passWord;
//        this.speciality = speciality;
//        this.interest = interest;
//        this.bio = bio;
//        this.industry = industry;
//        this.posts = posts;
    }

    public User() {

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String geteMail() {
//        return eMail;
//    }
//
//    public void seteMail(String eMail) {
//        this.eMail = eMail;
//    }
//
//    public String getPassWord() {
//        return passWord;
//    }
//
//    public void setPassWord(String passWord) {
//        this.passWord = passWord;
//    }
//
//    public String getSpeciality() {
//        return speciality;
//    }
//
//    public void setSpeciality(String speciality) {
//        this.speciality = speciality;
//    }
//
//    public String getInterest() {
//        return interest;
//    }
//
//    public void setInterest(String interest) {
//        this.interest = interest;
//    }
//
//    public String getBio() {
//        return bio;
//    }
//
//    public void setBio(String bio) {
//        this.bio = bio;
//    }
//
//    public String getIndustry() {
//        return industry;
//    }
//
//    public void setIndustry(String industry) {
//        this.industry = industry;
//    }

//    public List<Post> getPosts() {
//        return posts;
//    }
//
//    public void setPosts(List<Post> posts) {
//        this.posts = posts;
//    }
}
