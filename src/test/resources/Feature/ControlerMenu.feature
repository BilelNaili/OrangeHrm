#Author: your.email@your.domain.com
Feature: controler menu de la page home

  Scenario Outline: Se connecter sur la page home et verifier que le menu fonctionne
    Given Se connecter avec des identifiants valides
    When Cliquer sur le le bouton "<menu>"
    Then Se rediriger vers la page "<menu>"
    Examples:
      | menu  |
      | Admin |
      | PIM   |
      | Leave |
