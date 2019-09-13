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

public class Addtariff {
	WebDriver driver;

	@Given("user should click tariff plans")
	public void user_should_click_tariff_plans() {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\sowjanya\\eclipse-workspace\\Selenium\\Driver\\chromedriver1.exe");
		    driver=new ChromeDriver();
		    driver.get("http://www.demo.guru99.com/telecom/");
		    WebElement s=driver.findElement(By.xpath("//a[text()='Add Tariff Plan']"));
			s.click();
	}

	@When("user choose tariff plans")
	public void user_choose_tariff_plans() {
	    WebElement re=driver.findElement(By.id("rental1"));
	    re.sendKeys("8000");
	    WebElement lm=driver.findElement(By.id("local_minutes"));
	    lm.sendKeys("50");
	    WebElement im=driver.findElement(By.id("inter_minutes"));
	    im.sendKeys("70");
	    WebElement sm=driver.findElement(By.id("sms_pack"));
	    sm.sendKeys("40");
	    WebElement mc=driver.findElement(By.id("minutes_charges"));
	    mc.sendKeys("5");
	    WebElement ic=driver.findElement(By.id("inter_charges"));
	    ic.sendKeys("150");
	    WebElement sc=driver.findElement(By.id("sms_charges"));
	    sc.sendKeys("200");
	}
	@When("user chooses tariff plans")
	public void user_chooses_tariff_plans(io.cucumber.datatable.DataTable onelist) {
	List<String> datas=onelist.asList(String.class);
	driver.findElement(By.id("rental1")).sendKeys(datas.get(0));
	driver.findElement(By.id("local_minutes")).sendKeys(datas.get(1));
	driver.findElement(By.id("inter_minutes")).sendKeys(datas.get(2));
	driver.findElement(By.id("sms_pack")).sendKeys(datas.get(3));
	driver.findElement(By.id("minutes_charges")).sendKeys(datas.get(4));
	driver.findElement(By.id("inter_charges")).sendKeys(datas.get(5));
	driver.findElement(By.id("sms_charges")).sendKeys(datas.get(6));
		}
	@When("user chooses to tariff plans")
	public void user_chooses_to_tariff_plans(io.cucumber.datatable.DataTable onemap) {
		Map<String,String> datas=onemap.asMap(String.class, String.class);
		driver.findElement(By.id("rental1")).sendKeys(datas.get("re"));
		driver.findElement(By.id("local_minutes")).sendKeys(datas.get("lm"));
		driver.findElement(By.id("inter_minutes")).sendKeys(datas.get("im"));
		driver.findElement(By.id("sms_pack")).sendKeys(datas.get("sp"));
		driver.findElement(By.id("minutes_charges")).sendKeys(datas.get("mc"));
		driver.findElement(By.id("inter_charges")).sendKeys(datas.get("ic"));
		driver.findElement(By.id("sms_charges")).sendKeys(datas.get("sm"));
		}
	@When("user chooses the tariff plans")
	public void user_chooses_the_tariff_plans(io.cucumber.datatable.DataTable twolist) {
		List<List<String>>datas=twolist.asLists(String.class);
		driver.findElement(By.id("rental1")).sendKeys(datas.get(0).get(1));
		driver.findElement(By.id("local_minutes")).sendKeys(datas.get(1).get(2));
		driver.findElement(By.id("inter_minutes")).sendKeys(datas.get(1).get(3));
		driver.findElement(By.id("sms_pack")).sendKeys(datas.get(1).get(4));
		driver.findElement(By.id("minutes_charges")).sendKeys(datas.get(0).get(5));
		driver.findElement(By.id("inter_charges")).sendKeys(datas.get(1).get(6));
		driver.findElement(By.id("sms_charges")).sendKeys(datas.get(0).get(7));
	}
	@When("user check the tariff plans")
	public void user_check_the_tariff_plans(io.cucumber.datatable.DataTable twomap) {
		List<Map<String,String>>datas=twomap.asMaps(String.class,String.class);
		driver.findElement(By.id("rental1")).sendKeys(datas.get(0).get("ren"));
		driver.findElement(By.id("local_minutes")).sendKeys(datas.get(1).get("lme"));
		driver.findElement(By.id("inter_minutes")).sendKeys(datas.get(1).get("ime"));
		driver.findElement(By.id("sms_pack")).sendKeys(datas.get(0).get("sps"));
		driver.findElement(By.id("minutes_charges")).sendKeys(datas.get(1).get("mcs"));
		driver.findElement(By.id("inter_charges")).sendKeys(datas.get(0).get("ics"));
		driver.findElement(By.id("sms_charges")).sendKeys(datas.get(1).get("scs"));
		

	}
	@When("user click on submit button")
	public void user_click_on_submit_button() {
		WebElement sub=driver.findElement(By.xpath("//input[@value='submit']"));
	    sub.click();
	   
	}

	@Then("user should get displayed congratulation")
	public void user_should_get_displayed_congratulation() {
		WebElement ple=driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']"));
		String text=ple.getText();
		System.out.println(text);
	}

}
