
package com.githubtest.demo.Modul;

import jakarta.persistence.*;

@Entity
@Table(name = "kullanici")

public class UserTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="name" )
    private String name;
    @Column(name="LastName")
    private String lastname;
    @Column(name="UserName")
    private String username;
    @Column(name ="email")
    private String email;
    @Column(name="pass")
    private String pass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
