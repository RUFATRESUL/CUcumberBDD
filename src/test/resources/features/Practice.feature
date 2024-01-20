Feature: herokuapp Delete testi
  @Herokuapp
  Scenario: herokuapp website delete button test etmek
    Given istifadeci "herokuappURL" home sehifesine geder
    And add element button basar
    And istifadeci 3 saniye gozluyer
    Then Delete button gorunene qeder gozluyer
    And delete buttonu gorunur oldugunu test eder
    Then Delete buttonuna basar
    And Delete buttonunun gorunmedigini test eder
    And sehfeni baglar


