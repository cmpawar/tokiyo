package PageClassRedbus;

import java.awt.geom.Arc2D.Float;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;

public class Temp {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		float hours;
		float minutes;
		float seconds;
		
		
		Scanner sc = new Scanner(System.in);
		float time =sc.nextFloat();
		
		hours = time;
		minutes = hours*60;
		seconds = minutes*60;
		
		
		System.out.println(hours);
		System.out.println(minutes);
		System.out.println(seconds);
	
	
	
	
	}
	}
		
	

