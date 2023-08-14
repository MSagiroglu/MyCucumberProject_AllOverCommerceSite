package allOverCommerce.pages;

import allOverCommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllOverCommerce {
    public AllOverCommerce(){
        PageFactory.initElements(Driver.getDriver(),this);
    }








    // us_01 ve us_02 20 ve 213
    @FindBy(xpath = "//span[normalize-space()='Register']")//Anasayfa daki Register butonu
    public WebElement register;
    @FindBy(xpath = "//input[@id='reg_email']")//Register Sayfasın daki Email kutusu
    public WebElement registerEmail;
    @FindBy(xpath = "//input[@id='reg_password']")//Register Sayfasın daki Password kutusu
    public WebElement registerPassword;
    @FindBy(xpath = "//*[@id='reg_username']")//Register Sayfasın daki Username kutusu
    public WebElement username;
    @FindBy(xpath = "//*[@id='register-policy']")///Register Sayfasın daki "I agree to the privacy policy" kutucuğu
    public WebElement checkBox;
    @FindBy(xpath = "//*[@name='register']")//Register sayfasındaki SignUp butonu
    public WebElement signUp;
    @FindBy(xpath = "//span[text()='Sign Out']")//SignOut butonu
    public WebElement verifySignOut;
    @FindBy(xpath = "(//p[@class='submit-status'])[2]")//Register sayfasındaki"An account is already registered with your email address and username"mesajı.
    public WebElement AnAccountIsAlreadyRegisteredText;
    @FindBy(xpath = "//*[text()='Sign Out']")//SignOut butonu
    public WebElement signOut;
    @FindBy(xpath = "//*[text()='Log out']")//SignOut butonu
    public WebElement logOut1;























































































































































































// us_03 ve us_04 220 ve 413

    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]")
    public WebElement billingAddressButonu;
    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]")
    public WebElement shippingAddressButonu;
    @FindBy(xpath = "//*[@id='billing_phone']")
    public WebElement phoneButonu;
    @FindBy(xpath = "//*[@id='billing_first_name']")
    public WebElement firstNameKutusu;
    @FindBy(xpath = "//*[@id='billing_last_name']")
    public WebElement lastNameKutusu;
    @FindBy(xpath = "//*[@id='billing_address_1']")
    public WebElement streetAdressButonu;
    @FindBy(xpath = "//*[@id='billing_postcode']")
    public WebElement postcodeZipButonu;
    @FindBy(xpath = "//*[@name='billing_city']")
    public WebElement townCityButonu;
    @FindBy(xpath = "//*[@value='Save address']")
    public WebElement saveAddress;




















































































































































































// us_05 ve us_06 420 ve 613

    //Verify you login successfully
    @FindBy(xpath ="//a[@class='login logout inline-type']" )
    public WebElement verificationOfHomePage;
    @FindBy(xpath = "//a[text()='edit your password and account details']")//Click on account details
    public WebElement accountDetails;

    @FindBy(xpath = "//a[text()='Kahverengi Kadin Kazak']")
    public WebElement firstProduct;
    @FindBy(xpath = "//input[@type='text']")
    public  WebElement firstName1;
    @FindBy(xpath = "//button[@id='user_description-html']")
    public WebElement biographytext;
    @FindBy(xpath = "//textarea[@id='user_description']")
    public WebElement biography;
    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement currentPassword;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement saveChanges;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement entryEmail;

    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement search;

    @FindBy(xpath = "//button[@name='add-to-cart']")
    public WebElement addCart;
    @FindBy(xpath = "//span[@class='cart-label']")
    public WebElement iconChart;

    @FindBy(xpath = "//a[@class='button wc-forward']")
    public WebElement viewCart1;

    @FindBy(xpath = "//button[@title='Plus']")
    public WebElement quantity_Plus;
    @FindBy(xpath = "//button[@name='update_cart']")
    public WebElement update_Cart;
    @FindBy(xpath = "//button[@title='Minus']")
    public WebElement quantity_minus;
    @FindBy(xpath = "(//a[text()='Checkout'])[2]")
    public WebElement checkoutButton;
    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement firstname;
    //@FindBy(xpath = "(//span[@class='select2-selection__rendered'])[2]")
