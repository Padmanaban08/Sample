package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1 {
	public static void main (String [] args) {
//WebDriverManager.chromedriver.setup();
//driver=new ChromeDriver();

WebDriverManager.edgedriver().setup();
EdgeDriver d = new EdgeDriver();

}
}
