Feature: US_001Siteye kullanıcı (Müşteri) olarak kayıt yapılabilmeli.(Register)

  Background: Siteye gidiş
    Given  AllOverCommerce sitesine gider

  @US01
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
      | name     | mail | password |
      | name     | mail | password |
      | name     | mail | password |


  @US01
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


