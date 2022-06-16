package breakpoint.main;

import breakpoint.main.alerts.AlertController;

public class Breakpoint {

    public static void main(String[] args) {
        Setup setUp = new Setup();
        setUp.startScreen();
        AlertController controller = new AlertController();
        //System.out.println(fetchJoke.getJoke());
        controller.run();
    }
}
