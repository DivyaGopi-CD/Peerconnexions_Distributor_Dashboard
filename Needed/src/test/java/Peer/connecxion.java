package Peer;




import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;





public class connecxion {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//URL
		driver.get("https://ph-uat.peerconnexions.com/");
		
		
		WebElement Login =driver.findElement(By.xpath("//*[@id=\"site-header\"]/div[1]/div/div/div[9]/a"));
        Login.click();
		//driver.get("https://ph-uat.peerconnexions.com/account/login");
		
		//credential for login
		WebElement username=driver.findElement(By.name("email"));
		WebElement password=driver.findElement(By.name("password"));
	
		username.sendKeys("ravindrah+demodistyuser1@openspaceservices.com");
		password.sendKeys("Round@123");
		//Sign in
		WebElement m =driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div/div/div/div[2]/div/form/div[3]/button"));
        JavascriptExecutor j =(JavascriptExecutor) driver;
        j.executeScript("arguments[0].click();",m);
         Thread.sleep(5000);
        //seller zone
        WebElement sellerZone =driver.findElement(By.xpath("//*[@id=\'site-header\']/div[2]/div/div/div[2]/div/nav/div/ul/li[5]/a/span"));
        sellerZone.click();
        WebElement Dashboard =driver.findElement(By.xpath("//*[@id=\'site-header\']/div[2]/div/div/div[2]/div/nav/div/ul/li[5]/div/button[3]/a/span"));
        Dashboard.click();
        Thread.sleep(3000);
        
        //Date
        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[3]/div/div[2]/div/div/span/span/input[2]")).click();
        WebElement startdate =driver.findElement(By.cssSelector("#document-body > div:nth-child(11) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-range-part.ant-calendar-range-left > div.ant-calendar-input-wrap > div > input"));
        startdate.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        startdate.sendKeys(Keys.BACK_SPACE);
        startdate.sendKeys("09-09-2016");
        Thread.sleep(1000);
        WebElement enddate =driver.findElement(By.cssSelector("#document-body > div:nth-child(11) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-range-part.ant-calendar-range-right > div.ant-calendar-input-wrap > div > input"));
        enddate.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        enddate.sendKeys(Keys.BACK_SPACE);
        enddate.sendKeys("07-01-2022"+Keys.ENTER);
        
        Thread.sleep(2000);
        
        
        //Number of org login
        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[3]/div/div[1]/div[2]/div/a/span/u/p")).click();   
        //click date
        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[3]/div/div/div[1]/div/span/span/input[2]")).click();
        WebElement startdatelogin =driver.findElement(By.cssSelector("#document-body > div:nth-child(11) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-range-part.ant-calendar-range-left > div.ant-calendar-input-wrap > div > input"));
        startdatelogin.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        startdatelogin.sendKeys(Keys.BACK_SPACE);
        startdatelogin.sendKeys("15-07-2018");
        Thread.sleep(1000);
        WebElement enddatelogin =driver.findElement(By.cssSelector("#document-body > div:nth-child(11) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-range-part.ant-calendar-range-right > div.ant-calendar-input-wrap > div > input"));
        enddatelogin.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        enddatelogin.sendKeys(Keys.BACK_SPACE);
        enddatelogin.sendKeys("02-14-2022"+Keys.ENTER);
        Thread.sleep(2000);
        //search
        WebElement searchlog =driver.findElement(By.cssSelector("#root > div.site > div > div.block.full-card > div > div > div.col-12.col-lg-10.mt-4.mt-lg-0 > div > div.reseller-table-div.registration-summary-inn.sales-dashboard > div.ant-table-wrapper > div > div > div > div > div > table > thead > tr > th:nth-child(1) > span > div > span.ant-table-column-title > div > span > input"));
        searchlog.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        searchlog.sendKeys(Keys.BACK_SPACE);
        searchlog.sendKeys("NIRAJDIRECTTEST"+Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[4]/div[2]/div/div/div/div/div/table/thead/tr/th[1]/span/div/span[1]/div/span/span/i")).click();
        //searchlog.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        //searchlog.sendKeys(Keys.BACK_SPACE);
        
        //sorting
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[4]/div[2]/div/div/div/div/div/table/thead/tr/th[2]/span/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[4]/div[2]/div/div/div/div/div/table/thead/tr/th[2]/span/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[4]/div[2]/div/div/div/div/div/table/thead/tr/th[2]/span/div")).click();
        Thread.sleep(3000);
        //download excel
        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[3]/div/div/div[2]/a")).click();
        //page navigation
        Thread.sleep(2000);
        ((JavascriptExecutor)driver).executeScript("scroll(0, 400)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[4]/div[2]/div/div/ul/li[6]/a")).click();
        Thread.sleep(4000);
        //goto
        WebElement go =driver.findElement(By.cssSelector("#root > div.site > div > div.block.full-card > div > div > div.col-12.col-lg-10.mt-4.mt-lg-0 > div > div.reseller-table-div.registration-summary-inn.sales-dashboard > div.ant-table-wrapper > div > div > ul > li.ant-pagination-options > div.ant-pagination-options-quick-jumper > input[type=text]"));
        go.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        go.sendKeys(Keys.BACK_SPACE);
        go.sendKeys("3"+Keys.ENTER);
        Thread.sleep(2000);
        ((JavascriptExecutor)driver).executeScript("scroll(400, 0)");
        Thread.sleep(4000);
       //go to site activity
        WebElement siteactivity =driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[1]/div/ul/li[1]/a"));
        siteactivity.click();
        Thread.sleep(2000);
        //Product views
        WebElement ProductViews =driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[3]/div/div[1]/div[3]/div/a"));
        ProductViews.click();
        Thread.sleep(2000);
        ((JavascriptExecutor)driver).executeScript("scroll(0, 400)");
        //No of views sorting
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[4]/div[2]/div/div/div/div/div/div/table/thead/tr[1]/th[4]/span/div/span[1]/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[4]/div[2]/div/div/div/div/div/div/table/thead/tr[1]/th[4]/span/div/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[4]/div[2]/div/div/div/div/div/div/table/thead/tr[1]/th[4]/span/div/span[2]")).click();
        Thread.sleep(3000);
        
