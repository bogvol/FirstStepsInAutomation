package com.financeiua.tests;

/**
 * Created by Kengoroo on 05.04.2015.
 */
public class BankRate {
    private String bankName;
    private double buyRate;
    private double sellRate;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getBuyRate() {
        return buyRate;
    }

    public void setBuyRate(double buyRate) {
        this.buyRate = buyRate;
    }

    public double getSellRate() {
        return sellRate;
    }

    public void setSellRate(double sellRate) {
        this.sellRate = sellRate;
    }


    @Override
    public String toString() {
        return "BankRate{" +
                "bankName='" + bankName + '\'' +
                ", buyRate=" + buyRate +
                ", sellRate=" + sellRate +
                '}';
    }

//    @Override                          //переопределение метода equals
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        BankRate bankRate = (BankRate) o;
//
//        if (Double.compare(bankRate.buyRate, buyRate) != 0) return false;
//        if (Double.compare(bankRate.sellRate, sellRate) != 0) return false;
//        if (bankName != null ? !bankName.equals(bankRate.bankName) : bankRate.bankName != null) return false;
//
//        return true;
//    }
//
//    @Override                         //переопределение метода hashCode
//    public int hashCode() {
//        int result;
//        long temp;
//        result = bankName != null ? bankName.hashCode() : 0;
//        temp = Double.doubleToLongBits(buyRate);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        temp = Double.doubleToLongBits(sellRate);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        return result;
//    }
}
