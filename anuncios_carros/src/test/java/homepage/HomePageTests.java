package homepage;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import base.BaseTests;
import pages.Carro1Page;
import pages.Carro2Page;
import pages.CarrosPage;

public class HomePageTests extends BaseTests {
	
	@Test
	public void testCarregarPaginaInicial(){
		carregarPaginaInicial();
		
	}
	
	CarrosPage carrosPage;
	String modeloCarro1_CarrosPage;
	String valorCarro1_CarrosPage;
	String modeloCarro2_CarrosPage;
	String valorCarro2_CarrosPage;
	@Test
	public void testSelecionarMarcaModelo_MostrarPesquisa() {
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
		
		//listar 3 carros (mesma marca, modelo)
		//carro 1
		modeloCarro1_CarrosPage = carrosPage.obterModeloCarro1();
		valorCarro1_CarrosPage = carrosPage.obterValorCarro1();
		String anoCarro1_CarrosPage = carrosPage.obterAnoCarro1();
		String kmCarro1_CarrosPage = carrosPage.obterKmCarro1();
		String corCarro1_CarrosPage = carrosPage.obterCorCarro1();
		String cambioCarro1_CarrosPage = carrosPage.obterCambioCarro1();
		
		System.out.println(modeloCarro1_CarrosPage);
		System.out.println(valorCarro1_CarrosPage);
		System.out.println(anoCarro1_CarrosPage);
		System.out.println(kmCarro1_CarrosPage);
		System.out.println(corCarro1_CarrosPage);
		System.out.println(cambioCarro1_CarrosPage);
				
		//carro2
		modeloCarro2_CarrosPage = carrosPage.obterModeloCarro2();
		valorCarro2_CarrosPage = carrosPage.obterValorCarro2();
		String anoCarro2_CarrosPage = carrosPage.obterAnoCarro2();
		String kmCarro2_CarrosPage = carrosPage.obterKmCarro2();
		String corCarro2_CarrosPage = carrosPage.obterCorCarro2();
		String cambioCarro2_CarrosPage = carrosPage.obterCambioCarro2();
				
		System.out.println(modeloCarro2_CarrosPage);
		System.out.println(valorCarro2_CarrosPage);
		System.out.println(anoCarro2_CarrosPage);
		System.out.println(kmCarro2_CarrosPage);
		System.out.println(corCarro2_CarrosPage);
		System.out.println(cambioCarro2_CarrosPage);
				
		//carro3
		String modeloCarro3_CarrosPage = carrosPage.obterModeloCarro3();
		String valorCarro3_CarrosPage = carrosPage.obterValorCarro3();
		String anoCarro3_CarrosPage = carrosPage.obterAnoCarro3();
		String kmCarro3_CarrosPage = carrosPage.obterKmCarro3();
		String corCarro3_CarrosPage = carrosPage.obterCorCarro3();
		String cambioCarro3_CarrosPage = carrosPage.obterCambioCarro3();
				
		System.out.println(modeloCarro3_CarrosPage);
		System.out.println(valorCarro3_CarrosPage);
		System.out.println(anoCarro3_CarrosPage);
		System.out.println(kmCarro3_CarrosPage);
		System.out.println(corCarro3_CarrosPage);
		System.out.println(cambioCarro3_CarrosPage);
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "/massaTeste_icarros.csv", numLinesToSkip = 1, delimiter = ';')
	public void testModeloValor_ok_positivo(String nomeTeste, String modelo, String valor, String ano, String km, String cor, String cambio, String resultado) {
	///////////////////////
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
				
				
				//carro 1
				modeloCarro1_CarrosPage = carrosPage.obterModeloCarro1();
				valorCarro1_CarrosPage = carrosPage.obterValorCarro1();
				String anoCarro1_CarrosPage = carrosPage.obterAnoCarro1();
				String kmCarro1_CarrosPage = carrosPage.obterKmCarro1();
				String corCarro1_CarrosPage = carrosPage.obterCorCarro1();
				String cambioCarro1_CarrosPage = carrosPage.obterCambioCarro1();
				
				System.out.println(modeloCarro1_CarrosPage);
				System.out.println(valorCarro1_CarrosPage);
				System.out.println(anoCarro1_CarrosPage);
				System.out.println(kmCarro1_CarrosPage);
				System.out.println(corCarro1_CarrosPage);
				System.out.println(cambioCarro1_CarrosPage);
				
				System.out.println(modelo);
				System.out.println(valor);
				System.out.println(ano);
				System.out.println(km);
				System.out.println(cor);
				System.out.println(cambio);
				
				assertTrue(valorCarro1_CarrosPage.startsWith(valor));
				
			
	///////////////////////	
	
    }
	
	////////Obs: antes de rodar o teste verifique se os automoveis ainda estao
	///////aparecendo na lista do icarros para venda
		Carro1Page carro1Page;
		@Test
		public void testValidarCarro_ModeloValorIguais() {
		
			testSelecionarMarcaModelo_MostrarPesquisa();
		
			//Validar Modelo e valor carro 1
		carro1Page = carrosPage.clicarCarro1();
		
		String modeloCarro1_Carro1Page = carro1Page.obterModeloCarro1();
		String valorCarro1_Carro1Page = carro1Page.obterValorCarro1();
		
		System.out.println(modeloCarro1_Carro1Page);
		System.out.println(valorCarro1_Carro1Page);
				
		assertTrue(modeloCarro1_Carro1Page.startsWith(modeloCarro1_CarrosPage));
		assertTrue(valorCarro1_CarrosPage.startsWith(valorCarro1_Carro1Page));
		
		carro1Page.clicarBotaoVoltar();
		
		Carro2Page carro2Page = carrosPage.clicarCarro2();
		
		String modeloCarro2_Carro2Page = carro2Page.obterModeloCarro2();
		String valorCarro2_Carro2Page = carro2Page.obterValorCarro2();
		
		System.out.println(modeloCarro2_Carro2Page);
		System.out.println(valorCarro2_Carro2Page);
				
		assertTrue(modeloCarro2_Carro2Page.startsWith(modeloCarro2_CarrosPage));
		assertTrue(valorCarro2_CarrosPage.startsWith(valorCarro2_Carro2Page));
				
	}
		
		

}
