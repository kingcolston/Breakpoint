package alerts;

/*
This class will control which alert will be called next. It will call an alert every hour.

FOR TESTING PURPOSES IT IS CONFIGURED TO CALL AN ALERT EVERY 30 SECONDS.

 */

public class AlertController implements Runnable {
    int counter = 0;

    @Override
    public void run() {
        while(true) {
            try {
                System.out.println("Call Alert " + counter);
                counter++;
                //Thread.sleep(1000*60*60);
                Thread.sleep(1000*30);
            } catch (InterruptedException ie) {
            }
        }
    }
}
