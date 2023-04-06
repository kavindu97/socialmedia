package com.example.socialmedia.controller;

import com.example.socialmedia.model.FinancialPeriod;
import com.example.socialmedia.service.Financialservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/financial")
public class FinancialController {
    @Autowired
    private Financialservice financialservice;

    @PostMapping("/save")
    public String save(@RequestBody FinancialPeriod financialPeriod) {
        financialservice.savePeriod(financialPeriod);
        return "Saved";
    }

    @GetMapping("/show")
    public List<FinancialPeriod> getall() {
        return financialservice.getting();
    }
}
