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

WebUI.callTestCase(findTestCase('THANOS/LOGIN/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('THANOS/Homepage/01-button order'))

WebUI.delay(2)

WebUI.click(findTestObject('THANOS/Homepage/02-Order Kontes'))

WebUI.scrollToPosition(0, 100)

WebUI.delay(1)

WebUI.click(findTestObject('THANOS/Halaman Package Kontes List/Kontes Desain logo'))

WebUI.scrollToPosition(0, 230)

'pilih paket kontes'
if (paket == 'bronze') {
    WebUI.click(findTestObject('THANOS/Halaman Package Kontes Detail/Pricing bronze'))
} else if (paket == 'silver') {
    WebUI.click(findTestObject('THANOS/Halaman Package Kontes Detail/Pricing silver'))
} else {
    WebUI.click(findTestObject('THANOS/Halaman Package Kontes Detail/Pricing gold'))
}

WebUI.click(findTestObject('THANOS/Halaman Package Kontes Detail/Button Pilih Paket'))

WebUI.setText(findTestObject('THANOS/Edit Brief Kontes/Edit Brief Kontes Desain Logo/01-judul kontes'), judulkontes)

WebUI.setText(findTestObject('THANOS/Edit Brief Kontes/Edit Brief Kontes Desain Logo/02-deskripsi project'), deskripsiproject)

WebUI.click(findTestObject('THANOS/Edit Brief Kontes/Edit Brief Kontes Desain Logo/03-pilih industry'))

WebUI.click(findTestObject('THANOS/Edit Brief Kontes/Edit Brief Kontes Desain Logo/04-selected industry', [('id') : industri
            , ('textid') : textindustri]))

WebUI.setText(findTestObject('THANOS/Edit Brief Kontes/Edit Brief Kontes Desain Logo/05-input nama logo'), namalogo)

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('THANOS/Edit Brief Kontes/Edit Brief Kontes Desain Logo/06-pilih logo reference'))

WebUI.scrollToPosition(0, 950)

WebUI.click(findTestObject('THANOS/Edit Brief Kontes/Edit Brief Kontes Desain Logo/07-pilih warna'))

WebUI.scrollToPosition(0, 1400)

WebUI.uploadFile(findTestObject('THANOS/Edit Brief Kontes/Edit Brief Kontes Desain Logo/08-upload files'), fileupload)

WebUI.setText(findTestObject('THANOS/Edit Brief Kontes/Edit Brief Kontes Desain Logo/09-additional info'), additional)

WebUI.scrollToPosition(0, 2000)

'pilih fitur'
if (fitur == 'guarante') {
    WebUI.click(findTestObject('THANOS/Edit Brief Kontes/Edit Brief Kontes Desain Logo/12-pilih fitur guarantee'))
} else if (fitur == 'private') {
    WebUI.click(findTestObject('THANOS/Edit Brief Kontes/Edit Brief Kontes Desain Logo/11-fitur private'))
} else {
    WebUI.click(findTestObject('THANOS/Edit Brief Kontes/Edit Brief Kontes Desain Logo/10-fitur confidential'))
}

WebUI.scrollToPosition(0, 2150)

WebUI.click(findTestObject('THANOS/Edit Brief Kontes/Edit Brief Kontes Desain Logo/13-Submit Brief'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('THANOS/Halaman Pembayaran/Detail order'), 0)

WebUI.scrollToPosition(0, 50)

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

'pilih metode pembayaran'
if (bayar == 'deposit') {
    WebUI.click(findTestObject('THANOS/Halaman Pembayaran/01-Deposit/Bayar pakai Deposit'))

    WebUI.click(findTestObject('THANOS/Halaman Pembayaran/Button proses pembayaran'))

    WebUI.click(findTestObject('THANOS/Halaman Pembayaran/01-Deposit/button submit deposit'))

    WebUI.setText(findTestObject('THANOS/Halaman Pembayaran/01-Deposit/input password deposit'), godpassword)

    WebUI.click(findTestObject('THANOS/Halaman Pembayaran/01-Deposit/button submit input password'))

    WebUI.delay(3)

    WebUI.takeFullPageScreenshot()

    WebUI.delay(1)
} else if (bayar == 'transfer') {
    WebUI.click(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/Bayar pakai bank transfer'))

    WebUI.scrollToPosition(0, 200)

    GlobalVariable.totaltagihan = WebUI.getText(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/totalbayar'))

    String input = GlobalVariable.totaltagihan

    String nominaltagihan = input.replaceAll('[^0-9]', '')

    println(' --- ' + nominaltagihan)

    WebUI.click(findTestObject('THANOS/Halaman Pembayaran/Button proses pembayaran'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/01-input jumlah pembayaran'), nominaltagihan)

    WebUI.scrollToPosition(0, 230)

    WebUI.click(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/02-input tanggal'))

    WebUI.delay(1)

    for (def index : (0..12)) {
        String monthyear = WebUI.getText(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/03-ValueBulan'), FailureHandling.CONTINUE_ON_FAILURE)

        String data = monthyear

        System.print(data + '     ----     ')

        if (data == bulan) {
            break
        } else {
            WebUI.click(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/a_Tanggal Pembayaran_prev__W6fri'))
        }
    }
    
    WebUI.delay(2)

    WebUI.click(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/04-ValueTanggal', [('id') : tanggal]))

    WebUI.setText(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/05-Input nama Bank'), 'asdasd')

    WebUI.setText(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/06-input cabang bank'), 'asdasd')

    WebUI.setText(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/07-input no rekening'), 'asdasd')

    WebUI.setText(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/08-nama pemegang rekening'), 'asdasd')

    WebUI.setText(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/09-input catatan'), 'asdasd')

    WebUI.scrollToPosition(0, 600)

    WebUI.uploadFile(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/10-upload file'), fileupload)

    WebUI.delay(1)

    WebUI.takeFullPageScreenshot()

    WebUI.delay(1)

    WebUI.scrollToPosition(0, 750)

    WebUI.click(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/11-button konfirmasi bayar'))

    WebUI.takeScreenshot('')
}

