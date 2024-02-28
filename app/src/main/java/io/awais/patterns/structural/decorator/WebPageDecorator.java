package io.awais.patterns.structural.decorator;

public abstract class WebPageDecorator implements WebPage {
	protected WebPage page;

	public WebPageDecorator(WebPage page) {
		this.page = page;
	}

	public void display() {
		this.page.display();
	}
}
