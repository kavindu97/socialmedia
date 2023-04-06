package com.example.socialmedia.service.impl;

import com.example.socialmedia.model.FinancialPeriod;
import com.example.socialmedia.repositary.FianacialRepositary;
import com.example.socialmedia.service.Financialservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinacialServiceImpl implements Financialservice {
    @Autowired
    private FianacialRepositary fianacialRepositary;
    @Override
    public FinancialPeriod savePeriod(FinancialPeriod financialPeriod) {
        return fianacialRepositary.save(financialPeriod);
    }

    @Override
    public List<FinancialPeriod> getting() {
        return fianacialRepositary.findAll();
    }
}
