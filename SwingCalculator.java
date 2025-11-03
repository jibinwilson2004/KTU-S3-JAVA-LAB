// made by JIBIN WILSON S7 CSE
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SwingCalculator extends JFrame {
    private final JTextField display = new JTextField();
    private Double operand1 = null;
    private String operator = null;
    private boolean readyForNewNumber = true;

    public SwingCalculator() {
        super("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);

        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));

        JPanel buttons = new JPanel(new GridLayout(5, 4, 5, 5));
        String[] keys = {
                "7","8","9","/",
                "4","5","6","*",
                "1","2","3","-",
                "0",".","=","+",
                "C","%","(",")"
        };
        for (String k : keys) {
            JButton b = new JButton(k);
            b.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
            b.addActionListener(this::onKey);
            buttons.add(b);
        }

        setLayout(new BorderLayout(5, 5));
        add(display, BorderLayout.NORTH);
        add(buttons, BorderLayout.CENTER);
    }

    private void onKey(ActionEvent e) {
        String key = ((JButton) e.getSource()).getText();
        if ("C".equals(key)) {
            display.setText("");
            operand1 = null;
            operator = null;
            readyForNewNumber = true;
            return;
        }
        if ("+ - * / %".contains(key)) {
            setOperator(key);
            return;
        }
        switch (key) {
            case "+": case "-": case "*": case "/": case "%":
                setOperator(key);
                break;
            case "=":
                compute();
                break;
            default:
                appendDigit(key);
        }
    }

    private void appendDigit(String d) {
        if (readyForNewNumber) {
            display.setText("");
            readyForNewNumber = false;
        }
        if (d.equals(".") && display.getText().contains(".")) return;
        display.setText(display.getText() + d);
    }

    private void setOperator(String op) {
        try {
            operand1 = Double.parseDouble(display.getText().isEmpty() ? "0" : display.getText());
        } catch (NumberFormatException ex) {
            operand1 = 0.0;
        }
        operator = op;
        readyForNewNumber = true;
    }

    private void compute() {
        if (operator == null || operand1 == null) return;
        double a = operand1;
        double b;
        try {
            b = Double.parseDouble(display.getText().isEmpty() ? "0" : display.getText());
        } catch (NumberFormatException ex) {
            b = 0.0;
        }
        try {
            double res;
            switch (operator) {
                case "+": res = a + b; break;
                case "-": res = a - b; break;
                case "*": res = a * b; break;
                case "/":
                    if (b == 0) throw new ArithmeticException("Divide by zero");
                    res = a / b; break;
                case "%":
                    if (b == 0) throw new ArithmeticException("Divide by zero");
                    res = a % b; break;
                default: return;
            }
            display.setText(String.valueOf(res));
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            display.setText("");
        } finally {
            operator = null;
            operand1 = null;
            readyForNewNumber = true;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SwingCalculator().setVisible(true));
    }
}


