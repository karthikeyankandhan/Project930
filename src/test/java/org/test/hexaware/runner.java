package org.test.hexaware;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", glue="org.tst.cts",monochrome=true,plugin= {"pretty","html:target","json:target/reports.json"})

public class runner {

}