        //sales sorting
        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[4]/div[2]/div/div/div/div/div/div/table/thead/tr[2]/th[1]/span/div/span[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[4]/div[2]/div/div/div/div/div/div/table/thead/tr[2]/th[1]/span/div/span[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[4]/div[2]/div/div/div/div/div/div/table/thead/tr[2]/th[1]/span/div")).click();
        Thread.sleep(3000);
        
       
        
        //Eye symbol
        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[4]/div[2]/div/div/div/div/div/div/table/tbody/tr[1]/td[4]/div/i")).click();
        Thread.sleep(2000);
        //download excel
        driver.findElement(By.xpath("//*[@id=\'document-body\']/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/button")).click();
        Thread.sleep(2000);
        
        //org sorting
        driver.findElement(By.xpath("//*[@id=\'document-body\']/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[1]/table/thead/tr/th[2]/span/div/span[1]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\'document-body\']/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[1]/table/thead/tr/th[2]/span/div/span[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\'document-body\']/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[1]/table/thead/tr/th[2]/span/div/span[2]")).click();
        Thread.sleep(3000);
        
        //search org
        WebElement searchorg =driver.findElement(By.cssSelector("#document-body > div:nth-child(11) > div > div.ant-modal-wrap.ant-modal-centered > div > div.ant-modal-content > div.ant-modal-body > div.ant-table-wrapper > div > div > div > div > div.ant-table-body > table > thead > tr > th:nth-child(1) > span > div > span.ant-table-column-title > input"));
        searchorg.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        searchorg.sendKeys(Keys.BACK_SPACE);
        searchorg.sendKeys("Historia Reiss'"+Keys.ENTER);
        Thread.sleep(2000);
        //ok
        driver.findElement(By.xpath("//*[@id=\"document-body\"]/div[2]/div/div[2]/div/div[2]/div[3]/div/button[2]")).click();
        Thread.sleep(2000);	
        //cancel
        //driver.findElement(By.xpath("//*[@id=\"document-body\"]/div[2]/div/div[2]/div/div[2]/div[3]/div/button[1]")).click();
        //Thread.sleep(2000);
        Thread.sleep(4000);
        ((JavascriptExecutor)driver).executeScript("scroll(800, 0)");
        
        
        //download excel
        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[3]/div/div/div[7]/a/span")).click();
        Thread.sleep(4000);
        //Brand
        driver.findElement(By.xpath("//*[@id=\'brand\']/div/div[1]/div[1]")).click();   //search brand checkbox
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Baseus']")).click();    //selected
        //Thread.sleep(2000);
        //driver.findElement(By.xpath("//*[@id=\'brand\']/div/div[2]/div[1]/svg")).click();   //cancel selected option
        
        Thread.sleep(3000);
 
        //Date range
        driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[3]/div/div/div[2]/span/span/input[1]")).click();
        WebElement startdate1 =driver.findElement(By.cssSelector("#document-body > div:nth-child(13) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-range-part.ant-calendar-range-left > div.ant-calendar-input-wrap > div > input"));
        startdate1.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        startdate1.sendKeys(Keys.BACK_SPACE);
        startdate1.sendKeys("10-05-2018");
        Thread.sleep(1000);
        WebElement enddate1 =driver.findElement(By.cssSelector("#document-body > div:nth-child(13) > div > div > div > div > div.ant-calendar-date-panel > div.ant-calendar-range-part.ant-calendar-range-right > div.ant-calendar-input-wrap > div > input"));
        enddate1.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        enddate1.sendKeys(Keys.BACK_SPACE);
        enddate1.sendKeys("12-01-2022"+Keys.ENTER);
        Thread.sleep(2000);
        
        //VCAT1
        driver.findElement(By.xpath("//*[@id=\'vcat1\']/div/div[1]/div[1]")).click();   //select VCAT1
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Ear Phone']")).click();    //selected
        
        //VCAT2
        driver.findElement(By.xpath("//*[@id=\'vcat2\']/div/div[1]/div[1]")).click();   //select VCAT2
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Wireless Ear Phone']")).click();    //selected
        
        //VCAT3
        driver.findElement(By.xpath("//*[@id=\'vcat3\']/div/div[1]/div[1]")).click();   //select VCAT3
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Bluetooth']")).click();    //selected
        Thread.sleep(3000);
        ((JavascriptExecutor)driver).executeScript("scroll(0, 400)");
        Thread.sleep(2000);
        ((JavascriptExecutor)driver).executeScript("scroll(400, 0)");
        
        
        
        
        
        
        
        
        
        
        
        
	}
}














// WebElement channel =driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[1]/div/ul/li[2]/a/span"));
// channel.click();