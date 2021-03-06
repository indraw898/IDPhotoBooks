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
import internal.GlobalVariable as GlobalVariable

//Import java for the Create Folder Function
import java.io.File
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

int x = 1
Path subpath = Paths.get("D://Test IPB//Result" + "//" + GlobalVariable.SetCreateFolder + "//Run_" + x)

if (!Files.notExists(subpath)){
	while (!Files.notExists(subpath)) {
		if (!Files.exists(Paths.get("D://Test IPB//Result" + "//" + GlobalVariable.SetCreateFolder + "//Run_" + x)))
		{	
				Files.createDirectories(Paths.get("D://Test IPB//Result" + "//" + GlobalVariable.SetCreateFolder + "//Run_" + x))
				break				
			}
			x += 1
	}
	
}
else{

	Files.createDirectories(Paths.get("D://Test IPB//Result" + "//" + GlobalVariable.SetCreateFolder + "//Run_" + x))

}

//Set path for the capture result
Path setsubpath = Paths.get("D://Test IPB//Result" + "//" + GlobalVariable.SetCreateFolder + "//Run_" + x)
GlobalVariable.SetPathCapture = setsubpath

