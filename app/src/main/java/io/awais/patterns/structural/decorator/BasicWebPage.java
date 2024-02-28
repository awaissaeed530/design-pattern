package io.awais.patterns.structural.decorator;

public class BasicWebPage implements WebPage {
	private String html = "";
	private String css = "";
	private String scripts = "";

	@Override
	public void display() {
		System.out.println("Basic Web Page");
	}
}
