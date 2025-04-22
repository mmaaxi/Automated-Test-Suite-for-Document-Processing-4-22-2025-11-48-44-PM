package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {
    tc_010Page page = new tc_010Page();

    @Given("el usuario ha iniciado sesión en el sistema")
    public void usuarioIniciaSesion() {
        page.iniciarSesion();
    }

    @When("el usuario completa la carga y procesamiento de documentos")
    public void completarCargaYProcesamiento() {
        page.cargarYProcesarDocumentos();
    }

    @Then("el sistema debería generar el 'Slip de salida'")
    public void validarGeneracionSlip() {
        Assert.assertTrue(page.esSlipGenerado());
    }

    @Then("el sistema debería guardar los documentos originales en el historial")
    public void validarGuardadoDocumentosOriginales() {
        Assert.assertTrue(page.estanDocumentosOriginalesGuardados());
    }

    @Then("el sistema debería guardar los datos extraídos en el historial de la solicitud")
    public void validarGuardadoDatosExtraidos() {
        Assert.assertTrue(page.estanDatosExtraidosGuardados());
    }
}