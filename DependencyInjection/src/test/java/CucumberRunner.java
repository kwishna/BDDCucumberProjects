import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class )
@CucumberOptions(
        features = "src\\test\\java\\features",
        glue = {"steps", "utils"},
        tags = "@smoke",
        monochrome=true
        )
public class CucumberRunner {
	
}
