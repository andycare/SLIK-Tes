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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.click(findTestObject('iStyle.id_home/i_Tutup_todayMnaClose'))

WebUI.click(findTestObject('iStyle.id_home/button_Login'))

WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('iStyle.id_home/input_Search_query'), '000000862792')

WebUI.click(findTestObject('iStyle.id_home/button_Search'))

WebUI.click(findTestObject('iStyle.id_home/img_Item'))

WebUI.click(findTestObject('Product_page/button_Beli Sekarang'))

WebUI.delay(5)

WebUI.click(findTestObject('Order_page/div_Transfer'))

WebUI.click(findTestObject('Order_page/div_BCA'))

WebUI.delay(5)

WebUI.click(findTestObject('Order_page/button_Proses Checkout'))

WebUI.delay(10)

String payment_method = WebUI.getText(findTestObject('Order_page/span_Payment_method'))

WebUI.verifyMatch(payment_method, 'Transfer', false)

String bank = WebUI.getText(findTestObject('Order_page/span_Bank'))

WebUI.verifyMatch(bank, 'PT. BANK CENTRAL ASIA Tbk.', false)

WebUI.delay(10)

