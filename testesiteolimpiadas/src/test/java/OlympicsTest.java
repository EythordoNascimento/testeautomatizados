import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OlympicsTest {

    private WebDriver driver;

    @BeforeEach
    public void setup(){
     //configure driver
     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://www.olympics.com/pt");
     driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

    @Test
    public void test(){
        // test
        WebElement menuJogos = driver.findElement(By.linkText("Jogos Olímpicos"));
        menuJogos.click();

        driver.findElement(By.cssSelector("form#login-form input.input-field"));


        WebElement baseElement = driver.findElement(By.cssSelector("form#login-form"));
        baseElement.findElement(By.cssSelector("input.input-field"));

        // selenium
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }

}
