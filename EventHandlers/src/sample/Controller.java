package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import java.awt.*;

import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;
    @FXML
    private CheckBox ourCheckBox;
    @FXML
    private Label ourLabel;
    @FXML
    public void initialize(){
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }

    @FXML
    public void onButtonClicked(ActionEvent e){
//        System.out.println("Hello, "+ nameField.getText());
//     System.out.println("Following button was pressed" + e.getSource() );

        if(e.getSource().equals(helloButton)){
            System.out.println("Hello, "+ nameField.getText());
        }else if (e.getSource().equals(byeButton)){
            System.out.println("Bye, "+ nameField.getText());
        }

        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    String s = Platform.isFxApplicationThread() ? "UI Thread" : "Background Thread";
                    System.out.println("I'm going to sleep on the: "+ s);
                    Thread.sleep(10000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            String s = Platform.isFxApplicationThread() ? "UI Thread" : "Background Thread";
                            System.out.println("I'm updating the label on the: "+ s);
                            ourLabel.setText("We did something!");
                        }
                    });

                } catch (InterruptedException event) {
                    //
                }
            }
        };

        new Thread(task).start();


        if(ourCheckBox.isSelected()){
            nameField.clear();
            helloButton.setDisable(true);
            byeButton.setDisable(true);
        }
    }
    @FXML
    public void handleKeyRelease(){
        String text = nameField.getText();
        boolean disableButtons =text.isEmpty() || text.trim().isEmpty();
        helloButton.setDisable(disableButtons);
        byeButton.setDisable(disableButtons);
    }

    public void handleChange() {
        System.out.println("The checkbox is "+ (ourCheckBox.isSelected() ? "checked" : "not checked"));
    }


}
