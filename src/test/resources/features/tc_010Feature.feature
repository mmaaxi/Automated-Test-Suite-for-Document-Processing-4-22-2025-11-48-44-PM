Feature: Validar generación de 'Slip de salida' y almacenamiento en historial

  Scenario: Completar la carga y procesamiento de documentos
    Given el usuario ha iniciado sesión en el sistema
    When el usuario completa la carga y procesamiento de documentos
    Then el sistema debería generar el 'Slip de salida' 
    And el sistema debería guardar los documentos originales en el historial
    And el sistema debería guardar los datos extraídos en el historial de la solicitud