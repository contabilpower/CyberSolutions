#Author: rsppnet@hotmail.com

@Desafio
Feature: Desafioo Cyber solutions
  Eu como usuário, quero acessar o http://demo.automationtesting.in para realizar o desafio proposto.

   
  @Registro
 Scenario: Relizar Registro
	  Given eu esteja na pagina de registro "http://demo.automationtesting.in/Register.html"
	  
    When realizar o cadastro

    Then valido as informações
    
    @Frame
     Scenario: Escrever no frame
     Given eu esteja na pagina de frame "http://demo.automationtesting.in/Frames.html"
     
     When seleciono frame
     
     When escrever no frame

    Then valido o que foi escrito
    
    
    @DatePicker
    Scenario: inserir data
     Given eu esteja na pagina de datepicker "http://demo.automationtesting.in/Datepicker.html"
     
     When insiro a data de nascimento no primeiro datepicker
     
    When insiro a data de nascimento no segundo datepicker

    Then valido as datas
    
    @Slide
    Scenario: mover slider
     Given eu esteja na pagina de slide "http://demo.automationtesting.in/Slider.html"
     
     When movo o slide 50%

    Then valido a ação
    
  