//public WebElement province;(//input[@type='radio'])[1]
    @FindBy(xpath = "(//input[@type='radio'])[1]")
    public WebElement wireTransfer;
    @FindBy(xpath = "(//input[@type='radio'])[2]")
    public WebElement payAtTheDoor1;
    @FindBy(xpath = "(//button[@type='submit'])[4]")
    public WebElement placeOrder1;

    @FindBy(xpath = "//p[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success']")
    public WebElement thankYou;

    @FindBy(xpath = "//span[@class='cart-count']")
    public WebElement visibilitOfChartNumber;
    @FindBy(xpath = "//*[text()='Wrong username or password.']")
    public WebElement wrongEmailPassword;
    @FindBy(xpath = "//*[text()='Account Details']")
    public WebElement vertificationAccounDetailsPage;









































































































































// us_07 ve us_08 620 ve 813

    @FindBy(xpath = "//span[text()='Sign In']")
    public WebElement signIn;

    @FindBy(xpath = "(//input[@type='search'])[1]")
    public WebElement aramaKutusu;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement araButonu;

    @FindBy(xpath = "(//*[@class='product-media'])[1]")
    public WebElement ilkUrun;

    @FindBy(xpath = "//*[@data-product_id='14216']")
    public WebElement ilkUrunCompareIkonu;

    @FindBy(xpath = "(//*[@class='product-media'])[2]")
    public WebElement ikinciUrun;

    @FindBy(xpath = "//*[@data-product_id='37464']")
    public WebElement ikinciUrunCompareIkonu;

    @FindBy(xpath = "(//*[@class='product-media'])[3]")
    public WebElement ucuncuUrun;

    @FindBy(xpath = "//*[@data-product_id='37448']")
    public WebElement ucuncuUrunCompareIkonu;

    @FindBy(xpath = "(//*[@class='product-media'])[4]")
    public WebElement dorduncuUrun;

    @FindBy(xpath = "//*[@data-product_id='35571']")
    public WebElement dorduncuUrunCompareIkonu;

    @FindBy(xpath = "(//*[@class='product-media'])[5]")
    public WebElement besinciUrun;

    @FindBy(xpath = "//*[@data-product_id='35224']")
    public WebElement besinciUrunCompareIkonu;

    @FindBy(xpath = "(//h3)[10]")
    public WebElement compareProducts;

//    @FindBy(xpath = "(//img[@decoding='async'])[8]")
//    public WebElement getDorduncuUrun;

    @FindBy(xpath = "//a[@class='btn-remove remove_from_compare fas fa-times']")
    public WebElement ilkUrunSagdakiXButonu;

    @FindBy(xpath = "//a[text()='Start Compare !']")
    public WebElement startCompare;
    @FindBy(xpath = "(//i[@class='w-icon-times-solid'])[1]")
    public WebElement urunUzerindekiXButonu;

    @FindBy(xpath = "(//a[@data-product_id='35571'])[1]")
    public WebElement ikinciUrunUzerindekiXButonu;

    @FindBy(xpath = "(//a[@data-product_id='35224'])[1]")
    public WebElement ucuncuUrunUzerindekiXButonu;

    @FindBy(xpath = "//a[@data-product_id='14216']")
    public WebElement sonUrunUzerindekiXButonu;

    @FindBy(xpath = "(//h2)[2]")
    public WebElement noProductsAddedCompare;

    @FindBy(xpath = "//*[@class='compare-heading']")
    public WebElement fourProductsYazisi;

    @FindBy(xpath = "(//*[@data-product-id='37852'])[2]")
    public WebElement ilkUrunKalpIkonu;

    @FindBy(xpath = "//*[@class='w-icon-heart']")
    public WebElement anaEkranKalpIkonu;

    @FindBy(xpath = "(//*[@class='product-thumbnail'])[1]")
    public WebElement productYazisi;

    @FindBy(xpath = "//button[@title='Quick View']")
    public WebElement quickView;

    @FindBy(xpath = "//*[@value='37852']")
    public WebElement addToCartN;

    @FindBy(xpath = "(//h3)[1]")
    public WebElement cartTotals;

    @FindBy(xpath = "//*[text()='View cart']")
    public WebElement viewCartN;

    @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
    public WebElement proceedToCheckOut;

    @FindBy(xpath = "//input[@value='1']")
    public WebElement shipToDifferentAddressKutucugu;

    @FindBy(xpath = "(//input[@type='radio'])[1]")
    public WebElement wireTransferEFT;

    @FindBy(xpath = "(//input[@type='radio'])[2]")
    public WebElement payAtTheDoor;

