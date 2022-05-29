Feature: modulo de usuarios

  Scenario: Buscar un usuario por correo electronico
    When el usuario quiere buscar un usuario por el correo "jaimecabrera@mail.com"
    Then retorne el usuario buscado


  Scenario: Guardar un usuario
    When el usuario quiere guardar un usuario
    Then guarde el usuario ingresado
    And retorne el usuario ingresado