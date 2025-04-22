package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_001Page;

public class tc_001Steps {

    tc_001Page page = new tc_001Page();

    @Given("El usuario está en la página principal de carga de documentos")
    public void el_usuario_esta_en_la_pagina_principal_de_carga_de_documentos() {
        page.navigateToCargaDocumentosPage();
    }

    @When("El usuario selecciona la opción 'cargar documentos'")
    public void el_usuario_selecciona_la_opcion_cargar_documentos() {
        page.selectCargarDocumentosOption();
    }

    @Then("El sistema muestra opción para carga única y carga múltiple")
    public void el_sistema_muestra_opciones_de_carga_unica_y_carga_multiple() {
        Assert.assertTrue(page.isCargaUnicaOptionDisplayed());
        Assert.assertTrue(page.isCargaMultipleOptionDisplayed());
    }

    @When("El usuario elige 'carga en un solo archivo'")
    public void el_usuario_elige_carga_en_un_solo_archivo() {
        page.selectCargaUnica();
    }

    @Then("Se habilita un único recuadro para subir el archivo")
    public void se_habilita_un_unico_recuadro_para_subir_el_archivo() {
        Assert.assertTrue(page.isSingleUploadBoxDisplayed());
    }

    @When("El usuario elige 'cargar documentos por separado'")
    public void el_usuario_elige_cargar_documentos_por_separado() {
        page.selectCargaMultiple();
    }

    @Then("Se muestran múltiples recuadros correspondientes a cada documento requerido")
    public void se_muestran_multiples_recuadros_correspondientes_a_cada_documento_requerido() {
        Assert.assertTrue(page.areMultipleUploadBoxesDisplayed());
    }
}