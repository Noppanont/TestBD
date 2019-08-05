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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://bda.co.th/')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_BIG DATA AGENCY/a_Portfolio'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_BIG DATA AGENCY/div__item-img-overlay'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BIG DATA AGENCY/a_Clients'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BIG DATA AGENCY/img_Application_img-responsive'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BIG DATA AGENCY/li_Big Data'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BIG DATA AGENCY/li_System Integration'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BIG DATA AGENCY/li_AI NLP ML'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BIG DATA AGENCY/li_Application'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BIG DATA AGENCY/button_Next'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BIG DATA AGENCY/button_Next'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BIG DATA AGENCY/button_Next'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BIG DATA AGENCY/a_Careers'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_BIG DATA AGENCY/a_Contact'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BIG DATA AGENCY/a_Careers'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Page_BIG DATA AGENCY/a_Home_2'))
WebUI.delay(3)
WebUI.closeBrowser()

