package org.Cricket;
import org.testng.annotations.Test;
public class Group {
	@Test(groups="Sanity", priority=1)
	private void MSD() {
	System.out.println("5 Tropies");	
	}
	@Test(groups="Smoke", priority=1)
	private void Rohit() {
	System.out.println("5 Tropies");	
	}
	@Test(groups="Regg", priority=1)
	private void Virat() {
	System.out.println("Trying");
	}
}