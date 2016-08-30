package com.timeabout.yzq.configure;

import java.io.UnsupportedEncodingException;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

public class EncodeConfig {
	/**
	 * 对字符串进行加密 
	 * @param str
	 * @return
	 */
    public static String getBase64(String str) {  
        byte[] b = null;  
        String s = null;  
        try {  
            b = str.getBytes("utf-8");  
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
        }  
        if (b != null) {  
            s = new BASE64Encoder().encode(b);  
        }  
        return s;  
    }  
    /**
     * 对字符串进行解密
     * @param s
     * @return
     */
    public static String getFromBase64(String s) {  
        byte[] b = null;  
        String result = null;  
        if (s != null) {  
            BASE64Decoder decoder = new BASE64Decoder();  
            try {  
                b = decoder.decodeBuffer(s);  
                result = new String(b, "utf-8");  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }  
        return result;  
    }  
}
