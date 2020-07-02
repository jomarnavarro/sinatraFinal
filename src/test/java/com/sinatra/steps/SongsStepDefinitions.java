package com.sinatra.steps;

import com.sinatra.hooks.Hooks;
import com.sinatra.sites.SinatraSite;
import cucumber.api.java.en.And;

public class SongsStepDefinitions {

        public SinatraSite sinatraSite;

        public SongsStepDefinitions(Hooks h) {
                this.sinatraSite = h.getSinatraSite();
        }

        @And("le da click a la cancion numero {int}")
        public void clickEnCancionNumero(int numCancion){

        }

}
