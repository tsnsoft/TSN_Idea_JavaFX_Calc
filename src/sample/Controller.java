package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label label_answer;
    @FXML
    private TextField textField_A;
    @FXML
    private TextField textField_B;
    @FXML
    private TextField textField_X;
    @FXML
    private TextField textField_D;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void buttonMathAction() {
        double a, b, x, d, y;
        try {
            a = Double.parseDouble(textField_A.getText());
            b = Double.parseDouble(textField_B.getText());
            x = Double.parseDouble(textField_X.getText());
            d = Double.parseDouble(textField_D.getText());
        } catch (Exception ex) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Ошибка введенных данных!",
                "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
            textField_A.requestFocus();
            label_answer.setText("В введенных значениях допущены ошибки");
            textField_A.setText("");
            textField_B.setText("");
            textField_X.setText("");
            textField_D.setText("");
            return;
        }
        if (x < 6) {
            y = (((a + b) * (a + b)) / (x - 2));
        } else {
            y = ((x * (d * d * d)) + (b * b));
        }
        if (!(Double.isNaN(y)) && (!Double.isInfinite(y))) {
            label_answer.setText("Ответ: " + String.format("%.2f", y));
        } else {
            label_answer.setText("Нет ответа");
        }
    }

    @FXML
    private void buttonClearAction() {
        label_answer.setText("Ответ: ");
        textField_A.setText("");
        textField_B.setText("");
        textField_X.setText("");
        textField_D.setText("");
    }

    @FXML
    private void buttonExitAction() {
        System.exit(0);
    }

}
