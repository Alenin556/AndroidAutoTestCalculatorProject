package Calculator;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static DriverManager.Driver.driver;
import static com.codeborne.selenide.Selenide.$;


public class Calculator {


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
//    public WebElement result = driver.findElement(By.id("result_final"));

    public void clickOnElement(WebElement element){
     element.isDisplayed();
     element.click();
    }
}
