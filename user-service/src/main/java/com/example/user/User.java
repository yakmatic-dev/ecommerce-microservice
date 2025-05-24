package com.example.user;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data  // Lombok - generates getters/setters automatically
public class User {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, unique = true)
    private String email;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String password;
}
