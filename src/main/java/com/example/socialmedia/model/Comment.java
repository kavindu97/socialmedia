package com.example.socialmedia.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @CreationTimestamp
    private Instant createdAt;
    private String text;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId",referencedColumnName = "id")
    private  User user;
}
