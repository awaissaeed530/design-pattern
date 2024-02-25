package io.awais.patterns.structural.adapter;

public class WebClient {
  private WebRequester requester;

  public WebClient(WebRequester requester) {
    this.requester = requester;
  }

  public void doWork() {
    Object object = new Object();

    int status = this.requester.request(object);

    if (status == 200) {
      System.out.println("Good");
    } else {
      System.out.println("Not Good");
    }
  }
}
