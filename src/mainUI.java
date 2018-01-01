import control.controller;
import ui.AddBookUI;
import ui.BuyUI;
import ui.StrategiesUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainUI extends JFrame implements ActionListener {
    private JButton addButton=new JButton("添加书籍");
    private JButton strategyButton=new JButton("修改策略");
    private JButton buyButton=new JButton("购买");

    private controller mainController=new controller();

    public mainUI(){
        setTitle("电子购书系统");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(480,600);

        add(addButton);
        add(strategyButton);
        add(buyButton);

        addButton.addActionListener(this);
        strategyButton.addActionListener(this);
        buyButton.addActionListener(this);

        setLocationRelativeTo(null);
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
    }

    public static void main(String args[]){
        mainUI mUI=new mainUI();
        mUI.show();
    }

    public void actionPerformed(ActionEvent e)
    {
        Object source=e.getSource();
        if(source==addButton){
            AddBookUI aUI=new AddBookUI(mainController);
            aUI.show();
        }
        if(source==strategyButton){
            StrategiesUI sUI=new StrategiesUI(mainController);
            sUI.show();
        }
        if(source==buyButton){
            BuyUI bUI=new BuyUI(mainController);
            bUI.show();
        }
    }
}
