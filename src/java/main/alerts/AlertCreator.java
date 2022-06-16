package alerts;
import java.util.ArrayList;

public class AlertCreator {

    public AlertCreator(){
        alerts = new ArrayList<>();
    }
    public ArrayList<Alert> alerts;
    int index = 0;

    public void SetAlerts(){
        Alert alert1 = new Alert("Generic_Break", "It’s time to take a break!");
        alerts.add(alert1);
        Alert alert2 = new Alert("Water_Alert", "Hydrate or DIE-drate!");
        alerts.add(alert2);
        Alert alert3 = new Alert("Talk_Alert", "Is it so hard to believe that you have friends IRL? Maybe you should get up and talk to them!");
        alerts.add(alert3);
        Alert alert4 = new Alert("Smell_Alert", "You’re probably stinky. Time to freshen up!");
        alerts.add(alert4);
        Alert alert5 = new Alert("Stretch_Alert", "Time to stand up and get that blood flowing!");
        alerts.add(alert5);
        Alert alert6 = new Alert("Food_Alert", "I’m a computer, so I don’t need to eat—but you do.");
        alerts.add(alert6);
        Alert alert7 = new Alert("Bathroom_Alert", "Leak the lizard");
        alerts.add(alert7);
        Alert alert8 = new Alert("Sunshine_Alert", "You're looking a little pale. Time to get some fresh air!");
        alerts.add(alert8);
        Alert alert9 = new Alert("Breathe_Alert", "Hey friend…don’t forget to breathe…");
        alerts.add(alert9);
        Alert alert10 = new Alert("Joke_Alert", "Tell a joke to a coworker!");
        alerts.add(alert10);
    }

    public void PrintAllAlerts(){
        for(int i = 0; i < alerts.size(); i++){
            System.out.println(alerts.get(i).getAlertName() + ": " + alerts.get(i).getAlertMessage());
        }
    }

    public void printAlert() {
        System.out.println(alerts.get(index).getAlertMessage());
        index++;
    }
}
