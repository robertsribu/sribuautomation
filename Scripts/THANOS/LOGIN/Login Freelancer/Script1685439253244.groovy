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

WebUI.setViewPortSize(1440, 900)

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('THANOS/Homepage/Button Login'))

WebUI.verifyElementPresent(findTestObject('THANOS/Halaman Login/Halaman login'), 0)

WebUI.setText(findTestObject('THANOS/Halaman Login/username'), GlobalVariable.userfreelancer)

WebUI.setText(findTestObject('THANOS/Halaman Login/password'), GlobalVariable.passfreelancer)

WebUI.click(findTestObject('THANOS/Halaman Login/view password'))

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.click(findTestObject('THANOS/Halaman Login/Submit Login'))

WebUI.verifyElementPresent(findTestObject('THANOS/Halaman Login/Berhasil login'), 0)

WebUI.takeFullPageScreenshot()

WebUI.delay(1)

