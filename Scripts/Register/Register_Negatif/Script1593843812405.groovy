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
import java.lang.String as String


//rowNum = 1

GlobalVariable.SetCreateFolder = 'IDPhotoBooks'

GlobalVariable.SetSeparate = 'CallCreateSubFolder'

WebUI.callTestCase(findTestCase('Services/SVC_Separate'), null)

WebUI.openBrowser(findTestData('URL/URL').getValue(1, 1))

WebUI.maximizeWindow()

//GlobalVariable.SetTestScriptID = findTestData('Registrasi/Reg_Negatif').getValue('SCRIPT ID', rowNum)

WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Registrasi/Register Positif/Page_Home  IDPhotobook/div_Akun'))

WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()
WebUI.scrollToElement(findTestObject('Registrasi/Register Positif/Page_Login  IDPhotobook/button_Daftar'), 3, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Registrasi/Register Positif/Page_Login  IDPhotobook/button_Daftar'))

WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)

for (def rowNum = 1; rowNum <= findTestData('Registrasi/Reg_Negatif').getRowNumbers(); rowNum++) {
    if (findTestData('Registrasi/Reg_Negatif').getValue('ACTIVE', rowNum) == 'Y') {
        GlobalVariable.SetTestScriptID = findTestData('Registrasi/Reg_Negatif').getValue('SCRIPT ID', rowNum)

        WebUI.refresh()

        //-----------------------------------------------------------------------------------------------------
        WebUI.setText(findTestObject('Registrasi/Page_IDPhotobook/input_Daftar_mat-input-0'), findTestData('Registrasi/Reg_Negatif').getValue(
                'Nama', rowNum))

        //        WebUI.click(findTestObject('Registrasi/Register Positif/Page_Login  IDPhotobook/div_Nomor WhatsApp'))
        //WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)
        //stop ketika nama tidak sesuai
        //WebUI.verifyTextNotPresent('Nama harus diisi', true, FailureHandling.STOP_ON_FAILURE)
        //		WebUI.verifyTextNotPresent('Nama harus diisi', true, FailureHandling.CONTINUE_ON_FAILURE)
        //-----------------------------------------------------------------------------------------------------
        WebUI.setText(findTestObject('Registrasi/Page_IDPhotobook/input_Nama Lengkap_mat-input-1'), findTestData('Registrasi/Reg_Negatif').getValue(
                'WhatsApp', rowNum))

        //        WebUI.click(findTestObject('Registrasi/Register Positif/Page_Login  IDPhotobook/div_Nomor WhatsApp'))
        //WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)
        //Stop ketika Nomor WhatsApp harus diisi
        //WebUI.verifyTextNotPresent('Nomor WhatsApp harus diisi', true, FailureHandling.STOP_ON_FAILURE)
        //		WebUI.verifyTextNotPresent('Nomor WhatsApp harus diisi', true, FailureHandling.CONTINUE_ON_FAILURE)
        //-----------------------------------------------------------------------------------------------------
        WebUI.setText(findTestObject('Registrasi/Page_IDPhotobook/input_Nomor WhatsApp_mat-input-2'), findTestData('Registrasi/Reg_Negatif').getValue(
                'Email', rowNum))

        //        WebUI.click(findTestObject('Registrasi/Register Positif/Page_Login  IDPhotobook/div_Password'))
        //WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)
        //Stop ketika Format email salah
        //WebUI.verifyTextNotPresent('Format email salah', true, FailureHandling.STOP_ON_FAILURE)
        //		WebUI.verifyTextNotPresent('Format email salah', true, FailureHandling.CONTINUE_ON_FAILURE)
        //-----------------------------------------------------------------------------------------------------
        WebUI.setText(findTestObject('Registrasi/Page_IDPhotobook/input_ Kosongi email jika tidak punya email_mat-input-3'), 
            findTestData('Registrasi/Reg_Negatif').getValue('Password', rowNum))

        //WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)
        //Stop ketika Password minimal 6 karakter
        //WebUI.verifyTextNotPresent('Password minimal 6 karakter', true, FailureHandling.STOP_ON_FAILURE)
        //		WebUI.verifyTextNotPresent('Password minimal 6 karakter', true, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.click(findTestObject('Registrasi/Register Positif/Page_Login  IDPhotobook/button_Daftar_1'))

        //		WebUI.delay(1)		
        WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)

        GlobalVariable.VerifyCheck = WebUI.verifyTextNotPresent('No. Whatsapp / Email telah terdaftar', false, FailureHandling.CONTINUE_ON_FAILURE)

        GlobalVariable.VerifyCheck = WebUI.verifyTextNotPresent('Nama harus diisi', false, FailureHandling.CONTINUE_ON_FAILURE)

        GlobalVariable.VerifyCheck = WebUI.verifyTextNotPresent('Nomor WhatsApp harus berupa angka', false, FailureHandling.CONTINUE_ON_FAILURE)

        GlobalVariable.VerifyCheck = WebUI.verifyTextNotPresent('Nomor WhatsApp harus diisi', false, FailureHandling.CONTINUE_ON_FAILURE)

        GlobalVariable.VerifyCheck = WebUI.verifyTextNotPresent('Format email salah', false, FailureHandling.CONTINUE_ON_FAILURE)

        GlobalVariable.VerifyCheck = WebUI.verifyTextNotPresent('Password minimal 6 karakter', false, FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)
    }
}

WebUI.closeBrowser()

