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

WebUI.click(findTestObject('THANOS/Homepage/01-button order'))

WebUI.click(findTestObject('THANOS/Homepage/03-Button lihat paket'))

WebUI.delay(1)

WebUI.scrollToPosition(0, 200)

WebUI.click(findTestObject('THANOS/Halaman Package Job List/Subkategori/Desain logo'))

WebUI.scrollToPosition(0, 200)

WebUI.takeScreenshot()

WebUI.delay(1)

'pilih paket '
if (paket == 'basic') {
    WebUI.click(findTestObject('THANOS/Halaman Paket Job Detail/Pricing Basic'))
} else if (paket == 'plus') {
    WebUI.click(findTestObject('THANOS/Halaman Paket Job Detail/Pricing Plus'))
} else {
    WebUI.click(findTestObject('THANOS/Halaman Paket Job Detail/Pricing Gold'))
}

WebUI.click(findTestObject('THANOS/Halaman Paket Job Detail/Button saya ingin memilih freelancer', [('pilih') : pilihfreelancer]))

WebUI.delay(1)

WebUI.click(findTestObject('THANOS/Halaman Paket Job Detail/Button pilih paket', [('id') : buttonpilihpaket]))

'pilih freelancer'
WebUI.setText(findTestObject('THANOS/Halaman Paket Job Detail/Field Search Freelancer'), freelancer)

WebUI.click(findTestObject('THANOS/Halaman Paket Job Detail/Button search freelancer'))

WebUI.delay(1)

WebUI.click(findTestObject('THANOS/Halaman Paket Job Detail/Button Pilih Freelancer'))

WebUI.click(findTestObject('THANOS/Halaman Paket Job Detail/Button beli paket'))

WebUI.delay(1)

WebUI.scrollToPosition(0, 500)

WebUI.setText(findTestObject('THANOS/Edit Brief Paket/Edit Brief Paket Desain Logo/Field jelaskan kebutuhan'), kebutuhan)

WebUI.scrollToPosition(0, 700)

WebUI.delay(1)

WebUI.uploadFile(findTestObject('THANOS/Edit Brief Paket/Edit Brief Paket Desain Logo/upload dokumen tambahan'), dokumen)

WebUI.scrollToPosition(0, 900)

WebUI.click(findTestObject('THANOS/Edit Brief Paket/Edit Brief Paket Desain Logo/Field Inudstri'))

WebUI.click(findTestObject('THANOS/Edit Brief Paket/Edit Brief Paket Desain Logo/Select Industri', [('id') : industri]))

WebUI.scrollToPosition(0, 970)

WebUI.click(findTestObject('THANOS/Edit Brief Paket/Edit Brief Paket Desain Logo/Input tanggal'))

WebUI.delay(1)

for (def index : (0..12)) {
    String monthyear = WebUI.getText(findTestObject('THANOS/Edit Brief Paket/Edit Brief Paket Desain Logo/valuebulan'), 
        FailureHandling.CONTINUE_ON_FAILURE)

    String data = monthyear

    System.print('bulan:' + data)

    if (data == bulandeadline) {
        break
    } else {
        WebUI.click(findTestObject('THANOS/Edit Brief Paket/Edit Brief Paket Desain Logo/Button next datepicker'))
    }
}

WebUI.delay(1)

WebUI.click(findTestObject('THANOS/Edit Brief Paket/Edit Brief Paket Desain Logo/valuetanggal', [('dateid') : tanggaldeadline]))

WebUI.takeFullPageScreenshot()

WebUI.scrollToElement(findTestObject('THANOS/Edit Brief Paket/Edit Brief Paket Desain Logo/Button beli paket'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('THANOS/Edit Brief Paket/Edit Brief Paket Desain Logo/Button beli paket'))

WebUI.click(findTestObject('THANOS/Edit Brief Paket/Edit Brief Paket Desain Logo/Button setuju'))

WebUI.delay(1)

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(0, 100)

'pilih metode pembayaran'
if (bayar == 'deposit') {
    WebUI.click(findTestObject('THANOS/Halaman Pembayaran/01-Deposit/Bayar pakai Deposit'))
	
	WebUI.delay(1)
	
	GlobalVariable.juduljobpaket = WebUI.getText(findTestObject('Object Repository/THANOS/Halaman Pembayaran/Text Judul Pekerjaan'))
	
	String judul = GlobalVariable.juduljobpaket
	
	String inputjudul = judul
	
	println('judul pekerjaan : ' + inputjudul)

    WebUI.click(findTestObject('THANOS/Halaman Pembayaran/Button proses pembayaran'))

    WebUI.click(findTestObject('THANOS/Halaman Pembayaran/01-Deposit/button submit deposit'))

    WebUI.setText(findTestObject('THANOS/Halaman Pembayaran/01-Deposit/input password deposit'), godpassowrd)

    WebUI.click(findTestObject('THANOS/Halaman Pembayaran/01-Deposit/button submit input password'))

    WebUI.delay(1)

    WebUI.takeFullPageScreenshot()
	
	WebUI.click(findTestObject('THANOS/Halaman Proforma Invoice/Toast Info'))
	
	WebUI.waitForElementClickable(findTestObject('THANOS/Halaman Proforma Invoice/a_Kembali ke List Tagihan'), 2)
	
	WebUI.click(findTestObject('THANOS/Halaman Proforma Invoice/a_Kembali ke List Tagihan'))
	
	WebUI.verifyElementText(findTestObject('THANOS/Dashboard Client/Tagihan/Status Pembayaran'), 'Sudah Dibayar')
	
	WebUI.click(findTestObject('THANOS/Dashboard Client/Project/Menu Project'))
	
	WebUI.setText(findTestObject('THANOS/Dashboard Client/Project/Field search - project'), GlobalVariable.juduljobpaket)
	
	WebUI.sendKeys(findTestObject('THANOS/Dashboard Client/Project/Field search - project'), Keys.chord(Keys.ENTER))
	
	WebUI.delay(1)
	
	WebUI.click(findTestObject('THANOS/Dashboard Client/Project/Button Lihat Job'))
	
	WebUI.verifyElementText(findTestObject('THANOS/Dashboard Client/Project/Status Job Paket'), 'Menunggu Verifikasi')
	
	WebUI.takeScreenshot()
	
	WebUI.closeBrowser()

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
        String monthyear = WebUI.getText(findTestObject('THANOS/Halaman Pembayaran/07-Bank Transfer/03-ValueBulan'), FailureHandling.CONTINUE_ON_FAILURE)

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

