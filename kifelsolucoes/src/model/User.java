package model;

import java.util.ArrayList;
import java.util.List;

public abstract class User {
    private int id;
    private String name;
    private static int count;
    private static int idCount;

    private static List<User> users = new ArrayList<>();

    
    public User() {
    }
    
    public User(String name) {
        idCount++;
        this.id = idCount;
        this.name = name;
        count++;
        users.add(this);
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + "]";
    }
    
    public static int getCount() {
        return count;
    }
    
    public static List<User> getUsers() {
        return users;
    }
}
