package stepdefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.hooksclass;

public class uniform {
	WebDriver driver = hooksclass.driver;
	
	
	
	@Given("User is on homepage")
	public void user_is_on_homepage() {
		driver.get("http://uniformm1.upskills.in/admin");
		driver.manage().window().maximize();
		
	    
	}

	@When("user enter invalid Username {string} and password {string}")
	public void user_enter_invalid_Username_and_password(String username, String password) throws InterruptedException {
	   
       driver.findElement(By.id("input-username")).sendKeys(username);
        Thread.sleep(2000);
	    
	    driver.findElement(By.id("input-password")).sendKeys(password);
	    Thread.sleep(2000);

	}
	
	//@When("user clicks on submit button")
	//public void user_clicks_on_submit_button() throws InterruptedException {
	//	driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(1000);
		
	   
	//}

	@Then("Validation message appears")
	public void validation_message_appears() throws InterruptedException {
		WebElement e1=driver.findElement(By.cssSelector("i.fa.fa-exclamation-circle"));
		e1.getText();
        
		}

	@When("user enter valid Username {string} and password {string}")
	public void user_enter_valid_Username_and_password(String username, String password) throws InterruptedException {
		  driver.findElement(By.id("input-username")).sendKeys(username);
	        Thread.sleep(2000);
		    
		    driver.findElement(By.id("input-password")).sendKeys(password);
		    Thread.sleep(2000);

	     
	}


@When("user clicks on submit button")
public void user_clicks_on_submit_button_and_navigates_to_homepage() throws InterruptedException {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//a[@id='button-menu']/i")).click();
	      //  Thread.sleep(2000);
			
	        //driver.findElement(By.cssSelector("i.fa.fa-share-alt.fa-fw")).click();
	    	//Thread.sleep(1000);
	    
		 	//driver.findElement(By.linkText("Coupons")).click();
		 	//Thread.sleep(1000);
		 	//driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
		 	//Thread.sleep(10000);
		 	//driver.findElement(By.xpath("//input[@name='name']")).click();
		 	//Thread.sleep(10000);
	}


@When("user clicks on Menu to navigate to Marketing")
public void user_clicks_on_Menu_and_navigates_to_Marketing_button() throws InterruptedException {
	 driver.findElement(By.xpath("//a[@id='button-menu']/i")).click();
     Thread.sleep(2000);
		
     driver.findElement(By.cssSelector("i.fa.fa-share-alt.fa-fw")).click();
 	Thread.sleep(1000);
 
    
}

@When("user clicks on Coupons linktext and navigates to coupons page")
public void user_clicks_on_Coupons_linktext_and_navigates_to_coupons_page() throws InterruptedException{
	driver.findElement(By.linkText("Coupons")).click();
 	Thread.sleep(1000);

}


@Given("user clicks on Addnewcoupon")
public void user_clicks_on_Addnewcoupon() throws InterruptedException {
	//WebElement e= driver.findElement(By.cssSelector("a.btn.btn-primary"));
	//e.click();
	//driver.findElement(By.xpath("//div[@class='pull-right']/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("a.btn.btn-primary i")).click();
	Thread.sleep(1000);
  
}

@When("user enters  data in fields CouponName{string} and Code{string}")
public void user_enters_data_in_fields_CouponName_and_Code(String couponname, String code) throws InterruptedException {

 	driver.findElement(By.xpath("//input[@name='name']")).sendKeys(couponname);
 	Thread.sleep(10000);
 	driver.findElement(By.xpath("//input[@name='code']")).sendKeys(code);
 	Thread.sleep(10000);
}

@Then("Saves the new coupon")
public void saves_the_new_coupon() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button.close")).click();
	Thread.sleep(2000);
   
}

@When("User clicks on Edit coupon Page")
public void user_clicks_on_Edit_coupon_Page() throws InterruptedException {
	driver.findElement(By.xpath("//table/tbody/tr[5]/td[8]/a/i")).click();
	Thread.sleep(2000);	
     
}

@When("User clears the prevoius Coupon")
public void user_clears_the_prevoius_Coupon() throws InterruptedException { 
	  driver.findElement(By.xpath("//input[@name='name']")).clear();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='code']")).clear();
	    Thread.sleep(2000);
	  
}

@When("User enters the New coupon Couponname{string} and CouponCode{string}")
public void user_enters_the_New_coupon_Couponname_and_CouponCode(String couponname, String couponcode) throws InterruptedException {
    
    driver.findElement(By.xpath("//input[@name='name']")).sendKeys(couponname);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@name='code']")).sendKeys(couponcode);
    Thread.sleep(2000);
}

@Then("Saves the Coupon")
public void saves_the_Coupon() throws InterruptedException { 
	driver.findElement(By.cssSelector("i.fa.fa-save")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@class='close']")).click();
	Thread.sleep(1000);
	
}

@When("user clicks on Checkbox")
public void user_clicks_on_Checkbox() throws InterruptedException { 
	//driver.findElement(By.xpath("//input[@type='checkbox'])[5]")).click();
	driver.findElement(By.xpath("//*[@id='form-coupon']/div/table/tbody/tr[4]/td[1]/input")).click();
	Thread.sleep(1000);
}

@When("clicks on Delete button to delete selected")
public void clicks_on_Delete_button_to_delete_selected() throws InterruptedException {
	//driver.findElement(By.cssSelector("i.fa.fa-trash-o")).click();
	driver.findElement(By.cssSelector("button.btn.btn-danger")).click();
	Thread.sleep(1000);
     
}

@When("confirm the selected files to be delete")
public void confirm_the_selected_files_to_be_delete() {
    Alert am=driver.switchTo().alert();
    am.accept();
}

@Then("selected coupon deleted")
public void selected_coupon_deleted() throws InterruptedException { 
	driver.findElement(By.cssSelector("button.close")).click();//i.fa.fa-trash-o
	Thread.sleep(1000);
}



}
