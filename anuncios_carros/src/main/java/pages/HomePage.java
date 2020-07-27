package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	private By botaoMarca = By.cssSelector("div:nth-child(5) > div:nth-child(1) > div > div > div > div > button");
	
	private By inputMarca = By.cssSelector("div:nth-child(5) > div:nth-child(1) > div > div > div > div > div > div > input");
	
	private By dropdownMarca = By.cssSelector("div:nth-child(5) > div:nth-child(1) > div > div > div > div > div > ul");
	
	private By botaoModelo = By.cssSelector("div:nth-child(5) > div:nth-child(2) > div > div > div > div > button");
	
	private By inputModelo = By.cssSelector("div:nth-child(5) > div:nth-child(2) > div > div > div > div > div > div > input");
	
	private By dropdownModelo = By.cssSelector("div:nth-child(5) > div:nth-child(2) > div > div > div > div > div > ul");
	
	private By botaoBuscar = By.cssSelector("div:nth-child(7) > div.col-xs-4.p-top-xs > button");
	
	private By checkNovos = By.cssSelector("#anunciosNovos");
	
	
		
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		
	}	
	
	public void clicarBotaoMarca() {
		driver.findElement(botaoMarca).click();
	}
	
	public void preencherMarca(String texto) {
		driver.findElement(inputMarca).sendKeys(texto);
	}
	
	public String contarMarcasLista(int indice) {
		return driver.findElements(dropdownMarca).get(indice).getText();
	}
	
	public void clicarListaMarcas(int indice) {
		driver.findElements(dropdownMarca).get(indice).click();
	}
	
	////////////////////////////////////////////////////
	
	
	public void clicarBotaoCheckout() {
		driver.findElement(checkNovos).click();
		
	}
		
	public void clicarBotaoModelo() {
				
		driver.findElement(botaoModelo).click();
	}
	
	public void preencherModelo(String texto) {
		driver.findElement(inputModelo).sendKeys(texto);
	}	
			
	public String contarModelosLista(int indice1) {
		return driver.findElements(dropdownModelo).get(indice1).getText();
	}
	
	public void clicarListaModelos(int indice1) {
		driver.findElements(dropdownModelo).get(indice1).click();
	}
	
	
	public CarrosPage clicarBotaoBuscar() {
		driver.findElement(botaoBuscar).click();
		return new CarrosPage(driver);
		
	}

	public void carregarPagiInicial() {
		
		driver.get("https://www.icarros.com.br/principal/index.jsp");
		
	}

	public String obterTituloPagina() {
		return driver.getTitle();
		
	}
	
	

	
	

}
