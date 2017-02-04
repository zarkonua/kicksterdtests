package com.kicksterd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Page {

    @Autowired
    WebDriver driver;

    @PostConstruct
    public void setUp() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    protected void open(String url) {
        driver.get(url);
    }


    protected WebElement $(String xpath, String... args) {
        return driver.findElement(By.xpath(String.format(xpath, args)));
    }


    protected List<WebElement> $$(By by) {
        return driver.findElements(by);
    }

    protected WebElement $(By by) {
        return driver.findElement(by);
    }
}
