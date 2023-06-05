package com.example.rental;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class LoginController {
    @FXML
    private TextField txtusername;

    @FXML
    private PasswordField txtpassword;
    @FXML
    private Label lblinfo;
/*
    @FXML
    protected void btnsignin(ActionEvent event)  {
        String username = txtusername.getText();
        String password = txtpassword.getText();
        if(username.equals("admin") && password.equals("admin123")){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Dashboard.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 720, 480);
                Stage stage = new Stage();
                stage.setTitle("Hello!");
                stage.setScene(scene);
                stage.show();
            }catch (Exception e){
                e.printStackTrace();
            }
        }else{
            lblinfo.setText("Invalid login! please try again.");
        }
    }*/
    public void btnsignin(ActionEvent event) throws IOException {
        String username = txtusername.getText();
        String password = txtpassword.getText();
        if(username.equals("admin") && password.equals("admin123")){
            Parent toMenu = FXMLLoader.load(getClass().getResource("Masuk_Toko.fxml"));
            Scene sceneMenu = new Scene(toMenu);
            Stage stageMenu = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stageMenu.setScene(sceneMenu);
            stageMenu.show();
        }else if(username.equals("arta") && password.equals("arta123")){
            Parent toMenu = FXMLLoader.load(getClass().getResource("Dashboard_User.fxml"));
            Scene sceneMenu = new Scene(toMenu);
            Stage stageMenu = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stageMenu.setScene(sceneMenu);
            stageMenu.show();
        }else{
            lblinfo.setText("Invalid login! please try again.");
        }
    }
    public void dashboardOnAction(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("Dashboard_User.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }
    public void tambahOnAction(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("TambahMobil.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }
    public void ubahOnAction(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("UbahMobil.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }
    public void hapusOnAction(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("HapusMobil.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }
    public void balekOnAction(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("Masuk_Toko.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }
    public void profilOnAction(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("Profile.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }
    public void statusOnAction(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("StatusPemesanan.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }
    public void searchOnAction(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("Filter.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }
    public void deskOnAction(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("DeskripsiMobil.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }
    public void sewaOnAction(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("FormBayar.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }
    public void registerOnAction(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("Register.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }
    public void keluarOnAction(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Informasi");
        alert.setHeaderText("Berhasil melakukan register!");
        alert.setContentText(
                "TerimaKasih"
        );
        alert.showAndWait();
    }
    public void cancelOnAction(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }
}