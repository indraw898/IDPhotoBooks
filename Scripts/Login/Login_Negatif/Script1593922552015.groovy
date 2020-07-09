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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

GlobalVariable.SetCreateFolder = 'IDPhotoBooks'

GlobalVariable.SetSeparate = 'CallCreateSubFolder'

WebUI.callTestCase(findTestCase('Services/SVC_Separate'), null)

WebUI.openBrowser(findTestData('URL/URL').getValue(1, 1))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Login/Login Negatif/Page_Home  IDPhotobook/div_Akun'))

for (def rowNum = 1; rowNum <= findTestData('Login/Login_Negatif').getRowNumbers(); rowNum++) {
    if (findTestData('Login/Login_Negatif').getValue('ACTIVE', rowNum) == 'Y') {
        GlobalVariable.SetTestScriptID = findTestData('Login/Login_Negatif').getValue('SCRIPT ID', rowNum)

        //        WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)
		
		WebUI.delay(2)
        WebUI.refresh()

        WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)

        WebUI.setText(findTestObject('Login/Login Negatif/Page_Login  IDPhotobook/input_Yuuk Login ke IDPhotobookcom_mat-input-0'), 
            findTestData('Login/Login_Negatif').getValue('WhatsApp', rowNum))

        //        WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)
        WebUI.setText(findTestObject('Login/Login Negatif/Page_Login  IDPhotobook/input_Nomor Whatsapp  Email_mat-input-1'), 
            findTestData('Login/Login_Negatif').getValue('Password', rowNum))

        WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('Login/Login Negatif/Page_Login  IDPhotobook/button_Masuk Sekarang'))
		
		WebUI.delay(1)

        WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)

        GlobalVariable.VerifyCheck = WebUI.verifyTextNotPresent('No. Whatsapp / Email tidak ditemukan', false, FailureHandling.CONTINUE_ON_FAILURE)

        GlobalVariable.VerifyCheck = WebUI.verifyTextNotPresent('Password salah', false, FailureHandling.CONTINUE_ON_FAILURE)
		
		WebUI.delay(2)
        WebUI.refresh()

        WebUI.setText(findTestObject('Login/Login Negatif/Page_Login  IDPhotobook/input_Yuuk Login ke IDPhotobookcom_mat-input-0'), 
            findTestData('Login/Login_Negatif').getValue('Email', rowNum))

        //        WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)
        WebUI.setText(findTestObject('Login/Login Negatif/Page_Login  IDPhotobook/input_Nomor Whatsapp  Email_mat-input-1'), 
            findTestData('Login/Login_Negatif').getValue('Password', rowNum))

        WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('Login/Login Negatif/Page_Login  IDPhotobook/button_Masuk Sekarang'))
		
		WebUI.delay(1)

        WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)

        GlobalVariable.VerifyCheck = WebUI.verifyTextNotPresent('No. Whatsapp / Email tidak ditemukan', false, FailureHandling.CONTINUE_ON_FAILURE)

        GlobalVariable.VerifyCheck = WebUI.verifyTextNotPresent('Password salah', false, FailureHandling.CONTINUE_ON_FAILURE)
		
		WebUI.refresh()
    }
}

WebUI.closeBrowser()

