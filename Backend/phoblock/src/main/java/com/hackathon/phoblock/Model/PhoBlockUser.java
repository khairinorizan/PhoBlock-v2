package com.hackathon.phoblock.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "User_PhoBlock")
public class PhoBlockUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(nullable = false)
    String firstName;
    @Column(nullable = false)
    String lastName;
    @Column(nullable = false)
    String emailAddress;
    @Column(nullable = false)
    String userName;
    @Column(nullable = false)
    String userPassword;
    @Column(nullable = false)
    String userBio;
    @Column(nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    Date dateCreated;
//    @ManyToOne
//    @JoinColumn(name = "account_id")
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    PhoBlockUser accountOwner;
//    @OneToMany(mappedBy = "accountOwner")
//    Set<PhoBlockUser> followers;
//    @OneToMany(mappedBy = "accountOwner")
//    Set<PhoBlockUser> following;
    @OneToMany(mappedBy = "postOwner")
    Set<Post> userPost;

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserBio() {
        return userBio;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

//    public PhoBlockUser getAccountOwner() {
//        return accountOwner;
//    }
//
//    public Set<PhoBlockUser> getFollowers() {
//        return followers;
//    }
//
//    public Set<PhoBlockUser> getFollowing() {
//        return following;
//    }

    public Set<Post> getUserPost() {
        return userPost;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserBio(String userBio) {
        this.userBio = userBio;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

//    public void setAccountOwner(PhoBlockUser accountOwner) {
//        this.accountOwner = accountOwner;
//    }
//
//    public void setFollowers(Set<PhoBlockUser> followers) {
//        this.followers = followers;
//    }
//
//    public void addFollowers(PhoBlockUser user){
//        this.followers.add(user);
//    }
//
//    public void setFollowing(Set<PhoBlockUser> following) {
//        this.following = following;
//    }
//
//    public void addFollowing(PhoBlockUser user){
//        this.following.add(user);
//    }

    public void setUserPost(Set<Post> userPost) {
        this.userPost = userPost;
    }

    public void addUserPost(Post post){
        this.userPost.add(post);
    }

    @Override
    public String toString() {
        return "PhoBlockUser{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userBio='" + userBio + '\'' +
                ", dateCreated=" + dateCreated +
                ", userPost=" + userPost +
                '}';
    }
}
