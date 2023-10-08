package handlers;

import requests.Request;

public class SeniorHandler implements Handler {
  private final String name;
  private Handler nextHandler;

  public SeniorHandler(String name) {
    this.name = name;
  }

  @Override
  public Handler setNextHandler(Handler nextHandler) {
    this.nextHandler = nextHandler;
    return nextHandler;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void handleRequest(Request request) {
    System.out.println(getName() + " received request for " + request.getDaysOff() + " days off for " + request.getEmployeeName());
    if (request.getDaysOff() <= 10) {
      System.out.println(getName() + " approves " + request.getDaysOff() +
        " days off for " + request.getEmployeeName());
    } else if (nextHandler != null) {
      System.out.println(getName() + " cannot approve request for " + request.getEmployeeName() +
        " for " + request.getDaysOff() + " days. Sending request up the chain to " + nextHandler.getName());
      nextHandler.handleRequest(request);
    }
  }
}
