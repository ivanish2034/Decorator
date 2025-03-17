/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.b22901.decorator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author ivis2
 */
public class OrderApp {
    private JFrame frame;
    private JTextArea orderListArea;

    public OrderApp() {
        frame = new JFrame("Оформление заказа");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));
        JButton orderButton = new JButton("Оформить заказ (Рагу)");
        panel.add(orderButton);

        frame.add(panel, BorderLayout.NORTH);

        orderListArea = new JTextArea();
        orderListArea.setEditable(false);
        frame.add(new JScrollPane(orderListArea), BorderLayout.CENTER);

        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processOrder();
            }
        });

        frame.setVisible(true);
    }

    private void processOrder() {
        Dish dish = new Basic();

        String time = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        String orderText = time + " | " + dish.getName() + " | " + dish.getPrice() + " септимов";
        orderListArea.append(orderText + "\n");

        dish.execute();
    }
}
