package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Carro2Page {
	
	private WebDriver driver;
	
	private By nomeCarro2 = By.cssSelector("#ctdoTopo > h1");
	private By precoCarro2 = By.cssSelector("#cardProposta > div > h2");
	
	public Carro2Page(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public String obterModeloCarro2() {
		return driver.findElement(nomeCarro2).getText();
			
	}
	
	public String obterValorCarro2() {
		return driver.findElement(precoCarro2).getText();
		
	}

	

}
