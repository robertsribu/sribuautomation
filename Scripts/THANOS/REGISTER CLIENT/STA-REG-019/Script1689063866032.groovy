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
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

// Dapatkan internal dengan nama "Register Client"
def testData = TestDataFactory.findTestData('Register Client')

// Mendapatkan jumlah baris data pada internal data Register
int rowCount = testData.getRowNumbers()

WebUI.openBrowser('')

WebUI.setViewPortSize(1440, 900)

WebUI.navigateToUrl('http://128.199.177.111:8002')

WebUI.click(findTestObject('THANOS/Homepage/Button Login'))

WebUI.setText(findTestObject('THANOS/Halaman Login/username'), 'koden31823')

WebUI.setText(findTestObject('THANOS/Halaman Login/password'), 'Mobile123+')

WebUI.click(findTestObject('THANOS/Halaman Login/view password'))

WebUI.click(findTestObject('THANOS/Halaman Login/Submit Login'))

WebUI.click(findTestObject('THANOS/Homepage/Button Close Alert Toast'))

WebUI.verifyElementPresent(findTestObject('THANOS/Halaman Lengkapi Profile/Notifikasi Bar'), 1)

WebUI.getText(findTestObject('THANOS/Halaman Lengkapi Profile/Notifikasi Bar'))

WebUI.click(findTestObject('THANOS/Halaman Register Client/Button Navbar Lengkapi Profile'))

WebUI.verifyElementPresent(findTestObject('THANOS/Halaman Lengkapi Profile/Text 1 Langkah lagi menggunakan Sribu'), 1)

// Melakukan iterasi untuk setiap baris data untuk field Lengkapi Profile
for (def rowIndex = 1; rowIndex <= 8; rowIndex++) {
    // Mendapatkan nilai dari setiap kolom data
    String FullName = testData.getValue('namalengkap2', rowIndex)

    String UserName = testData.getValue('username', rowIndex)

    String Industri = testData.getValue('industri', rowIndex)

    // Menginput Field Nama Lengkap
    if (!(FullName.isEmpty())) {
        WebUI.setText(findTestObject('Object Repository/THANOS/Halaman Lengkapi Profile/Input nama lengkap'), FullName)
    } else {
        WebUI.setText(findTestObject('Object Repository/THANOS/Halaman Lengkapi Profile/Input nama lengkap'), FullName)

        WebUI.verifyElementPresent(findTestObject('Object Repository/THANOS/Halaman Lengkapi Profile/Redhint Nama lengkap'), 1)

        def errorMessage = WebUI.getText(findTestObject('Object Repository/THANOS/Halaman Lengkapi Profile/Redhint Nama lengkap'))
        KeywordUtil.markPassed('Error Message: ' + errorMessage)
    }
    
    // Menginput Field Username
    if (!(UserName.isEmpty())) {
		WebUI.sendKeys(findTestObject('Object Repository/THANOS/Halaman Lengkapi Profile/Input username'), Keys.chord(Keys.CONTROL, 'a') + Keys.chord(Keys.BACK_SPACE))
        WebUI.setText(findTestObject('Object Repository/THANOS/Halaman Lengkapi Profile/Input username'), UserName)

        // Verifikasi input username valid
        def validateUsernameFormat = { def username ->
            def regexPattern = '^[a-zA-Z0-9._]+$'
            return username.matches(regexPattern)
        }

        // Kondisi jika username tidak valid
        if (!(validateUsernameFormat(UserName))) {
            WebUI.verifyElementPresent(findTestObject('Object Repository/THANOS/Halaman Lengkapi Profile/Redhint Username'), 1)

            def errorMessage = WebUI.getText(findTestObject('Object Repository/THANOS/Halaman Lengkapi Profile/Redhint Username'))
            KeywordUtil.markPassed('Error Message: ' + errorMessage)
        }
        
        // Kondisi: Input password kurang dari 8 karakter
        if (UserName.length() < 8) {
            WebUI.verifyElementPresent(findTestObject('Object Repository/THANOS/Halaman Lengkapi Profile/Input username'), 1)

            def errorMessage = WebUI.getText(findTestObject('Object Repository/THANOS/Halaman Lengkapi Profile/Input username'))
            KeywordUtil.markPassed('Error Message: ' + errorMessage)
        }
    } else {
		WebUI.sendKeys(findTestObject('Object Repository/THANOS/Halaman Lengkapi Profile/Input username'), Keys.chord(Keys.CONTROL, 'a') + Keys.chord(Keys.BACK_SPACE))
        WebUI.setText(findTestObject('Object Repository/THANOS/Halaman Lengkapi Profile/Input username'), UserName)

        def errorMessage = WebUI.getText(findTestObject('Object Repository/THANOS/Halaman Lengkapi Profile/Redhint Username'))
        KeywordUtil.markPassed('Error Message: ' + errorMessage)
		
        WebUI.click(findTestObject('Object Repository/THANOS/Halaman Lengkapi Profile/Field Email'))
    }
    
    WebUI.scrollToPosition(0, 430)

    // Mengisi dropdown Industri
    if (!(Industri.isEmpty())) {
        WebUI.click(findTestObject('Object Repository/THANOS/Halaman Lengkapi Profile/Button dropdown Industri'))

        WebUI.click(findTestObject('Object Repository/THANOS/Halaman Lengkapi Profile/Select Industri', [('index') : Industri]))
    } else {
        WebUI.click(findTestObject('Object Repository/THANOS/Halaman Lengkapi Profile/Button Simpan Lengkapi Profile'))

        WebUI.verifyElementPresent(findTestObject('Object Repository/THANOS/Halaman Lengkapi Profile/Redhint Industri'), 1)

        def errorMessage = WebUI.getText(findTestObject('Object Repository/THANOS/Halaman Lengkapi Profile/Redhint Industri'))
        KeywordUtil.markPassed('Error Message: ' + errorMessage)
    }
    
	WebUI.scrollToElement(findTestObject('Object Repository/THANOS/Halaman Lengkapi Profile/Field Email'), 1)
	WebUI.click(findTestObject('Object Repository/THANOS/Halaman Lengkapi Profile/Button Simpan Lengkapi Profile'))
    WebUI.delay(1)
}

WebUI.verifyElementPresent(findTestObject('THANOS/Halaman Edit Profile Client/Title Informasi Akun'), 1)

WebUI.verifyElementPresent(findTestObject('THANOS/Halaman Edit Profile Client/Field Email'), 1)

WebUI.verifyElementPresent(findTestObject('THANOS/Halaman Edit Profile Client/Field nama lengkap'), 1)

def Email = WebUI.getText(findTestObject('THANOS/Halaman Edit Profile Client/Field Email'))
KeywordUtil.markPassed('Email Client: ' + Email)

def NamaLengkap = WebUI.getText(findTestObject('THANOS/Halaman Edit Profile Client/Field nama lengkap'))
KeywordUtil.markPassed('Nama Lengkap Client: ' + NamaLengkap)

WebUI.getUrl()

WebUI.scrollToPosition(0, 0)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

