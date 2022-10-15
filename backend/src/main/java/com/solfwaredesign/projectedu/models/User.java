package com.solfwaredesign.projectedu.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("user")
public class User {

    @Id
    private String id;
    private String userID;
    private String name;
    private String email;

    public User(String id, String userID, String name, String email) {
        super();
        this.id = id;
        this.userID = userID;
        this.name = name;
        this.email = email;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    @Override
//    public String toString(){
//        return String.format(
//                "User[userID=%s, name='%s', email='%s']", userID, name, email);
//    }
}
