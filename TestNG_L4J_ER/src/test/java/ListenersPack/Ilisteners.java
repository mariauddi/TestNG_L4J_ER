package ListenersPack;



import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;


import Utilities.Utilities_;


public class Ilisteners extends Utilities_ implements ITestListener{


	@Override
	public void onTestSuccess(ITestResult result) {
		this.driver = ((Utilities_)result.getInstance()).driver;
		try {
			screenshort("Success");
			log.info("test passed and screenshot taken");
		} catch (IOException e) {
			
			e.printStackTrace();}}
		
	@Override
	public void onTestFailure(ITestResult result) {
		this.driver = ((Utilities_)result.getInstance()).driver;
		try {
			screenshort("failed");
		} catch (IOException e) {
			
			e.printStackTrace();}}
		

	@Override
	public void onTestSkipped(ITestResult result) {
		this.driver=((Utilities_)result.getInstance()).driver;
		try {
			screenshort("er_ss");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
	