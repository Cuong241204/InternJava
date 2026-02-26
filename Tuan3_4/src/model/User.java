package model;

import java.util.Objects;

public class User {
    private int id;
    private String username;
    private String password;
    private int age;
    public User(int id, String userName, String passWord, int age){
        this.id = id;
        this.username = userName;
        this.password = passWord;
        this.age = age;
    }
    public int getId(){
        return id;
    }
    public String getUserName(){
        return username;
    }
    public String getPassWord(){
        return password;
    }
    public int getAge(){
        return age;
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o==null || getClass() != o.getClass()) return false;
        User us = (User) o;
        return id == us.id;
    }
    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
    @Override
    public String toString(){
        return id + " - " + username + " - " + password + " - " + age;
    }

}
