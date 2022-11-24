
package projectautomatedbrowsingtest;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import java.lang.reflect.Field;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProjectAutomatedBrowsingTest {

    
    public static void main(String[] args) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.setProperty("webdriver.chrome.driver", "I:\\Java Libraries\\Selenium Server And WebDriver\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        Wait wait=new WebDriverWait(driver, 90);
//        Field f=driver.getClass().getDeclaredField("webClient");
//        f.setAccessible(true);
//        WebClient client=(WebClient)f.get(driver);
//        client.getOptions().setCssEnabled(false);
//        client.getOptions().setJavaScriptEnabled(false);
        
        driver.get("https://www.flipkart.com/ultimate-nutrition-iso-sensation-93-whey-protein/p/itmewux2qrwvsztp?pid=PSLEWUX2CKGJ2FBJ&lid=LSTPSLEWUX2CKGJ2FBJIEI10I&marketplace=FLIPKART&srno=b_1_1&otracker=hp_omu_Deals%20of%20the%20Day_1_Min%2020%25%2B5%25%20Off_YJQPY11WKA_0&fm=neo/merchandising&iid=934c5407-3621-47f6-b4cc-a11ca52bbfa4.PSLEWUX2CKGJ2FBJ.SEARCH&ppt=Store%20Browse&ppn=Search%20Page&ssid=ox3d0cnfauuk3z0g1518848223722");
        
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button")).click();
        System.out.println("BuyNow");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input")));
        
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input")).sendKeys("adityaagrawal399@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[3]/button")).click();
        System.out.println("UserId");
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[2]/input")));
        
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[2]/input")).sendKeys("SKNKPC");
        System.out.println("Password");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[3]/button")));
        
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[3]/button")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[1]/div[2]/div/div/div/div[1]/label[1]/div[2]/div/div[1]/button")));
        System.out.println("Logged");
        
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[1]/div[2]/div/div/div/div[1]/label[1]/div[2]/div/div[1]/button")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[1]/div[3]/div/div/div/div/div[2]/span[2]/button")));
        System.out.println("Address Selected");
        
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[1]/div[3]/div/div/div/div/div[2]/span[2]/button")).click();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Continue Clicked");
    }
    
}
