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

WebUI.navigateToUrl('https://www.annauniv.edu/')

WebUI.click(findTestObject('Object Repository/anna_repo/Page_Anna University, Chennai/b_AlumniCorporate(CEGACTMITSAP)'))

WebUI.switchToWindowTitle('Centre for Alumni Relations and Corporate Affairs-[CARCA]')

WebUI.doubleClick(findTestObject('Object Repository/anna_repo/Page_Centre for Alumni Relations and Corpor_0e6bb1/h2_ABOUT CAMPUSES'))

WebUI.click(findTestObject('Object Repository/anna_repo/Page_Centre for Alumni Relations and Corpor_0e6bb1/a_Read more'))

WebUI.switchToWindowTitle('Centre for Alumni Relations and Corporate Affairs-[CARCA]')

WebUI.click(findTestObject('Object Repository/anna_repo/Page_Centre for Alumni Relations and Corpor_0e6bb1/a_Get Started'))

WebUI.closeBrowser()

