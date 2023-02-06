package com.forlearn;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginWindowController implements Initializable {

    private Stage stage;
    private Scene scene;

  //#region
    @FXML
    PasswordField userPassword;
    @FXML
    TextField userName;
    @FXML
    Label nameLabel;
    @FXML
    Label passwordLabel;
    //#endregion
    
    @FXML
    private void handleLogin(ActionEvent event) throws IOException{
        if(nameCheck(userName.getText()) && passwordCheck(userPassword.getText()))
            switchWindow(event);
    }

    private boolean passwordCheck(String text) {
        int textLength = text.length();
        if( textLength < 6 || textLength == 0 || textLength > 15 ){
            userName.setStyle("-fx-border-color: red");
            if (textLength < 6) {
                passwordLabel.setText("Túl kevés karakter, 8 karakternél több kell, még "+textLength+" db kell");
                userPassword.setStyle("-fx-border-color: red");
                return false;
            } else if(textLength == 0) {
                passwordLabel.setText("Nem írtál be semmit haló");
                userPassword.setStyle("-fx-border-color: red");
                return false;
            }else{
                passwordLabel.setText("Túl sok karakter tesvérem");
                userPassword.setStyle("-fx-border-color: red");
                return false;
            }
            }
        else
            return true;
    }

    private boolean nameCheck(String text) {
        int names = text.split(" ").length;
        if(names <2  || names ==0){
            nameLabel.setText("Nem jó a név, legalább egy kereszt- és vezetéknév kell!");
            userName.setStyle("-fx-border-color: red");
            return false;
        }
        else if(names > 4){
        nameLabel.setText("Nem jó a név mező, túl sok név");
        userName.setStyle("-fx-border-color: red");
        return false;
        }
        else 
            return true;
    }

    public void switchWindow(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        
    }
}
