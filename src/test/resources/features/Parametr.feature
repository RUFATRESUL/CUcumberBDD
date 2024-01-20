Feature: mehsullar axtarmaq

  Background: Umumi websayta getmek
    Given Amazon websehifesine getmek

  Scenario: Istifadeci searchbox test eder

    When istifadeci "iphone" axtarir
    Then istifadeci neticelerin "iphone" oldugunu test eder

  Scenario: Istifadeci searchbox test eder

    When istifadeci "Selenium" axtarir
    Then istifadeci neticelerin "Selenium" oldugunu test eder


  Scenario: Istifadeci searchbox test eder

    When istifadeci "Samsung" axtarir
    Then istifadeci neticelerin "Samsung" oldugunu test eder
    And istifadeci websehifeni baglayir