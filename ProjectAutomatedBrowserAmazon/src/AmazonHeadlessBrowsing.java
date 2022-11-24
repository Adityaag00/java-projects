
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AmazonHeadlessBrowsing {
    
    public static void main(String[] args) throws InterruptedException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException {
        System.setProperty("webdriver.gecko.driver", "I:\\Java Libraries\\Selenium Server And WebDriver\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        
        WebDriver driver=new HtmlUnitDriver(true);
        Wait wait=new WebDriverWait(driver, 90);
        Field f=driver.getClass().getDeclaredField("webClient");
        f.setAccessible(true);
        WebClient client=(WebClient)f.get(driver);
        client.getOptions().setCssEnabled(false);
        client.getOptions().setJavaScriptEnabled(true);
        
        driver.get("https://www.amazon.in/Unwanted-issue-1-1-Comics-Pack/dp/B077VRWXRV/ref=sr_1_1_sspa?ie=UTF8&qid=1518853137&sr=8-1-spons&keywords=comic&psc=1");
//        Select sel=new Select(driver.findElement(By.xpath("//*[@id=\"native_dropdown_selected_size_name\"]")));
//        sel.selectByValue("0,B01N6Q7D8I");
//        Thread.sleep(9000);
        driver.findElement(By.id("buy-now-button")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ap_email")));
        System.out.println("BuyNow");
        
        driver.findElement(By.id("ap_email")).sendKeys("adityaagrawal399@gmail.com");
        driver.findElement(By.id("continue")).click();
        System.out.println("UserId");
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ap_password")));
        
        driver.findElement(By.id("ap_password")).sendKeys("SKNKPC");
        System.out.println("Password");
        driver.findElement(By.id("signInSubmit")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("paymentMethod")));
        
        driver.findElement(By.name("paymentMethod")).click();
        driver.findElement(By.id("continue-top")).click();
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"signInSubmit\"]")));
    }
}
