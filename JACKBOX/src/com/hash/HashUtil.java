package com.hash;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashUtil {
	
	public String simpleProcess(String password) {
		
		char[] chars = password.toCharArray();
		char[] result = new char[chars.length * 2];
		for(int i = 0; i < chars.length; i++) {
			char character = chars[i];
			result[i * 2] = (char) (character + 1);
			result[(i * 2) + 1] = '#';
		}
		
		return new String(result);
	}
	
	public String sha256Process(String password) {
		MessageDigest messageDigest;
		String encodeStr = "";
		try {
			messageDigest = MessageDigest.getInstance("SHA-256");
			messageDigest.update(password.getBytes("UTF-8"));
			encodeStr = byte2Hex(messageDigest.digest());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return encodeStr;
	}

	private String byte2Hex(byte[] bytes) {
		StringBuffer stringBuffer = new StringBuffer();
		String temp = null;
		for (int i = 0; i < bytes.length; i++) {
			temp = Integer.toHexString(bytes[i] & 0xFF);
			if (temp.length() == 1) {
				stringBuffer.append("0");
			}
			stringBuffer.append(temp);
		}
		return stringBuffer.toString();
	}
	
	public static void main(String[] args) {
		String password = "1";
		HashUtil hashUtil = new HashUtil();
		String handledPassword =  hashUtil.sha256Process(password);
		System.out.println("handledPassword: " + handledPassword);
	}
}
