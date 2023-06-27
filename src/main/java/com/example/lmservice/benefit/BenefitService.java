package com.example.lmservice.benefit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BenefitService {
    private final BenefitRepository benefitRepository;
    @Autowired
    public BenefitService(BenefitRepository benefitRepository) {
        this.benefitRepository = benefitRepository;
    }

    public List<Benefit> getBenefits(){
        return benefitRepository.findAll();
    }
}
