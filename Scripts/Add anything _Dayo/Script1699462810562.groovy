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

WebUI.click(findTestObject('Object Repository/Page_SECRET SALES  BLACK FRIDAY PREVIEW  UP_33cc2b/svg_success_icon-icon-5Yc'))

WebUI.click(findTestObject('Object Repository/Page_SECRET SALES  BLACK FRIDAY PREVIEW  UP_33cc2b/a_Black Friday'))

WebUI.click(findTestObject('Object Repository/Page_SECRET SALES  BLACK FRIDAY PREVIEW  UP_33cc2b/a_Shop Women'))

WebUI.click(findTestObject('Object Repository/Page_Products/p_ASOS DESIGN'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ASOS DESIGN all over metallic mosiac e_c7a1b6/select_Please select a size4 UK6 UK8 UK10 U_3ffa33'), 
    '301097', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ASOS DESIGN all over metallic mosiac e_c7a1b6/select_12345'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Page_ASOS DESIGN all over metallic mosiac e_c7a1b6/button_Add to Bag'))

WebUI.click(findTestObject('Object Repository/Page_ASOS DESIGN all over metallic mosiac e_c7a1b6/path'))

WebUI.click(findTestObject('Object Repository/Page_Shopping Bag/button_Proceed to Checkout'))

WebUI.closeBrowser()

