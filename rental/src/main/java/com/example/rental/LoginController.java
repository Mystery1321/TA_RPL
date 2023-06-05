package com.example.rental;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.cell.PropertyValueFactory;
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
        if(username.equals("a") && password.equals("1")){
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


    @FXML
    private TextField namaTambah;
    @FXML
    private TextField txtmerk;
    @FXML
    private ComboBox cbjenis;
    @FXML
    private TextField txtkapasitas;
    @FXML
    private TextField txtharga;
    @FXML
    private TextField txtbahanbakar;
    @FXML
    private TableView<Mobil> table;

    private ObservableList<Mobil> data;

    private ObservableList<Object> jenisMobilList = FXCollections.observableArrayList();
//    Try Create Data
    @FXML
    void tambahajaOnAction(ActionEvent event) {
        data = FXCollections.observableArrayList();
        table = new TableView<>();
        table.setItems(data);

        String nama = namaTambah.getText();
        String merk = txtmerk.getText();
        String kapasitas = txtkapasitas.getText();
        String harga = txtharga.getText();
        String jenis = String.valueOf(cbjenis.getValue());
        String bahanbakar = txtbahanbakar.getText();

        if (!nama.isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Tambah Jenis Mobil Berhasil");
            alert.setHeaderText(null);
            alert.setContentText("Data jenis mobil " + nama + " telah disimpan.");
            alert.showAndWait();

//            updateTableView();
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Text Field masih kosong!");
            alert.setHeaderText(null);
            alert.setContentText("Silahkan isi terlebih dahulu Jenis Mobil");
            alert.showAndWait();
        }
    }
//    private void updateTableView() {
//        colnama.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue()));
//        colmerk.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue()));
//        colharga.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue()));
//        colbahanbakar.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue()));
//        colkapasitas.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue()));
//        tabelMobil.setItems(jenisMobilList);
//    }



//    private TableColumn<Mobil,String> nama;
//    @FXML
//    private TableColumn<String, String> merk;
//    @FXML
//    private TableColumn<String, String> jenis;
//    @FXML
//    private TableColumn<String, String> kapasitas;
//    @FXML
//    private TableColumn<String, String> harga;
//    @FXML
//    private TableColumn<String, String> bahanbakar;

//    @FXML
//    private TextField namaTambah;
//    @FXML
//    private TextField txtmerk;
//    @FXML
//    private TextField txtharga;
//    @FXML
//    private TextField txtkapasitas;
//    @FXML
//    private TextField txtbahanbakar;
//    @FXML
//    private ComboBox cbjenis;
//    @FXML
//    private Button tambahbtn;
//    @FXML
//    private TableView<Mobil> tabelMobil;
//
//    private ObservableList<Mobil> jenisMobilList;
//    TableColumn<Mobil,String> colnama = new TableColumn<>("Nama");
//    //colnama.setCellValueFactory((new PropertyValueFactory<>("nama")));
//    TableColumn<Mobil,String> colmerk = new TableColumn<>("Merk");
//    TableColumn<Mobil,String> coljenis = new TableColumn<>("Jenis");
//    TableColumn<Mobil,String> colkapasitas = new TableColumn<>("Kapasitas");
//    TableColumn<Mobil,String> colharga = new TableColumn<>("Harga");
//    TableColumn<Mobil,String> colbahanbakar = new TableColumn<>("Bahan Bakar");
//
//    @FXML
//    protected void tambahajaOnAction(ActionEvent event) {
//        String nama = namaTambah.getText();
//        String merk = txtmerk.getText();
//        String jenis = String.valueOf(cbjenis.getValue());
//        String kapasitas = txtkapasitas.getText();
//        String harga = txtharga.getText();
//        String bahanbakar = txtbahanbakar.getText();
//        tabelMobil = new TableView<>();
//        Mobil mbl = new Mobil(nama, merk, jenis, kapasitas, harga, bahanbakar);
//
//
//        if (!nama.isEmpty()) {
//            jenisMobilList = FXCollections.observableArrayList();
//            jenisMobilList.add(mbl);
//            tabelMobil.setItems(jenisMobilList);
//
//            tabelMobil.getColumns().addAll(colnama, colmerk, coljenis, colkapasitas, colharga, colbahanbakar);
//
//            Alert alert = new Alert(Alert.AlertType.INFORMATION);
//            alert.setTitle("Tambah Jenis Mobil Berhasil");
//            alert.setHeaderText(null);
//            alert.setContentText("Data jenis mobil " + nama + " telah disimpan.");
//            alert.showAndWait();
//
//            updateTableView();
//        } else {
//            Alert alert = new Alert(Alert.AlertType.WARNING);
//            alert.setTitle("Text Field masih kosong!");
//            alert.setHeaderText(null);
//            alert.setContentText("Silahkan isi terlebih dahulu Jenis Mobil");
//            alert.showAndWait();
//        }
//    }
//    private void updateTableView() {
//        colnama.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue()));
//        colmerk.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue()));
//        coljenis.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue()));
//        kapasitas.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue()));
//        harga.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue()));
//        bahanbakar.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue()));
//        tabelMobil.setItems(jenisMobilList);
//    }
}