import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('blanja.com')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('sebelum login/icon close'))

WebUI.delay(2)

WebUI.click(findTestObject('sebelum login/Button-Masuk'))

WebUI.delay(2)

WebUI.setText(findTestObject('sebelum login/nickname input'), 'tblanja123')

WebUI.delay(2)

WebUI.setText(findTestObject('sebelum login/password input'), '123qwe')

WebUI.delay(2)

WebUI.click(findTestObject('sebelum login/login button'))

WebUI.delay(2)

WebUI.setText(findTestObject('setelah login/search'), 'Instax Mini')

WebUI.delay(1)

WebUI.click(findTestObject('setelah login/button cari'))

WebUI.delay(2)

WebUI.click(findTestObject('setelah login/product'))

WebUI.delay(2)

WebUI.click(findTestObject('setelah login/blanja sekarang'))

WebUI.waitForPageLoad(2)

WebUI.selectOptionByIndex(findTestObject('setelah login/select kurir'), '1')

WebUI.click(findTestObject('setelah login/lanjutkan pembayaran'))

WebUI.delay(2)

WebUI.click(findTestObject('setelah login/lanjutkan'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('setelah login/kartu kredit'))

WebUI.delay(1)

WebUI.click(findTestObject('setelah login/konfirmasi pembayaran'))

WebUI.delay(2)

WebUI.navigateToUrl('member.blanja.com/trades/orderList.html')

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('setelah login/rincian pembelanjaan'))

WebUI.delay(1)

WebUI.switchToWindowIndex('1')

detail = WebUI.getText(findTestObject('setelah login/text rincian pesanan'))

'untuk verifikasi sistem menampilkan order detail disini saya menggunakan text rincian pesanan sebagai patokan\r\n'
WebUI.verifyMatch(detail, 'Rincian Pesanan', false)

WebUI.delay(1)

total = WebUI.getText(findTestObject('setelah login/total pemesanan'))

KeywordLogger log = new KeywordLogger()

'ini digunakan untuk print total pemesanan pada log viewer'
log.logInfo('total pemesanan anda adalah ' + total)

