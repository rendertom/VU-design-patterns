package handlers;

import requests.Request;

public interface Handler {
  void handleRequest(Request request);
  Handler setNextHandler(Handler nextHandler);
  String getName();
}
