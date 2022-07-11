import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.safari.SafariDriver;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");

        SafariDriver driver = new SafariDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");
        WebElement dateField = driver.findElement(By.id("datepicker"));
        Thread.sleep(2000);
        dateField.sendKeys("07/07/2022");
        Thread.sleep(2000);
        dateField.sendKeys(Keys.RETURN);


        driver.quit();
    }
}