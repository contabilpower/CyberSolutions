package metodos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Metodos {

	WebDriver driver;
	
	/**
	 * @author ROQUE
	 * Metodo abrir navegador
	 * @param browser CHROME
	 * @param abrir navegador chrome
	 */
	public void abrirNavegador(String browser, String descricao) {
		try {

				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(browser);
				driver.manage().window().maximize();

			
		} catch (Exception e) {
			System.out.println("#####-----error-----##### ao abrir browser " + e.getMessage());
		}
	}
	/**
 * @author ROQUE
 *@param Metodo pausar teste
 *@param colocar o tempo em milissegundos!ex: para 1 segundo, colocar (1000)
 */
	public void pausaTeste(int tempo, String descricao) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			System.out.println("#####-----error-----##### ao pausar teste " + e.getMessage());
		}
	}
	/**
	 * @author ROQUE
	 * Metodo clicar no elemento
	 * @param metodo para clicar no elemento
	 */
	public void clicar(By elemento, String descricao) {
	try {
			driver.findElement(elemento).click();
	}catch (Exception e) {
		System.out.println("#####-----error-----##### ao clicar no elemento " + e.getCause());
	}

	}
	/**
	 * @author ROQUE
	 * @param coloque quantas vezes você quer clicar no elemento
	 * @param método para clicar mais de uma vez em um elemento
	 */
	
	public void clicks(By elemento,int n1, String descricao) {
		int n2 = 0;
		while(n1 >n2) {
			driver.findElement(elemento).click();
			n2++;
		}
		
		}
	
	/**
	 * @author ROQUE
	 * @param metodo para escrever no elemento
	 */
	public void escrever(By elemento, String texto) {
		try{
		driver.findElement(elemento).sendKeys(texto);
		}catch (Exception e) {
			System.out.println("#####-----error-----##### ao escrever " + e.getMessage());
		}
	}
	/**
	 * @author ROQUE
	 *@param Metodo selecionar texto no combobox
	 * @param elemento
	 * @param texto
	 */
	public void selectText(By elemento, String texto) {
		try {
		WebElement element = driver.findElement(elemento);
		Select element1 = new Select(element);
		element1.selectByVisibleText(texto);
		}catch (Exception e) {
			System.out.println("#####-----error-----##### ao selecionar elemento" +e.getMessage());
		}
	}
	/**
 * @author ROQUE
 * @param metodo para selecionar texto
 */
	public void Textolink(String texto,String descricao) {
		try {
			
			driver.findElement(By.linkText(texto)).click();
		} catch (Exception e) {
			System.out.println("#####-----error-----##### ao selecionar texto" +e.getMessage());
		}
		
	}
/**
 * @author ROQUE
 *@param Metodo mover Elemento na pagina
 * @param primeiro numero  mover horizontal
 * @param segundo numero mover vertical
 */
public void moverElemento(By elemento, int NH,int NV) {
	try {
		
	WebElement move = driver.findElement(elemento);
	Actions slide = new Actions(driver);
	slide.dragAndDropBy(move, NH, NV).build().perform();
	
	}catch (Exception e) {
		System.out.println("#####-----error ao mover objeto" +e.getMessage());
	}
}
/**
 * @author ROQUE
 *@param Metodo selecionar frame
 */
public void frame(int numero) {
	try {
		
		driver.switchTo().frame(numero);
	} catch (Exception e) {
		System.out.println("#####-----error ao clicar no frame" +e.getMessage());
	}
	
}
	/**
	 * @author ROQUE
	 * @param metodo para tirar screenShot ao final do teste como evidencia
	 * @param foto
	 * @param descricao
	 */
	public void ScreenShot(String foto, String descricao) {
		try {
			
		TakesScreenshot scrshot = ((TakesScreenshot)driver);
		File scrfile = scrshot.getScreenshotAs(OutputType.FILE);
		File destfile = new File("./src/Evidencias/" +foto+ ".png");
		FileUtils.copyFile(scrfile, destfile);
		
		} catch (IOException e) {
			System.out.println("#####-----error ao tirar foto evidencia" +e.getMessage());
		}
	}
	
	/**
	 * @author ROQUE
	 * Metodo fechar navegdor
	 */
	public void fecharNavegador() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("#####-----error-----##### ao fechar navegador");
		}
	}
	
	
	
}
