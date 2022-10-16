package com.solfwaredesign.projectedu.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
public class User {

    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";
    @Id
    private long id;
    private String name;
    private String password;
    private String email;

    public User(String name, String password, String email) {
        super();
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public long getID() {
        return id;
    }

    public void setID(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return String.format(
                "User[id=%s, name='%s', email='%s']", id, name, email);
    }
}
