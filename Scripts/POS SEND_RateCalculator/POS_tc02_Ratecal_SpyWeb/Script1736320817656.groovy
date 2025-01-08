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

WebUI.navigateToUrl('https://www.pos.com.my/send/ratecalculator')

WebUI.click(findTestObject('Page_Parcel Shipment Rate Calculator  Pos Malaysia/div_CountryMalaysia'))

WebUI.setText(findTestObject('Page_Parcel Shipment Rate Calculator  Pos Malaysia/input_Malaysia_form-control ng-touched ng-d_f59c10'), 
    '35600')

WebUI.click(findTestObject('Page_Parcel Shipment Rate Calculator  Pos Malaysia/div_Country_mat-mdc-form-field-infix ng-tns-c11-8'))

WebUI.setText(findTestObject('Page_Parcel Shipment Rate Calculator  Pos Malaysia/input_Country_country'), 'India')

WebUI.click(findTestObject('Page_Parcel Shipment Rate Calculator  Pos Malaysia/div_India - IN'))

WebUI.setText(findTestObject('Page_Parcel Shipment Rate Calculator  Pos Malaysia/input_Weight (kg)_form-control border-right-0 ng-untouched ng-pristine ng-invalid'), 
    '9.09')

WebUI.click(findTestObject('Page_Parcel Shipment Rate Calculator  Pos Malaysia/Page_Parcel Shipment Rate Calculator  Pos Malaysia/a_Calculate'))

WebUI.closeBrowser()

