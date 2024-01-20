Feature: ClassWork


  Scenario Outline: Istifadeci sutun basligi ile liste almalidir
    Given istifadeci "guruURL" home sehifesinde
    And "<Titles>" sutunundaki butun deyerleri yazdir
    Examples:
      | Titles             |
      | Company            |
      | Group              |
      | Prev Close (Rs)    |
      | Current Price (Rs) |
      | % Change           |

    Scenario: Istifadeci sehifeni bagliyir
      Given sehfeni baglar