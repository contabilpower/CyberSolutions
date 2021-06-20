package datepickerSteps;

import datapickerElementos.DataElementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class DatapickerSteps {
Metodos metodo = new Metodos();
	DataElementos data = new DataElementos();
	
	
	
	@Given("eu esteja na pagina de datepicker {string}")
	public void eu_esteja_na_pagina_de_datepicker(String data) {
		metodo.abrirNavegador(data, "pagina Datepicker");

	}

	@When("insiro a data de nascimento no primeiro datepicker")
	public void insiro_a_data_de_nascimento_no_primeiro_datepicker() {
		metodo.clicar(data.datepicker1, "clicar em datepicker");
		metodo.clicks(data.prev,502,"clicar no botão prev ate agosto de 1979");
		metodo.pausaTeste(500, "pausa o teste");
		metodo.Textolink("10", "selecionar dia 10");
		

	}

	@When("insiro a data de nascimento no segundo datepicker")
	public void insiro_a_data_de_nascimento_no_segundo_datepicker() {
		metodo.pausaTeste(1000,  "pausa o teste");
		metodo.escrever(data.Datepicker2, "08/10/1979");
		metodo.pausaTeste(500,  "pausa o teste");
		metodo.clicar(data.close, "clicar em close");
	}
		
	

	@Then("valido as datas")
	public void valido_as_datas() {
		metodo.pausaTeste(500, "pausa o teste");
		metodo.ScreenShot("Datepicker", "evidencia DatePicker");
		metodo.pausaTeste(1000, "pausa o teste");
		metodo.fecharNavegador();
		System.out.println("TESTE FINALIZADO COM SUCESSO");

	}
}
