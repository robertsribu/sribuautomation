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

WebUI.callTestCase(findTestCase('JARVIS/Login_Admin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('JARVIS/Approve Job Public/01-button job'))

WebUI.click(findTestObject('JARVIS/Approve Job Public/02-pilih job'))

WebUI.setText(findTestObject('JARVIS/Approve Job Public/03-input title job'), titlejob)

WebUI.click(findTestObject('JARVIS/Approve Job Public/03-button search'))

WebUI.click(findTestObject('JARVIS/Approve Job Public/04-button detail job'))

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('JARVIS/Approve Job Public/05-approve job'), 0)

WebUI.takeScreenshot()

WebUI.click(findTestObject('JARVIS/Approve Job Public/05-approve job'))

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

