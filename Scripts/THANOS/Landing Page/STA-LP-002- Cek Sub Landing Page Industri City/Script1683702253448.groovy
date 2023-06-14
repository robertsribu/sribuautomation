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

WebUI.navigateToUrl('http://128.199.177.111:8002/id/logo-design/bekasi')

WebUI.verifyElementPresent(findTestObject('THANOS/Landing Page/Desain Logo/Breadcrumb Landing Page'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Landing Page/Desain Logo/Title Landing Page'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Landing Page/Desain Logo/Subtitle Landing Page'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Landing Page/Desain Logo/Button Cek Harga Paket'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Landing Page/Desain Logo/H3 Client Landing Page'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Landing Page/Desain Logo/H3 Portfolio Landing Page'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Landing Page/Desain Logo/H3 Harga Paket'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Landing Page/Desain Logo/H3 Contact Us'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Landing Page/Desain Logo/H3 Testimoni'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Landing Page/Desain Logo/H3 Diliput Oleh'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Landing Page/Desain Logo/H3 Order Pertama'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Landing Page/Desain Logo/Button Cek Harga Paket Bottom'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Landing Page/Desain Logo Bekasi/H3 section Industri'), 0)

WebUI.verifyElementPresent(findTestObject('THANOS/Landing Page/Desain Logo Bekasi/H3 section city'), 0)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

