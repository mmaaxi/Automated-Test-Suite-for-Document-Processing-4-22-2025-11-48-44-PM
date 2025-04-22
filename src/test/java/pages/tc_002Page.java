package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_002Page {
    WebDriver driver;
    WebDriverWait wait;

    By uploadButton = By.id("uploadButton");
    By previewName = By.id("previewName");
    By previewSize = By.id("previewSize");
    By previewType = By.id("previewType");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navigateToUploadPage() {
        driver.get("https://example.com/upload");
    }

    public void uploadFile(String fileType) {
        String filePath;
        if (fileType.equalsIgnoreCase("pdf")) {
            filePath = "/path/to/valid.pdf";
        } else {
            filePath = "/path/to/valid.docx";
        }
        driver.findElement(uploadButton).sendKeys(filePath);
    }

    public boolean isPreviewDisplayed() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(previewName));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isFileNameCorrect() {
        WebElement nameElement = driver.findElement(previewName);
        String expectedName = "valid." + getFileExtension(nameElement.getText());
        return nameElement.getText().equals(expectedName);
    }

    public boolean isFileSizeCorrect() {
        WebElement sizeElement = driver.findElement(previewSize);
        return Integer.parseInt(sizeElement.getText().replace("MB", "").trim()) <= 50;
    }

    public boolean isFileTypeCorrect() {
        WebElement typeElement = driver.findElement(previewType);
        return typeElement.getText().equals("PDF") || typeElement.getText().equals("DOCX");
    }

    private String getFileExtension(String fileName) {
        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }
}