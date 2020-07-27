package steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.Carro1Page;
import pages.Carro2Page;
import pages.CarrosPage;
import pages.HomePage;

public class VisualizaCarrosSteps {
	
	private static WebDriver driver;
	private HomePage homePage = new HomePage(driver);
	
	@Before
	public static void inicializar() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\simone\\eclipse-workspace\\siteIterasys\\drivers\\chrome\\83\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
		
	CarrosPage carrosPage;
	String modeloCarro1_CarrosPage;
	String valorCarro1_CarrosPage;
	String modeloCarro2_CarrosPage;
	String valorCarro2_CarrosPage;
	@Dado("que estou na tela inicial e faco uma pesquisa de carros usados da marca Citroen e modelo Aircross")
	public void estou_na_tela_com_a_lista_de_carros_usados_da_marca_citroen_e_modelo_aircross() {
	homePage.carregarPagiInicial();
		
	assertThat(homePage.obterTituloPagina(), is("Carros novos, usados e seminovos para comprar e vender - iCarros"));
	
	////////////////
	//Preencher Marca
			homePage.clicarBotaoMarca();
			homePage.preencherMarca("Citroen");
			
			int indice = 0;
			String listaMarca_HomePage = homePage.contarMarcasLista(indice);
							
			System.out.println(listaMarca_HomePage);
			homePage.clicarListaMarcas(indice);
			
			//tirar o check dos carros novos
			homePage.clicarBotaoCheckout();
					
			//Preencher Modelo
			homePage.clicarBotaoModelo();
			homePage.preencherModelo("Aircross");
					
			int indice1 = 0;
			String listaModelo_HomePage = homePage.contarModelosLista(indice1);
							
			System.out.println(listaModelo_HomePage);
			homePage.clicarListaModelos(indice1);
					
			//Clicar no bot�o Buscar
			carrosPage = homePage.clicarBotaoBuscar();
			
			modeloCarro1_CarrosPage = carrosPage.obterModeloCarro1();
			valorCarro1_CarrosPage = carrosPage.obterValorCarro1();
			
			modeloCarro2_CarrosPage = carrosPage.obterModeloCarro2();
			valorCarro2_CarrosPage = carrosPage.obterValorCarro2();
			
						
	
	
	////////////////
	}
	
	@Quando("abre tela com lista dos carros e o primeiro modelo do carro {string} na tela e dentro do link eh {string} valor {string} ano {string} km {string} cor {string} e cambio {string}")
	public void abre_tela_com_lista_dos_carros_e_o_primeiro_modelo_do_carro_na_tela_e_dentro_do_link_eh_valor_ano_km_cor_e_cambio(String numero, String modelo, String valor, String ano, String km, String cor, String cambio) {

		int numeroCarro;
		numeroCarro = Integer.parseInt(numero);
		//carro 1
		System.out.println(numeroCarro);
		
		if (numeroCarro == 1)  {
		
			
		assertThat(carrosPage.obterModeloCarro1(), is(modelo));
		
		assertTrue(carrosPage.obterValorCarro1().startsWith(valor));
		
		assertThat(carrosPage.obterAnoCarro1(), is(ano));
		assertThat(carrosPage.obterKmCarro1(), is(km));
		assertThat(carrosPage.obterCorCarro1(), is(cor));
		assertThat(carrosPage.obterCambioCarro1(), is(cambio));
		
		System.out.println(valor);
		System.out.println(carrosPage.obterValorCarro1());
				
		System.out.println(modeloCarro1_CarrosPage);
		System.out.println(carrosPage.obterAnoCarro1());
		System.out.println(carrosPage.obterKmCarro1());
		System.out.println(carrosPage.obterCorCarro1());
		System.out.println(carrosPage.obterCambioCarro1());
		}
		
		//carro2
		
		
		else if (numeroCarro == 2) {
		//assertThat(carrosPage.obterModeloCarro2(), is(modelo));
		
		//assertTrue(carrosPage.obterValorCarro2().startsWith(valor));
		
		//assertThat(carrosPage.obterAnoCarro2(), is(ano));
		//assertThat(carrosPage.obterKmCarro2(), is(km));
		//assertThat(carrosPage.obterCorCarro2(), is(cor));
		//assertThat(carrosPage.obterCambioCarro2(), is(cambio));
		
		
		System.out.println(valor);
		System.out.println(carrosPage.obterValorCarro2());
		
		System.out.println(modeloCarro2_CarrosPage);
		System.out.println(carrosPage.obterAnoCarro2());
		System.out.println(carrosPage.obterKmCarro2());
		System.out.println(carrosPage.obterCorCarro2());
		System.out.println(carrosPage.obterCambioCarro2());
		}
						
				
		else if (numeroCarro == 3) {	
			System.out.println(carrosPage.obterModeloCarro3());
			System.out.println(carrosPage.obterValorCarro3());
			System.out.println(carrosPage.obterAnoCarro3());
			System.out.println(carrosPage.obterKmCarro3());
			System.out.println(carrosPage.obterCorCarro3());
			System.out.println(carrosPage.obterCambioCarro3());
			
					
			
		}
		
		
		
		 
		
	}
	Carro2Page carro2Page;
	Carro1Page carro1Page;
	@Entao("clico no modelo {string} e abre tela")
	public void clica_no_modelo_e_abre_tela(String numero) {
		
		int numeroCarro;
		numeroCarro = Integer.parseInt(numero);
		
		if (numeroCarro == 1) {
		carro1Page = carrosPage.clicarCarro1();
		}
		else if (numeroCarro == 2) {
		carro2Page = carrosPage.clicarCarro2();
		}
	}

	@Entao("valido o Modelo e Valor do carro {string} e o produto aparece na confirmacao com o modelo {string} valor {string} ano {string} km {string} cor {string} cambio {string}")
	public void o_produto_aparece_na_confirmacao_com_o_modelo_valor_ano_km_cor_cambio(String numero, String string, String string2, String string3, String string4, String string5, String string6) {
	    
		int numeroCarro;
		numeroCarro = Integer.parseInt(numero);
		
		if (numeroCarro == 1) {
		String modeloCarro1_Carro1Page = carro1Page.obterModeloCarro1();
		
		
		String valorCarro1_Carro1Page = carro1Page.obterValorCarro1();
	
		
		System.out.println(modeloCarro1_Carro1Page);
		System.out.println(valorCarro1_Carro1Page);
				
		assertTrue(modeloCarro1_Carro1Page.startsWith(modeloCarro1_CarrosPage));
		assertTrue(valorCarro1_CarrosPage.startsWith(valorCarro1_Carro1Page));
		}
		
		else if (numeroCarro == 2) {
		String modeloCarro2_Carro2Page = carro2Page.obterModeloCarro2();
		String valorCarro2_Carro2Page = carro2Page.obterValorCarro2();
		
		System.out.println(modeloCarro2_Carro2Page);
		System.out.println(valorCarro2_Carro2Page);
				
		assertTrue(modeloCarro2_Carro2Page.startsWith(modeloCarro2_CarrosPage));
		assertTrue(valorCarro2_CarrosPage.startsWith(valorCarro2_Carro2Page));
		}
		
		
		
	}
	
	
	
	
	@After
	public static void finalizar() {
		driver.quit();
		
	}



}