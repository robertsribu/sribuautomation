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

WebUI.click(findTestObject('JARVIS/Contest/01-button Contest'))

WebUI.click(findTestObject('JARVIS/Contest/02-button pilih contest'))

WebUI.setText(findTestObject('JARVIS/Contest/03-input search'), GlobalVariable.juduljobpaket)

WebUI.click(findTestObject('JARVIS/Contest/04-button search'))

WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('JARVIS/Contest/05-button pilih detail kontes'))

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

WebUI.scrollToElement(findTestObject('JARVIS/Contest/scrollelement1'), 0)

WebUI.click(findTestObject('JARVIS/Contest/06-button approve'))

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

