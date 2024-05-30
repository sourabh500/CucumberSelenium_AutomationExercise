package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features =".//Features/Register_Account.feature",
                    glue = "StepDefinations",
                    dryRun = true,
                    monochrome = true,
                    plugin = {"pretty"}
)

public class LoadRunner {

}
