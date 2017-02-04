package com.kicksterd.pages;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class Register extends Page {

    private static final String URl = "http://localhost:8080/register.html";

    public void open() {
        open(URl);
    }

    public void fillInRegistrationForm(String name, String email, String pass) throws InterruptedException {
        $(By.xpath("//*[@id=\"name\"]")).sendKeys(name);
        $(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
        $(By.xpath("//*[@id=\"password\"]")).sendKeys(pass);
        $(By.xpath("//*[@id=\"password_again\"]")).sendKeys(pass);
        $(By.xpath("//*[@id=\"user\"]/div[5]/div/input")).click();
    }

}
