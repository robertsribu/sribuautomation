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

WebUI.callTestCase(findTestCase('THANOS/LOGIN/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('THANOS/Halaman Detail Budget post Job/button order'))

WebUI.click(findTestObject('THANOS/Halaman Detail Budget post Job/button post job'))

WebUI.click(findTestObject('THANOS/Halaman Deskripsi post Job/01 Job Offer'))

WebUI.click(findTestObject('THANOS/Halaman Deskripsi post Job/02-Type Job Public'))

WebUI.click(findTestObject('THANOS/Halaman Deskripsi post Job/03-Button lanjutkan'))

WebUI.setText(findTestObject('THANOS/Halaman Detail Budget post Job/04-Input Judul'), juduljobpekerjaan)

WebUI.click(findTestObject('THANOS/Halaman Detail Budget post Job/05-Pilih kategori'))

WebUI.click(findTestObject('THANOS/Halaman Detail Budget post Job/06-Select kategori', [('id') : catid, ('category') : textcategory]))

System.print(textcategory + '     ----     ')

WebUI.click(findTestObject('THANOS/Halaman Detail Budget post Job/07-Pilih Subcategori'))

WebUI.click(findTestObject('THANOS/Halaman Detail Budget post Job/08-Select Subcategory', [('subcatid') : subcatid, ('subcat') : textsubcat]))

System.print(textsubcat + '     ----     ')

WebUI.setText(findTestObject('THANOS/Halaman Detail Budget post Job/09-Cari skill'), 'edit')

WebUI.click(findTestObject('THANOS/Halaman Detail Budget post Job/pilih skill'))

WebUI.setText(findTestObject('THANOS/Halaman Detail Budget post Job/10-Deskripsi Pekerjaan'), 'Job posting auto test Job posting auto test Job posting auto test Job posting auto test Job posting auto test ')

WebUI.scrollToPosition(0, 570)

WebUI.click(findTestObject('THANOS/Halaman Detail Budget post Job/11-Pilih industri'))

WebUI.click(findTestObject('THANOS/Halaman Detail Budget post Job/pilih industri'))

WebUI.scrollToPosition(0, 600)

WebUI.uploadFile(findTestObject('THANOS/Halaman Detail Budget post Job/12-Unggah dokumen'), 'C:\\Users\\ekokr\\OneDrive\\Pictures\\01. Katalon Upload\\dummy.png')

WebUI.click(findTestObject('THANOS/Halaman Detail Budget post Job/13-input tanggal'))

WebUI.delay(1)

for (def index : (0..12)) {
    String monthyear = WebUI.getText(findTestObject('THANOS/Halaman Detail Budget post Job/span_Mei 2023'), FailureHandling.CONTINUE_ON_FAILURE)

    String data = monthyear

    System.print(data + '     ----     ')

    if (data == bulan) {
        break
    } else {
        WebUI.click(findTestObject('THANOS/Halaman Detail Budget post Job/button next datepicker'))
    }
}

WebUI.delay(2)

WebUI.click(findTestObject('THANOS/Halaman Detail Budget post Job/tanggal', [('date') : tanggal]))

if (pilih == 'offer') {
    WebUI.click(findTestObject('THANOS/Halaman Detail Budget post Job/15-offer'))

    WebUI.setText(findTestObject('THANOS/Halaman Detail Budget post Job/input client budget'), budgetclient)

    WebUI.delay(1)

    WebUI.click(findTestObject('THANOS/Halaman Detail Budget post Job/16-button lanjutkan 2'))

    WebUI.delay(1)

    GlobalVariable.juduljob = WebUI.getText(findTestObject('Object Repository/THANOS/Halaman Preview Job Detail/JudulJob'))

    String juduljob = GlobalVariable.juduljob

    String judulinput = juduljob

    println('Judul Pekerjaan :' + judulinput)

    WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('THANOS/Halaman Preview Job Detail/01-button buat job sekarang'))

    WebUI.delay(2)

    WebUI.takeScreenshot()

    WebUI.closeBrowser()
} else {
    WebUI.click(findTestObject('THANOS/Halaman Detail Budget post Job/14-budget'))

    WebUI.click(findTestObject('THANOS/Halaman Detail Budget post Job/16-button lanjutkan 2'))

    WebUI.delay(1)

    GlobalVariable.juduljob = WebUI.getText(findTestObject('Object Repository/THANOS/Halaman Preview Job Detail/JudulJob'))

    String juduljob = GlobalVariable.juduljob

    String judulinput = juduljob

    println('Judul Pekerjaan :' + judulinput)

    WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('THANOS/Halaman Preview Job Detail/01-button buat job sekarang'))

    WebUI.delay(2)

    WebUI.takeScreenshot()

    WebUI.closeBrowser()
}

