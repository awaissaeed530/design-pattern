package io.awais;

import org.junit.Test;

import io.awais.patterns.structural.adapter.WebAdapter;
import io.awais.patterns.structural.adapter.WebClient;
import io.awais.patterns.structural.adapter.WebService;

public class AdapterPatternTest {
  @Test
  public void test() {
    String host = "https://google.com";
    WebService service = new WebService(host);

    WebAdapter adapter = new WebAdapter();
    adapter.connect(service);

    WebClient client = new WebClient(adapter);
    client.doWork();
  }
}
