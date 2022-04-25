package com.testng;

import org.testng.annotations.Test;

public class Grouping_Concepts {
	@Test( groups = "Books")
	private void books() {
System.out.println("books");
	}
	@Test( priority =- 1 ,groups = "music")
	private void spotify() {
System.out.println("spotify");
	}
	@Test( priority = 1 ,groups = "music")
	private void wynkmusic() {
System.out.println("Wynk music");
	}
@Test(  priority = 3 ,groups = "social media")
private void instagram() {
System.out.println("instagram");
}
@Test(  priority = 2 ,groups = "social media")
private void whatsapp() {
System.out.println("whatsapp");
}
}
