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

WebUI.click(findTestObject('Object Repository/Page_SECRET SALES  WHY WAIT FOR BLACK FRIDA_2098a2/svg_Sign up today for a FREE tastecard plus_507bcf'))

WebUI.click(findTestObject('Object Repository/Page_SECRET SALES  WHY WAIT FOR BLACK FRIDA_2098a2/a_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Secret Sales  Sign In/a_NEW TOSECRETSALES'))

WebUI.setText(findTestObject('Object Repository/Page_Secret Sales  Sign In/input_First name_firstName'), 'Tola')

WebUI.setText(findTestObject('Object Repository/Page_Secret Sales  Sign In/input_Last name_lastName'), 'Ajayi')

WebUI.setText(findTestObject('Object Repository/Page_Secret Sales  Sign In/input_Email Address_email'), 'Teeboy@outlook.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Secret Sales  Sign In/input_Password_password'), 'sBWJsejbA8lh+z9xnQhvtw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Secret Sales  Sign In/input_Password_confirm-password'), 'sBWJsejbA8lh+z9xnQhvtw==')

WebUI.click(findTestObject('Object Repository/Page_Secret Sales  Sign In/span_Allow brands I purchase to email me fu_21f89b'))

WebUI.click(findTestObject('Object Repository/Page_Secret Sales  Sign In/input_indicates required field_button butto_1402ef'))

