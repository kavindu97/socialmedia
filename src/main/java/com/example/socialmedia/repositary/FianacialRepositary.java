package com.example.socialmedia.repositary;

import com.example.socialmedia.model.FinancialPeriod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FianacialRepositary extends JpaRepository<FinancialPeriod,Integer> {
}
