package steps;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.*;
import pages.PaginaCursos;
import pages.PaginaIntroduccionTesting;
import pages.PaginaPrincipal;
import pages.PaginaRegistro;

public class FreeRangeTest {

    SoftAssert soft = new SoftAssert();

    PaginaPrincipal landingPage = new PaginaPrincipal();    
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaIntroduccionTesting introduccionTestingPage = new PaginaIntroduccionTesting();
    PaginaRegistro registroPage = new PaginaRegistro();
    
    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT(){
        landingPage.navigateToFreeRangeTesters();
    }

    @When("I go to {word} using navigation bar")
    public void navigationBarUse(String section){
        landingPage.clickOnSectionNavigationBar(section);
    }

    @When("^(?:I|The user|The client) selects? Elegir Plan$")
    public void slectElegirPlan(){
        landingPage.clickOnElegirPlanButton();
    }

    @And("^(?:I|The user|The client) selects? Introduction al Testing$")
    public void navigateToIntro(){
        cursosPage.clickIntroduccionTestingLink();
        introduccionTestingPage.clickIntroduccionTestingLink();
    }

    @Then("^(?:I|The user|The client) can validate the options in the checkout page$")
    public void validateCheckoutPlans(){
        List<String> lista  = registroPage.returnPlanDropdownValues();
        List<String> listaEsperada = Arrays.asList(
        "Academia: $16.99 / mes \u2022 15 productos",
        "Academia: $176 / a\u00F1o \u2022 15 productos",
        "Free: Gratis \u2022 3 productos");

        Assert.assertEquals(listaEsperada, lista);

    }


   // Y así se ven (exactamente como las assertions comunes, pero con el potente assertAll(); al final!
public void Ejemplulis() {
        String palabraEsperada = "Pepe";
        String palabraEncontrada = "Papa";
 
        // Soft Assertions: No detienen la ejecución al fallar. Ideal para verificar
        // muchas cosas pequeñas a la vez.
        soft.assertEquals(palabraEsperada, palabraEncontrada);
        soft.assertTrue(palabraEncontrada.contains(palabraEsperada));
        soft.assertNotEquals(palabraEncontrada,palabraEsperada);
 
        soft.assertAll();
 
    }
}
