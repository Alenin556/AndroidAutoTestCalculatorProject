package uiCalculator;

import static DriverManager.Driver.driver;
import static DriverManager.Driver.driverSetUp;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    @BeforeAll
    public static void initialize() throws Exception {
    driverSetUp();
    }

    @AfterAll
    public static void teardown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

}