//    @FindBy(xpath = "//h4[text()='Shopping Cart']")
//    public WebElement shoppingCart;

    @FindBy(xpath = "//input[@value='1']")
    public WebElement quantity;

    @FindBy(xpath = "//*[text()='Thank you. Your order has been received.']")
    public WebElement siparisTamamlandiYazisi;


















































































    // us_09ve us_10 813 ve 1013
    @FindBy(xpath="//span[text()='Register']")
    public WebElement registerButton;
    @FindBy(xpath="//a[text()='Become a Vendor']")
    public WebElement becomeaVendor;
    @FindBy(xpath="//input[@id='user_email']")
    public WebElement emailKutusu;
    @FindBy(xpath="//input[@id='user_email']")
    public WebElement verificationMessage;
    @FindBy(xpath="//input[@name=\"wcfm_email_verified_input\"]")
    public WebElement recendKutusu;
    @FindBy(xpath="//input[@value='Register']")
    public WebElement register2;
    @FindBy(xpath="//span[@class='wcicon-status-completed']")
    public WebElement SuccessfullyCompleted;
    @FindBy(xpath="//a[text()='Not right now']")
    public WebElement notRightNowButton;
    @FindBy(xpath="//a[@class='login logout inline-type']")
    public WebElement signinOut;
    @FindBy(xpath="//a[text()='Log out']")
    public WebElement logOut;
    @FindBy(xpath="//a[@class='color cetc']")
    public WebElement fakeMailCopy;
    @FindBy(xpath = "(//*[@class=\"hidden-xs hidden-sm klikaciRadek newMail\"])[1]")
    public WebElement codeEmail;
    @FindBy(xpath = "//*[@id=\"predmet\"]")
    public WebElement verificationCode;
    @FindBy(xpath = "//a[text()='Signup as a vendor?']")
    public WebElement signUpVendor;
    @FindBy(xpath = "//span[@class='wcicon-status-cancelled']")
    public WebElement alreadyExistsMail;
    @FindBy(xpath = "//input[@id='passoword']")
    public WebElement password;
    @FindBy(xpath = "//div[@id='password_strength']")
    public WebElement passwordStrength; //..
    //erol











































































































































































// us_11ve us_12 1020 ve 1213

    @FindBy(xpath = "//a[contains(.,'Dashboard')]")
    public WebElement Dashboard;

    @FindBy(xpath = "//a[contains(.,'Store Manager')]")
    public WebElement StoreManager;

    @FindBy(xpath = "(//a[contains(.,'Orders')])[1]")
    public WebElement Orders;

    @FindBy(xpath = "(//a[contains(.,'Downloads')])[1]")
    public  WebElement Downloads;

    @FindBy(xpath = "(//a[contains(.,'Addresses')])[1]")
    public  WebElement Add_resses;

    @FindBy(xpath = "(//a[contains(.,'Account details')])[1]")
    public  WebElement Account_Details;

    @FindBy(xpath = "(//a[contains(.,'Wishlist')])[1]")
    public  WebElement Wishlist;

    @FindBy(xpath = "(//a[contains(.,'Support Tickets')])[1]")
    public  WebElement Support_Tickets;

    @FindBy(xpath = "(//a[contains(.,'Followings')])[1]")
    public  WebElement Followings;

    @FindBy(xpath = "(//a[contains(.,'Logout')])[1]")
    public  WebElement LogOut;

    @FindBy(xpath = "//a[contains(.,'Register')]")
    public WebElement registerLink;

    @FindBy (xpath="//a[contains(.,'Become a Vendor')]")
    public WebElement becomeAVendorLink;

    @FindBy(xpath = "(//a[contains(.,\"Add\")])[2]")
    public WebElement ADD;

    @FindBy(xpath = "//input[@value='maddin.snyder@fixedfor.com']")
    public WebElement EmailAddresssVerify;

    @FindBy(xpath = "(//a[contains(.,'My Account')])[2]")
    public  WebElement MyAccountClick;



















































































































































