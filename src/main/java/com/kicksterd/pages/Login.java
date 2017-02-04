package com.kicksterd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component
public class Login extends Page {

    private static final String URl = "http://localhost:8080/login.html";

    public void open() {
        open(URl);
    }

    public void fillInLoginForm(String name, String pass) throws InterruptedException {
        $(By.xpath("//*[@id=\"name\"]")).sendKeys(name);
        $(By.xpath("//*[@id=\"password\"]")).sendKeys(pass);
        $(By.xpath("//*[@id=\"user\"]/div[5]/div/input")).click();
    }

    public boolean isMyAccountDisplayed() {
        return $(By.xpath("/html/body/div/div[1]/div/div[2]/ul/li[3]/a")).isDisplayed();
    }

}
