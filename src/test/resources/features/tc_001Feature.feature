Feature: Validar selección de modo de carga de documentos

  Scenario: Cargar documentos usando diferentes modos
    Given El usuario está en la página principal de carga de documentos
    When El usuario selecciona la opción 'cargar documentos'
    Then El sistema muestra opción para carga única y carga múltiple

    When El usuario elige 'carga en un solo archivo'
    Then Se habilita un único recuadro para subir el archivo

    When El usuario elige 'cargar documentos por separado'
    Then Se muestran múltiples recuadros correspondientes a cada documento requerido