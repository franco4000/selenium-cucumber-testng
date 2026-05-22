package steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class primerTest {

    private void pause(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void clickEnElementsYTextBox() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {

            driver.manage().window().maximize();
            driver.get("https://demoqa.com");

            pause(2000);

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            JavascriptExecutor js = (JavascriptExecutor) driver;

            // CLICK EN ELEMENTS (FIX REAL)
            WebElement elementsCard = wait.until(
                    ExpectedConditions.presenceOfElementLocated(
                            By.xpath("//h5[text()='Elements']")
                    )
            );

            js.executeScript("arguments[0].scrollIntoView(true);", elementsCard);
            pause(1000);
            js.executeScript("arguments[0].click();", elementsCard);

            pause(2000);

            // CLICK EN TEXT BOX
            WebElement textBox = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//span[text()='Text Box']")
                    )
            );

            js.executeScript("arguments[0].click();", textBox);

            pause(2000);

            // FORMULARIO
            WebElement fullName = driver.findElement(By.id("userName"));
            fullName.sendKeys("Franco QA");

            pause(500);

            WebElement email = driver.findElement(By.id("userEmail"));
            email.sendKeys("franco@test.com");

            pause(500);

            WebElement address = driver.findElement(By.id("currentAddress"));
            address.sendKeys("Argentina - Automation Testing");

            pause(1000);

            WebElement submit = driver.findElement(By.id("submit"));
            js.executeScript("arguments[0].click();", submit);

            System.out.println("Formulario completado OK");

            pause(3000);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            driver.quit();
        }
    }

    @CucumberOptions(
            features = "src/test/resources/features",
            glue = "steps",
            plugin = {
                    "pretty",
                    "html:target/cucumber-report.html"
            },
            monochrome = true
    )
    public static class TestRunner extends AbstractTestNGCucumberTests {
    }
}