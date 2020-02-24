package com.util;

public class Customer 
{
    public int id;
    public String username;
    public String password;
    public String name;
    public String contact;

    public Customer(int id, String username, String password, String name, String contact) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.contact = contact;
    }

    public Customer() 
    {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
          
}
