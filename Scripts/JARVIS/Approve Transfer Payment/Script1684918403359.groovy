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

WebUI.callTestCase(findTestCase('JARVIS/Login Admin'), [('useradmin') : 'rezavoe', ('passwordadmin') : 'mobile123+'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('JARVIS/Payment/Button Payment'))

WebUI.click(findTestObject('JARVIS/Payment/Payment List/Button Payment List'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('JARVIS/Payment/Payment List/Field Proforma Invoice Docnum'), GlobalVariable.PINV)

WebUI.click(findTestObject('JARVIS/Payment/Payment List/Button Search'))

WebUI.click(findTestObject('JARVIS/Payment/Payment List/Button Docnum Pay'))

WebUI.click(findTestObject('JARVIS/Payment/Payment List/Tab Payment'))

WebUI.click(findTestObject('JARVIS/Payment/Payment List/Button Approve Payment'))

WebUI.takeFullPageScreenshot()

WebUI.delay(1)

WebUI.closeBrowser()

