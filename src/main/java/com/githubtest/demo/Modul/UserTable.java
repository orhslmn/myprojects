
package com.githubtest.demo.Modul;

import jakarta.persistence.*;

@Entity
@Table(name = "kullanici")

public class UserTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="UserAd" )
    private String UserAd;
    @Column(name = "UserPass")
    private String UserPass;

    public String getUserAd() {
        return UserAd;
    }

    public void setUserAd(String userAd) {
        UserAd = userAd;
    }

    public String getUserPass() {
        return UserPass;
    }

    public void setUserPass(String userPass) {
        UserPass = userPass;
    }
}
