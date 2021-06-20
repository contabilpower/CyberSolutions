package registroSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import registroElementos.RegElementos;

public class RegSteps {
	
	Metodos metodo = new Metodos();
	RegElementos el = new RegElementos();
	
	
	@Given("eu esteja na pagina de registro {string}")
	public void eu_esteja_na_pagina_de_registro(String registro) {
		metodo.abrirNavegador(registro, "Abrir Navegador");

	   
	}

	@When("realizar o cadastro")
	public void realizar_o_cadastro() {
		metodo.escrever(el.FirstName, "Roque");
		metodo.escrever(el.LaststName, "Simão");
		metodo.escrever(el.Endereco, "Rua jose lopes neto 41");
		metodo.escrever(el.Email, "rsppnet@hotmail.com");
		metodo.escrever(el.Phone, "1146110492");
		metodo.clicar(el.Male, "Masculino");
		metodo.clicar(el.Cricket, "hobby");
		metodo.clicar(el.Moveis, "hobby");
		metodo.clicar(el.Language, "Click");
		metodo.clicar(el.LanguageP, "Portuguese");
		metodo.clicar(el.Hocket, "hobby");
		metodo.selectText(el.Skill, "Java");
		metodo.selectText(el.País, "Brazil");
		metodo.clicar(el.SeCountry, "United States of America");
		metodo.selectText(el.ano, "1979");
		metodo.selectText(el.mes, "August");
		metodo.selectText(el.dia, "10");
		metodo.escrever(el.password1, "Jnrp@1234");
		metodo.escrever(el.password2, "Jnrp@1234");
		metodo.clicar(el.submit, "clicr em submit");
	
	    
	}

	@Then("valido as informações")
	public void valido_as_informações() {
		metodo.ScreenShot("Registro", "ok");
		metodo.fecharNavegador();
		System.out.println("TESTE FINALIZADO COM SUCESSO");
	}

}
