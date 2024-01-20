Feature: Datable saytindan 5 ferqli istifadeci girisi etmeli
@Data
  Scenario Outline: istifadeci 5 ferqli qeyd girisi etmelidir
    When istifadeci "dataURL" anasehifesine geder
    Then istifadeci new buttonuna basar
    And ad bolmesine "<firstname>"yazar
    And istifadeci 1 saniye gozluyur
    And soyad bolmesine "<lastname>"yazar
    And istifadeci 1 saniye gozluyur
    And position bolmesine "<position>"yazar
    And istifadeci 1 saniye gozluyur
    And office bolmesine "<office>"yazar
    And istifadeci 1 saniye gozluyur
    And extension bolmesine "<extension>"yazar
    And istifadeci 1 saniye gozluyur
    And startDate bolmesine "<startDate>"yazar
    And istifadeci 1 saniye gozluyur
    And salary bolmesine "<salary>"yazar
    And istifadeci 1 saniye gozluyur
    And istifadeci create buttonuna basar
    And istifadeci 1 saniye gozluyur
    When istifadeci "<firstname>" ile axtaris eder
    And ad bolmesinde "<firstname>" oldugunu test eder
    Examples:
      | firstname | lastname | position | office | extension | startDate  | salary |
      | rufat     | rasulov  | QA       | Baku   | cucumber  | 2020-11-14 | 5000   |
      | murad     | ehmedov  | frontend | Ankara | react     | 2019-11-14 | 89000  |
      | eli       | selimov  | backend  | London | java      | 2018-11-14 | 50000  |
#      | rza       | rzayev   | Devops   | Paris  | kubernets | 2022-11-14 | 7000   |

  Scenario: Istifadeci sehefeni baglar
      Given sehfeni baglar