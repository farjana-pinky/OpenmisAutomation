import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class broken_link {
    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spaceappschallenge.org/");
        driver.manage().window().maximize();


      List<WebElement> links= driver.findElements(By.tagName("a"));

      for(WebElement link:links) {

         String url = link.getAttribute("href");

          System.out.println("--------------------------------------------");
          System.out.println(url);
         if(url== null || url.isEmpty())
         {
             System.out.println("this link is empty");
             continue;


         }

         try {
             HttpURLConnection check = (HttpURLConnection)(new URL(url).openConnection());
              check.connect();

              if(check.getResponseCode()>=400)
              {

                  System.out.println(url+"this is broken url");
              } else {
                  System.out.println(url+"this is not broken url");

              }

         }

         catch (MalformedURLException e) {
             throw new RuntimeException(e);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }


      }  driver.quit();

    }

}
