package _2testsuite;

import org.testng.annotations.AfterSuite;

public class _6TerminateDataSource {
	  @AfterSuite
	  public void TerminateDatasource() {
	    System.out.println("We terminate data source after executing of testsuite");
	  }
}

