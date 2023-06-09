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

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Menu Cara Kerja'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Menu Portfolio'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Menu Cari Freelancer'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Menu Order'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Button Login'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Button Daftar'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Button Lihat Paket Home'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Button Order Kontes Desain Home'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/H3 Klien UKM'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/H3 Ratusan Kategori'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/H3 Ratusan Ribu Portofolio'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Button Lihat Portofolio Lainnya'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/H3 Apa Kata klien'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/H3 Kenapa menggunakan Sribu'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/H3 Langkah Mudah'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/H3 Diliput Oleh'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/H3 Order Pertama'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Button Lihat Paket Bottom'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Button Order Kontes Bottom'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/H3 Butuh Bantuan'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Footer Cara memulai Job'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Footer Cara memulai sebagai freelancer'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Footer Pembayaran'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Footer Jaminan di Sribu'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Footer FAQ'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Footer Garansi Uang Kembali'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Footer Peraturan Freelancer'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Footer Peraturan Klien'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Footer Tentang Kami'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Footer Hak Cipta'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Footer Partner'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Footer Press Room'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Footer Syarat dan Ketentuan'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Footer Kebijakan Privasi'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Footer Email Sribu'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Homepage/Footer No HP Sribu'), 0)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

