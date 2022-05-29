package com.blogapp.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStepdefs {
    @When("el usuario quiere buscar un usuario por el correo {string}")
    public void elUsuarioQuiereBuscarUnUsuarioPorElCorreo(String correo) {
    }

    @Then("retorne el usuario buscado")
    public void retorneElUsuarioBuscado() {

    }

    @When("el usuario quiere guardar un usuario")
    public void elUsuarioQuiereGuardarUnUsuario() {
    }

    @Then("guarde el usuario ingresado")
    public void guardeElUsuarioIngresado() {
    }

    @And("retorne el usuario ingresado")
    public void retorneElUsuarioIngresado() {
    }
}
