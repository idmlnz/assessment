package com.test.testng;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.java.RemoveString;
import com.test.helpers.RestClient;


/**
 * This testsuite tests the RemoveStringIterator API
 * @author imalonzo
 *
 */
public class RemoveStringIteratorTest {
	private RemoveString rs = new RemoveString();

	// Test to see if all occurrences of Char are removed
	@Test
	public void testOneCharacter() {
		String actual =  rs.removeStringIterator("hello world", 'l');
		Assert.assertTrue("testOneChar failed", actual.equals("heo word") );
	}

	// Test if no Char is found
	@Test
	public void testNoCharacter() {
		String actual =  rs.removeStringIterator("hello world", 'z');
		Assert.assertTrue("testNoCharacter failed", actual.equals("hello world") );
	}

	// Test if String contains literal digit
	@Test
	public void testLiteralDigit() {
		String actual =  rs.removeStringIterator("hello22 world222", '2');
		Assert.assertTrue("testLiteralDigit failed", actual.equals("hello world") );
	}


	// Test if String is blank
	@Test
	public void testStringBlank() {
		String actual =  rs.removeStringIterator("", 'z');
		Assert.assertTrue("testNoCharacter failed", actual.equals("") );
	}

	// Test if String is null
	@Test
	public void testStringNull() {
		String actual =  rs.removeStringIterator(null, 'z');
		Assert.assertTrue("testStringNull failed",  actual == null);
	}




}
