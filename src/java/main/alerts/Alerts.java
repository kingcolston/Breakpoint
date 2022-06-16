package alerts;

public interface Alerts {
    public String alertName = "Alert";
    public String message = "Alert Message";

    public String getAlertName();
    public String getAlertMessage();

    public void setAlertName();
    public void setMessage();

    // We might not need this
    public void startAlert();
    public void closeAlert();

}
