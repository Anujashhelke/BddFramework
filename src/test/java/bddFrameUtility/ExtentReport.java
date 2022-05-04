package bddFrameUtility;

import java.text.SimpleDateFormat;
import java.util.Date;



import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ExtentReport {
	
	    public static ExtentReports extent;
		public static ExtentTest test;
		public String timeStamp;
		
		public void createReport(String string) {
			timeStamp="./reports";
			Date d=new Date();
			String date=new SimpleDateFormat("MM-dd-yy-HH-mm-ss").format(d);
			extent=new ExtentReports(System.getProperty("user.dir")+"./reports/rp"+date+".html",true);
			test=extent.startTest("start test");
		}
		
		public void createTest(String Testname) {
			
			test.assignAuthor("anuja shelke");
			test.assignCategory("oralb");
		
		}
		public void logPass(String text) {
			test.log(LogStatus.PASS,text);
		}
		public void logFail(String text) {
			
			test.log(LogStatus.FAIL, text);
			test.addScreenCapture(text);
		}
		
		public void endReport() {
			extent.endTest(test);	
			extent.flush();
			extent.close();
		}

		public void logAdd(String path) {
		test.log(LogStatus.FAIL, test.addScreenCapture(path));
			
		}

		

		
	}


