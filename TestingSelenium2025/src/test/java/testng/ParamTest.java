package testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
  
	@Test
	@Parameters({"val1", "val2"})
	public void Summation(int v1, int v2) {
		
		int sum = v1 + v2;
		System.out.println("Summation is :" +sum);
	}
	
	@Test
	@Parameters({"val3", "val4"})
	public void Subtraction(int v3, int v4) {
		
		int sub = v3 - v4;
		System.out.println("Subtraction is :" +sub);
	}
	
	@Test
	@Parameters({"val1", "val2"})
	public void Multiplication(int v1, int v2) {
		
		int mul = v1 * v2;
		System.out.println("Multiplication is :" +mul);
	}
	
	@Test
	@Parameters({"val3", "val4"})
	public void Dividation(int v3, int v4) {
		
		int div = v3 / v4;
		System.out.println("Dividation is :" +div);
	}
	
	@Test
	@Parameters("message")
	public void OptionalParam(@Optional("Welcome to selenium testing")String message) {
		
		System.out.println(message);
	}
	
	
}
