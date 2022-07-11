import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");

        SafariDriver driver = new SafariDriver();

        driver.get("https://formy-project.herokuapp.com/form");
        submitForm(driver);

        waitForAlertBanner(driver);
        //getAlertBannerText(driver);
        //String alertText = alert.getText();
        assertEquals("The form was successfully submitted!",getAlertBannerText(driver),getAlertBannerText(driver));

        driver.quit();
    }

    public static void submitForm(WebDriver driver){
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("John");
        //Thread.sleep(2000);

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Doe");
        // Thread.sleep(2000);

        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("Engineer");
        //Thread.sleep(2000);

        driver.findElement(By.id("radio-button-2")).click();
        //Thread.sleep(2000);
        driver.findElement(By.id("checkbox-1")).click();
        //Thread.sleep(2000);
        driver.findElement(By.cssSelector("option[value='1']")).click();

        //Thread.sleep(2000);

        driver.findElement(By.id("datepicker")).sendKeys("01/27/1990");
        //Thread.sleep(2000);
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        ///Thread.sleep(2000);

        driver.findElement(By.cssSelector("a[class = 'btn btn-lg btn-primary']")).click();

    }
    public static void waitForAlertBanner(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 2);
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
    }
    public static String getAlertBannerText(WebDriver driver){
        return driver.findElement(By.className("alert")).getText();
    }
}
