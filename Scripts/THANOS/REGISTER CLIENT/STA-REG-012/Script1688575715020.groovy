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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

// Dapatkan internal dengan nama "Register Client"
def testData = TestDataFactory.findTestData('Register Client')

// Mendapatkan jumlah baris data pada internal data Register
int rowCount = testData.getRowNumbers()

WebUI.openBrowser('')

WebUI.setViewPortSize(1440, 900)

WebUI.navigateToUrl('http://128.199.177.111:8002/id/packages-detail/logo-design')

WebUI.scrollToPosition(0, 200)

WebUI.click(findTestObject('THANOS/Halaman Paket Job Detail/Button pilih paket', [('id') : buttonpilihpaketjob]))

//Test Case Register Pop Up
WebUI.verifyElementPresent(findTestObject('THANOS/Halaman Register Client/Title Halaman Pop Up Register Client'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('THANOS/Halaman Register Client/Button view password pop up'))

// Kondisi Tanpa Input field apapun
WebUI.click(findTestObject('THANOS/Halaman Register Client/Button Daftar Pop Up'))

WebUI.verifyElementText(findTestObject('THANOS/Halaman Register Client/Redhint Nama Lengkap'), 'Mohon mengisi bagian Nama')

WebUI.verifyElementText(findTestObject('THANOS/Halaman Register Client/Redhint Email'), 'Mohon mengisi bagian Email')

WebUI.verifyElementText(findTestObject('THANOS/Halaman Register Client/Redhint Password'), 'Mohon mengisi bagian Password')

WebUI.verifyElementText(findTestObject('THANOS/Halaman Register Client/Redhint No HP'), 'Mohon mengisi bagian Nomor Telepon')

WebUI.takeFullPageScreenshot()

// Melakukan iterasi untuk setiap baris data untuk field register
for (def rowIndex = 1; rowIndex <= rowCount; rowIndex++) {
    // Mendapatkan nilai dari setiap kolom data
    String FullName = testData.getValue('namalengkap1', rowIndex)

    String Email = testData.getValue('email', rowIndex)

    String Password = testData.getValue('password', rowIndex)

    String KodeNegara = testData.getValue('kodenegara', rowIndex)

    String NomorTelepon = testData.getValue('notelp', rowIndex)

	// Mengisi field Nama Lengkap jika tidak kosong
	if (!(FullName.isEmpty())) {
		WebUI.sendKeys(findTestObject('Object Repository/THANOS/Halaman Register Client/Input nama lengkap'), Keys.chord(Keys.CONTROL, 'a') + Keys.chord(Keys.BACK_SPACE))

		WebUI.setText(findTestObject('Object Repository/THANOS/Halaman Register Client/Input nama lengkap'), FullName)
	} else {
		WebUI.sendKeys(findTestObject('Object Repository/THANOS/Halaman Register Client/Input nama lengkap'), Keys.chord(Keys.CONTROL, 'a') + Keys.chord(Keys.BACK_SPACE))

		WebUI.setText(findTestObject('Object Repository/THANOS/Halaman Register Client/Input nama lengkap'), FullName)

		WebUI.verifyElementPresent(findTestObject('Object Repository/THANOS/Halaman Register Client/Redhint Nama Lengkap'), 1)

		def errorMessage = WebUI.getText(findTestObject('THANOS/Halaman Register Client/Redhint Nama Lengkap'))
		KeywordUtil.markPassed('Error Message: ' + errorMessage)
	}
	
	// Mengisi field Email
	if (!(Email.isEmpty())) {
		WebUI.sendKeys(findTestObject('Object Repository/THANOS/Halaman Register Client/input email'), Keys.chord(Keys.CONTROL, 'a') + Keys.chord(Keys.BACK_SPACE))

		WebUI.setText(findTestObject('Object Repository/THANOS/Halaman Register Client/input email'), Email)

		// Verifikasi input email valid
		def validateEmailFormat = { def email ->
			def regexPattern = '^\\w+([.-]?\\w+)*@\\w+([.-]?\\w+)*(\\.\\w{2,3})+$'
			return email.matches(regexPattern)
		}

		// Kondisi jika email tidak valid
		if (!(validateEmailFormat(Email))) {
			WebUI.verifyElementPresent(findTestObject('Object Repository/THANOS/Halaman Register Client/Redhint Email'), 1)

			def errorMessage = WebUI.getText(findTestObject('Object Repository/THANOS/Halaman Register Client/Redhint Email'))
			KeywordUtil.markPassed('Error Message: ' + errorMessage)
		}
	} else {
		WebUI.sendKeys(findTestObject('Object Repository/THANOS/Halaman Register Client/input email'), Keys.chord(Keys.CONTROL, 'a') + Keys.chord(Keys.BACK_SPACE))

		WebUI.setText(findTestObject('Object Repository/THANOS/Halaman Register Client/input email'), Email)

		WebUI.verifyElementPresent(findTestObject('Object Repository/THANOS/Halaman Register Client/Redhint Email'), 1)

		def errorMessage = WebUI.getText(findTestObject('Object Repository/THANOS/Halaman Register Client/Redhint Email'))
		KeywordUtil.markPassed('Error Message: ' + errorMessage)
	}
    
    // Mengisi field Password
    if (!(Password.isEmpty())) {
        WebUI.sendKeys(findTestObject('Object Repository/THANOS/Halaman Register Client/input password'), Keys.chord(Keys.CONTROL, 'a') + Keys.chord(Keys.BACK_SPACE))

        WebUI.setText(findTestObject('Object Repository/THANOS/Halaman Register Client/input password'), Password)
    } else {
        WebUI.sendKeys(findTestObject('Object Repository/THANOS/Halaman Register Client/input password'), Keys.chord(Keys.CONTROL, 'a') + Keys.chord(Keys.BACK_SPACE))

        WebUI.setText(findTestObject('Object Repository/THANOS/Halaman Register Client/input password'), Password)

        WebUI.verifyElementPresent(findTestObject('Object Repository/THANOS/Halaman Register Client/Redhint Password'), 1)

        def errorMessage = WebUI.getText(findTestObject('Object Repository/THANOS/Halaman Register Client/Redhint Password'))
        KeywordUtil.markPassed('Error Message: ' + errorMessage)
    }
    
    // Kondisi: Input password kurang dari 8 karakter
    if (Password.length() < 8) {
        WebUI.verifyElementPresent(findTestObject('Object Repository/THANOS/Halaman Register Client/Redhint Password'), 1)

        def errorMessage = WebUI.getText(findTestObject('Object Repository/THANOS/Halaman Register Client/Redhint Password'))
        KeywordUtil.markPassed('Error Message: ' + errorMessage)
    }
    
    // Input Field Kode Negara
    if (!(KodeNegara.isEmpty())) {
        WebUI.click(findTestObject('THANOS/Halaman Register Client/Button Kode negara pop up'))

        WebUI.click(findTestObject('Object Repository/THANOS/Halaman Register Client/Select Kode negara', [('id') : KodeNegara]))
    }
    
    // Mengisi field No. Telepon 
    if (!(NomorTelepon.isEmpty())) {
        WebUI.sendKeys(findTestObject('Object Repository/THANOS/Halaman Register Client/Input no telp'), Keys.chord(Keys.CONTROL, 'a') + Keys.chord(Keys.BACK_SPACE))

        WebUI.setText(findTestObject('Object Repository/THANOS/Halaman Register Client/Input no telp'), NomorTelepon)
    } else {
        WebUI.sendKeys(findTestObject('Object Repository/THANOS/Halaman Register Client/Input no telp'), Keys.chord(Keys.CONTROL, 'a') + Keys.chord(Keys.BACK_SPACE))

        WebUI.setText(findTestObject('Object Repository/THANOS/Halaman Register Client/Input no telp'), NomorTelepon)

        WebUI.verifyElementPresent(findTestObject('Object Repository/THANOS/Halaman Register Client/Redhint No HP'), 1)

        def errorMessage = WebUI.getText(findTestObject('THANOS/Halaman Register Client/Redhint No HP'))
		KeywordUtil.markPassed('Error Message: ' + errorMessage)
    }
    
    if (NomorTelepon.length() < 9) {
        WebUI.verifyElementPresent(findTestObject('Object Repository/THANOS/Halaman Register Client/Redhint No HP'), 1)

        def errorMessage = WebUI.getText(findTestObject('Object Repository/THANOS/Halaman Register Client/Redhint No HP'))
        KeywordUtil.markPassed('Error Message: ' + errorMessage)
    }
    
    WebUI.click(findTestObject('THANOS/Halaman Register Client/Button Daftar Pop Up'))

    WebUI.delay(1)

    WebUI.takeFullPageScreenshot()

    WebUI.delay(1)
}

WebUI.closeBrowser()

