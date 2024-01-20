Feature: Practice
  @Practice
  Scenario: istifadeci kecerli testlerle gris testi eder
    Given istifadeci "brcURL" sehifesine gedir
    And istifadeci 2 saniye gozluyur
    Then login yazisina click eder
    And istifadeci 2 saniye gozluyur
    And istifadeci kecersiz email daxil eder
    And istifadeci 2 saniye gozluyur
    And istifadeci yanlis password daxil eder
    And istifadeci 2 saniye gozluyur
    And istifadeci login button click eder
    And istifadeci 2 saniye gozluyur
    And sehifeye giris edile bilmese test eder
    And istifadeci sehifeni baglar