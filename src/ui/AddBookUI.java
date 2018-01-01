package ui;

import control.controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBookUI extends JFrame implements ActionListener {
    private controller mainController;

    private JLabel isbnLabel=new JLabel("ISBN:");
    private JLabel titleLabel=new JLabel("书名");
    private JLabel priceLabel=new JLabel("单价");
    private JLabel typeLabel=new JLabel("类型");

    private JTextField isbnTextField=new JTextField();
    private JTextField titleTextField=new JTextField();
    private JTextField priceTextField=new JTextField();
    private JComboBox<String> typeComboBox=new JComboBox<>();

    private JButton confirmButton=new JButton("确定");
    private JButton cancelButton=new JButton("取消");

    public AddBookUI(controller ctl){
        mainController=ctl;

        setTitle("添加书籍");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300,300);

        add(isbnLabel);
        add(isbnTextField);
        add(titleLabel);
        add(titleTextField);
        add(priceLabel);
        add(priceTextField);
        add(typeLabel);
        add(typeComboBox);

        add(confirmButton);
        add(cancelButton);

        typeComboBox.addItem("非教材类计算机图书");
        typeComboBox.addItem("教材类图书");
        typeComboBox.addItem("连环画类图书");
        typeComboBox.addItem("养生类图书");
        typeComboBox.addItem("其他");

        confirmButton.addActionListener(this);
        cancelButton.add(this);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5,2));
    }
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if(source==confirmButton){
            //controller添加书籍
            dispose();
        }
        if(source==cancelButton){
            dispose();
        }
    }
}
