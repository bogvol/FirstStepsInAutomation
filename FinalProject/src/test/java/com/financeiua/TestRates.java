package com.financeiua;

import com.financeiua.tests.ArrayUtiles;
import com.financeiua.tests.BankRate;
import com.financeiua.tests.pages.FinancePage_Cl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Kengoroo on 05.04.2015.
 */
public class TestRates {
	//нужно для сравненния в тестах будет использовать Assert.assertEquals
	private static WebDriver driver;
	private static final double TOLERANCE = 0.6;

	@BeforeMethod
	public void openFinancePage() {
		driver = new FirefoxDriver();
		driver.get("http://www.finance.i.ua/");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@Test
	public void testMeanValueBuy() {
		FinancePage_Cl financePage = new FinancePage_Cl(driver);
		List<WebElement> allRows = driver.findElements(By.xpath("//div[@id='feMain2']//tr"));
		List<BankRate> parsedBankRates = financePage.getBankRates(allRows);
		List<BankRate> parsedSummaryRates = financePage.getSummaryRates(allRows);
		double meanBuy = ArrayUtiles.meanValueBuy(parsedBankRates);
		double summaryMeanBuy = parsedSummaryRates.get(2).getBuyRate();
		double deviation = Math.abs(meanBuy - summaryMeanBuy);
		Assert.assertTrue(deviation <= TOLERANCE);
//        Assert.assertEquals(ArrayUtiles.meanValueBuy(parsedBankRates), parsedSummaryRates.get(2).getBuyRate());
	}

	@Test
	public void testMeanValueSell() {
		FinancePage_Cl financePage = new FinancePage_Cl(driver);
		List<WebElement> allRows = driver.findElements(By.xpath("//div[@id='feMain2']//tr"));
		List<BankRate> parsedBankRates = financePage.getBankRates(allRows);
		List<BankRate> parsedSummaryRates = financePage.getSummaryRates(allRows);
		double meanSell = ArrayUtiles.meanValueSell(parsedBankRates);
		double summaryMeanSell = parsedSummaryRates.get(2).getSellRate();
		double deviation = Math.abs(meanSell - summaryMeanSell);
		Assert.assertTrue(deviation <= TOLERANCE);
//        Assert.assertEquals(ArrayUtiles.meanValueSell(parsedBankRates), parsedSummaryRates.get(2).getSellRate());
	}

	@Test
	public void testMinValueBuy() {
		FinancePage_Cl financePage = new FinancePage_Cl(driver);
		List<WebElement> allRows = driver.findElements(By.xpath("//div[@id='feMain2']//tr"));
		List<BankRate> parsedBankRates = financePage.getBankRates(allRows);
		List<BankRate> parsedSummaryRates = financePage.getSummaryRates(allRows);
		double minBuy = ArrayUtiles.minValueBuy(parsedBankRates);
		double summaryMinBuy = parsedSummaryRates.get(1).getBuyRate();
		double deviation = Math.abs(minBuy - summaryMinBuy);
		Assert.assertTrue(deviation <= TOLERANCE);
//        Assert.assertEquals(ArrayUtiles.minValueBuy(parsedBankRates), parsedSummaryRates.get(1).getBuyRate());
	}

	@Test
	public void testMinValueSell() {
		FinancePage_Cl financePage = new FinancePage_Cl(driver);
		List<WebElement> allRows = driver.findElements(By.xpath("//div[@id='feMain2']//tr"));
		List<BankRate> parsedBankRates = financePage.getBankRates(allRows);
		List<BankRate> parsedSummaryRates = financePage.getSummaryRates(allRows);
		double minSell = ArrayUtiles.minValueSell(parsedBankRates);
		double summaryMinSell = parsedSummaryRates.get(1).getSellRate();
		double deviation = Math.abs(minSell - summaryMinSell);
		Assert.assertTrue(deviation <= TOLERANCE);
//        Assert.assertEquals(ArrayUtiles.minValueSell(parsedBankRates), parsedSummaryRates.get(1).getSellRate());
	}

	@Test
	public void testMaxValueBuy() {
		FinancePage_Cl financePage = new FinancePage_Cl(driver);
		List<WebElement> allRows = driver.findElements(By.xpath("//div[@id='feMain2']//tr"));
		List<BankRate> parsedBankRates = financePage.getBankRates(allRows);
		List<BankRate> parsedSummaryRates = financePage.getSummaryRates(allRows);
		double maxBuy = ArrayUtiles.maxValueBuy(parsedBankRates);
		double summaryMaxBuy = parsedSummaryRates.get(0).getBuyRate();
		double deviation = Math.abs(maxBuy - summaryMaxBuy);
		Assert.assertTrue(deviation <= TOLERANCE);
//        Assert.assertEquals(ArrayUtiles.maxValueBuy(parsedBankRates), parsedSummaryRates.get(0).getBuyRate());
	}

	@Test
	public void testMaxValueSell() {
		FinancePage_Cl financePage = new FinancePage_Cl(driver);
		List<WebElement> allRows = driver.findElements(By.xpath("//div[@id='feMain2']//tr"));
		List<BankRate> parsedBankRates = financePage.getBankRates(allRows);
		List<BankRate> parsedSummaryRates = financePage.getSummaryRates(allRows);
		double maxSell = ArrayUtiles.maxValueSell(parsedBankRates);
		double summaryMaxSell = parsedSummaryRates.get(0).getSellRate();
		double deviation = Math.abs(maxSell - summaryMaxSell);
		Assert.assertTrue(deviation <= TOLERANCE);
//        Assert.assertEquals(ArrayUtiles.maxValueSell(parsedBankRates), parsedSummaryRates.get(0).getSellRate());
	}

	@Test
	public void testOptValueBuy() {
		FinancePage_Cl financePage = new FinancePage_Cl(driver);
		List<WebElement> allRows = driver.findElements(By.xpath("//div[@id='feMain2']//tr"));
		List<BankRate> parsedBankRates = financePage.getBankRates(allRows);
		List<BankRate> parsedSummaryRates = financePage.getSummaryRates(allRows);
		double optBuy = ArrayUtiles.maxValueBuy(parsedBankRates);
		double summaryOptBuy = parsedSummaryRates.get(0).getBuyRate();
		double deviation = Math.abs(optBuy - summaryOptBuy);
		Assert.assertTrue(deviation <= TOLERANCE);
//        Assert.assertEquals(ArrayUtiles.maxValueBuy(parsedBankRates), parsedSummaryRates.get(0).getBuyRate());
	}

	@Test
	public void testOptValueSell() {
		FinancePage_Cl financePage = new FinancePage_Cl(driver);
		List<WebElement> allRows = driver.findElements(By.xpath("//div[@id='feMain2']//tr"));
		List<BankRate> parsedBankRates = financePage.getBankRates(allRows);
		List<BankRate> parsedSummaryRates = financePage.getSummaryRates(allRows);
		double optSell = ArrayUtiles.minValueSell(parsedBankRates);
		double summaryOptSell = parsedSummaryRates.get(1).getSellRate();
		double deviation = Math.abs(optSell - summaryOptSell);
		Assert.assertTrue(deviation <= TOLERANCE);
//        Assert.assertEquals(ArrayUtiles.minValueSell(parsedBankRates), parsedSummaryRates.get(1).getSellRate());
	}

//    @Test
//    public void t(){
//        List<WebElement> allRows = driver.findElements(By.xpath("//div[@id='feMain2']//tr"));
//        List<WebElement> neededRows = allRows.subList(1, allRows.size() - 5);
//        for (WebElement row : neededRows){
//            List<WebElement> cells = row.findElements(By.xpath("./td"));
//            for (WebElement cell : cells){
//                System.out.println(cell.getText());
//            }
//        }
//
//    }

	//сортировка массива "пузырьком" по возрастанию
//	@Test
//	public void q() {
//		int[] arr = new int[]{2, 3, 4, 5, 6, 7, 8, 9};
//		printArray(arr);
//		for (int j = 0; j < arr.length - 1; j++) {
//			for (int i = 0; i < arr.length - j - 1; i++) {
//				System.out.println("test: a[" + i + "]=" + arr[i] + "; a[" + (i + 1) + "]=" + arr[i + 1]);
//				if (arr[i] > arr[i + 1]) {
//					System.out.println("  -> swap");
//					int temp = arr[i];
//					arr[i] = arr[i + 1];
//					arr[i + 1] = temp;
//				}
//			}
//			printArray(arr);
//		}
//
////        printArray(arr);
////        int min = arr[0];
////        for (int element : arr) {
////            if (element < min) {
////                min = element;
////            }
////        }
////        System.out.println("MIN: " + min);
//
////        int min = arr[0];
////        int minIndex = 0;
////        for (int i = 0; i < arr.length; i++) {
////            if (min > arr[i]) {
////                min = arr[i];
////                minIndex = i;
////            }
////        }
////        System.out.println("MIN: [" + minIndex + "]" + min);
//
////        for (int element : arr) {
////            if (0 == element % 2) {
////                System.out.println(element);
////            }
////        }
//	}
}
