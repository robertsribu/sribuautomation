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

WebUI.callTestCase(findTestCase('THANOS/LOGIN/Login Client'), [('usernameclient') : 'ekoclient', ('passwordclient') : 'mobile123+'], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('THANOS/Dashboard Client/Project/Menu Project'))

WebUI.setText(findTestObject('THANOS/Dashboard Client/Project/Field search - project'), GlobalVariable.juduljobpaket)

WebUI.sendKeys(findTestObject('THANOS/Dashboard Client/Project/Field search - project'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('THANOS/Dashboard Client/Project/List Project'), GlobalVariable.juduljobpaket)

WebUI.click(findTestObject('THANOS/Homepage/Button Lihat Job dan Kontes'))

WebUI.click(findTestObject('THANOS/Homepage/Button Pilih Lihat Kontes'))

WebUI.setText(findTestObject('THANOS/Halaman Lihat Kontes/Field Search'), GlobalVariable.juduljobpaket)

WebUI.click(findTestObject('THANOS/Halaman Lihat Kontes/Button Cari'))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('THANOS/Halaman Lihat Kontes/Judul Kontes'), GlobalVariable.juduljobpaket)

WebUI.takeFullPageScreenshot()

