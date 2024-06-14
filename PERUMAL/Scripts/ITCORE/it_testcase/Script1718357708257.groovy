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

WebUI.navigateToUrl('http://www.itcorelite.net/')

WebUI.click(findTestObject('Object Repository/itcore/Page_CIsco CCNA CCNP CCIE  Online Training _371a1d/span_Services'))

WebUI.click(findTestObject('Object Repository/itcore/Page_Services  CCNA CCNP CCIE Tamil Trainin_e0bba9/span_ITCEMembers Zone'))

WebUI.click(findTestObject('Object Repository/itcore/Page_ITCEMembers  CCNA CCNP CCIE Tamil Trai_d6a8fe/a_Virtual Lab'))

WebUI.click(findTestObject('Object Repository/itcore/Page_ITCEMembers  CCNA CCNP CCIE Tamil Trai_d6a8fe/a_Job Openings'))

WebUI.closeBrowser()

