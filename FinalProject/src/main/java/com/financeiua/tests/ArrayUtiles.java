package com.financeiua.tests;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Kengoroo on 05.04.2015.
 */
public class ArrayUtiles {
//
//    private WebDriver driver;
//    FinancePage currentTable = new FinancePage(driver);

    public static double meanValueBuy(List<BankRate> bankRatesList) {
        Double buyRateSum = 0.0;
        for (int j = 0; j < bankRatesList.size(); j++) {
            buyRateSum += bankRatesList.get(j).getBuyRate();
        }
        return buyRateSum / bankRatesList.size();
    }

    public static double meanValueSell(List<BankRate> bankRatesList) {
        Double sellRateSum = 0.0;
        for (int j = 0; j < bankRatesList.size(); j++) {
            sellRateSum += bankRatesList.get(j).getSellRate();
        }
        return sellRateSum / bankRatesList.size();
    }

    public static double minValueBuy(List<BankRate> bankRatesList) {
        Double minBuy = bankRatesList.get(0).getBuyRate();
        for (int j = 1; j < bankRatesList.size(); j++) {
            if (bankRatesList.get(j).getBuyRate() < minBuy)
                minBuy = bankRatesList.get(j).getBuyRate();
        }
        return minBuy;
    }

    public static double minValueSell(List<BankRate> bankRatesList) {
        Double minSell = bankRatesList.get(0).getSellRate();
        for (int j = 1; j < bankRatesList.size(); j++) {
            if (bankRatesList.get(j).getSellRate() < minSell)
                minSell = bankRatesList.get(j).getSellRate();
        }
        return minSell;
    }

    public static double maxValueBuy(List<BankRate> bankRatesList) {
        Double maxBuy = bankRatesList.get(0).getBuyRate();
        for (int j = 1; j < bankRatesList.size(); j++) {
            if (bankRatesList.get(j).getBuyRate() > maxBuy)
                maxBuy = bankRatesList.get(j).getBuyRate();
        }
        return maxBuy;
    }

    public static double maxValueSell(List<BankRate> bankRatesList) {
        Double maxSell = bankRatesList.get(0).getSellRate();
        for (int j = 1; j < bankRatesList.size(); j++) {
            if (bankRatesList.get(j).getSellRate() > maxSell)
                maxSell = bankRatesList.get(j).getSellRate();
        }
        return maxSell;
    }
}