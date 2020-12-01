package com.tanky.Utils;

import java.io.BufferedReader;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class HttpUtils {

	private String value;
	
	public HttpUtils(String value) {
		this.value = value;
	}
	
	public <T> T toModel (Class<T> tclass) {
		
		try {
			return new ObjectMapper().readValue(value, tclass);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static HttpUtils of(BufferedReader reader) {
		StringBuilder builder = new StringBuilder();
		String line="";
		try {
			while ((line= reader.readLine()) != null) {
				builder.append(line);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new HttpUtils(builder.toString());
	}
	
}
