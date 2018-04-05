package com.keyword.revenue;
import org.junit.Test;
import junit.framework.TestCase;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
/**
 * Created by bonythomas on 4/5/18.
 */
public class KeywordUtilTest extends TestCase {
    String domain = "http://www.google.com/search?hl=en&client=firefox-a&rls=org.mozilla%3Aen-US%3Aofficial&hs=ZzP&q=Ipod&aq=f&oq=&aqi=";
    String query = "Ipod";
    MessageUtil m = new MessageUtil(message);

    @Test
    public void testDomainAndSearchName(String d,String q) {
        System.out.println("Inside testPrintMessage()");
        assertEquals(message, messageUtil.printMessage());
    }
}

}