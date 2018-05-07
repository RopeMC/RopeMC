package de.ropemc.updater;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class UpdaterGUIController {

    @FXML
    private Pane pane;

    public void createGUI() {
        new Thread(() -> Application.launch(UpdaterGUI.class)).start();
        FadeTransition ft = new FadeTransition(Duration.millis(1000), pane);
        ft.setFromValue(0.0);
        ft.setToValue(1.0);
        ft.play();
    }

    public void closeGUI() {
        FadeTransition ft = new FadeTransition(Duration.millis(1000), pane);
        ft.setFromValue(1.0);
        ft.setToValue(0.0);
        ft.setOnFinished(event -> Platform.exit());
        ft.play();
    }

}
