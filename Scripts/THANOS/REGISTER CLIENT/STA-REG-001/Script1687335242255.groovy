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

// Masuk ke halaman Register
WebUI.navigateToUrl('http://128.199.177.111:8002')

WebUI.refresh()

WebUI.delay(1)

WebUI.click(findTestObject('THANOS/Homepage/Button Daftar'))

WebUI.click(findTestObject('THANOS/Homepage/Button Daftar as Client'))

WebUI.waitForElementPresent(findTestObject('THANOS/Halaman Register Client/Title daftar sebagai client'), 20)

WebUI.verifyElementPresent(findTestObject('THANOS/Halaman Register Client/Title daftar sebagai client'), 1)

WebUI.click(findTestObject('Object Repository/THANOS/Halaman Register Client/Button view password'))

WebUI.delay(1)

WebUI.scrollToPosition(0, 100)

// Test Case Register Form tanpa input field apapun
WebUI.click(findTestObject('Object Repository/THANOS/Halaman Register Client/Button Submit'))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('THANOS/Halaman Register Client/Redhint Nama Lengkap'), 'Mohon mengisi bagian Nama')

WebUI.verifyElementText(findTestObject('THANOS/Halaman Register Client/Redhint Email'), 'Mohon mengisi bagian Email')

WebUI.verifyElementText(findTestObject('THANOS/Halaman Register Client/Redhint Password'), 'Mohon mengisi bagian Password')

WebUI.verifyElementText(findTestObject('THANOS/Halaman Register Client/Redhint No HP'), 'Mohon mengisi bagian Nomor Telepon')

WebUI.scrollToPosition(0, 200)

// Test Case Register Input Form
WebUI.setText(findTestObject('Object Repository/THANOS/Halaman Register Client/Input nama lengkap'), namalengkap1)

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

//Masuk ke Halaman Thankyou Page
WebUI.waitForElementPresent(findTestObject('THANOS/Halaman Thankyou Page/Title Halaman'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('THANOS/Halaman Thankyou Page/Title Halaman'), 1)

WebUI.scrollToPosition(0, 180)

WebUI.click(findTestObject('THANOS/Halaman Thankyou Page/Button Lengkapi Profile'))

//Masuk ke Halaman Lengkapi Profile
WebUI.waitForElementPresent(findTestObject('THANOS/Halaman Lengkapi Profile/Text 1 Langkah lagi menggunakan Sribu'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('THANOS/Halaman Lengkapi Profile/Text 1 Langkah lagi menggunakan Sribu'), 1)

WebUI.verifyElementNotPresent(findTestObject('THANOS/Halaman Lengkapi Profile/Icon Centang verifikasi email'), 1)

WebUI.verifyElementPresent(findTestObject('THANOS/Halaman Lengkapi Profile/Field Email'), 1)

WebUI.verifyElementPresent(findTestObject('THANOS/Halaman Lengkapi Profile/Field No Telp'), 1)

WebUI.setText(findTestObject('THANOS/Halaman Lengkapi Profile/Input username'), username)

WebUI.scrollToElement(findTestObject('THANOS/Halaman Lengkapi Profile/Button Simpan Lengkapi Profile'), 1)

WebUI.click(findTestObject('THANOS/Halaman Lengkapi Profile/Button dropdown Industri'))

WebUI.click(findTestObject('THANOS/Halaman Lengkapi Profile/Select Industri', [('index') : industri]))

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('THANOS/Halaman Lengkapi Profile/Button Simpan Lengkapi Profile'))

//Masuk ke Halaman Edit Profile
WebUI.verifyElementPresent(findTestObject('THANOS/Halaman Edit Profile Client/Title Informasi Akun'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('THANOS/Halaman Edit Profile Client/Field Email'), 1)

WebUI.verifyElementPresent(findTestObject('THANOS/Halaman Edit Profile Client/Field nama lengkap'), 1)

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

