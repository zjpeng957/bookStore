package ui;

import book.buy.Sale;
import book.buy.ShoppingCarUI;
import control.controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuyUI extends JFrame implements ActionListener {
    private controller mainController;

    private ShoppingCarUI scUI;

    private JPanel upPanel=new JPanel();
    private JPanel bottomPanel=new JPanel();

    private JTable bookTable=new JTable();
    private JLabel isbnLabel=new JLabel("ISBN:");
    private JLabel numberLabel=new JLabel("数量:");
    private JTextField isbnTextField=new JTextField();
    private JTextField numberTextField=new JTextField();
    private JButton buyButton=new JButton("购买");

    public BuyUI(controller ctl){
        mainController=ctl;

        upPanel.add(bookTable);
        bottomPanel.add(isbnLabel);
        bottomPanel.add(isbnTextField);
        bottomPanel.add(numberLabel);
        bottomPanel.add(numberTextField);
        bottomPanel.add(buyButton);

        add(upPanel);
        add(bottomPanel);

        buyButton.addActionListener(this);

        bottomPanel.setLayout(new GridLayout(3,2));

        setLocationRelativeTo(null);
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==buyButton){
            if(scUI==null){

            }
        }
    }
}
