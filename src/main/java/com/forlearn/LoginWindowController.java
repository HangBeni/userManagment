package com.forlearn;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class LoginWindowController implements Initializable {

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
        nameCheck(nameLabel.getText());
        passwordCheck(userPassword.getText());
    }

    private void passwordCheck(String text) {
        int textLength = text.length();
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Check");
        alert.setContentText("A jelszó mező hossza: "+textLength);
        if( textLength < 8 || textLength == 0 || textLength > 15 ){
            userName.setStyle("-fx-border-color: red");
            if (textLength < 8) {
                passwordLabel.setText("Túl kevés karakter, 8 karakternél több kell, még "+textLength+" db kell");
            } else if(textLength == 0) {
                passwordLabel.setText("Nem írtál be semmit haló");
            }else{
                passwordLabel.setText("Túl sok karakter tesvérem");
            }
            }
    }

    private void nameCheck(String text) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Check");
        int names = text.split(" ").length;
        alert.setContentText("A név mezőben: "+names+ " név van");
        if(names <2  || names ==0){
            nameLabel.setText("Nem jó a név mező, legalább egy kereszt és vezetéknév kell");
            userName.setStyle("-fx-border-color: red");
        }
        else if(names > 4){
        nameLabel.setText("Nem jó a név mező, túl sok név");
        userName.setStyle("-fx-border-color: red");
        }
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        
    }
}
