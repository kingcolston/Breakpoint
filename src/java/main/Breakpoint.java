import alerts.Alert;
import alerts.AlertController;
import alerts.AlertCreator;

import javax.swing.*;

public class Breakpoint {

    public static void main(String[] args) {
        Setup setUp = new Setup();
        setUp.startScreen();
        AlertController controller = new AlertController();
        controller.run();
    }
}
