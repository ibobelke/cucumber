package renastech.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




   @RunWith(Cucumber.class)
    @CucumberOptions(

           features = "src/test/resources",
                   glue = "renastech/stepDefinitions",
                   dryRun= false,
                    tags = "@TC_11"

    )
   public class CucumberRunner {


}
  //Feature file
// runner class
//step definition
//utils pack (Browserutils,Driver)
// pom .xlm star whit this one