// us_13 ve us_14 1213 ve 1413

    @FindBy(xpath = "//a[contains(text(),'My Account')]")//--> "My account" Button at the bottom of the homepage
    public WebElement myAccount;
    @FindBy(xpath = "//a[contains(text(),'Addresses')]") //--> "Addresses" Button at the left of the My Account page
    public WebElement addresses;
    @FindBy(xpath = "//a[normalize-space()='Edit Your Shipping Address']")//--> "Edit Your Shipping Address" Button at the right of the My Account page
    public WebElement editShippingAddress;
    @FindBy(xpath = "//input[@id='shipping_first_name']")//--> "First Name" Field at the "Edit Your Shipping Address" page
    public WebElement firstNameShiipping;
    @FindBy(xpath = "//input[@id='shipping_last_name']")//--> "Last Name" Field at the "Edit Your Shipping Address" page
    public WebElement lastName;
    @FindBy(xpath = "//span[@id='select2-shipping_country-container']")//--> "Country / Region" Field at the "Edit Your Shipping Address" page
    public WebElement countryRegion;
    @FindBy(xpath = "//*[@class='select2-search__field']")//--> "Country / Region" Input Field at the "Edit Your Shipping Address" page
    public WebElement countryRegionInputField;
    @FindBy(xpath = "//*[@id=\"shipping_address_1\"]")//--> "Street address" Field at the "Edit Your Shipping Address" page
    public WebElement streetAddress;
    @FindBy(xpath = "//*[@id=\"shipping_city\"]")//--> "Town / City" Field at the "Edit Your Shipping Address" page
    public WebElement townCity;
    @FindBy(xpath = "(//*[@class=\"selection\"])[2]")//--> "State" Field at the "Edit Your Shipping Address" page
    public WebElement state;
    @FindBy(xpath = "//*[@class=\"select2-search__field\"]")//--> "State" Input Field at the "Edit Your Shipping Address" page
    public WebElement stateInputField;
    @FindBy(xpath = "//input[@id='shipping_postcode']")//--> "Zip / Postal Code" Field at the "Edit Your Shipping Address" page
    public WebElement zipCode;
    @FindBy(xpath = "//button[@name='save_address']")//--> "Save Address" Button at the "Edit Your Shipping Address" page
    public WebElement saveAddressButton;
    @FindBy(xpath = "//*[@class=\"woocommerce-message alert alert-simple alert-icon alert-close-top alert-success\"]")//--> "Success" Message at the "Edit Your Shipping Address" page
    public WebElement successMessage;
    @FindBy(xpath = "//li[contains(@class,'alert alert-simple alert-icon alert-close-top alert-danger')]")//--> "First name is a required field" Message at the "Edit Your Shipping Address" page
    public WebElement requirementMessageForSavingAddress;
    @FindBy(xpath = "//main[@id='main']//div[2]//div[1]//a[1]")//--> "Add" Button at the "Address" page
    public WebElement addButton;
    @FindBy(xpath = "//a[normalize-space()='Store Manager']")//--> "Store Manager" Button at the "My Account" page
    public WebElement storeManager;
    @FindBy(xpath = "//span[normalize-space()='Products']")//--> "Products" Button at the "My Account" page
    public WebElement products;
    @FindBy(xpath = "//a[@id='add_new_product_dashboard']")//--> "Add New Product" Button at the "Products" page
    public WebElement addNewProduct;
    @FindBy(xpath = "//*[@id=\"product_type\"]")//--> "Product Type" Field at the "Add New Product" page
    public WebElement productType;
    @FindBy(xpath = "//img[@id='featured_img_display']")//--> "Featured Image" Field at the "Add New Product" page
    public WebElement featuredImage;
    @FindBy(xpath = "//*[text()='Select Files']")//--> "Select Files" Button at the "Upload Image" page
    public WebElement selectFiles;
    @FindBy(xpath = "//img[@id='gallery_img_gimage_0_display']")//--> "Gallery Image" Field at the "Upload Image" page
    public WebElement galleryImage;
    @FindBy(xpath = "//*[@id='__wp-uploader-id-0']/div[4]/div/div[2]/button")//--> "Select" Button at the "Upload Image" page
    public WebElement selectButton;
    @FindBy (xpath = "(//div[@class='media-toolbar-primary search-form'])[4]")//--> "Add to Galery" Button at the "Products" page
    public WebElement addToGalery ;
    @FindBy(xpath = "(//div[@class='media-toolbar-primary search-form'])[2]")//--> "Add to Galery" Button at the "Products" page
    public WebElement addToGalery2 ;
    @FindBy(xpath = "//input[@id=\"pro_title\"]")//--> "Product Title" Field at the "Add New Product" page
    public WebElement productTitle;
    @FindBy(xpath = "//input[@id=\"regular_price\"]")//--> "Price" Field at the "Add New Product" page
    public WebElement price;
    @FindBy(xpath = "//*[@class=\"mce-content-body excerpt post-type-page post-status-publish page-template-default locale-en-us mceContentBody webkit wp-editor html5-captions\"]")//--> "Short Description" Field at the "Add New Product" page
    public WebElement shortDescription;
    @FindBy(xpath = "//*[@class=\"mce-content-body description post-type-page post-status-publish page-template-default locale-en-us mceContentBody webkit wp-editor html5-captions\"]")//--> "Description" Field at the "Add New Product" page
    public WebElement description;
    @FindBy(xpath = "//input[@value=\"230\"]")//--> "Electronics" Checkbox in the "Categories" page
    public WebElement categoriesElectronics;
    @FindBy(xpath = "//input[@value=\"298\"]")//--> "Apple" Checkbox in the "Brands" page
    public WebElement brandsApple;
    @FindBy(xpath = "//*[@id=\"wcfm_products_simple_submit_button\"]")//--> "Submit" Button at the "Add New Product" page
    public WebElement submitButton;
    @FindBy(xpath = "//*[text()='Published']")//--> "Published" Message at the "Add New Product" page
    public WebElement publishedMessage;
    @FindBy(xpath = "//*[text()='Featured img: This field is required.']")//--> "Featured img: This field is required." Message at the "Add New Product" page
    public WebElement featuredImgRequiredMessage;
    @FindBy(xpath = "//*[text()='Gallery Images: This field is required.']")//--> "Gallery Images: This field is required." Message at the "Add New Product" page
    public WebElement galleryImagesRequiredMessage;
    @FindBy(xpath = "//*[text()='Please insert Product Title before submit.']")//--> "Please insert Product Title before submit." Message at the "Add New Product" page
    public WebElement productTitleRequiredMessage;
    @FindBy(xpath = "//*[text()='Product cat: This field is required.']")//--> "Product cat: This field is required." Message at the "Add New Product" page
    public WebElement productCatRequiredMessage;
    @FindBy(xpath = "//*[text()='+Add new category']")//--> "Add new category" Button at the "Add New Product" page
    public WebElement addNewCategory;
    @FindBy(xpath = "//*[@id=\"wcfm_new_cat\"]")//--> "Category Name" Field at the "Add new Product" page
    public WebElement categoryName;
    @FindBy(xpath = "//*[@id=\"wcfm_new_parent_cat\"]")//--> "Parent Category" Field at the "Add new Product" page
    public WebElement parentCategory;
    @FindBy(xpath = "//*[@data-taxonomy=\"product_cat\"]")//--> "ADD" button at the "Add new Product" page
    public WebElement addCategoryButton;
    @FindBy(xpath = "//*[.='+Add new Product brands']")//--> "Add new Product brands" Button at the "Add new Product" page
    public WebElement addNewProductBrands;
    @FindBy(xpath = "//*[@id=\"wcfm_new_product_brand\"]")//--> "Brand Name" Field at the "Add new Product" page
    public WebElement brandName;
    @FindBy(xpath = "//*[@id=\"wcfm_new_parent_product_brand\"]")//--> "Parent Taxonomy" Field at the "Add new Product" page
    public WebElement parentTaxonomy;
    @FindBy(xpath = "//*[@id=\"wcfm_products_manage_form_general_expander\"]/div[2]/div[10]/div/button")//--> "Add" Button at the "Add new Product" page
    public WebElement addBrandsButton;

















































































































