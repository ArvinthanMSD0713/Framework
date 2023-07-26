package org.Cricket;
import org.testng.Assert;
import org.testng.annotations.Test;
public class AssertTorF {
	@Test
	public void tc1() {
		String a="Joshna";
		boolean contains=a.contains("J");
		Assert.assertTrue(contains);
		boolean contains1=a.contains("A");
		Assert.assertFalse(contains1);
	}
}
