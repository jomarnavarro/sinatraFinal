package com.sinatra.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
			"src/test/resources/features/moduloB/"
		},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/likeSongs.json",
        "html:target/likeSongs-html"},
        glue = {"com.sinatra.sites",
				"com.sinatra.pages",
                "com.sinatra.steps",
                "com.sinatra.utils",
                "com.sinatra.hooks"})


public class ModuloBRunner {}
