package TestNGprog;

import org.testng.annotations.Test;

public class SkipaParticularTestCase {


//To drive a car

	@Test(priority = 0)
	public void StarttheCar(){
		System.out.println("Start the car");
	}

	@Test(priority = 1)
	public void FirstGear(){
		System.out.println("Put the First Gear");
	}

	@Test(priority = 2)
	public void SecondGear(){
		System.out.println("Put the Second Gear");
		}

	@Test(priority = 3)
	public void ThirdGear(){
		System.out.println("Put the Third Gear");
		}

	@Test(priority = 4)
	public void FourthGear(){
		System.out.println("Put the Fourth Gear");
	}
	
	@Test (enabled=false)
	public void MusicOn(){
		System.out.println("Music On");
	}
	}
	
    
	



