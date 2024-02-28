package io.awais.patterns.structural.decorator;

public class AuthenticatedWebPage extends WebPageDecorator {
	public AuthenticatedWebPage(WebPage page) {
		super(page);
	}

	public void authenticate() {
		System.out.println("Authenticating user...");
	}

	public void display() {
		this.authenticate();
		super.display();
	}
}
