package registroElementos;

import org.openqa.selenium.By;

public class RegElementos {
	
	public By FirstName = By.xpath("//input[@ng-model=\"FirstName\"]");
	public By LaststName = By.xpath("//input[@ng-model=\"LastName\"]");
	public By Endereco = By.xpath("//textarea[@ng-model=\"Adress\"]");
	public By Email = By.xpath("//input[@ng-model=\"EmailAdress\"]");
	public By Phone = By.xpath("//input[@ng-model=\"Phone\"]");
	public By Male = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input");
	public By Language = By.id("msdd");
	public By LanguageP = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[29]/a");
	public By Cricket = By.id("checkbox1");
	public By Moveis = By.id("checkbox2");
	public By Hocket = By.id("checkbox3");
	public By Skill = By.id("Skills");
	public By País = By.id("countries");
	public By SeCountry = By.xpath("//*[@id=\"country\"]/option[11]");
	public By ano = By.id("yearbox");
	public By mes = By.xpath("//select[@ng-model=\"monthbox\"]");
	public By dia = By.id("daybox");
	public By password1 = By.id("firstpassword");
	public By password2 = By.id("secondpassword");
	public By submit = By.id("submitbtn");

}
