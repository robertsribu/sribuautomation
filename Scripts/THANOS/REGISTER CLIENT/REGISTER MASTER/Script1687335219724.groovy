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

// Dapatkan internal dengan nama "Register Client"
def testData = TestDataFactory.findTestData('Register Client')

// Mendapatkan jumlah baris data pada internal data Register
int rowCount = testData.getRowNumbers()

WebUI.openBrowser('')

WebUI.setViewPortSize(1440, 900)

WebUI.navigateToUrl('http://128.199.177.111:8002')

WebUI.waitForPageLoad(2)

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/THANOS/Homepage/Button Daftar'))

WebUI.click(findTestObject('Object Repository/THANOS/Homepage/Button Daftar as Client'))

WebUI.click(findTestObject('Object Repository/THANOS/Halaman Register Client/Button view password'))

WebUI.delay(1)

// Melakukan iterasi untuk setiap baris data untuk field register
for (def rowIndex = 1; rowIndex <= rowCount; rowIndex++) {
    // Mendapatkan nilai dari setiap kolom data
    String Email = testData.getValue('email', rowIndex)

    String Password = testData.getValue('password', rowIndex)

    String KodeNegara = testData.getValue('kodenegara', rowIndex)

    String NomorTelepon = testData.getValue('notelp', rowIndex)

    // Test Case Register Form
    WebUI.sendKeys(findTestObject('THANOS/Halaman Register Client/input email'), Keys.chord(Keys.CONTROL, 'a') + Keys.chord(
            Keys.BACK_SPACE))

    WebUI.setText(findTestObject('Object Repository/THANOS/Halaman Register Client/input email'), Email)

    WebUI.sendKeys(findTestObject('Object Repository/THANOS/Halaman Register Client/input password'), Keys.chord(Keys.CONTROL, 
            'a') + Keys.chord(Keys.BACK_SPACE))

    WebUI.setText(findTestObject('Object Repository/THANOS/Halaman Register Client/input password'), Password)

    WebUI.click(findTestObject('Object Repository/THANOS/Halaman Register Client/Button dropdown kode negara'))

    WebUI.click(findTestObject('Object Repository/THANOS/Halaman Register Client/Select Kode negara', [('id') : KodeNegara]))

    WebUI.sendKeys(findTestObject('Object Repository/THANOS/Halaman Register Client/Input no telp'), Keys.chord(Keys.CONTROL, 
            'a') + Keys.chord(Keys.BACK_SPACE))

    WebUI.setText(findTestObject('Object Repository/THANOS/Halaman Register Client/Input no telp'), NomorTelepon)

    WebUI.click(findTestObject('Object Repository/THANOS/Halaman Register Client/Button Submit'))

    WebUI.delay(1)
}

//Masuk ke halaman Lengkapi Profile
WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Object Repository/THANOS/Halaman Thankyou Page/Title Halaman'), 1)

WebUI.scrollToPosition(0, 180)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('THANOS/Halaman Thankyou Page/Button Lengkapi Profile'))

WebUI.delay(4)

WebUI.verifyElementPresent(findTestObject('THANOS/Halaman Lengkapi Profile/Text 1 Langkah lagi menggunakan Sribu'), 1)

WebUI.scrollToPosition(0, 210)

WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('THANOS/Halaman Lengkapi Profile/Button Simpan Lengkapi Profile'))

WebUI.verifyElementPresent(findTestObject('THANOS/Halaman Lengkapi Profile/Redhint Nama lengkap'), 1)

WebUI.verifyElementPresent(findTestObject('THANOS/Halaman Lengkapi Profile/Redhint Industri'), 1)

// Melakukan iterasi untuk setiap baris data untuk field lengkapi profile
for (def rowIndex = 1; rowIndex <= 3; rowIndex++) {
    // Mendapatkan nilai dari setiap kolom data
    String NamaLengkap = testData.getValue('namalengkap', rowIndex)

    String Username = testData.getValue('username', rowIndex)

    String Industri = testData.getValue('industri', rowIndex)

    WebUI.scrollToPosition(0, 280)

    //Test Case Lengkapi Profile 
    WebUI.sendKeys(findTestObject('Object Repository/THANOS/Halaman Lengkapi Profile/Input nama lengkap'), Keys.chord(Keys.CONTROL, 
            'a') + Keys.chord(Keys.BACK_SPACE))

    WebUI.setText(findTestObject('THANOS/Halaman Lengkapi Profile/Input nama lengkap'), NamaLengkap)

    WebUI.sendKeys(findTestObject('Object Repository/THANOS/Halaman Lengkapi Profile/Input username'), Keys.chord(Keys.CONTROL, 
            'a') + Keys.chord(Keys.BACK_SPACE))

    WebUI.setText(findTestObject('THANOS/Halaman Lengkapi Profile/Input username'), Username)

    WebUI.click(findTestObject('THANOS/Halaman Lengkapi Profile/Field no telphone'))

    WebUI.scrollToPosition(0, 290)

    WebUI.waitForElementClickable(findTestObject('THANOS/Halaman Lengkapi Profile/Button dropdown Industri'), 1)

    WebUI.click(findTestObject('THANOS/Halaman Lengkapi Profile/Button dropdown Industri'))

    WebUI.scrollToPosition(0, 330)

    WebUI.delay(1)

    WebUI.waitForElementClickable(findTestObject('Object Repository/THANOS/Halaman Lengkapi Profile/Select Industri'), 1)

    WebUI.click(findTestObject('THANOS/Halaman Lengkapi Profile/Select Industri', [('index') : Industri]))

    WebUI.delay(1)

    WebUI.takeScreenshot()

    WebUI.scrollToPosition(0, 280)

    WebUI.click(findTestObject('THANOS/Halaman Lengkapi Profile/Button Simpan Lengkapi Profile'))
}

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

