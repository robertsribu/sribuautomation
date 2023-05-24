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

WebUI.callTestCase(findTestCase('null'), [('paket') : 'bronze', ('judulkontes') : 'DESAIN KONTES LUCU'
        , ('deskripsiproject') : 'Desain Kontes Bronze Desain Kontes Bronze Desain Kontes Bronze Desain Kontes Bronze Desain Kontes Bronze Desain Kontes Bronze Desain Kontes Bronze Desain Kontes Bronze '
        , ('industri') : '2', ('textindustri') : 'Akuntansi & Keuangan ', ('namalogo') : 'Logo Design', ('fileupload') : 'C:\\Users\\ekokr\\OneDrive\\Pictures\\01. Katalon Upload\\dummy.png'
        , ('additional') : 'Saya ingin Desain logo yang elegan dan cantik', ('fitur') : 'confidential', ('godpassword') : 'vamfMTv6qshyTZrXqRVQdqxQ1'], 
    FailureHandling.CONTINUE_ON_FAILURE)

if (bayar == 'deposit') {
    WebUI.click(findTestObject('THANOS/Halaman Pembayaran/01-Deposit/Bayar pakai Deposit'))

    WebUI.click(findTestObject('THANOS/Halaman Pembayaran/Button proses pembayaran'))

    WebUI.click(findTestObject('THANOS/Halaman Pembayaran/01-Deposit/button submit deposit'))

    WebUI.setText(findTestObject('THANOS/Halaman Pembayaran/01-Deposit/input password deposit'), godpassword)

    WebUI.click(findTestObject('THANOS/Halaman Pembayaran/01-Deposit/button submit input password'))

    WebUI.delay(3)

    WebUI.takeFullPageScreenshot()

    WebUI.delay(1)
} else if (bayar == 'transferbank') {
    WebUI.click(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/Bayar pakai bank transfer'))

    WebUI.click(findTestObject('THANOS/Halaman Pembayaran/Button proses pembayaran'))

    WebUI.click(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/02-input tanggal'))

    WebUI.delay(1)

    for (def index : (0..12)) {
        String monthyear = WebUI.getText(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/03-ValueBulan'), FailureHandling.CONTINUE_ON_FAILURE)

        String data = monthyear

        System.print(data + '     ----     ')

        if (data == bulan) {
            break
        } else {
            WebUI.click(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/datepicker_prev'))
        }
    }
    
    WebUI.delay(2)

    WebUI.click(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/04-ValueTanggal'))

    WebUI.setText(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/05-Input nama Bank'), 'asdasd')

    WebUI.setText(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/06-input cabang bank'), 'asdasd')

    WebUI.setText(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/07-input no rekening'), 'asdasd')

    WebUI.setText(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/08-nama pemegang rekening'), 'asdasd')

    WebUI.setText(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/09-input catatan'), 'asdasd')

    WebUI.uploadFile(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/10-upload file'), '')
}

