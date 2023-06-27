package com.example.lmservice.benefit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.CommandLinePropertySource;

import java.util.List;

@Configuration
public class BenefitCofig {
    @Bean
    CommandLineRunner commandLineRunner(BenefitRepository benefitRepository){
        return args ->{
                Benefit ceFunding= new Benefit(
                    1L,
                    "Clean Energy Funding",
                    "Washington State has implemented a Clean Fuel Standard that aims to reduce the carbon intensity of transportation fuels. The program provides incentives for adopting low-carbon and renewable fuel options, which can benefit trucking companies seeking to reduce their carbon emissions and operational costs.",
                    "https://www.commerce.wa.gov/growing-the-economy/energy/clean-energy-fund/",
                    "https://www.commerce.wa.gov/wp-content/uploads/2019/02/GHG-Globe-776x310.jpeg"
            );
                Benefit egLoand = new Benefit(
                    2L,
                    "Ecology Grants and Loans",
                    "The Department of Ecology offers various grants and loans to support projects related to environmental protection and sustainability. Trucking companies can explore funding options to invest in technologies or practices that reduce emissions, improve fuel efficiency, or enhance environmental sustianability",
                    "https://ecology.wa.gov/About-us/Payments-contracts-grants/Grants-loans",
                    "https://swefcsrfswitchboard.unm.edu/srf/wp-content/uploads/2020/05/washington-dept-of-ecology-logo.jpg"
            );
                Benefit wsdotFunting = new Benefit(
                        3L,
                        "WSDOT Freight Funding",
                        "WSDOT administers several funding programs that support freight mobility and infrastructure improvements. For example, the Freight Rail Assistance Program provides grants for rail projects, while the Freight Mobility Strategic Investment Board offers funding for infrastructure projects that enhance freight movement.",
                        "https://wsdot.wa.gov/construction-planning/statewide-plans/freight-plans/national-highway-freight-program",
                        "https://www.naco.org/sites/default/files/styles/hero_1_up/public/GettyImages-1198307085_0.jpg?itok=dKLBewyU"
                );
                Benefit apprenticeshipProgram = new Benefit(
                        4L,
                        "WA Apprenticeship Program",
                        "The Apprenticeship Program in Washington provides support for employers to develop registered apprenticeship programs. Trucking companies can leverage this program to enhance their workforce by providing structured training and career advancement opportunities for truck drivers.",
                        "https://www.lni.wa.gov/licensing-permits/apprenticeship/become-an-apprentice",
                        "https://www.crowder.edu/wp-content/uploads/2022/11/Apprenticeship-Landing-Page-Banner-Header.jpg"
                );

                Benefit rdFunding = new Benefit(
                        5L,
                        "WA R&D Funding",
                        "The Clean Energy Fund provides grants and loans to support R&D projects focused on clean energy technologies. This includes research and development in the transportation sector, such as advanced vehicle technologies, alternative fuels, and sustainable transportation solutions.",
                        "https://www.commerce.wa.gov/growing-the-economy/energy/clean-energy-fund/energy-rdd-clean-energy-fund/",
                        "https://highways.dot.gov/sites/fhwa.dot.gov/files/images/STOL/20-008_HRDO_webpage_23aug21%20copy.jpg"
                );
                benefitRepository.saveAll(
                    List.of(ceFunding,egLoand,wsdotFunting, apprenticeshipProgram,rdFunding)
                );
            };
        }
}
