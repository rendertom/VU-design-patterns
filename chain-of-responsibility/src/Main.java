import handlers.*;
import requests.Request;

public class Main {
  public static void main(String[] args) {
    Handler junior = new JuniorHandler("Junior John");
    Handler middle = new MiddleHandler("Middle Mary");
    Handler senior = new SeniorHandler("Senior Sam");
    Handler cto = new CTOHandler("CTO Chris");

    junior
      .setNextHandler(middle)
      .setNextHandler(senior)
      .setNextHandler(cto);

    Request request1 = new Request("Antanas", 1);
    Request request2 = new Request("Vytas", 4);
    Request request3 = new Request("Zita", 8);
    Request request4 = new Request("Jurga", 15);

    junior.handleRequest(request1);
    System.out.println("---");
    junior.handleRequest(request2);
    System.out.println("---");
    junior.handleRequest(request3);
    System.out.println("---");
    junior.handleRequest(request4);
  }
}