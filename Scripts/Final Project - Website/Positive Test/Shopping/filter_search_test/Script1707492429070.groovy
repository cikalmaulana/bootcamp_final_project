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

WebUI.waitForElementVisible(findTestObject('Object Repository/Shopping/img_item_speaker'), 10)
WebUI.click(findTestObject('Object Repository/Shopping/img_item_speaker'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Shopping/btn_manufacturer'), 10)
WebUI.click(findTestObject('Object Repository/Shopping/btn_manufacturer'))

def manufacturer = manufacturer
switch (manufacturer) {
	case manufacturer = 'Bose':
		WebUI.waitForElementVisible(findTestObject('Object Repository/Shopping/checkbox_bose'), 10)
		WebUI.click(findTestObject('Object Repository/Shopping/checkbox_bose'))
		break
	case manufacturer = 'HP':
		WebUI.waitForElementVisible(findTestObject('Object Repository/Shopping/checkbox_hp'), 10)
		WebUI.click(findTestObject('Object Repository/Shopping/checkbox_hp'))
		break
	case manufacturer = 'Logitech':
		WebUI.waitForElementVisible(findTestObject('Object Repository/Shopping/checkbox_logitech'), 10)
		WebUI.click(findTestObject('Object Repository/Shopping/checkbox_logitech'))
		break
	default:
		WebUI.waitForElementVisible(findTestObject('Object Repository/Shopping/checkbox_bose'), 10)
		WebUI.click(findTestObject('Object Repository/Shopping/checkbox_bose'))
		break
}

WebUI.click(findTestObject('Object Repository/Shopping/btn_color'))

def color = color
switch (color) {
	case color = 'Black':
		WebUI.waitForElementVisible(findTestObject('Object Repository/Shopping/btn_color_black'), 10)
		WebUI.click(findTestObject('Object Repository/Shopping/btn_color_black'))
		break
	case color = 'Blue':
		WebUI.waitForElementVisible(findTestObject('Object Repository/Shopping/btn_color_blue'), 10)
		WebUI.click(findTestObject('Object Repository/Shopping/btn_color_blue'))
		break
	case color = 'Red':
		WebUI.waitForElementVisible(findTestObject('Object Repository/Shopping/btn_color_red'), 10)
		WebUI.click(findTestObject('Object Repository/Shopping/btn_color_red'))
		break
	case color = 'White':
		WebUI.waitForElementVisible(findTestObject('Object Repository/Shopping/btn_color_white'), 10)
		WebUI.click(findTestObject('Object Repository/Shopping/btn_color_white'))
		break
	default:
		WebUI.waitForElementVisible(findTestObject('Object Repository/Shopping/btn_color_black'), 10)
		WebUI.click(findTestObject('Object Repository/Shopping/btn_color_black'))
		break
}

WebUI.delay(5)
WebUI.closeBrowser()