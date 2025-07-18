package testng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.testng.IAnnotationTransformer;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.xml.XmlSuite;

public class ListenersTest implements ITestListener,IReporter,IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		for (ISuite suite : suites) {
            
	         String suiteName = suite.getName();
	         Map<String, ISuiteResult> suiteResults = suite.getResults();
	         for (ISuiteResult sr : suiteResults.values()) {
	            ITestContext tc = sr.getTestContext();
	            System.out.println("Passed tests for suite '" + suiteName +
	               "' is:" + tc.getPassedTests().getAllResults().size());
	            System.out.println("Failed tests for suite '" + suiteName +
	               "' is:" + tc.getFailedTests().getAllResults().size());
	            System.out.println("Skipped tests for suite '" + suiteName +
	               "' is:" + tc.getSkippedTests().getAllResults().size());
	         }
	      }
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("New Test method" +result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("onTestSuccess method" +result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("onTestFailure method" +result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("onTestSkipped method" +result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("onTestFailedButWithinSuccessPercentage method" +result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		System.out.println("onTestFailedWithTimeout method" +result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("onStart method started");
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("onFinish method started");
	}
	
	

}
