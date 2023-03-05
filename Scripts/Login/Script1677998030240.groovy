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

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.setText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ccef60'), 
    'hungquocduong@yahoo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ab63fc'), 
    '/X9k718/GXmFiIHckk+6ZA==')

not_run: WebUI.click(findTestObject('Object Repository/Page_Facebook  log in or sign up/button_Log in'))

WebUI.rightClick(findTestObject('Object Repository/Page_Facebook  log in or sign up/div_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Facebook  log in or sign up/button_Log in_1'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/svg_Ti khon_x1lliihq x1k90msu x2h7rmj x1qfu_99b887'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/g'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/g'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/span_Ti khon_x4k7w5x x1h91t0o x1h9r5lt xv2u_186148'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Facebook/path'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Facebook/g'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/span_ng xut'))

WebUI.closeBrowser()

