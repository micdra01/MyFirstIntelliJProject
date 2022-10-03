package Controllers;

import Entities.StringExercises;
import com.sun.tools.javac.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class StringExerciseController {
    public Button btnPushMe;
    public TextField txtInput;
    public TextField txtOutput;

    public void onButton1Click(ActionEvent actionEvent) {
        String input = txtInput.getText();
        String exNo = "Ex. 1) ";
        txtOutput.setText(exNo + StringExercises.exercise1(input));
    }

    public void onButton2Click(ActionEvent actionEvent) {
        String input = txtInput.getText();
        String exNo = "Ex. 2) ";
        txtOutput.setText(exNo + StringExercises.exercise2(input));
    }

    public void onButton3Click(ActionEvent actionEvent) {
        String input = txtInput.getText();
        String exNo = "Ex. 3) ";
        txtOutput.setText(exNo + StringExercises.exercise3(input));
    }

    public void onButton4Click(ActionEvent actionEvent) {
        String input = txtInput.getText();
        String exNo = "Ex. 4) ";
        txtOutput.setText(exNo + StringExercises.exercise4(input));
    }

    public void onButton5Click(ActionEvent actionEvent) {
        String input = txtInput.getText();
        String exNo = "Ex. 5) ";
        txtOutput.setText(exNo + StringExercises.exercise5(input));
    }

    public void onButton6Click(ActionEvent actionEvent) {
        String input = txtInput.getText();
        String exNo = "Ex. 6) ";
        txtOutput.setText(exNo + StringExercises.exercise6(input));
    }

    public void onButton7Click(ActionEvent actionEvent) {
        String input = txtInput.getText();
        String exNo = "Ex. 7) : ";
        txtOutput.setText(exNo + StringExercises.exercise7(input));
    }

    public void onButton8Click(ActionEvent actionEvent) {
        String input = txtInput.getText();
        String exNo = "Ex. 8) ";
        txtOutput.setText(exNo + StringExercises.exercise8(input));
    }

    public void onButton9Click(ActionEvent actionEvent) {
        String input = txtInput.getText();
        String exNo = "Ex. 9) ";
        txtOutput.setText(exNo + StringExercises.exercise9(input));
    }

    public void onButton10Click(ActionEvent actionEvent) {
    }

}
