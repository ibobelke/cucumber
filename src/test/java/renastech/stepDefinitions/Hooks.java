package renastech.stepDefinitions;

import org.junit.Before;
import renastech.utils.BrowserUtils;

import java.util.concurrent.TimeUnit;

public class Hooks extends BrowserUtils {

    @Before
    public void setup(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/Default.aspx");
//        Driver.getDriver();
//        Driver.getDriver().manage().window().maximize();
//        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/Default.aspx");

    }


}
