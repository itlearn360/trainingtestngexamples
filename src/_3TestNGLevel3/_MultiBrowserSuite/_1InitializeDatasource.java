package _3TestNGLevel3._MultiBrowserSuite;

import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import _3TestNGLevel3._exceldatap.ReadExcelData;

public class _1InitializeDatasource {
  @BeforeTest
  public void initializeDatasource(ITestContext icontext) {
	  try {
		Object[][] testObjArray=ReadExcelData.getTableArray("C:\\Users\\jayan\\workspace\\TrainingTestNGExamples\\src\\_3TestNGLevel3\\dataprovider.xls",
					"Sheet2");
		icontext.setAttribute("sddata", testObjArray);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
