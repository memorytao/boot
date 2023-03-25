package com.learn.boot;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.opentelemetry.api.internal.StringUtils;

public class Automate {

    public static void main(String[] args) {

        try {

            System.setProperty("webdriver.edge.driver", "D:\\code\\edgedriver_win64\\msedgedriver.exe");

            WebDriver webDriver = new EdgeDriver();
            webDriver.get("https://www.google.com/");

            webDriver.findElement(By.name("q")).sendKeys("python" + Keys.ENTER);
            webDriver.findElement(By.partialLinkText("Python Tutorial - W3Schools")).click();

            // ========================================================================================
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            webDriver.findElement(By.xpath("//a[normalize-space()='Try it Yourself »']")).click();
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

            // ========================================

            List<String> tabs = new ArrayList<>(webDriver.getWindowHandles());
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            webDriver.switchTo().window(tabs.get(1));

            webDriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]")).sendKeys(" fgfdsjghjsdkfghkj ");

            if (StringUtils.isNullOrEmpty(new Scanner(System.in).nextLine())) {
                webDriver.quit();
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            System.err.println(e.getMessage());
        }

    }
}