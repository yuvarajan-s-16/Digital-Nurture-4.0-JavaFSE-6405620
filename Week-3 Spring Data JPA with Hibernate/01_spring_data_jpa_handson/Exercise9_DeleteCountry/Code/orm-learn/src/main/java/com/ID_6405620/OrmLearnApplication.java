package com.ID_6405620;

import com.ID_6405620.model.Country;
import com.ID_6405620.service.CountryService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

        CountryService countryService = context.getBean(CountryService.class); // ✅ Get bean from context

        testGetAllCountries(countryService);
    }

    private static void testGetAllCountries(CountryService countryService) {
        LOGGER.info("Start");
        List<Country> countries = countryService.getAllCountries();
        for (Country country : countries) {
            LOGGER.debug("Country: {}", country);
        }
        LOGGER.info("End");
    }
}
