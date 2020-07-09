import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import bsh.Variable
import internal.GlobalVariable as GlobalVariable


//Import java for the Create Folder Function
import java.io.File
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

WebUI.delay(GlobalVariable.TimeDelay)

///////////////////////////////CREATE DATA FOLDER///////////////////////////////////////////////
String GetPath = GlobalVariable.SetPathCapture
String GetPathData = GetPath + '\\' + GlobalVariable.SetTestScriptID
Path SetPath = Paths.get(GetPathData)

if (Files.notExists(SetPath)){
	try {
		Files.createDirectories(SetPath)
	}
	catch (IOException e) {
		e.printStackTrace()
	}
}

/////////////////////////////////TAKE SCREENSHOT////////////////////////////////////////////////

//int Set_Number

Date today = new Date()

String CapturePath = SetPath

////Berguna untuk mengambil path ketika create excel
GlobalVariable.GetSubCapture = CapturePath
////////////////////////////////

CapturePath += "\\"

if (GlobalVariable.VerifyCheck == true) {
	WebUI.takeScreenshot(((((CapturePath + today.format('ddMMyy')) + today.format('hhmmss')) + '_') + GlobalVariable.SetTestScriptID) + '.png')
}else if (GlobalVariable.VerifyCheck == false) {
	WebUI.takeScreenshot(((((CapturePath + today.format('ddMMyy')) + today.format('hhmmss')) + '_') + GlobalVariable.SetTestScriptID) + '_Failed.png')
}



