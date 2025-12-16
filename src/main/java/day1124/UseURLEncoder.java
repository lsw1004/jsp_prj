package day1124;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class UseURLEncoder {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String name = "홍길동";
		System.out.println(name);
		
		String enName = URLEncoder.encode(name, "UTF-8");
		System.out.println("enName : " + enName);
		String deName = URLDecoder.decode(enName, "UTF-8");
		System.out.println("deName : " + deName);
		// id = %ED%99%8D%EA%B8%B8%EB%8F%99
		
		// String 사용.
		String str = new String(URLDecoder.decode(enName, "8859_1").getBytes("ISO-8859-1"), "UTF-8");
		System.out.println(str);
		
	}// main

}// class
