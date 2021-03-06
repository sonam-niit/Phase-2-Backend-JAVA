package com.simplilearn.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TestURL {

	public static void main(String[] args) throws IOException {
		
		URL url=new URL("http://localhost:8123/URLConnection/");
		HttpURLConnection conn=(HttpURLConnection) url.openConnection();
		
		conn.setRequestMethod("GET");
		conn.setRequestProperty("User-Agent", "IE=edge");
		System.out.println("Response code "+conn.getResponseCode());
		BufferedReader reader=new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		String line=null;
		StringBuilder sb=new StringBuilder("");
		while((line=reader.readLine())!=null) {
			sb.append(line);
		}
		reader.close();
		System.out.println(sb.toString());

	}

}
