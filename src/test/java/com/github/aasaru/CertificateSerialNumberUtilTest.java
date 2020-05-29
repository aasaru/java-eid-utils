package com.github.aasaru;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class CertificateSerialNumberUtilTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CertificateSerialNumberUtilTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CertificateSerialNumberUtilTest.class );
    }


    public void testApp()
    {
        assertEquals("000079DE35CA46BDBDA5567B480EE7ED", CertificateSerialNumberUtil.to16byteHexString("79DE35CA46BDBDA5567B480EE7ED") );
        assertEquals("000C3C233E0B49C89EC7B17A573F6FBE", CertificateSerialNumberUtil.to16byteHexString("C3C233E0B49C89EC7B17A573F6FBE") );
    }



}
