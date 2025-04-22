package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {

    WebDriver driver;

    By loginButton = By.id("loginBtn");
    By uploadButton = By.id("uploadBtn");
    By processButton = By.id("processBtn");
    By slipGeneratedIndicator = By.xpath("//div[@id='slipGenerated']");
    By originalDocumentsStoredIndicator = By.xpath("//div[@id='originalDocsStored']");
    By extractedDataStoredIndicator = By.xpath("//div[@id='extractedDataStored']");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void iniciarSesion() {
        driver.findElement(loginButton).click();
        // logic to handle login credentials
    }

    public void cargarYProcesarDocumentos() {
        driver.findElement(uploadButton).click();
        driver.findElement(processButton).click();
        // logic to handle file upload and processing
    }

    public boolean esSlipGenerado() {
        return driver.findElement(slipGeneratedIndicator).isDisplayed();
    }

    public boolean estanDocumentosOriginalesGuardados() {
        return driver.findElement(originalDocumentsStoredIndicator).isDisplayed();
    }

    public boolean estanDatosExtraidosGuardados() {
        return driver.findElement(extractedDataStoredIndicator).isDisplayed();
    }
}