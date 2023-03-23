package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private Button adddetails;
    @FXML
    void adddetailsclck(ActionEvent event) throws IOException {
        Stage stage = (Stage) adddetails.getScene().getWindow();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("destination.fxml"));
        primaryStage.setTitle("destination");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        stage.close();

    }
    @FXML
    private Button next2;
    @FXML
    void next2Click(ActionEvent event) throws IOException{
        Stage stage = (Stage) next2.getScene().getWindow();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("adddetails.fxml"));
        primaryStage.setTitle("Add Your Details");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        stage.close();

    }
    @FXML
    private Button back2;
    @FXML
    void back2Click(ActionEvent event) throws IOException{
        Stage stage = (Stage) back2.getScene().getWindow();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primaryStage.setTitle("Welcome");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        stage.close();

    }



    @FXML
    private Button add1;

    @FXML
    private Button back1;

    @FXML
    private Button next1;

    @FXML
    private Button registereddetails;

    @FXML
    void next1Click(ActionEvent event) throws IOException {
        Stage stage = (Stage) next1.getScene().getWindow();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("last page.fxml"));
        primaryStage.setTitle("Thankyou");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        stage.close();


    }
    @FXML
    void back1Click(ActionEvent event) throws IOException {

        Stage stage = (Stage) back1.getScene().getWindow();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("destination.fxml"));
        primaryStage.setTitle("Select Destination");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        stage.close();

    }
    @FXML
    void add1Click(ActionEvent event) {
        Alert newalert = new Alert(Alert.AlertType.CONFIRMATION);
        newalert.setContentText("Are you sure want to submit your documents?");
        Optional<ButtonType> result = newalert.showAndWait();
        ButtonType button = result.orElse(ButtonType.CANCEL);
        if (button == ButtonType.OK) {

        } else if (button == ButtonType.CANCEL) {
            System.out.println("Cancelled Successfully");

        }
    }
    @FXML
    void registereddetailsClick(ActionEvent event) throws IOException {

        Stage stage = (Stage) registereddetails.getScene().getWindow();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("view tourist details.fxml"));
        primaryStage.setTitle("Registered Details");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        stage.close();

    }

    @FXML
    private Button fillanother;

    @FXML
    private Button quit;

    @FXML
    void fillanotherClick(ActionEvent event) throws IOException {
        Stage stage = (Stage) fillanother.getScene().getWindow();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("adddetails.fxml"));
        primaryStage.setTitle("Add Your Details");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        stage.close();

    }
    @FXML
    void quitClick(ActionEvent event) {
        Stage stage = (Stage) quit.getScene().getWindow();
        stage.close();
    }
    @FXML
    private Button back3;

    @FXML
    private Button mainmenu;

    @FXML
    void back3Click(ActionEvent event) throws IOException {
        Stage stage = (Stage) back3.getScene().getWindow();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("adddetails.fxml"));
        primaryStage.setTitle("Add Your Details");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        stage.close();


    }

    @FXML
    void mainmenuClick(ActionEvent event) throws IOException {
        Stage stage = (Stage) mainmenu.getScene().getWindow();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primaryStage.setTitle("Welcome");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        stage.close();

    }












}
