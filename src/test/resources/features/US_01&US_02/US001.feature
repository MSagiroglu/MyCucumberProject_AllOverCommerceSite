Feature: US_001Siteye kullanıcı (Müşteri) olarak kayıt yapılabilmeli.(Register)

  Background: Siteye gidiş
    Given  AllOverCommerce sitesine gider

  @p1
  Scenario Outline: TC_01 Pozitif Register İşlemi
    And  Register butonunu tıklar
    And  Username kutucuğuna geçerli bir "<username>" girer
    And  Mail kutucuğuna geçerli bir "<mail>" mail girer
    And  Password kutucuğuna geçerli bir "<password>" girer
    And  I agree to the privacy policy kutucuğuna tıklar
    When Sign up butonuna tıklar
    But  Kullanıcı 5 saniye bekler
    Then Kayıt işleminin başarıyla gerçekleştiğini doğrular
    * Sekmeleri Kapatır
    Examples:
      | username | mail | password |
      | name     | mail | password |


  @p2
  Scenario Outline: TC_02 Negatif Register İşlemi
    And Register butonunu tıklar
    And Username kutucuğuna geçerli bir "<username>" girer
    And Mail kutucuğuna geçerli bir "<mail>" mail girer
    And Password kutucuğuna geçerli bir "<password>" girer
    #And I agree to the privacy policy kutucuğuna tıklamdan step devam eder
    When Sign up butonuna tıklar
    Then Kayıt işleminin başarıyla gerçekleşmediğini doğrular
    * Sekmeleri Kapatır
    Examples:
      | username | mail | password |
      | username | mail | password |


  Scenario Outline: TC_03 Negatif Register İşlemi
    And Register butonunu tıklar
    #Username girmeden devam eder
    And Mail kutucuğuna geçerli bir "<mail>" mail girer
    And Password kutucuğuna geçerli bir "<password>" girer
    And I agree to the privacy policy kutucuğuna tıklar
    When Sign up butonuna tıklar
    Then Kayıt işleminin başarıyla gerçekleşmediğini doğrular
    * Sekmeleri Kapatır
    Examples:
      | mail | password |
      | mail | password |
      | mail | password |
      | mail | password |
      | mail | password |


  Scenario: TC04 Negatif Register İşlemi Data Table ile
    And Register butonunu tıklar
    Then Data table verilerini gerekli yerlere girer checkbox kutucuğuna tıklamadan kayıt olunamadığını doğrular
    #And I agree to the privacy policy kutucuğuna tıklamdan step devam eder
      | username | mail                | password      |
      | Mustafa1 | fasdfasfa@gmail.com | ewqwreqwrqwer |
      | Leyla1   | dfgdsg@gmail.com    | safasdfas     |
      | Latife1  | fewgfg@gmail.com    | safasdfas     |
      | Erol1    | hterthg@gmail.com   | safasdfas     |

    * Sekmeleri Kapatır


  @excel
  Scenario: TC05 Pozitif Register İşlemi Excell ile
    When Register butonunu tıklar
    Then Kullanıcı excel dosyasındaki "cutomer informations" sayfasındaki bilgileri girer
    * Sayfayı Kapatır






