package com.footballmanager.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class MainController {
    @FXML
    private void handleViewTeams() {
        showAlert("View Teams", "Team view not implemented yet");
    }

    @FXML
    private void handleViewPlayers() {
        showAlert("View Players", "Player view not implemented yet");
    }

    @FXML
    private void handleViewFixtures() {
        showAlert("View Fixtures", "Fixture view not implemented yet");
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
