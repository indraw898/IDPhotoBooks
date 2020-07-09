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

GlobalVariable.SetCreateFolder = 'IDPhotoBooks'

GlobalVariable.SetSeparate = 'CallCreateSubFolder'

GlobalVariable.SetTestScriptID = findTestData('Pembelian/Pembelian').getValue('SCRIPT ID', 2)

WebUI.callTestCase(findTestCase('Services/SVC_Separate'), null)

WebUI.openBrowser(findTestData('URL/URL').getValue(1, 1))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Login/Login Negatif/Page_Home  IDPhotobook/div_Akun'))

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/Login/Login Positif/Page_Login  IDPhotobook/input_Yuuk Login ke IDPhotobookcom_mat-input-0'), 
    findTestData('Login/Login_Positif').getValue('WhatsApp', 1))

WebUI.setText(findTestObject('Object Repository/Login/Login Positif/Page_Login  IDPhotobook/input_Nomor Whatsapp  Email_mat-input-1'), 
    findTestData('Login/Login_Positif').getValue('Password', 1))

WebUI.click(findTestObject('Object Repository/Login/Login Positif/Page_Login  IDPhotobook/button_Masuk Sekarang'))

WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)
//pilih barang 1-------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Object Repository/Pembelian/Beli_Positif/Page_Akun  IDPhotobook/div_Asset 1Katalog'))

WebUI.delay(2)

WebUI.click(findTestObject('Pembelian/Produk/Page_Katalog  IDPhotobook/NewBellaSerries(1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Pembelian/Beli_Positif/Page_Masker Non Medic  IDPhotobook/div_Pesan Sekarang'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Pembelian/Beli_Positif/Page_Masker Non Medic  IDPhotobook/button_Lanjutkan Belanja'))

WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)
//pilih barang 2-------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Object Repository/Pembelian/Beli_Positif/Page_Masker Non Medic  IDPhotobook/div_Asset 1Katalog'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Pembelian/Beli_Positif/Page_Katalog  IDPhotobook/button_Paling Laris'))

WebUI.delay(2)

WebUI.click(findTestObject('Pembelian/Produk/Page_Katalog  IDPhotobook/ElenaSeries(2)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Pembelian/Beli_Positif/Page_Elena Series  IDPhotobook/div_Pesan Sekarang'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Pembelian/Beli_Positif/Page_Elena Series  IDPhotobook/button_Lanjutkan Belanja'))

WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)
//pilih barang 3-------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Object Repository/Pembelian/Beli_Positif/Page_Elena Series  IDPhotobook/div_Asset 1Katalog'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Pembelian/Beli_Positif/Page_Katalog  IDPhotobook/button_Dibawah 150000'))

WebUI.delay(2)

WebUI.click(findTestObject('Pembelian/Produk/Page_Katalog  IDPhotobook/Kalender Jumbo 20R (3)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Pembelian/Beli_Positif/Page_jamu anti corona  IDPhotobook/div_Pesan Sekarang'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Pembelian/Beli_Positif/Page_jamu anti corona  IDPhotobook/button_Lanjutkan Belanja'))

WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)
//pilih barang 4-------------------------------------------------------------------------------------------------------------------------------------------
WebUI.click(findTestObject('Object Repository/Pembelian/Beli_Positif/Page_jamu anti corona  IDPhotobook/div_Asset 1Katalog'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Pembelian/Beli_Positif/Page_Katalog  IDPhotobook/button_Beneran Diskon'))

WebUI.delay(2)

WebUI.click(findTestObject('Pembelian/Produk/Page_Katalog  IDPhotobook/Bronze Series (4)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Pembelian/Beli_Positif/Page_Katalog  IDPhotobook/div_Pesan Sekarang'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Pembelian/Beli_Positif/Page_Katalog  IDPhotobook/button_Bayar Sekarang'))

WebUI.delay(2)
WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.refresh()

WebUI.click(findTestObject('Pembelian/Beli_Negatif/Page_Checkout  IDPhotobook/mat-icon_close_CheckOut'))

//-------------------------------------------------------------------------------------------------------------------------------------------
WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Pembelian/Beli_Negatif/Page_Tas Belanja  IDPhotobook/delete_items_keranjang'))

WebUI.click(findTestObject('Pembelian/Beli_Negatif/Page_Tas Belanja  IDPhotobook/button_Ya0'))
WebUI.delay(2)
WebUI.refresh()
WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Pembelian/Beli_Negatif/Page_Tas Belanja  IDPhotobook/delete_items_keranjang'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.click(findTestObject('Pembelian/Beli_Negatif/Page_Tas Belanja  IDPhotobook/delete_items_keranjang'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.click(findTestObject('Pembelian/Beli_Negatif/Page_Tas Belanja  IDPhotobook/button_Ya0'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(2)
WebUI.refresh()
WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Pembelian/Beli_Negatif/Page_Tas Belanja  IDPhotobook/delete_items_keranjang'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.click(findTestObject('Pembelian/Beli_Negatif/Page_Tas Belanja  IDPhotobook/delete_items_keranjang'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.click(findTestObject('Pembelian/Beli_Negatif/Page_Tas Belanja  IDPhotobook/button_Ya0'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(2)
WebUI.refresh()
WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Pembelian/Beli_Negatif/Page_Tas Belanja  IDPhotobook/delete_items_keranjang'), 5, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.click(findTestObject('Pembelian/Beli_Negatif/Page_Tas Belanja  IDPhotobook/delete_items_keranjang'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.click(findTestObject('Pembelian/Beli_Negatif/Page_Tas Belanja  IDPhotobook/button_Ya0'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(2)
//WebUI.refresh()
//WebUI.verifyElementPresent(findTestObject('Pembelian/Beli_Negatif/Page_Tas Belanja  IDPhotobook/delete_items_keranjang'), 5, FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.click(findTestObject('Pembelian/Beli_Negatif/Page_Tas Belanja  IDPhotobook/delete_items_keranjang'), FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.click(findTestObject('Pembelian/Beli_Negatif/Page_Tas Belanja  IDPhotobook/button_Ya0'), FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.delay(2)

WebUI.callTestCase(findTestCase('Services/SVC_Get Capture'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyTextPresent('Keranjang belanja moms masih kosong!', false, FailureHandling.STOP_ON_FAILURE)


WebUI.closeBrowser()

