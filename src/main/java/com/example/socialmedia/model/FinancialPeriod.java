package com.example.socialmedia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class FinancialPeriod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
    private String name;
    private String year;
    private  String openDate;
    private String closeDate;
    private String status;

}
