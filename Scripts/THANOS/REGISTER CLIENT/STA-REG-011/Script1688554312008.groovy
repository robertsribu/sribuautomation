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

WebUI.navigateToUrl('http://128.199.177.111:8002/id/launch/logo-design/packages')

WebUI.scrollToPosition(0, 200)

WebUI.click(findTestObject('THANOS/Halaman Package Kontes Detail/Button Pilih Paket Kontes', [('id') : buttonpilihpaket]))

WebUI.verifyElementPresent(findTestObject('THANOS/Halaman Register Client/Title Halaman Pop Up Register Client'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('THANOS/Halaman Register Client/Input nama lengkap'), namalengkap)

WebUI.setText(findTestObject('THANOS/Halaman Register Client/input email'), email)

WebUI.setText(findTestObject('THANOS/Halaman Register Client/input password'), password)

WebUI.setText(findTestObject('THANOS/Halaman Register Client/Input no telp'), notelp)

WebUI.click(findTestObject('THANOS/Halaman Register Client/Button Kode negara pop up'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('THANOS/Halaman Register Client/Select Kode negara', [('id') : kodenegara]))

WebUI.click(findTestObject('THANOS/Halaman Register Client/Button Daftar Pop Up'))

WebUI.waitForElementPresent(findTestObject('THANOS/Edit Brief Kontes/Edit Brief Kontes Desain Logo/Title Halaman Brief kontes'), 
    20, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('THANOS/Edit Brief Kontes/Edit Brief Kontes Desain Logo/Title Halaman Brief kontes'), 
    1)

WebUI.getUrl()

WebUI.click(findTestObject('THANOS/Homepage/Button Account Menu'))

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Button Username Account client'), 1)

WebUI.getText(findTestObject('THANOS/Homepage/Button Username Account client'))

WebUI.takeFullPageScreenshot()

WebUI.delay(1)

WebUI.closeBrowser()

