package slideSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import slideElementos.SlideElementos;

public class SlideSteps {
Metodos metodo = new Metodos();
SlideElementos slid = new SlideElementos();
		
	
	@Given("eu esteja na pagina de slide {string}")
	public void eu_esteja_na_pagina_de_slide(String slide) {
		metodo.abrirNavegador(slide, "pagina de slide");
	  
	}
	@When("movo o slide {int}%")
	public void movo_o_slide(Integer int1) {
		metodo.pausaTeste(1000, "pausa o teste");
	metodo.moverElemento(slid.slide, 0, 0);
	  
	}
	@Then("valido a ação")
	public void valido_a_ação() {
		metodo.ScreenShot("Slide", "mover slide");
		metodo.pausaTeste(1000, "pausa o teste");
		metodo.fecharNavegador();
		System.out.println("TESTE FINALIZADO COM SUCESSO");
	   
	}
}
