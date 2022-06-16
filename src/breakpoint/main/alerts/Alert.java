package breakpoint.main.alerts;

public class Alert {
    public String alertName;
    public String alertMessage;

    public Alert(String name, String message) {
        setAlertName(name);
        setAlertMessage(message);
    }

    public String getAlertName() {
        return alertName;
    }

    public void setAlertName(String alertName) {
        this.alertName = alertName;
    }

    public String getAlertMessage() {
        return alertMessage;
    }

    public void setAlertMessage(String alertMessage) {
        this.alertMessage = alertMessage;
    }

}
