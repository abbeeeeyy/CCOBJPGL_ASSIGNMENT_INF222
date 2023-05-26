package DrinkController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import Model.*;

public class DrinkController {

    @FXML
    Button spriteButton, milkButton, milkteaButton, milkshakeButton, coffeeButton;

    Sprite sprite2 = new Sprite();
    Milk milk2 = new Milk();
    Milktea milktea2 = new Milktea();
    Milkshake milkshake2= new Milkshake();
    Coffee coffee2 = new Coffee();


    public void initialize() {

        sprite2.setRating("Top 5 !");
        sprite2.setTaste("Good !");

        milk2.setRating("Top 4 !");
        milk2.setTaste("Calcium !");

        milktea2.setRating("Top 3 !");
        milktea2.setTaste("Very good !");

        milkshake2.setRating("Top 2 !");
        milkshake2.setTaste("Yummy !");

        coffee2.setRating("Top 1 !");
        coffee2.setTaste("Top tier !");
      
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton == spriteButton) {
            alert.setContentText("Sprite is " + sprite2.getRating() + " and it's " + sprite2.getTaste());
        }

        if (sourceButton == milkButton) {
            alert.setContentText("Milk is " + milk2.getRating() + " and is has " + milk2.getTaste());
        }

        if (sourceButton == milkteaButton) {
            alert.setContentText("Milktea is " + milktea2.getRating() + " and it's " + milktea2.getTaste());
        }

        if (sourceButton == milkshakeButton) {
            alert.setContentText("Milkshake is " + milkshake2.getRating() + " and it's " + milkshake2.getTaste());
        }

        if (sourceButton == coffeeButton) {
            alert.setContentText("Coffee is " + coffee2.getRating() + " and it's " + coffee2.getTaste());
        }

        alert.showAndWait();

    }

}
