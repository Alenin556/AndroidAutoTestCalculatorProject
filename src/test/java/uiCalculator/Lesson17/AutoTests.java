package uiCalculator.Lesson17;
import static DriverManager.Driver.driver;
import static com.codeborne.selenide.Selenide.$;

import Calculator.Calculator;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import uiCalculator.BaseTest;

public class AutoTests extends BaseTest {
    Calculator cal = new Calculator();

    public WebElement n1 = driver.findElement(By.id("digit_1"));
    public WebElement n2 = driver.findElement(By.id("digit_2"));
    public WebElement n3 = driver.findElement(By.id("digit_3"));
    public WebElement n4 = driver.findElement(By.id("digit_4"));
    public WebElement n5 = driver.findElement(By.id("digit_5"));
    public WebElement n6 = driver.findElement(By.id("digit_6"));
    public WebElement n7 = driver.findElement(By.id("digit_7"));
    public WebElement n8 = driver.findElement(By.id("digit_8"));
    public WebElement n9 = driver.findElement(By.id("digit_9"));
    public WebElement n0 = driver.findElement(By.id("digit_0"));
    public WebElement divisionButton = driver.findElement(By.id("op_div"));
    public WebElement multiplicationButton = driver.findElement(By.id("op_mul"));
    public WebElement subtractionButton = driver.findElement(By.id("op_sub"));
    public WebElement additionButton = driver.findElement(By.id("op_add"));
    public WebElement sumButton = driver.findElement(By.id("eq"));
    public WebElement resultValue = driver.findElement(By.id(("result_preview")));
    public WebElement clearButton = driver.findElement(By.id(("clr")));

    @AfterEach
    public void clean(){
        cal.clickOnElement(clearButton);
    }

    @Test
    public void divisionFunction() {
        cal.clickOnElement(n6);
        cal.clickOnElement(divisionButton);
        cal.clickOnElement(n2);
        String result = "3";
        Assertions.assertEquals(result,resultValue.getText());
    }

    @Test
    public void multiplicationFunction() {
        cal.clickOnElement(n2);
        cal.clickOnElement(multiplicationButton);
        cal.clickOnElement(n2);
        String result = "4";
        Assertions.assertEquals(result,resultValue.getText());
    }

    @Test
    public void subtractionFunction() {
        cal.clickOnElement(n1);
        cal.clickOnElement(n0);
        cal.clickOnElement(subtractionButton);
        cal.clickOnElement(n9);
        String result = "1";
        Assertions.assertEquals(result,resultValue.getText());
    }

    @Test
    public void additionFunction() {
        cal.clickOnElement(n5);
        cal.clickOnElement(additionButton);
        cal.clickOnElement(n5);
        String result = "10";
        Assertions.assertEquals(result,resultValue.getText());
    }
}

