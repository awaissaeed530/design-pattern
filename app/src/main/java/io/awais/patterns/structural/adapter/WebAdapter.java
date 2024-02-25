package io.awais.patterns.structural.adapter;

public class WebAdapter implements WebRequester {
  private WebService service;

  public void connect(WebService service) {
    this.service = service;
  }

  public int request(Object request) {
    String json = this.toJson(request);
    String response = service.request(json);

    if (response != null) {
      return 200;
    }
    return 500;
  }

  private String toJson(Object input) {
    return input.toString();
  }
}
