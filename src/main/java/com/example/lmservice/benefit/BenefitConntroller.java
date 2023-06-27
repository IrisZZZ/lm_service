package com.example.lmservice.benefit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/benefit")
public class BenefitConntroller {
    private final BenefitService benefitService;

    @Autowired
    public BenefitConntroller(BenefitService benefitService) {
        this.benefitService = benefitService;
    }

    @GetMapping
    public List<Benefit> getBenefits(){
        return benefitService.getBenefits();

    }
}
