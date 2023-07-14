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

WebUI.navigateToUrl('http://128.199.177.111:8002/id/dashboard/client/profile')

WebUI.setText(findTestObject('THANOS/Halaman Login/username'), 'jujuj44442')

WebUI.setText(findTestObject('THANOS/Halaman Login/password'), 'asdasd')

WebUI.click(findTestObject('THANOS/Halaman Login/Submit Login'))

WebUI.click(findTestObject('THANOS/Halaman Login/Button close alert toast'))

WebUI.delay(1)

WebUI.click(findTestObject('THANOS/Halaman Login/Button Lengkapi Disini'))

WebUI.delay(1)

WebUI.refresh()

//Masuk ke Halaman Lengkapi Profile
WebUI.waitForElementPresent(findTestObject('THANOS/Halaman Lengkapi Profile/Text 1 Langkah lagi menggunakan Sribu'), 20)

WebUI.verifyElementPresent(findTestObject('THANOS/Halaman Lengkapi Profile/Text 1 Langkah lagi menggunakan Sribu'), 1)

WebUI.verifyElementPresent(findTestObject('THANOS/Halaman Lengkapi Profile/Field Email'), 1)

WebUI.verifyElementPresent(findTestObject('THANOS/Halaman Lengkapi Profile/Field No Telp'), 1)

WebUI.setText(findTestObject('THANOS/Halaman Lengkapi Profile/Input username'), 'clientregis001')

WebUI.scrollToElement(findTestObject('THANOS/Halaman Lengkapi Profile/Button Simpan Lengkapi Profile'), 1)

WebUI.click(findTestObject('THANOS/Halaman Lengkapi Profile/Button dropdown Industri'))

WebUI.click(findTestObject('THANOS/Halaman Lengkapi Profile/Select Industri', [('index') : industri]))

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

