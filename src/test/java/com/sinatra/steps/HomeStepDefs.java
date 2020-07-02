package com.sinatra.steps;

import com.sinatra.hooks.Hooks;
import com.sinatra.sites.SinatraSite;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertNotNull;

public class HomeStepDefs {
    public SinatraSite sinatraSite;

    public HomeStepDefs(Hooks hooksClass) {
        this.sinatraSite = hooksClass.getSinatraSite();
    }

    @Given("El usuario navega a la pagina de home")
    public void usuarioNavegaHomePage() {
        sinatraSite.getHome().navegarSitio();
    }

    @When("el lista las canciones")
    public void listarCanciones() {

    }

}
