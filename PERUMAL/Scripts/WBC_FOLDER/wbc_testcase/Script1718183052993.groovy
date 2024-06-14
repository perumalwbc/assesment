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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.msswbc.org/')

WebUI.doubleClick(findTestObject('Object Repository/wbc_repo/Page_MSS WAKF BOARD College Madurai  Offici_95a2a2/span_MANAGEMENT'))

WebUI.click(findTestObject('Object Repository/wbc_repo/Page_Management and committee Details of Ou_d2c67a/span_IQAC'))

WebUI.doubleClick(findTestObject('Object Repository/wbc_repo/Page_ALUMNI REGISTRATION WAKF BOARD COLLEGE_a6f5d0/span_GALLERY'))

WebUI.click(findTestObject('Object Repository/wbc_repo/Page_NAAC LINKS  WAKF BOARD COLLEGE Madurai/span_NIRF'))

WebUI.doubleClick(findTestObject('Object Repository/wbc_repo/Page_NAAC LINKS  WAKF BOARD COLLEGE Madurai/span_NIRF'))

WebUI.closeBrowser()

