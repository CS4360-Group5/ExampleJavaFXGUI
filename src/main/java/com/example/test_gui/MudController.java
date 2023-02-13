package com.example.test_gui;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MudController {
    @FXML private TextArea output;
    @FXML private TextField input;

    @FXML
    private void handleSendButton() {
        String command = input.getText();
        input.clear();
        String response = processCommand(command);
        output.appendText("> " + command + "\n" + response + "\n");
    }

    private String processCommand(String command) {
        // Here will be the implementation of the MUD GUI text logic
        return "420 69 blaze it.";
    }
}
