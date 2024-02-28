package io.awais.patterns.structural.decorator;

public class AuthorizedWebPage extends WebPageDecorator {
	public AuthorizedWebPage(WebPage page) {
		super(page);
	}

	public void authorize() {
		System.out.println("Authorizing user...");
	}

	public void display() {
		this.authorize();
		super.display();
	}
}
