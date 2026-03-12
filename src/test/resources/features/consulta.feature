#language: es
Feature: Consulta de información

  Scenario: El usuario realiza una consulta exitosa
    Given el usuario se encuentra en la página de consulta
    When el usuario ingresa los datos requeridos y ejecuta la consulta
    Then el sistema muestra los resultados correspondientes
