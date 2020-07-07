package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarrosPage {
	
	private WebDriver driver;
	
	private By carroModelo1 = By.cssSelector("#ac30072052 > div > a > h2");
	private By carroValor1 = By.cssSelector("#ac30072052 > div > a > h3");
	private By carroAno1 = By.cssSelector("#ac30072052 > div > div.clearfix.dados_anuncio > div.dados_veiculo > a > ul > li.primeiro > p");
	private By carroKm1 = By.cssSelector("#ac30072052 > div > div.clearfix.dados_anuncio > div.dados_veiculo > a > ul > li.usado > p");
	private By carroCor1 = By.cssSelector("#ac30072052 > div > div.clearfix.dados_anuncio > div.dados_veiculo > a > ul > li:nth-child(3) > p");
	private By carroCambio1 = By.cssSelector("#ac30072052 > div > div.clearfix.dados_anuncio > div.dados_veiculo > a > ul > li.ultimo > p");
	
	
	private By carroModelo2 = By.cssSelector("#ac30037122 > div > a > h2");
	private By carroValor2 = By.cssSelector("#ac30037122 > div > a > h3");
	private By carroAno2 = By.cssSelector("#ac30037122 > div > div.clearfix.dados_anuncio > div.dados_veiculo > a > ul > li.primeiro > p");
	private By carroKm2 = By.cssSelector("#ac30037122 > div > div.clearfix.dados_anuncio > div.dados_veiculo > a > ul > li.usado > p");
	private By carroCor2 = By.cssSelector("#ac30037122 > div > div.clearfix.dados_anuncio > div.dados_veiculo > a > ul > li:nth-child(3) > p");
	private By carroCambio2 = By.cssSelector("#ac30037122 > div > div.clearfix.dados_anuncio > div.dados_veiculo > a > ul > li.ultimo > p");
	
	
	private By carroModelo3 = By.cssSelector("#ac29385452 > div > a > h2");
	private By carroValor3 = By.cssSelector("#ac29385452 > div > a > h3");
	private By carroAno3 = By.cssSelector("#ac29385452 > div > div.clearfix.dados_anuncio > div.dados_veiculo > a > ul > li.primeiro > p");
	private By carroKm3 = By.cssSelector("#ac29385452 > div > div.clearfix.dados_anuncio > div.dados_veiculo > a > ul > li.usado > p");
	private By carroCor3 = By.cssSelector("#ac29385452 > div > div.clearfix.dados_anuncio > div.dados_veiculo > a > ul > li:nth-child(3) > p");
	private By carroCambio3 = By.cssSelector("#ac29385452 > div > div.clearfix.dados_anuncio > div.dados_veiculo > a > ul > li.ultimo > p");
	
	
	
	public CarrosPage(WebDriver driver) {
		this.driver = driver;
		
	}
	//carro 1
	public String obterModeloCarro1() {
		return driver.findElement(carroModelo1).getText();
	}
	
	public String obterValorCarro1() {
		return driver.findElement(carroValor1).getText();
	}
	
	public String obterAnoCarro1() {
		return driver.findElement(carroAno1).getText();
	}
	
	public String obterKmCarro1() {
		return driver.findElement(carroKm1).getText();
	}
	
	public String obterCorCarro1() {
		return driver.findElement(carroCor1).getText();
	}
	
	public String obterCambioCarro1() {
		return driver.findElement(carroCambio1).getText();
	}
	
	
	
	
	//carro 2
	public String obterModeloCarro2() {
		return driver.findElement(carroModelo2).getText();
	}
	
	public String obterValorCarro2() {
		return driver.findElement(carroValor2).getText();
	}
	
	public String obterAnoCarro2() {
		return driver.findElement(carroAno2).getText();
	}
	
	public String obterKmCarro2() {
		return driver.findElement(carroKm2).getText();
	}
	
	public String obterCorCarro2() {
		return driver.findElement(carroCor2).getText();
	}
	
	public String obterCambioCarro2() {
		return driver.findElement(carroCambio2).getText();
	}
	
	
	
	
	//carro 3
		public String obterModeloCarro3() {
			return driver.findElement(carroModelo3).getText();
		}
		
		public String obterValorCarro3() {
			return driver.findElement(carroValor3).getText();
		}
		
		public String obterAnoCarro3() {
			return driver.findElement(carroAno3).getText();
		}
		
		public String obterKmCarro3() {
			return driver.findElement(carroKm3).getText();
		}
		
		public String obterCorCarro3() {
			return driver.findElement(carroCor3).getText();
		}
		
		public String obterCambioCarro3() {
			return driver.findElement(carroCambio3).getText();
		}
		
		public Carro1Page clicarCarro1() {
			driver.findElement(carroModelo1).click();
			return new Carro1Page(driver);
		}
		
		public Carro2Page clicarCarro2() {
			driver.findElement(carroModelo2).click();
			return new Carro2Page(driver);
		}
		

}
