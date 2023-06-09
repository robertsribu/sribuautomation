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

WebUI.click(findTestObject('THANOS/Homepage/Menu Cari Freelancer'))

WebUI.click(findTestObject('THANOS/Cari Freelancer/Dropdown Jumlah freelancer yang di lihat'))

WebUI.click(findTestObject('THANOS/Cari Freelancer/Item per page 24'))

WebUI.verifyElementPresent(findTestObject('THANOS/Cari Freelancer/Card Freelancer urutan ke 24'), 0)

WebUI.click(findTestObject('THANOS/Cari Freelancer/Dropdown Jumlah freelancer yang di lihat'))

WebUI.click(findTestObject('THANOS/Cari Freelancer/Item per page 36'))

WebUI.verifyElementPresent(findTestObject('THANOS/Cari Freelancer/Card Freelancer urutan ke 36'), 0)

WebUI.click(findTestObject('THANOS/Cari Freelancer/Dropdown Jumlah freelancer yang di lihat'))

WebUI.click(findTestObject('THANOS/Cari Freelancer/Item per page 48'))

WebUI.verifyElementPresent(findTestObject('THANOS/Cari Freelancer/Card Freelancer urutan ke 48'), 0)

WebUI.click(findTestObject('THANOS/Cari Freelancer/Dropdown Jumlah freelancer yang di lihat'))

WebUI.click(findTestObject('THANOS/Cari Freelancer/Item per page 60'))

WebUI.verifyElementPresent(findTestObject('THANOS/Cari Freelancer/Card Freelancer urutan ke 60'), 0)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

