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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory

WebUI.openBrowser('')

WebUI.setViewPortSize(1440, 900)

WebUI.navigateToUrl('http://128.199.177.111:8002')

// Masuk ke halaman Register
WebUI.click(findTestObject('THANOS/Homepage/Button Daftar'))

WebUI.click(findTestObject('THANOS/Homepage/Button Daftar as Client'))

WebUI.verifyElementPresent(findTestObject('THANOS/Halaman Register Client/Title daftar sebagai client'), 1)

WebUI.click(findTestObject('Object Repository/THANOS/Halaman Register Client/Button view password'))

WebUI.delay(1)

// Test Case Register Form
WebUI.setText(findTestObject('Object Repository/THANOS/Halaman Register Client/Input nama lengkap'), namalengkap)

WebUI.setText(findTestObject('Object Repository/THANOS/Halaman Register Client/input email'), email)

WebUI.setText(findTestObject('Object Repository/THANOS/Halaman Register Client/input password'), password)

WebUI.scrollToPosition(0, 450)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/THANOS/Halaman Register Client/Button dropdown kode negara'))

WebUI.click(findTestObject('Object Repository/THANOS/Halaman Register Client/Select Kode negara', [('id') : kodenegara]))

WebUI.setText(findTestObject('Object Repository/THANOS/Halaman Register Client/Input no telp'), notelp)

WebUI.takeFullPageScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/THANOS/Halaman Register Client/Button Submit'))

//Masuk ke halaman Lengkapi Profile
WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Object Repository/THANOS/Halaman Thankyou Page/Title Halaman'), 1)

WebUI.takeFullPageScreenshot()

WebUI.delay(130)

WebUI.verifyElementPresent(findTestObject('THANOS/Halaman Thankyou Page/Button Kirim ulang verifikasi'), 0)

WebUI.takeScreenshot()

WebUI.click(findTestObject('THANOS/Halaman Thankyou Page/Button Kirim ulang verifikasi'))

WebUI.setText(findTestObject('THANOS/Halaman Thankyou Page/Field input email'), email)

WebUI.click(findTestObject('THANOS/Halaman Thankyou Page/Button Kirim'))

WebUI.scrollToPosition(0, 180)

WebUI.delay(4)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

