package com.forlearn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class HomeController extends Application {
    
@FXML
MenuItem userLoaderItem;
    
@FXML
private void usersList(){

}


@FXML
private void usersLoadIn(Stage stage) throws IOException{
    FileChooser fileChooser = new FileChooser();
    fileChooser.setTitle("Open Text File");
    fileChooser.setInitialDirectory(new File("."));
    fileChooser.setInitialFileName("users.txt");
    fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Text Files", "*.txt", "*.csv"));
    File selectedFile = fileChooser.showOpenDialog(null);
    if (selectedFile == null)
    {
      
      try
      {
       BufferedReader reader = new BufferedReader(new FileReader("data/"+fileName));
       reader.close();  
    }
      catch (IOException e)
      { 
        
      }
     
      
    }

    else
    {
      try
      {
        BufferedReader reader = new BufferedReader(new FileReader(selectedFile));
        
        reader.close();
      }
      catch (IOException e)
      { 

      }
      
    }
}


@Override
public void start(Stage stage) throws Exception {
 userLoaderItem.setOnAction( e -> {
  try {
    usersLoadIn(stage);
  } catch (IOException e1) {
    e1.printStackTrace();
  }
 });

}

}
