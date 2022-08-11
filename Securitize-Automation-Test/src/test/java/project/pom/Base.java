package project.pom;

import baseUrl.url;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Base {
    private WebDriver driver;

    public Base(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver chromeDriverConections(){
        System.setProperty("webdriver.chrome.driver", "src/test/java/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;

    }

    public WebElement findElement(By locator){
    return driver.findElement(locator);
    }

    public List <WebElement> findElements(By locator){
        return driver.findElements(locator);
    }

    public String getText(WebElement element){
        return element.getText();
    }

    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public Boolean isDisplayed(By locator){
      try{
            return driver.findElement(locator).isDisplayed();

      }
      catch (org.openqa.selenium.NoSuchElementException e){
            return false;
      }
    }

    public Boolean isDisplayed(WebElement element){
        try{
            return element.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    public void visit(String url){
        driver.get(url);
    }

    public void clearAndWriteToElement(String inputText, By locator){
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(inputText);
    }

//    public Boolean isEnabled(By locator){
//        try{
//            return driver.findElement(locator).isEnabled();
//        }catch (org.openqa.selenium.NoSuchElementException e){
//            return false;
//        }
//    }

    public void clear(By locator){
        driver.findElement(locator).clear();
    }

}