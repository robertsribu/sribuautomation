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

WebUI.callTestCase(findTestCase('THANOS/LOGIN/Login Freelancer'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('THANOS/Homepage/Button Lihat Job dan Kontes'))

WebUI.click(findTestObject('THANOS/Homepage/Button Pilih Lihat Job'))

WebUI.setText(findTestObject('THANOS/Halaman Lihat Job/Input search job'), 'JOB PUBLIC AUTOMATION 2')

WebUI.click(findTestObject('THANOS/Halaman Lihat Job/Button search job'))

WebUI.delay(1)

WebUI.click(findTestObject('THANOS/Halaman Lihat Job/List Job'))

WebUI.delay(5)

WebUI.click(findTestObject('THANOS/Halaman Job Public Detail/a_Daftar Job'))

WebUI.setText(findTestObject('THANOS/Halaman Job Public Detail/Input penawaran'), '300000')

WebUI.setText(findTestObject('THANOS/Halaman Job Public Detail/Field Alasan Penawaran'), 'Saya berpengalaman')

WebUI.uploadFile(findTestObject('THANOS/Halaman Job Public Detail/Upload Dokumen'), 'C:\\Users\\ekokr\\OneDrive\\Pictures\\01. Katalon Upload\\dummy.png')

WebUI.takeFullPageScreenshot()

WebUI.scrollToElement(findTestObject('THANOS/Halaman Job Public Detail/Button Kirim penawaran'), 0)

WebUI.click(findTestObject('THANOS/Halaman Job Public Detail/Button Kirim penawaran'))

