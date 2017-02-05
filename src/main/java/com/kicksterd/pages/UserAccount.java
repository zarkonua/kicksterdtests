package com.kicksterd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

@Component
public class UserAccount extends Page {

    private static final String URl = "http://localhost:8080/account.html";

    public void open() {
        open(URl);
    }

    public void fillInNewProjectForm(String name, String description, String goal, String daysLeft, String history, String linksToVideo, String category) throws InterruptedException {
        $(By.xpath("/html/body/div/button")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@id=\"name\"]")))).sendKeys(name);
        $(By.xpath("//*[@id=\"description\"]")).sendKeys(description);
        $(By.xpath("//*[@id=\"goal\"]")).sendKeys(goal);
        $(By.xpath("//*[@id=\"daysLeft\"]")).sendKeys(daysLeft);
        $(By.xpath("//*[@id=\"history\"]")).sendKeys(history);
        $(By.xpath("//*[@id=\"linksToVideo\"]")).sendKeys(linksToVideo);
        (new Select($(By.xpath("//*[@id=\"category.id\"]")))).selectByVisibleText(category);
        $(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/input")).click();
    }
}
