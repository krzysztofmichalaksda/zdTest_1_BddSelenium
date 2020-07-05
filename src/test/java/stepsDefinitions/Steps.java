package stepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

    @Given("warunki początkowe")
    public void precondition()
    {
        System.out.println(">>> Warunki początkowe");
    }

    @When("krok 1")
    public void step1()
    {
        System.out.println(">>> Wykonanie korku 1");
    }

    @When("krok 2")
    public void step2()
    {
        System.out.println(">>> Wykonanie korku 2");
    }

    @Then("sprawdzenie")
    public void sprawdzenie()
    {
        System.out.println(">>> Sprawdzenie wyników");
    }
}
