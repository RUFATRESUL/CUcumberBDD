Feature: Amazon Search Testi


  Scenario: TC01 kullanici searchbox test eder
    Given kullanici amazon sayfasina gider
    When kullanici iphone aratir
    Then kullanici sonuclarin iphone icerdigini test eder
    And kullanici sayfayi kapatir


  Scenario: Istifadeci  searchbox test eder
    Given kullanici amazon sayfasina gider
    When kullanici Selenium axtarir
    Then kullanici sonuclarin Selenium icerdigini test eder
    And kullanici sayfayi kapatir