package geekbrains_lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame {

    private int value;

    public Counter(int initial) {
        setBounds(500, 500, 300, 120);
        setTitle("Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 35);


        final JTextField counterValue = new JTextField();
        counterValue.setFont(font);
        counterValue.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValue, BorderLayout.CENTER);

        value = initial;

        //Кнопки увеличить, уменьшить
        counterValue.setText(String.valueOf(value));
        JButton decreaseButton = new JButton("<<");
        JButton incrementButton = new JButton(">>");
        add(decreaseButton, BorderLayout.WEST);
        add(incrementButton, BorderLayout.EAST);


        counterValue.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent actionEvent) {
                value = Integer.parseInt(counterValue.getText());
            }
        });


        decreaseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                value--;
                counterValue.setText(String.valueOf(value));
            }
        });

        incrementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                value++;
                counterValue.setText(String.valueOf(value));
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {

        new Counter(0);
    }
}

