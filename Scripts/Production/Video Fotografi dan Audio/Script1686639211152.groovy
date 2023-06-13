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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory

// Dapatkan data internal dengan nama "URLData"
def testData = TestDataFactory.findTestData('Video Fotografi Audio')

// Loop melalui setiap baris data internal
for (int row = 1; row <= testData.getRowNumbers(); row++) {
    // Dapatkan URL dari kolom "URL" pada setiap baris
    String url = testData.getValue('URL', row)

    // Lakukan tindakan yang diinginkan dengan URL
    println("Visiting URL: $url")

    // Lakukan aksi lain sesuai kebutuhan, seperti membuka URL di browser
    // Contoh aksi: Buka URL menggunakan WebUI.openBrowser()
    WebUI.openBrowser(url)

    WebUI.setViewPortSize(1440, 900)

    WebUI.refresh(FailureHandling.CONTINUE_ON_FAILURE)

    // Memeriksa keberadaan elemen TITLE
    isTitlePresent = WebUI.verifyElementPresent(findTestObject('Object Repository/TITLE LANDING PAGE'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    // Memeriksa Landing Page memiliki Title yang menunjukkan Landing Page sukses terbuka
    if (isTitlePresent) {
        println('LANDING PAGE MEMILIKI TITLE')
    } else {
        println('LANDING PAGE TIDAK MEMILIKI TITLE')
    }
}

