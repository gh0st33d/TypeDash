package com.tonevellah.demofx1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Scene6Controller {
    @FXML
    Label wpmLabel;
    @FXML
    Label accuracyLabel;
    @FXML
    Label typedwordsLabel;
    @FXML
    Label wrongtwordsLabel;
    @FXML
    Button button;
    @FXML
    Button exitButton;
    @FXML
    Button statButton;

    private Stage stage;
    private Scene scene;
    private Parent root;

    //
    public void displayResult(int wpmScore,int accuracyScore,int typedWords,int wrongWords){
        wpmLabel.setText(String.valueOf((int)wpmScore));
        accuracyLabel.setText(String.valueOf(accuracyScore) + "%");
        typedwordsLabel.setText(String.valueOf(typedWords) + " Words");
        wrongtwordsLabel.setText(String.valueOf(wrongWords) + " Words");
    }
    public void goback(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scene5.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void viewGraph(ActionEvent e) {

        System.out.println("graph");
    }
    public void exit(ActionEvent e) {

        //System.out.println("Exit");
        System.exit(0);
    }
}
