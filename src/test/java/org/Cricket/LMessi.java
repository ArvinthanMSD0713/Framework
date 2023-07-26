package org.Cricket;
import org.testng.annotations.Test;
public class LMessi {
	@Test (priority=1, invocationCount=5)
	private void CSK() {
		System.out.println("MSD");	
	}
	@Test(priority=3)
	private void RCB() {
		System.out.println("VIRAT");
	}
	@Test(priority=6, invocationCount=1)
	private void GT() {
		System.out.println("Hardik");
	}
	@Test(priority=-100, invocationCount=0)
	private void MI() {
		System.out.println("ROHIT");
	}
	@Test(priority=7, enabled=true)
	private void GL() {
		System.out.println("RAINA");
	}
}
