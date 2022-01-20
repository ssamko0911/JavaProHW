package homeworktocheck.hw011pro.taskadditional;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class Currency {

    @JsonProperty("r030")
    private String currencyCode;
    @JsonProperty("txt")
    private String currencyTitle;
    @JsonProperty("rate")
    private BigDecimal exchangeRate;
    @JsonProperty("cc")
    private String shortNaming;
    @JsonProperty("exchangedate")
    private String exchangeDate;

    public Currency() {
    }

    public Currency(String currencyCode, String currencyTitle, BigDecimal exchangeRate, String shortNaming, String exchangeDate) {
        this.currencyCode = currencyCode;
        this.currencyTitle = currencyTitle;
        this.exchangeRate = exchangeRate;
        this.shortNaming = shortNaming;
        this.exchangeDate = exchangeDate;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyTitle() {
        return currencyTitle;
    }

    public void setCurrencyTitle(String currencyTitle) {
        this.currencyTitle = currencyTitle;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getShortNaming() {
        return shortNaming;
    }

    public void setShortNaming(String shortNaming) {
        this.shortNaming = shortNaming;
    }

    public String getExchangeDate() {
        return exchangeDate;
    }

    public void setExchangeDate(String exchangeDate) {
        this.exchangeDate = exchangeDate;
    }

    @Override
    public String toString() {
        return "Данные по обменному курсу НБУ: " + "код валюты: " + currencyCode + ", наименование: " + currencyTitle
                + ", курс за 1 UAH: " + exchangeRate + ", буквенный код: " + shortNaming + ", курс на дату: " + exchangeDate;
    }
}