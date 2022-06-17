package breakpoint.main;

import breakpoint.main.alerts.AlertController;

public class Breakpoint {

    public static void main(String[] args) {
        Setup setUp = new Setup();
        AlertController alertController = new AlertController();
        alertController.start();
        setUp.startScreen(alertController);
        alertController.run();
    }
}
