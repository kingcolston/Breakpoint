import alerts.Alert;
import javax.swing.*;
import java.util.ArrayList;
import alerts.AlertCreator;

public class Breakpoint {


    public static void main(String[] args) {
        Setup setUp = new Setup();
        setUp.startScreen();
        AlertCreator alert_obj = new AlertCreator();
        alert_obj.SetAlerts();
        alert_obj.PrintAlerts();



    }



}




