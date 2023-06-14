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

WebUI.click(findTestObject('THANOS/Homepage/Menu Portfolio'))

WebUI.click(findTestObject('THANOS/Portofolio Kontes/Filter Jenis Paket'))

if (jenispaket == 'bronze') {
    WebUI.click(findTestObject('THANOS/Portofolio Kontes/Bronze filter'))
} else if (jenispaket == 'silver') {
    WebUI.click(findTestObject('THANOS/Portofolio Kontes/Silver filter'))
} else {
    WebUI.click(findTestObject('THANOS/Portofolio Kontes/Gold filter'))
}

filterdipilih = WebUI.getText(findTestObject('THANOS/Portofolio Kontes/Filter Jenis Paket'))

println(filterdipilih)

jenispaketlabel = WebUI.getText(findTestObject('THANOS/Portofolio Kontes/Badge Kontes Jenis Paket'))

if (jenispaketlabel.contains(filterdipilih)) {
    println('Porto Kontes sudah sesuai dengan filter')
} else {
    println('Porto Kontes tidak sesuai')
}

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

