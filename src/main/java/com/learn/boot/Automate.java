package com.learn.boot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Automate {

    public static void main(String[] args) {

        try {

            System.setProperty("webdriver.edge.driver", "D:\\code\\edgedriver_win64\\msedgedriver.exe");

            WebDriver webDriver = new EdgeDriver();

            webDriver.get("https://www.google.com/");
            webDriver.findElement(By.name("q")).sendKeys("python");
            webDriver.findElement(By.name("btnK")).submit();
            webDriver.findElement(By.partialLinkText("Python Tutorial - W3Schools")).click();

            webDriver.findElement(By.partialLinkText("Try it Yourself »")).click();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            System.err.println(e.getMessage());
        }

    }
}