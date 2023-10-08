package handlers;

import requests.Request;

public class CTOHandler implements Handler {
  private final String name;

  public CTOHandler(String name) {
    this.name = name;
  }

  @Override
  public Handler setNextHandler(Handler nextHandler) {
    // The CTO is the highest authority and doesn't delegate further.
    return null;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void handleRequest(Request request) {
    System.out.println(getName() + " approves " + request.getDaysOff() + " days off for " + request.getEmployeeName());
  }
}
