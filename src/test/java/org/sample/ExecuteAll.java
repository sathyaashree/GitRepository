package org.sample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IAnnotation;
import org.testng.annotations.ITestAnnotation;

public class ExecuteAll implements IAnnotationTransformer {

	public void transform(ITestAnnotation ant, Class testClass, Constructor testConstructor, Method testMethod) {
		ant.setRetryAnalyzer(RetryFailure.class);
		
	}

	
}
