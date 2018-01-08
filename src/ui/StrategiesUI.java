package ui;

import control.controller;
import jdk.nashorn.internal.scripts.JD;
import strategy.CompositeBestForCustomer;
import strategy.FlatRateStrategy;
import strategy.IPricingStrategy;
import strategy.PercentageStrategy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StrategiesUI extends JFrame implements ActionListener {
    private controller mainController;

    private JMenuBar bar = new JMenuBar();
    private JMenu addMenu = new JMenu();
    private JMenuItem addComStrategy = new JMenuItem("组合策略");
    private JMenuItem addSimStrategy = new JMenuItem("简单策略");
    private JMenu searchMenu = new JMenu("查找");
    private JTextField searchTextField = new JTextField();

    public StrategiesUI(controller ctl){
        mainController=ctl;

        addMenu.add(addComStrategy);
        addMenu.add(addSimStrategy);
        bar.add(addMenu);
        bar.add(searchTextField);
        bar.add(searchMenu);

        setJMenuBar(bar);
        setSize(400,600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        searchMenu.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==searchMenu){
            String number=searchTextField.getText();
            IPricingStrategy strategy=mainController.searchStrategy(number);
            if(strategy!=null){
                switch (strategy.getType()){
                    case 1:
                        FlatRateDialog flatRateDialog=new FlatRateDialog((FlatRateStrategy)strategy,mainController);
                        flatRateDialog.show();
                        break;
                    case 2:
                        PercentageDialog percentageDialog=new PercentageDialog((PercentageStrategy)strategy,mainController);
                        percentageDialog.show();
                        break;
                    case 3:
                        CompositeDialog compositeDialog=new CompositeDialog((CompositeBestForCustomer)strategy,mainController);
                        compositeDialog.show();
                        break;
                }
            }
        }
    }


}