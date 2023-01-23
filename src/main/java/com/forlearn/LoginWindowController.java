package com.forlearn;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML
    PasswordField userPassword;
    @FXML
    TextField userName;
    @FXML
    Label nameLabel;
    @FXML
    Label passwordLabel;
    @FXML
    private void handleLogin(ActionEvent event){
        nameLabel.setText("Nem jó a név");
        passwordLabel.setText("Nem jó a jelszó");

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        
    }
}
