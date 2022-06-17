package breakpoint.main.alerts;

/*
This class will control which alert will be called next. It will call an alert every hour.

FOR TESTING PURPOSES IT IS CONFIGURED TO CALL AN ALERT EVERY 30 SECONDS.

 */

public class AlertController implements Runnable {
    private static double timer = 0.5;
    private static boolean start;
    int counter = 0;
    Thread alertThread = new Thread();

    AlertCreator alert_obj = new AlertCreator();

    public static void setTimer(double time){
        start = true;
        timer = time;
    }
    public void start(){
        alert_obj.SetAlerts();
    }
    @Override
    public void run() {
        while(true) {
            try {
                alert_obj.printAlert();
                //Thread.sleep(1000*60*60);
                long num = (long) (timer*60);
                alertThread.sleep(1000*num);
            } catch (InterruptedException ie) {
            }
        }
    }
}
