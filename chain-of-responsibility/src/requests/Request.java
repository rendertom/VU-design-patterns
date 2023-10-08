package requests;

public class Request {
  private String employeeName;
  private int daysOff;

  public Request(String employeeName, int daysOff) {
    this.employeeName = employeeName;
    this.daysOff = daysOff;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public int getDaysOff() {
    return daysOff;
  }
}
