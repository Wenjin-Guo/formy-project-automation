import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.safari.SafariDriver;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");

        SafariDriver driver = new SafariDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");
        WebElement dropDown = driver.findElement(By.id("dropdownMenuButton"));
        dropDown.click();
        Thread.sleep(2000);
        WebElement fileUpload = driver.findElement(By.xpath("/html/body/div/div/div/a[8]"));
        fileUpload.click();
        Thread.sleep(2000);
        WebElement fileSelect = driver.findElement(By.id("file-upload-field"));
        fileSelect.sendKeys("/Users/wenjinguo/Downloads/chromedriver_mac64 (1).zip");
        Thread.sleep(4000);

        driver.quit();
    }
}
