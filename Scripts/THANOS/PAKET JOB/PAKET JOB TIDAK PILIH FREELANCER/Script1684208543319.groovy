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

WebUI.callTestCase(findTestCase('THANOS/LOGIN/Login'), [('usernameclient') : 'ekoclient', ('passwordclient') : 'mobile123+'], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('THANOS/Homepage - Login/01-button order'))

WebUI.click(findTestObject('THANOS/Homepage - Login/03-Button lihat paket'))

WebUI.delay(1)

WebUI.scrollToPosition(0, 200)

WebUI.click(findTestObject('THANOS/Halaman Package Job List/Subkategori/Desain logo'))

WebUI.scrollToPosition(0, 200)

WebUI.delay(1)

WebUI.click(findTestObject('THANOS/Halaman Paket Job Detail/p_Bandingkan Paket'))

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

if (paket == 'basic') {
    WebUI.click(findTestObject('THANOS/Halaman Paket Job Detail/Pricing Basic'))
} else if (paket == 'plus') {
    WebUI.click(findTestObject('THANOS/Halaman Paket Job Detail/Pricing Plus'))
} else {
    WebUI.click(findTestObject('THANOS/Halaman Paket Job Detail/Pricing Gold'))
}

WebUI.delay(1)

WebUI.click(findTestObject('THANOS/Halaman Paket Job Detail/button_Pilih Paket'))

WebUI.setText(findTestObject('THANOS/Edit Brief Paket/Edit Brief Paket Desain Logo/Field jelaskan kebutuhan'), kebutuhan)

WebUI.scrollToPosition(0, 300)

WebUI.delay(1)

WebUI.uploadFile(findTestObject('THANOS/Edit Brief Paket/Edit Brief Paket Desain Logo/upload dokumen tambahan'), dokumen)

WebUI.scrollToPosition(0, 530)

WebUI.click(findTestObject('THANOS/Edit Brief Paket/Edit Brief Paket Desain Logo/Field Inudstri'))

WebUI.click(findTestObject('THANOS/Edit Brief Paket/Edit Brief Paket Desain Logo/Select Industri', [('id') : industri]))

WebUI.scrollToPosition(0, 700)

WebUI.click(findTestObject('THANOS/Edit Brief Paket/Edit Brief Paket Desain Logo/Input tanggal'))

WebUI.delay(1)

for (def index : (0..12)) {
    String monthyear = WebUI.getText(findTestObject('THANOS/Edit Brief Paket/Edit Brief Paket Desain Logo/valuebulan'), 
        FailureHandling.CONTINUE_ON_FAILURE)

    String data = monthyear

    System.print(data + '     ----     ')

    if (data == bulan) {
        break
    } else {
        WebUI.click(findTestObject('THANOS/Edit Brief Paket/Edit Brief Paket Desain Logo/Button next datepicker'))
    }
}

WebUI.delay(1)

WebUI.click(findTestObject('THANOS/Edit Brief Paket/Edit Brief Paket Desain Logo/valuetanggal', [('dateid') : tanggal]))

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('THANOS/Edit Brief Paket/Edit Brief Paket Desain Logo/Button beli paket'))

WebUI.click(findTestObject('THANOS/Edit Brief Paket/Edit Brief Paket Desain Logo/Button setuju'))

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

