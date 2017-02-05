package com.kicksterd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

@Component
public class Login extends Page {

    private static final String URl = "http://localhost:8080/login.html";

    public void open() {
        open(URl);
    }

    public void fillInLoginForm(String name, String pass) throws InterruptedException {
        if($(By.xpath("/html/body/div/div[1]/div/div[2]/ul/li[3]/a")).isDisplayed()){
            $(By.xpath("/html/body/div/div[1]/div/div[2]/ul/li[3]/a")).click();
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable((By.xpath("/html/body/div/form/input[1]")))).sendKeys(name);
        $(By.xpath("/html/body/div/form/input[2]")).sendKeys(pass);
        $(By.xpath("/html/body/div/form/button")).click();
        Thread.sleep(1000);
    }

    public boolean isMyAccountDisplayed() {
        return $(By.xpath("/html/body/div/div[1]/div/div[2]/ul/li[3]/a")).isDisplayed();
    }

}
