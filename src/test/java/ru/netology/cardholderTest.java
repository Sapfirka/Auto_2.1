package ru.netology;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cardholderTest {
    private WebDriver driver;

    @BeforeAll
    static void setAppAll() {System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
    }
    @BeforeEach
    void setUp() { driver = new ChromeDriver(); }

    @AfterEach
    void tearDown() {
        driver.quit();
        driver = null;
    }

    @Test
    void shouldTestV1() {
        driver.get("http:localhost:9999");
    }
}
