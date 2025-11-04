package baseLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	protected WebDriver driver;
	public static void main(String[] args) {
		System.out.println("Base Class by Akshay");
		
		System.out.println("PIMPage Created By Test Engineer Akshada");
		
	}	
	 public BaseClass()
	 {
		 driver=new ChromeDriver();
	 }

}
	


