package com.sinatra.steps;

import com.sinatra.hooks.Hooks;
import com.sinatra.sites.SinatraSite;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertTrue;

public class SongInfoSteps {

    public SinatraSite sinatraSite;
    int numLikes;

    public SongInfoSteps(Hooks h) {
        this.sinatraSite = h.getSinatraSite();
    }

    @And("le da click a like song")
    public void likeSong() {
        numLikes = sinatraSite.getSongInfo().obtenerNumeroLikes();
        sinatraSite.getSongInfo().darLikeCancion();
    }

    @Then("El numero de likes se incrementa")
    public void elNumeroDeLikesSeIncrementa() throws Exception {
        int numeroActualLikes = sinatraSite.getSongInfo().obtenerNumeroLikes();
        assertTrue("No aumento el numero de likes.  Eran " + numLikes + " y se encontraron " + numeroActualLikes, numeroActualLikes > numLikes);
//        if(numeroActualLikes > numLikes ) {
//            System.out.println("Si se le dio like");
//        } else {
//            System.out.println("No se le dio like");
//            throw new Exception("No aumento el numero de likes.  Eran " + numLikes + " y se encontraron " + numeroActualLikes);
//        }
    }
}
