package org.sample;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailure implements IRetryAnalyzer {
int min=0, max=10;
	public boolean retry(ITestResult result) {
		if(min<max) {
			min++;
		return true;
		}
	
return false;	
}
}
