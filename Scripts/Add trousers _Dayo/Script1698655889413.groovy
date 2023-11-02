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

WebUI.click(findTestObject('Object Repository/Page_SECRET SALES  GIFTS FOR THEM, GIFTS FO_4fd8cd/line'))

WebUI.click(findTestObject('Object Repository/Page_SECRET SALES  GIFTS FOR THEM, GIFTS FO_4fd8cd/li_Clothing'))

WebUI.click(findTestObject('Object Repository/Page_SECRET SALES  GIFTS FOR THEM, GIFTS FO_4fd8cd/a_Shop All'))

WebUI.click(findTestObject('Object Repository/Page_Clothing/button_Categories'))

WebUI.click(findTestObject('Object Repository/Page_Clothing/span_Trousers'))

WebUI.click(findTestObject('Object Repository/Page_Trousers/p_Nike'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Nike Mens Fleece Joggers in Black/select_Please select a sizeSmallMediumLargeX-Large'), 
    '295385', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Nike Mens Fleece Joggers in Black/select_12345'), '3', 
    true)

WebUI.click(findTestObject('Object Repository/Page_Nike Mens Fleece Joggers in Black/button_Add to Bag'))

WebUI.closeBrowser()

