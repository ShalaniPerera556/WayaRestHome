/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.softwareeng;


public class User{
    
    private String username;
    private String email;
    private String phone;
    private String dob;
    private String password;

    public User(String username, String email, String phone, String dob, String password) {
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
        this.password = password;
    }

    public String getUsername() { 
        return username; 
    }
    public void setUsername(String username) { 
        this.username = username; 
    }

    public String getEmail() { 
        return email; 
    }
    public void setEmail(String email) { 
        this.email = email;
    }

    public String getPhone() { 
        return phone;
    }
    public void setPhone(String phone) { 
        this.phone = phone; 
    }

    public String getDob() {
        return dob; 
    }
    public void setDob(String dob) { 
        this.dob = dob;
    }

    public String getPassword() { 
        return password; 
    }
    public void setPassword(String password) { 
        this.password = password; 
    }
}

    