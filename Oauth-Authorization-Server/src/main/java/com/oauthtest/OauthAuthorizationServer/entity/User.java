package com.oauthtest.OauthAuthorizationServer.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "USER_DETAILS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    @Column(length = 60)
    private String password;

    private String role;
    private boolean enabled = false;
}
