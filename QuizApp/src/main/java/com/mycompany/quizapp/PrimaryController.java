package com.mycompany.quizapp;

import com.mycompany.quizapp.utils.MyAlert;
import com.mycompany.quizapp.utils.MyStage;
import com.mycompany.quizapp.utils.theme.Theme;
import com.mycompany.quizapp.utils.theme.ThemeManager;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;


public class PrimaryController implements Initializable  {
    @FXML private ComboBox<Theme> cbThemes;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(Theme.values()));
    }
    
    public void handleTheme(ActionEvent event) {
        this.cbThemes.getSelectionModel().getSelectedItem().updateTheme();
        ThemeManager.applyTheme(this.cbThemes.getScene());
    }
    
    public void handleQuestionManagement(ActionEvent event) throws IOException {
        MyStage.getInstance().showStage("questions.fxml");
    }
    
    public void handlePractice(ActionEvent event) throws IOException {
         MyStage.getInstance().showStage("practice.fxml");
    }
    
    public void handleExam(ActionEvent event) {
        MyAlert.getInstance().showMsg("Exam: Comming soon...");
    }
    
    public void handleRegister(ActionEvent event) {
        MyAlert.getInstance().showMsg("Register: Comming soon...");
    }
    
    public void handleLogin(ActionEvent event) {
        MyAlert.getInstance().showMsg("Login: Comming soon...");
    }
}