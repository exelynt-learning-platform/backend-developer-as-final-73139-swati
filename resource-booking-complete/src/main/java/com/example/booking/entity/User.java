
package com.example.booking.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity @Data
public class User {
 @Id @GeneratedValue
 private Long id;
 private String username;
 private String password;
 private String role;
}
