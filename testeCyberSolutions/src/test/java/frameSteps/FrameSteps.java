package frameSteps;

import frameElemento.FraElementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class FrameSteps {
	
Metodos metodo = new Metodos();
FraElementos fra = new FraElementos();
	
	
	@Given("eu esteja na pagina de frame {string}")
	public void eu_esteja_na_pagina_de_frame(String frame) {
	  metodo.abrirNavegador(frame, "pagina Frame");
	
	}

	@When("seleciono frame")
	public void seleciono_frame() {
		metodo.frame(0);
	
	   
	}
	@When("escrever no frame")
	public void escrever_no_frame() {
	
		metodo.escrever(fra.tframe, "Cyber Solutions");
	   
	}

	@Then("valido o que foi escrito")
	public void valido_o_que_foi_escrito() {
		metodo.pausaTeste(1000, "pausa o teste");
		metodo.ScreenShot("frame", "ok");
		metodo.fecharNavegador();
		System.out.println("TESTE FINALIZADO COM SUCESSO");
	}
}
