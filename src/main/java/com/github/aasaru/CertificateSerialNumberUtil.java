package com.github.aasaru;

import com.google.common.io.BaseEncoding;

public class CertificateSerialNumberUtil
{

    /**
     * Adds missing padding so the output is exactly 32 characters long (16-byte hex string)
     * @param hexAsString Hex string without padding
     * @return Hex string with correct padding
     */
    public static String to16byteHexString(String hexAsString) {
        if (hexAsString.length() % 2 == 1) {
            hexAsString = "0" + hexAsString;
        }

        byte[] byteArray = BaseEncoding.base16().lowerCase().decode(hexAsString.toLowerCase());

        byte[] result = new byte[16];

        System.arraycopy(byteArray, 0, result, 16 - byteArray.length, byteArray.length);


        return BaseEncoding.base16().encode(result);
    }


}
