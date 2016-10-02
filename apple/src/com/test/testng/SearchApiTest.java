package com.test.testng;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Assert.*;
import com.test.helpers.RestClient;

public class SearchApiTest {
	public RestClient rc;

    @Before
    public void initialize() {
        rc = RestClient.getInstance();    
    }

    /**
     * Test searchApi limit parameter
     * 	input: valid term, country and limit is set to 2
     * 		
     * @throws Exception
     */
	@Test
	public void test() throws Exception {
		JSONObject json = rc.sendGet("https://itunes.apple.com/search?term=jim+jones&country=ca&limit=2");
		Assert.assertTrue("Return record failed for limit=2", Integer.valueOf(json.getString("resultCount")) == 2);
	}

}
