package com.solfwaredesign.projectedu.models;

import java.util.List;
import java.util.Optional;

public class LoginValid {
    private String name;
    private String password;

    private boolean status;

    public LoginValid(String name, String password) {
        this.status = false;
        this.name = name;
        this.password = password;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void login(List<User> users){
        for(User user:users){
            if(user.getName().equals(this.name)){
                if(user.getPassword().equals(this.password)) {
                    this.status = true;
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "LoginValid[" +
                "status=" + status +
                ']';
    }
}
