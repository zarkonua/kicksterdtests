package com.kicksterd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

@Component
public class Project extends Page {

    private static final String URl = "http://localhost:8080/project/1.html";

    public void open() {
        open(URl);
    }

    public WebElement investCustomSummBotton() {
        return $(By.cssSelector("body > div > div.buttons > button.btn.btn-primary.btn-lg"));
    }

    public WebElement getCollectedSumm() {
        return $(By.xpath("/html/body/div/table[1]/tbody/tr[4]/td[2]"));
    }

    public void fillInvestForm(String name, String cardNum, String summ) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/form/input[2]")))).sendKeys(name);
        $(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/form/input[3]")).sendKeys(cardNum);
        $(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/form/input[4]")).sendKeys(summ);
        $(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/form/button")).click();
    }

}
