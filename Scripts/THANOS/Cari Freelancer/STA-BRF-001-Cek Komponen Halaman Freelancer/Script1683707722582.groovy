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

WebUI.navigateToUrl('http://128.199.177.111:8002/')

WebUI.click(findTestObject('THANOS/Homepage/Menu Cari Freelancer'))

WebUI.verifyElementPresent(findTestObject('THANOS/Cari Freelancer/Title Cari freelancer'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Cari Freelancer/H2 Kategori'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Cari Freelancer/Semua Kategori'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Cari Freelancer/Card freelancer'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Cari Freelancer/Search'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Cari Freelancer/Button Search'), 0)

WebUI.verifyElementPresent(findTestObject('Cari Freelancer/Button add favorit'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Cari Freelancer/Dropdown Jumlah freelancer yang di lihat'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Cari Freelancer/Button next pagination'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Cari Freelancer/Button previous pagination'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Cari Freelancer/H3 Order Pertama'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Cari Freelancer/Button Lihat Paket bottom'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Cari Freelancer/Button Order Kontes Desain'), 0)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

