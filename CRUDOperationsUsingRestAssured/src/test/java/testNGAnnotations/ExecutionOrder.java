package testNGAnnotations;

import org.testng.annotations.*;

public class ExecutionOrder {
@BeforeSuite
public  void bs() {
	System.out.println("BS");
}
@AfterSuite
public void as() {
	System.out.println("AS");
}
@BeforeClass
public void bc1() {
	System.out.println("BC1");
}
@AfterClass
public void ac1() {
	System.out.println("AC1");
}
@BeforeClass
public void bc2() {
	System.out.println("BC2");
}
@AfterClass
public void ac2() {
	System.out.println("AC2");
}
@AfterMethod
public void am() {
	System.out.println("AM");
}
@BeforeMethod
public void bm() {
	System.out.println("BM");
}
@Test
public void t1() {
	System.out.println("t1");
}
@Test
public void t2() {
	System.out.println("t2");
}
}
