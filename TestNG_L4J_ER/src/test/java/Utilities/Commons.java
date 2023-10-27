package Utilities;

import java.time.Duration;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Commons {
	
	      
	  public WebDriver driver;
	  public Logger log = (Logger) LogManager.getLogger(Commons.class);
	  public String ud= System.getProperty("user.dir");
	  
	  
	  public ExtentReports reports = new ExtentReports();//extent
	  public ExtentSparkReporter htmlreporter = new ExtentSparkReporter("Results/MariaExtenReport_" +System.currentTimeMillis()+".html"); //spark
	  public ExtentTest test;
	  
	  
		
		public void switchtoOpenWindow(String Parent) {
			Set<String> wins= driver.getWindowHandles();
			for (String sesid :wins) {
				   if(sesid!=Parent) {
				   driver.switchTo().window(sesid);
				   log.info("Window Switched - Driver is present in the new");
				   }}}
				
			
		
		public void waitforcelementclickable(WebElement elementvariable) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(elementvariable));
			log.info("Waiting for element to be clickable");
			
		}

		
		public void waitforpageTitle(String pagetitle, WebDriver driver) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.titleContains(pagetitle));
			log.info("Waiting for page Tittle to be visible");
			
		}
	
		

		public void configureReport() {
			//add system information/environment information to report
			reports.setSystemInfo("Machine","TestPC1");
			reports.setSystemInfo("os", "windows11");
			reports.setSystemInfo("browsere","chrome");
			reports.setSystemInfo("username","maria");
			
			//Configuration to change
			htmlreporter.config().setDocumentTitle("uddin's report");
			htmlreporter.config().setReportName("google test report");
			htmlreporter.config().setTheme(Theme.DARK);
		}
		
		
		
		
		
		
		
}
