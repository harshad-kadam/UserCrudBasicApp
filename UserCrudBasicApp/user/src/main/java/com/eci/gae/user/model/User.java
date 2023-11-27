package com.eci.gae.user.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data//no need to write getters and setters
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;

    // getters, setters, constructors, etc.
}
