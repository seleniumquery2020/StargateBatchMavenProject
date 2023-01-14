package com.TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
      (
        features="src\\test\\resources\\Features\\LoginPage.feature",
        glue="com.StepDefination",
        dryRun=true,
        monochrome=true,
       // plugin={"pretty"},
        tags = {"@Smoke"}
		)

public class Runner {

}
