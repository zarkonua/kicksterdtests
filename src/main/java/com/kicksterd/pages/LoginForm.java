package com.kicksterd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

@Component
public class LoginForm extends Page {

    private static final String URl = "https://twitter.com/?lang=en";

    public void open() {
        open(URl);
    }

    public void fillInLoginForm(String name, String pass) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.titleIs("Twitter. It's what's happening."));

        $(By.cssSelector("#signin-email")).sendKeys("zarkonua@gmail.com");
        $(By.cssSelector("#signin-password")).sendKeys("");
        $(By.cssSelector("#front-container > div.front-card > div.front-signin.js-front-signin > form > table > tbody > tr > td.flex-table-secondary > button")).click();
        if (!amILoggedIn()) {
            $(By.cssSelector("#challenge_response")).sendKeys("0631440037");
            $(By.cssSelector("#email_challenge_submit")).click();
        }
    }

    public boolean amILoggedIn() {
        try {
            $(By.cssSelector("#page-container > div.dashboard.dashboard-left > div.DashboardProfileCard.module > div > div.DashboardProfileCard-userFields.account-group > div > a")).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }
}
