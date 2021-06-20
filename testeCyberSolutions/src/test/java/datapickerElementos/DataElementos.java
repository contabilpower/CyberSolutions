package datapickerElementos;

import org.openqa.selenium.By;

public class DataElementos {
	
	//----Primeiro DatePicker----//
	public By d = By.cssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(1) > td:nth-child(7)");
	public By datepicker1 = By.id("datepicker1");
	public By prev = By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span");
	public By close = By.xpath("//a[@title='Close the datepicker']");
	
	//----Segundo DatePicker----//

	public By Datepicker2 = By.xpath("//*[@id=\"datepicker2\"]");
	public By dateAgosto = By.xpath("/html/body/div[2]/div/div[2]/div/div/select[1]");
	public By dateAno = By.xpath("/html/body/div[2]/div/div[2]/div/div/select[2]");
	

}
