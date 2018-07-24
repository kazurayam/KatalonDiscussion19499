import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.apple.com/newsroom/2018/05/apple-reports-second-quarter-results/')

WebUI.waitForElementPresent(findTestObject('Page_Apple Reports Second Quarter R/a_View PDF'), 10)

WebUI.click(findTestObject('Page_Apple Reports Second Quarter R/a_View PDF'))

// wait for PDF file to be downloaded
WebUI.delay(10)

WebUI.closeBrowser()

