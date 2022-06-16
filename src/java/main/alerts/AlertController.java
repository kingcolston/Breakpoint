package alerts;

/*
This class will control which alert will be called next. It will call an alert every hour.

FOR TESTING PURPOSES IT IS CONFIGURED TO CALL AN ALERT EVERY 30 SECONDS.

 */

public class AlertController implements Runnable {
    int counter = 0;
    Thread alertThread = new Thread();

    AlertCreator alert_obj = new AlertCreator();

    @Override
    public void run() {
        alert_obj.SetAlerts();
        while(true) {
            try {
                alert_obj.printAlert();
                //Thread.sleep(1000*60*60);
                alertThread.sleep(1000*30);
            } catch (InterruptedException ie) {
            }
        }
    }
}
