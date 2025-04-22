Feature: Upload and preview a valid file

  Scenario: Validate upload of a valid PDF/DOCX file and preview
    Given I am on the file upload page
    When I upload a valid "document" file
    Then I should see the file preview with name, size, and type