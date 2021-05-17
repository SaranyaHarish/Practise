package TestNGprog;

import org.testng.annotations.Test;

public class Dependencies 
{

@Test(enabled=true)
public void highschool(){
	System.out.println("High School");
}

@Test(dependsOnMethods="highschool")
public void highersecondary(){
	System.out.println("Higher Secondary");
}

@Test(dependsOnMethods="highersecondary")
public void college(){
	System.out.println("College");
}
}
