package com.VLS.login.entity;


import javax.persistence.*;

@Entity
@Table(name="LoginData")
public class LoginEntity {
    @Id
    private Long id;
    @Column(name="password",nullable = false)
    private String password;

    public LoginEntity() {
    }

    public LoginEntity( String password) {


        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
