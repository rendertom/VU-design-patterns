package observable;

public class Secretary extends Observable {
  public void sendMeetingReminder() {
    notify("Reminder: Staff meeting at 2 PM.");
  }
}
