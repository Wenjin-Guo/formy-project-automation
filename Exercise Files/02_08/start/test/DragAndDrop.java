import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.safari.SafariDriver;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "/Users/wenjinguo/Downloads/chromedriver");

        //WebDriver driver = new ChromeDriver();
        SafariOptions options = new SafariOptions();
        SafariDriver driver = new SafariDriver(options);
        driver.get("https://formy-project.herokuapp.com/dragdrop");

        WebElement image = driver.findElement(By.id("image"));
        WebElement box = driver.findElement(By.id("box"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(image,box).build().perform();
        Thread.sleep(2000);

        driver.quit();
    }
}

