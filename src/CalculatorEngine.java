import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;


public class CalculatorEngine implements ActionListener {

   // import static java.lang.Math.*;

    Main parent;
    char selectedAction = ' ';  // +,-, *, /
    double currentResult = 0;

    CalculatorEngine(Main parent) {
        this.parent = parent;
    }


    @Override
    public void actionPerformed(ActionEvent e) {


        JButton clickedButton = (JButton) e.getSource();
        String dispFieldText = parent.displayField.getText();

        double displayValue = 0;

        if (!"".equals(dispFieldText)) {
            displayValue = Double.parseDouble(dispFieldText);

        }
        Object src = e.getSource();
        if (src == parent.buttonPlus) {
            selectedAction = '+';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonMinus) {
            selectedAction = '-';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonDivide) {
            selectedAction = '/';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonMultiply) {
            selectedAction = '*';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonDell) {
            selectedAction = '%';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonSin) {
            selectedAction = "sin".charAt(0);;
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonCos) {
            selectedAction = "cos".charAt(0);;
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonPi) {
            selectedAction = "pi".charAt(0);;
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonsinminusone) {
            selectedAction = "arcsin".charAt(0);;
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonlog) {
            selectedAction = "log".charAt(0);;
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonacos) {
            selectedAction = "acos".charAt(0);;
            currentResult = displayValue;
            parent.displayField.setText("");
        }
        else if (src == parent.buttonEq) {
            if (selectedAction == '+') {
                currentResult += displayValue;
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '-') {
                currentResult -= displayValue;
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '/') {
                currentResult /= displayValue;
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '*') {
                currentResult *= displayValue;
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '%') {
                currentResult %= displayValue;
                parent.displayField.setText("" + currentResult);
            }  else if (selectedAction == "sin".charAt(0)) {
                currentResult = Math.sin(displayValue);
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == "cos".charAt(0)) {
                currentResult = Math.cos(displayValue);
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == "pi".charAt(0)) {
                currentResult = Math.PI;
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == "arcsin".charAt(0)) {
                currentResult = Math.asin(displayValue);
                parent.displayField.setText("" + currentResult);
            }
            else if (selectedAction == "log".charAt(0)) {
                currentResult = Math.log10(displayValue);
                parent.displayField.setText("" + currentResult);
            }
            else if (selectedAction == "acos".charAt(0)) {
                currentResult = Math.acos(displayValue);
                parent.displayField.setText("" + currentResult);
            }

        } else {
                String clickedButtonLabel = clickedButton.getText();
                parent.displayField.setText(dispFieldText + clickedButtonLabel);
                JOptionPane.showConfirmDialog(null, "You pressed" + clickedButtonLabel, "test", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
