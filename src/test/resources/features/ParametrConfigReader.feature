Feature: Parametr ve ConfigReader istifadesi
  @ConfigReader

  Scenario: Parametr isledilmesinde ConfigReader istifadesi
    Given istifadeci "faceURL" sehifesine geder
    Then istifadeci 2 saniye gozluyur
    When url in "facebook" oldugunu test et
    And sehifeni bagla

  Scenario: Parametr isledilmesinde ConfigReader istifadesi
    Given istifadeci "amazonURL" sehifesine geder
    Then istifadeci 2 saniye gozluyur
    When url in "amazon" oldugunu test et
    And sehifeni bagla

  Scenario: Parametr isledilmesinde ConfigReader istifadesi
    Given istifadeci "walmartURL" sehifesine geder
    Then istifadeci 2 saniye gozluyur
    When url in "walmart" oldugunu test et
    And sehifeni bagla