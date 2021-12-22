package com.xworkz.inheritance;

import com.xworkz.inheritance.dto.Browser;
import com.xworkz.inheritance.dto.Chrome;

public class TestInheritance

{
	public static void main(String[] args) {
		Browser browser = new Browser();
		System.out.println(browser.title);
		browser.search("7zip");
		browser.download("7zip");
		Chrome chrome = new Chrome();
		String resp = chrome.search("os");
		System.out.println(resp);
	}

}
