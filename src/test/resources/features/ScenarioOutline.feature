Feature: Senaryo outline istifadesi

  Scenario Outline: Istifadeci istediyi Sozleri axtarir
    Given istifadeci amazon sehifesine daxil olar
    Then istifadeci "<istenilenSoz>" ucun axtaris eder
    Then istifadeci "<istenilenSozunNeticesi>" oldugunu test etmek
    And sehifeni bagla
    Examples:
      | istenilenSoz | istenilenSozunNeticesi |
      | java         | java                   |
      | selenium     | selenium               |
      | samsung      | samsung                |