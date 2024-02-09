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

WebUI.click(findTestObject('Object Repository/User Management Objects/btn_create_account'))

WebUI.setText(findTestObject('Object Repository/User Management Objects/input_username'), GlobalVariable.username)

WebUI.setText(findTestObject('Object Repository/User Management Objects/input_email'), email)

WebUI.setText(findTestObject('Object Repository/User Management Objects/input_password'), GlobalVariable.password)

WebUI.setText(findTestObject('Object Repository/User Management Objects/input_confirm_password'), GlobalVariable.password)

WebUI.setText(findTestObject('Object Repository/User Management Objects/input_email'), email)

WebUI.setText(findTestObject('Object Repository/User Management Objects/input_first_name'), first_name)

WebUI.setText(findTestObject('Object Repository/User Management Objects/input_last_name'), last_name)

WebUI.setText(findTestObject('Object Repository/User Management Objects/input_phone_number'), phone_number)

WebUI.selectOptionByLabel(findTestObject('Object Repository/User Management Objects/select_country'), country, false)

WebUI.setText(findTestObject('Object Repository/User Management Objects/input_city'), city)

WebUI.setText(findTestObject('Object Repository/User Management Objects/input_address'), address)

WebUI.setText(findTestObject('Object Repository/User Management Objects/input_state'), state)

WebUI.setText(findTestObject('Object Repository/User Management Objects/input_postal_code'), postal_code)

WebUI.check(findTestObject('Object Repository/User Management Objects/checkbox_agree'))

WebUI.click(findTestObject('Object Repository/User Management Objects/btn_register'))

String displayedUsername = WebUI.getText(findTestObject('Object Repository/User Management Objects/span_user_name'))

assert displayedUsername.equalsIgnoreCase(GlobalVariable.username) : 'Username false!'

WebUI.closeBrowser()

