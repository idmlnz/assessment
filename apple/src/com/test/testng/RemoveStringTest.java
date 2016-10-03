package com.test.testng;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.java.RemoveString;
import com.test.helpers.RestClient;


/**
 * This testsuite tests the RemoveString.removeString API
 * 
 * @author imalonzo
 *
 */
public class RemoveStringTest {
	private RemoveString rs = new RemoveString();

	// Test to see if all occurrences of Char are removed
	@Test
	public void testOneCharacter() {
		String actual =  rs.removeString("hello world", 'l');
		Assert.assertTrue("testOneChar failed", actual.equals("heo word") );
	}

	// Test if no Char is found
	@Test
	public void testNoCharacter() {
		String actual =  rs.removeString("hello world", 'z');
		Assert.assertTrue("testNoCharacter failed", actual.equals("hello world") );
	}

	// Test if String contains literal digit
	@Test
	public void testLiteralDigit() {
		String actual =  rs.removeString("hello 2world2", '2');
		Assert.assertTrue("testLiteralDigit failed", actual.equals("hello world") );
	}

	// Test if String is blank
	@Test
	public void testStringBlank() {
		String actual =  rs.removeString("", 'z');
		Assert.assertTrue("testStringBlank failed", actual.equals("") );
	}

	// Test if String is null
	@Test
	public void testStringNull() {
		String actual =  rs.removeString(null, 'z');
		Assert.assertTrue("testStringNull failed",  actual == null);
	}

	// Test non alpha-numeric string
	@Test
	public void testNonAlphaNumeric() {
		String actual =  rs.removeString("@@@hello@@@@", '@');
		Assert.assertTrue("testNonAlphaNumeric failed", actual.equals("hello") );
	}	


}
