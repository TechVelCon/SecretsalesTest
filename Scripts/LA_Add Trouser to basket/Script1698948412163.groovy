import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.secretsales.com/')

WebUI.click(findTestObject('Object Repository/Page_SECRET SALES  OH, HELLO BLACK FRIDAY  _0edd18/button_Sign-up for 10 OFF  beat the Black F_ef6a2e'))

WebUI.click(findTestObject('Object Repository/Page_SECRET SALES  OH, HELLO BLACK FRIDAY  _0edd18/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Secret Sales  Sign In/input_Email Address_username'), 'luke1.ade@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Secret Sales  Sign In/input_Password_password'), 'svaAysTorPmWMmksl/VMYg==')

WebUI.click(findTestObject('Object Repository/Page_Secret Sales  Sign In/input_Password_okta-signin-submit'))

WebUI.setText(findTestObject('Object Repository/Page_SECRET SALES  OH, HELLO BLACK FRIDAY  _0edd18/input_Search_productSearchDesktop'), 
    'trouser')

WebUI.sendKeys(findTestObject('Object Repository/Page_SECRET SALES  OH, HELLO BLACK FRIDAY  _0edd18/input_Search_productSearchDesktop'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Search results for trouser/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_Search results for trouser/button_Gender'))

WebUI.click(findTestObject('Object Repository/Page_Search results for trouser/span_Mens'))

WebUI.click(findTestObject('Object Repository/Page_Search results for trouser/img_Items 1 - 48 of 1993_image-image-Q9a im_f41b9c'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Topman tapered cargo trousers with ple_8f8d9a/select_Please select a size30W30L30W32L30W3_62b027'), 
    '292677', true)

WebUI.click(findTestObject('Object Repository/Page_Topman tapered cargo trousers with ple_8f8d9a/button_Add to Bag'))

WebUI.closeBrowser()

