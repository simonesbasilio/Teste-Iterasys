package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Carro1Page {
	
	private WebDriver driver;
	
	private By nomeCarro1 = By.cssSelector("#ctdoTopo > h1");
	private By precoCarro1 = By.cssSelector("#cardProposta > div > h2");
	
	private By botaoVoltar = By.cssSelector("body > div > div:nth-child(1) > div > div.clearfix.breadcrumbs > ul > li.primeiro > span:nth-child(2) > a");
	
	public Carro1Page(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public String obterModeloCarro1() {
		return driver.findElement(nomeCarro1).getText();
		
		
	}
	
	public String obterValorCarro1() {
		return driver.findElement(precoCarro1).getText();
		
	}
	
	public void clicarBotaoVoltar() {
		driver.findElement(botaoVoltar).click();
	}
	

}
