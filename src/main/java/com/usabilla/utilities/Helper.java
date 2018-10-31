package com.usabilla.utilities;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Helper {

    private static final int TIME_SECONDS = 5;
    private static WebDriver driver;


    public static void initialiseDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperties().get("user.dir") + "/chromedriver");

        if (System.getProperty("browserType").equals("headless")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            driver = new ChromeDriver(chromeOptions);
        } else {
            driver = new ChromeDriver();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static String generateString(int length) {
        String generatedString = RandomStringUtils.randomAlphanumeric(length);
        return generatedString;
    }

    public static String setRandomCity() {
        String[] cities = {"Amsterdam", "Amstelveen", "Den Haag", "Rotterdam", "Haarlem", "Utrecht", "Eindhoven"};
        return cities[new Random().nextInt(cities.length)];
    }

    public static void snapScreenShot(String result, String name, WebDriver driver) throws IOException {
        File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String fileName = System.getProperties().get("user.dir") + "/screenshots";
        File directory = new File(fileName);
        if (!directory.exists()) {
            directory.mkdir();
        }
        fileName = fileName + "/" + name + "_" + result + ".jpg";
        File destinationFile = new File(fileName);
        FileHandler.copy(sourceFile, destinationFile);
    }

    public static void waitTillElementVisible(WebElement element) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, TIME_SECONDS);
        webDriverWait.ignoring(WebDriverException.class);
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public static boolean isDisplayed(WebElement element) {
        try {
            waitTillElementVisible(element);
        } catch (NoSuchElementException e) {
            return false;
        } catch (TimeoutException e) {
            return false;
        }
        return true;
    }

    public static void deleteFolderIfExists(String folderName) {
        Path folder = Paths.get(folderName);
        if (Files.exists(folder)) {
            FileHandler.delete(new File(folderName));
        }
    }

    public static void click(WebElement element) {
        waitTillElementVisible(element);
        element.click();
    }

    public static boolean validateText(WebElement element, String text) {
        try {
            waitTillElementVisible(element);
            if (element.getText().contains(text)) {
                return true;
            }
        } catch (NoSuchElementException e) {
            return false;
        } catch (TimeoutException e) {
            return false;
        }
        return false;
    }

    public static void selectDropdownValue(WebElement element, String value) {
        waitTillElementVisible(element);
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public static void enterText(WebElement element, String text) {
        waitTillElementVisible(element);
        element.sendKeys(text);
    }
}

