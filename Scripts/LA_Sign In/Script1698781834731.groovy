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

WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('https://www.secretsales.com/', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForAlert(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_SECRET SALES  OH, HELLO BLACK FRIDAY  _0edd18/button_Sign-up for 10 OFF  beat the Black F_ef6a2e'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/a_Sign in'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/input_Email Address_username'), 'luke1.ade@gmail.com', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Object Repository/input_Password_password'), 'svaAysTorPmWMmksl/VMYg==', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/input_Password_okta-signin-submit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

