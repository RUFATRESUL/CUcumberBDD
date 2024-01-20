Feature: Senaryo Outline Practice

  Scenario Outline: ConfigReader ile Senaryo Outline istifadesi
    Given istifadeci "<axtarilanURL>" sehifesine geder
    Then istifadeci 2 saniye gozluyur
    When url in "<istenenURL>" oldugunu test eder
    And sehifeni bagla
    Examples:
      | axtarilanURL | istenenURL |
      | amazonURL    | amazon     |
      | faceURL      | facebook   |
      | walmartURL   | walmart    |
