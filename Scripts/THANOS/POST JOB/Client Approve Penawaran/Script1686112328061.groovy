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

WebUI.click(findTestObject('THANOS/Dashboard Client/Menu Inbox/Inbox'))

WebUI.scrollToPosition(0, 0)

WebUI.setText(findTestObject('THANOS/Dashboard Client/Menu Inbox/Input Search - Inbox'), 'ekokrismn')

WebUI.click(findTestObject('THANOS/Dashboard Client/Menu Inbox/Button Cari - Inbox'))

WebUI.delay(1)

WebUI.click(findTestObject('THANOS/Dashboard Client/Menu Inbox/List Freelancer - Inbox'))

WebUI.delay(3)

WebUI.setText(findTestObject('THANOS/Halaman Penawaran - Client/Field Search Penawaran'), 'JOB PUBLIC AUTOMATION 2')

WebUI.sendKeys(findTestObject('THANOS/Halaman Penawaran - Client/Field Search Penawaran'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('THANOS/Halaman Penawaran - Client/List Job Penawaran'))

WebUI.delay(1)

if (offer == 'terima') {
    WebUI.click(findTestObject('THANOS/Halaman Penawaran - Client/Button Terima penawaran'))

    WebUI.click(findTestObject('THANOS/Halaman Penawaran - Client/Button Terima penawaran'))

    WebUI.verifyElementPresent(findTestObject('THANOS/Halaman Penawaran - Client/Text Setelah Terima penawaran'), 0)

    WebUI.click(findTestObject('THANOS/Halaman Penawaran - Client/Button Setuju dan Rekrut Freelancer'))

    if (bayar == 'deposit') {
        WebUI.click(findTestObject('THANOS/Halaman Pembayaran/01-Deposit/Bayar pakai Deposit'))

        WebUI.click(findTestObject('THANOS/Halaman Pembayaran/Button proses pembayaran'))

        WebUI.click(findTestObject('THANOS/Halaman Pembayaran/01-Deposit/button submit deposit'))

        WebUI.setText(findTestObject('THANOS/Halaman Pembayaran/01-Deposit/input password deposit'), godpassowrd)

        WebUI.click(findTestObject('THANOS/Halaman Pembayaran/01-Deposit/button submit input password'))

        WebUI.delay(3)

        WebUI.takeFullPageScreenshot()

        WebUI.delay(1)
    } else if (bayar == 'transfer') {
        WebUI.click(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/Bayar pakai bank transfer'))

        WebUI.scrollToPosition(0, 200)

        GlobalVariable.juduljobpaket = WebUI.getText(findTestObject('Object Repository/THANOS/Halaman Pembayaran/Text Judul Pekerjaan'))

        String judul = GlobalVariable.juduljobpaket

        String inputjudul = judul

        println('judul pekerjaan : ' + inputjudul)

        GlobalVariable.PINV = WebUI.getText(findTestObject('Object Repository/THANOS/Halaman Pembayaran/Text PINV'))

        String inputpinv = GlobalVariable.PINV

        String pinv = inputpinv

        println('PINV: ' + pinv)

        GlobalVariable.totaltagihan = WebUI.getText(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/totalbayar'))

        String input = GlobalVariable.totaltagihan

        String nominaltagihan = input.replaceAll('[^0-9]', '')

        println('Nominal Tagihan:' + nominaltagihan)

        WebUI.click(findTestObject('THANOS/Halaman Pembayaran/Button proses pembayaran'))

        WebUI.delay(1)

        WebUI.setText(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/01-input jumlah pembayaran'), nominaltagihan)

        WebUI.scrollToPosition(0, 230)

        WebUI.click(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/02-input tanggal'))

        WebUI.delay(1)

        for (def index : (0..12)) {
            String monthyear = WebUI.getText(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/03-ValueBulan'), 
                FailureHandling.CONTINUE_ON_FAILURE)

            String data = monthyear

            System.print('bulan:' + data)

            if (data == bulanbayar) {
                break
            } else {
                WebUI.click(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/a_Tanggal Pembayaran_prev__W6fri'))
            }
        }
        
        WebUI.delay(1)

        WebUI.click(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/04-ValueTanggal', [('id') : tanggalbayar]))

        WebUI.setText(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/05-Input nama Bank'), 'BANK CENTRAL ASIA')

        WebUI.setText(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/06-input cabang bank'), 'JAKARTA')

        WebUI.setText(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/07-input no rekening'), '0099887766')

        WebUI.setText(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/08-nama pemegang rekening'), 'LOREM IPSUM')

        WebUI.setText(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/09-input catatan'), 'PEMBAYARAN TESTING')

        WebUI.scrollToPosition(0, 600)

        WebUI.uploadFile(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/10-upload file'), fileupload)

        WebUI.delay(1)

        WebUI.takeFullPageScreenshot()

        WebUI.delay(1)

        WebUI.scrollToPosition(0, 750)

        WebUI.click(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/11-button konfirmasi bayar'))

        WebUI.delay(1)

        WebUI.takeFullPageScreenshot()

        WebUI.closeBrowser()
    }
} else {
    WebUI.click(findTestObject('THANOS/Halaman Penawaran - Client/Button Negosiasi'))

    WebUI.setText(findTestObject('THANOS/Halaman Penawaran - Client/Field input negosiasi'), '400000')

    WebUI.click(findTestObject('THANOS/Halaman Penawaran - Client/Button Kirim Negosiasi'))
}

