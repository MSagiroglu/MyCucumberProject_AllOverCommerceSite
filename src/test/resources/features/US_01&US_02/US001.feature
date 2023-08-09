Feature: US_001Siteye kullanıcı (Müşteri) olarak kayıt yapılabilmeli.(Register)

  Background: Siteye gidiş
    Given  AllOverCommerce sitesine gider

  Scenario: TC_01 Pozitif Register İşlemi
    And  Register butonunu tıklar
    And  Username kutucuğuna geçerli bir username girer
    And  Mail kutucuğuna geçerli bir mail girer
    And  Password kutucuğuna geçerli bir password girer
    And  I agree to the privacy policy kutucuğuna tıklar
    When Sign up butonuna tıklar
    But  Kullanıcı 5 saniye bekler
    Then Kayıt işleminin başarıyla gerçekleştiğini doğrular
    * Sayfayı Kapatır

