package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo {
	WebDriver driver;
	@Given("user should be in home page")
	public void user_should_be_in_home_page() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\sowjanya\\eclipse-workspace\\Selenium\\Driver\\chromedriver1.exe");
	    driver=new ChromeDriver();
	    driver.get("http://www.demo.guru99.com/telecom/");
	}

	@Given("user should click add customer")
	public void user_should_click_add_customer() {
		WebElement s=driver.findElement(By.xpath("//a[text()='Add Customer']"));
		s.click();
		
	   
	}

	@When("user gives the valid details")
	public void user_gives_the_valid_details() throws InterruptedException {
	
		WebElement s=driver.findElement(By.xpath("//label[@for='done']"));
		s.click();
		WebElement fn=driver.findElement(By.xpath("//input[@id='fname']"));
		fn.sendKeys("sowjanya");
		WebElement lf=driver.findElement(By.xpath("//input[@id='lname']"));
		lf.sendKeys("siva");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("sowjanya873@gmai.com");
		WebElement add=driver.findElement(By.xpath("//textarea[@id='message']"));
		add.sendKeys("chennai");
		WebElement ph=driver.findElement(By.xpath("//input[@id='telephoneno']"));
		ph.sendKeys("9554357411");
	    
	}
	@When("user enters the valid details")
	public void user_enters_the_valid_details(io.cucumber.datatable.DataTable cusDetails) {
		List<String> datas=cusDetails.asList(String.class);
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(datas.get(0));
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys(datas.get(1));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(datas.get(2));;
	    driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(datas.get(3));
		driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(datas.get(4));;
	
	    }
	@When("user enters to the valid details")
	public void user_enters_to_the_valid_details(io.cucumber.datatable.DataTable Details) {
		Map<String,String> datas=Details.asMap(String.class, String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(datas.get("Fstname"));
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys(datas.get("Lstname"));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(datas.get("Email"));;
	    driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(datas.get("Addres"));
		driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(datas.get("Phno"));;
		
	}
	
	@When("user enters all the valid details")
	public void user_enters_all_the_valid_details(io.cucumber.datatable.DataTable twodymlist) {
		List<List<String>>datas=twodymlist.asLists(String.class);
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(datas.get(0).get(0));
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys(datas.get(1).get(1));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(datas.get(1).get(2));
	    driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(datas.get(1).get(3));
		driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(datas.get(0).get(4));
	}

	@When("user enters too the valid details")
	public void user_enters_too_the_valid_details(io.cucumber.datatable.DataTable twodymmap) {
		List<Map<String,String>>datas=twodymmap.asMaps(String.class,String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(datas.get(1).get("firstname"));
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys(datas.get(1).get("lastname"));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(datas.get(0).get("email"));;
	    driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(datas.get(1).get("address"));
		driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(datas.get(0).get("phno"));;
			
		
	}
	@When("user should click submit")
	public void user_should_click_submit() {
		WebElement sub=driver.findElement(By.xpath("//input[@value='Submit']"));
		sub.click();
	  
	}

	@Then("user should get generated id")
	public void user_should_get_generated_id() {
		WebElement ple=driver.findElement(By.xpath("//b[text()='Please Note Down Your CustomerID']"));
		String text=ple.getText();
		System.out.println(text);
	    
	}



}
