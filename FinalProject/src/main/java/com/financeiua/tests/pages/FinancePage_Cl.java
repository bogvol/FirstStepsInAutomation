package com.financeiua.tests.pages;

import com.financeiua.tests.BankRate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kengoroo on 05.04.2015.
 */
public class FinancePage_Cl {
    private WebDriver driver;

    public FinancePage_Cl(WebDriver driver) {
        this.driver = driver;
    }

    public List<BankRate> getBankRates(List<WebElement> allRows) {
        List<BankRate> rates = new ArrayList<BankRate>();
//        List<WebElement> allRows = driver.findElements(By.xpath("//div[@id='feMain2']//tr"));
        List<WebElement> neededRows = allRows.subList(1, allRows.size() - 5);
        for (WebElement row : neededRows) {
            List<WebElement> cells = row.findElements(By.xpath("./td"));
            BankRate rate = new BankRate();
            rate.setBankName(cells.get(0).getText());
            rate.setBuyRate(Double.parseDouble(cells.get(1).getText()));
            rate.setSellRate(Double.parseDouble(cells.get(2).getText()));
            rates.add(rate);
        }
        return rates;
    }

    public List<BankRate> getSummaryRates(List<WebElement> allRows) {
        List<BankRate> ratesSummary = new ArrayList<BankRate>();
//        List<WebElement> allRows = driver.findElements(By.xpath("//div[@id='feMain2']//tr"));
        List<WebElement> neededSummaryRows = allRows.subList(allRows.size() - 4, allRows.size());
        for (WebElement rowSummary : neededSummaryRows) {
            List<WebElement> cellsSummary = rowSummary.findElements(By.xpath("./td"));
            BankRate rateSummary = new BankRate();
            rateSummary.setBankName(cellsSummary.get(0).getText());
            rateSummary.setBuyRate(Double.parseDouble(cellsSummary.get(1).getText()));
            rateSummary.setSellRate(Double.parseDouble(cellsSummary.get(2).getText()));
            ratesSummary.add(rateSummary);
        }
        return ratesSummary;
    }


}