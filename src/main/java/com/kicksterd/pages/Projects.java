package com.kicksterd.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Projects extends Page{

    public static final String URL = "http://localhost:8080/category/1.html";

    public String getCurrentUrl() {
        return URL;
    }

    public void open() {
        open(URL);
    }

    public List<WebElement> getSubItems() {
        return $$(By.cssSelector("body > div > table > tbody > * > td:nth-child(1)"));
    }

    public WebElement getProject(String name){
        return $("//a[contains(.,'%s')]",name);
    }

}
