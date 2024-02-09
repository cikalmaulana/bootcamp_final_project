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

CustomKeywords.'website.Browser.openBrowser'(GlobalVariable.website_url)

WebUI.waitForElementVisible(findTestObject('Object Repository/User Management Objects/btn_account'), 10)
WebUI.delay(10)
WebUI.click(findTestObject('Object Repository/User Management Objects/btn_account'))

WebUI.waitForElementVisible(findTestObject('Object Repository/User Management Objects/input_login_username'), 10)
WebUI.setText(findTestObject('Object Repository/User Management Objects/input_login_username'), GlobalVariable.username)

WebUI.waitForElementVisible(findTestObject('Object Repository/User Management Objects/input_login_password'), 10)
WebUI.setText(findTestObject('Object Repository/User Management Objects/input_login_password'), GlobalVariable.password)

WebUI.check(findTestObject('Object Repository/User Management Objects/checkbox_login_remember_me'))

WebUI.click(findTestObject('Object Repository/User Management Objects/btn_signin'))

WebUI.waitForElementVisible(findTestObject('Object Repository/User Management Objects/span_user_name'), 10)

String displayedUsername = WebUI.getText(findTestObject('Object Repository/User Management Objects/span_user_name'))

assert displayedUsername.equalsIgnoreCase(GlobalVariable.username) : 'Username false!'

WebUI.closeBrowser()