// us_15 ve us_16 1420 ve 1613
@FindBy(xpath = "//*[.='Store Manager']") //store Manager my account icindeki
public WebElement storeManagerButton ;
    @FindBy(xpath = "(//*[@class='text'])[4]") //Products button store manager icinde ki
    public WebElement productsButton ;
    @FindBy(xpath = "(//*[@class='text'])[18]") // add new store manager / products icinde ki
    public WebElement addNewButton ;
    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[1]") //add product kismindaki
    public WebElement inventory ;
    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[4]") //add product kismindaki
    public WebElement shipping ;
    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[5]") //add product kismindaki
    public WebElement attributes ;
    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[7]") //add product kismindaki
    public WebElement linked ;
    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[8]") //add product kismindaki
    public WebElement seo ;
    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[10]") //add product kismindaki
    public WebElement advanced ;
    @FindBy(xpath = "//*[@id='sku']") //inventory kisminda ki sku locati
    public WebElement sku ;
    @FindBy(xpath = "(//*[@type='submit'])[2]") // inventory kisminda ki submit butonu
    public WebElement submitInventory ;
    @FindBy(xpath = "//*[@id='manage_stock']") //inventory kisminda manage stock checkboxi
    public WebElement manageStock ;
    @FindBy(xpath = "//*[@id='stock_qty']") //inventory kisminda ki managa stock acildiktan sonraki stock qty
    public WebElement stockQty ;
    @FindBy(xpath = "//*[@id='sold_individually']") //inventory kisminda ki sold individualy
    public  WebElement soldIndividualy ;
    @FindBy(xpath = "//*[@id='backorders']")//inventory kisminda ki allow baskorders
    public WebElement allowBackorders ;
    @FindBy(xpath = "//*[@id='weight']") //shipping kisminda ki weight(kg)
    public WebElement weightShipping ;
    @FindBy(xpath = "//*[@id='_wcfmmp_processing_time']") //shipping kisminda ki  processing time
    public  WebElement processingTime ;
    @FindBy(xpath = "//*[@id='attributes_is_active_1']") //attributes kisminda ki color
    public  WebElement colorAttributes ;
    @FindBy(xpath = "(//*[.='Blue'])[2]")
    public WebElement colorSecim;
    @FindBy(xpath = "//*[@id='attributes_is_active_2']") //attributes kisminda ki size
    public  WebElement sizeAttributes ;
    @FindBy(xpath = "//*[text()='Medium']") //color acildiktan sonraki renk yeri
    public  WebElement sizeSecim ;
    @FindBy(xpath = "//*[@id='product_type']") // Add product sayfasinda ki simple product kismi
    public  WebElement simpleProduct ;
    @FindBy(xpath = "//*[@id='is_virtual']") // Add product sayfasinda ki virtual kismi
    public WebElement virtualAddProduct ;
    @FindBy(xpath = "//*[@id='is_downloadable']")// Add product sayfasinda ki downloadable kismi
    public WebElement downloadableAddProduct ;
    @FindBy(xpath = "//*[@id='pro_title']")// Add product sayfasinda ki product title  kismi
    public  WebElement productTitleAddProduct ;
    @FindBy(xpath = "//*[@class='wcfm_product_manager_cats_checklist_fields']")// Add product sayfasinda ki categories  kismi
    public  WebElement categoriesAddProduct ;
    @FindBy(xpath = "//*[@id='regular_price']")// Add product sayfasinda ki price  kismi
    public  WebElement priceAddProduct ;
    @FindBy(xpath = "//*[@id='sale_price']")// Add product sayfasinda ki Sale price  kismi
    public WebElement salePriceAddProduct ;
    @FindBy(xpath = "(//*[text()='Select Files'])[1]") // product kisminda urun fotografi secimi icin
    public WebElement selectFiles1;
    @FindBy(xpath = "(//*[text()='Select'])[1]") // add new kisminda ki urun ekleme
    public WebElement select ;
    @FindBy(xpath = "//*[@id='gallery_img_gimage_0_display']")
    public WebElement kucukResim ;
    @FindBy(xpath = "//*[@id='featured_img_display']")
    public  WebElement buyukResim ;
    @FindBy(xpath = "(//*[text()='Upload files'])[1]")
    public  WebElement uploadFiles ;
    @FindBy (xpath = "(//div[@class='media-toolbar-primary search-form'])[4]")
    public WebElement lanetButon ;
    @FindBy(xpath = "//*[@value='230']")
    public WebElement categories ;
    @FindBy(xpath = "(//*[text()='Downloadable'])[2]")
    public  WebElement downloadable ;
    @FindBy(xpath = "//*[@id='downloadable_files_name_0']")
    public WebElement nameDownloadeble ;
    @FindBy(xpath = "//*[@name='downloadable_files_file_0_button']")
    public WebElement fileDownloadeble;
    @FindBy(xpath = "(//*[text()='Upload files'])[3]")
    public WebElement uploadFilesDownloadebla ;
    @FindBy(xpath = "(//*[text()='Select Files'])[3]")
    public WebElement selectFilesDownloadebla ;
    @FindBy(xpath = "(//*[text()='Select'])[2]")
    public WebElement selectDownloadebla ;
    @FindBy(xpath = "//*[text()='Iphone Case']")
    public WebElement iphoneProduct ;
    @FindBy(xpath = "wcfm-message wcfm-error")
    public WebElement hataMesaji ;
    @FindBy(xpath = "//*[@name='stock_status']")
    public WebElement  stockStatus ;
    @FindBy(xpath = "(//*[@class='select2-search__field'])[2]")
    public  WebElement searchColar ;
    @FindBy(xpath = "(//*[@class='select2-search__field'])[3]")
    public  WebElement searchSize ;











































































































    // us_17 ve us_18 1620 ve 1813
    @FindBy(xpath = "(//*[@alt='products'])[1]")//--> First product of top 20 best sellers
    public WebElement firstProductOfTop20BestSellers;
    @FindBy(xpath = "(//*[@type='submit'])[2]")//--> Add to cart button
    public WebElement addToCartButton;
    @FindBy(xpath = "(//div//a[@href='https://allovercommerce.com/urun/producds/'])[1]")
    public WebElement firstProductOfCartRightSideView;
    @FindBy(xpath = "(//div//h3//a)[1]") //--> First product after search "kazak"
    public WebElement firstKazak;
    @FindBy(xpath = "//h1[@class='product_title entry-title']") //--> First prduct name element of top 20 best sellers after clicking
    public WebElement nameOfFirstProductOfTop20BestSellersAtOwnPage;
    @FindBy(xpath = "(//div//p//a)[2]")  //--> checkout button
    public WebElement checkOutButton;
    @FindBy(xpath = "//*[.='Billing details']")  //--> Billing details page
    public WebElement orderCompletePage;
    @FindBy(xpath = "//input[@id='billing_first_name']") //--> First name of billing page
    public WebElement firstNameOfBillingPage;
    @FindBy(xpath = "//input[@id='billing_last_name']") //--> Last name of billing page
    public WebElement lastNameOfBillingPage;
    @FindBy(xpath = "//select[@name='billing_country']") //--> Country region dropdown menu
    public WebElement countryRegionOfBillingPage;
    @FindBy(xpath = "//input[@name='billing_address_1']") //--> Address line 1 of billing page
    public WebElement addressLine1OfBillingPage;
    @FindBy(xpath = "//input[@name='billing_postcode']") //--> Postcode of billing page
    public WebElement postcodeOfBillingPage;
    @FindBy(xpath = "//input[@name='billing_city']") //--> City of billing page
    public WebElement townOfBillingPage;
    @FindBy(xpath = "(//select)[2]") //--> State dropdown menu
    public WebElement stateOfBillingPage;
    @FindBy(xpath = "//input[@name='billing_phone']") //--> Phone number of billing page
    public WebElement phoneOfBillingPage;
    @FindBy(xpath = "//input[@name='billing_email']") //--> Email of billing page
    public WebElement emailOfBillingPage;
    @FindBy(xpath = "(//*[@class='woocommerce-Price-amount amount'])[1]") //--> Price of product
    public WebElement priceOfProduct;
    @FindBy(xpath = "//tr[@class='order-total']//bdi[1]")  //--> Total Amount
    public WebElement totalAmount;
    @FindBy(xpath = "//*[@id='payment_method_bacs']") //--> Wire transfer/EFT payment radiobutton
    public WebElement wireTransferEft;
    @FindBy(xpath = "//*[@id='payment_method_cod']") //--> Pay At The Door payment radiobutton
    public WebElement payATTheDoor;
    @FindBy(xpath = "//*[@id='place_order']") //--> Place Order button
    public WebElement placeOrderButton;
    @FindBy(xpath = "//*[.='Thank you. Your order has been received.']") //--> Thank you receive order message
    public WebElement receiveOrderMessage;
    @FindBy(xpath = "(//li//a)[8]") //--> My Orders at the bottom of page
    public WebElement myOrders;
    @FindBy(xpath = "(//*[@class='overview-item'])[1]") //--> order number thank you page
    public WebElement orderNumber1;
    @FindBy(xpath = "(//tr//td//a)[1]") //--> order number my orders page
    public WebElement orderNumber2;
    @FindBy(xpath = "//span[normalize-space()='Sign Out']") //--> Sign Out button
    public WebElement signOutButton;
    @FindBy(xpath = "//a[text()='Log out']") //--> Log Out button
    public WebElement logOutButton;
    @FindBy(xpath = "//a[.='Store Manager']") //--> Store Manager button

    public WebElement storeManager1;

    @FindBy(xpath = "(//div//a//span)[19]") //--> Coupons Buttton
    public WebElement couponsButton;
    @FindBy(xpath = "//span[.='Add New']")  //--> Add New Coupons button
    public WebElement addNewCouponsButton;
    @FindBy(xpath = "//input[@class='wcfm-text wcfm_ele']") //--> New Coupon code textbox
    public WebElement newCouponCode;
    @FindBy(xpath = "//textarea[@id='description']") //--> New Coupon description textbox
    public WebElement newCouponDescription;
    @FindBy(xpath = "//select[@id='discount_type']") //--> New Coupon discount type dropdown
    public WebElement newCouponDiscountType;
    @FindBy(xpath = "//input[@id='expiry_date']") //--> New Coupon expiry date textbox
    public WebElement newCouponExpiryDate;
    @FindBy(xpath = "//input[@id='free_shipping']") //--> New Coupon free shipping checkbox
    public WebElement newCouponFreeShippingCheckbox;
    @FindBy(xpath = "//input[@id='show_on_store']") //--> New Coupon show on store checkbox
    public WebElement newCouponShowOnStoreCheckbox;
    @FindBy(xpath = "//input[@name='submit-data']") //--> New Coupon submit button
    public WebElement newCouponSubmitButton;
    @FindBy(xpath = "(//*[@class='wcfm_dashboard_item_title'])[1]") //--> Created coupon code at coupons list
    public WebElement createdCouponCodeAtCouponsList;
    @FindBy(xpath = "(//*[text()='Allow free shipping'])[1]") //--> Allow free shipping Label
    public WebElement allowFreeShippingLabel;























































































































    // us_19 ve us_20 1820 ve 2013
    @FindBy(xpath = "(//input[@class='form-control'])[1]")//searchBox line
    public WebElement searchBox;

    @FindBy(xpath = "//button[@name='add-to-cart']")//add to cart button
    public WebElement addToCart;

    @FindBy(xpath = "//span[@class='cart-label']")//cart icon
    public WebElement cartIcon;

    @FindBy(xpath = "//a[@class='button wc-forward']")//viewcart button
    public WebElement viewCart;

    @FindBy(xpath = "//button[@title='Plus']")//quantityPlus button
    public WebElement quantityPlus;

    @FindBy(xpath = "//button[@name='update_cart']")//updateCart button
    public WebElement updateCart;

    @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")//PcheckoutButton
    public WebElement PcheckoutButton;

    @FindBy(xpath = "//input[@id='billing_first_name']")//firstName line
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='billing_postcode']")//postcode line
    public WebElement postcode;
    @FindBy(xpath = "//input[@id='billing_city']")//town line
    public WebElement town;

    @FindBy(xpath = "//a[@class='showcoupon']")//enterYourCode text
    public WebElement enterYourCode;

    @FindBy(xpath = "//input[@id='coupon_code']")//couponCode line
    public WebElement couponCode;
    @FindBy(xpath = "//button[@id='place_order']")//placeOrder Button
    public WebElement placeOrder;

    @FindBy(xpath = "//a[normalize-space()='Orders']")//vendorProducts link
    public WebElement vendorProducts;

    @FindBy(xpath = "//a[text()='Go Shop']")//goShop button
    public WebElement goShop;
    @FindBy(xpath = "//a[contains(text(),'PenaPEN')]") //--> PenaPen Text
    public WebElement penapenText;

    @FindBy(xpath = "//span[text()='PenaPEN']") //--> Checkout PenaPen Text
    public WebElement checkoutPenapenText;

    @FindBy(xpath = "(//div/ul/li/a)[4]") //--> ShoppingCart Text
    public WebElement shoppingCartText;

    @FindBy(xpath = "//input[@value='3']") //--> Quantity Numbers==>3
    public WebElement quantityNumber;

    @FindBy(xpath = "//a[contains(text(),'PenaPEN')]") //--> PenaPEN product
    public WebElement PenaPENProduct;


    @FindBy(xpath = "//td[@class='product-name']") //--> PenaPEN x 3
    public WebElement penapenx3;




































































































































}