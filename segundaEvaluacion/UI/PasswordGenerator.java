package segundaEvaluacion.UI;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PasswordGenerator extends JFrame {
    private JSlider slider;
    private JTextField passwordTextField;
    private JCheckBox lowerCaseCheckbox;
    private JCheckBox upperCaseCheckBox;
    private JCheckBox numbersCheckBox;
    private JCheckBox specialCheckBox;
    private JButton generateButton;
    private JPanel panel1;

    public PasswordGenerator(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setResizable(true);
        this.pack();
        this.setBounds(300, 300, 900, 600);

        generateButton.addActionListener(e -> {
            if (!lowerCaseCheckbox.isSelected() && !upperCaseCheckBox.isSelected() && !numbersCheckBox.isSelected() && !specialCheckBox.isSelected()){
                passwordTextField.setText("Debe seleccionar alguna opcion de abajo");
                return;
            }
            StringBuilder password = new StringBuilder();
            ArrayList<Character> allCharacter = new ArrayList<>();
            Character[] lowerCase = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            Character[] upperCase = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
            Character[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
            Character[] special = {'/', '.', ',', ';', ':', '@', '#', '-', '_', '$', '%', '*', '&', '?', '!'};
            if (lowerCaseCheckbox.isSelected()){
                password.append(lowerCase[(int) (Math.random() * lowerCase.length)]);
                allCharacter.addAll(Arrays.asList(lowerCase));
            }
            if (upperCaseCheckBox.isSelected()){
                password.append(upperCase[(int) (Math.random() * upperCase.length)]);
                allCharacter.addAll(Arrays.asList(upperCase));
            }
            if (numbersCheckBox.isSelected()){
                password.append(numbers[(int) (Math.random() * numbers.length)]);
                allCharacter.addAll(Arrays.asList(numbers));
            }
            if (specialCheckBox.isSelected()){
                password.append(special[(int) (Math.random() * special.length)]);
                allCharacter.addAll(Arrays.asList(special));
            }

            while (password.length() < slider.getValue()) {
                Collections.shuffle(allCharacter);
                password.append(allCharacter.get(0));
            }

            passwordTextField.setText(password.toString());
        });
    }

    public static void main(String[] args) {
        PasswordGenerator frame = new PasswordGenerator("Generador de contraseñas");
        frame.setVisible(true);
    }

}
