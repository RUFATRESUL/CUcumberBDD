Feature: Background istifadesi


  Background: Ortag addimlar
    Given kullanici amazon sayfasina gider


  Scenario: TC01 kullanici searchbox test eder

    When kullanici "iphone" aratir
    Then kullanici sonuclarin "iphone" icerdigini test eder


  Scenario: Istifadeci  searchbox test eder

    When kullanici "Selenium" axtarir
    Then kullanici sonuclarin "Selenium" icerdigini test eder
    And kullanici sayfayi kapatir