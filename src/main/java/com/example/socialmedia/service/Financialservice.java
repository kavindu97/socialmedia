package com.example.socialmedia.service;

import com.example.socialmedia.model.FinancialPeriod;

import java.util.List;

public interface Financialservice {
    public FinancialPeriod savePeriod(FinancialPeriod financialPeriod);
    public List<FinancialPeriod> getting();
}
