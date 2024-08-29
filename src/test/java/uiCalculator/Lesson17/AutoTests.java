package uiCalculator.Lesson17;
import static DriverManager.Driver.driver;

import Calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import uiCalculator.BaseTest;

public class AutoTests extends BaseTest {
    Calculator cal = new Calculator();

    @Test
    public void additionFunction() {
        WebElement n1 = driver.findElement(By.id("digit_1"));
        WebElement n2 = driver.findElement(By.id("digit_2"));
        WebElement additionButton = driver.findElement(By.id("op_add"));
        WebElement sumButton = driver.findElement(By.id("eq"));
        cal.clickOnElement(n1);
        cal.clickOnElement(additionButton);
        cal.clickOnElement(n2);
        cal.clickOnElement(sumButton);
        
//        String result = "3";
//        Assertions.assertEquals(result,cal.result.getText());
    }
}

