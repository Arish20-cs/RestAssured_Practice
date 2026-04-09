package testNGAnnotations;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

class DataSender{
	@DataProvider
	public static Object[][] dataForBooking(){
		Object[][] data=new Object[5][2];
		data[0][1]="Chennai";data[0][0]="Tiruttani";
		data[1][0]="Chennai"; data[1][1]="Kodaikanal";
		data[2][0]="Kodaikanal"; data[2][1]="Ooty";
		data[3][0]="Ooty"; data[3][1]="Kashmir";
		data[4][0]="Kashmir"; data[4][1]="Tiruttani";
		return data;
		}
}
public class DataProviderExec extends DataSender 
{
@Test(dataProviderClass=DataSender.class ,dataProvider="dataForBooking")
public void bookingTest(Object src, Object dest) {
	System.out.println("Journey starts at "+src+" ends at "+dest);
}
}
