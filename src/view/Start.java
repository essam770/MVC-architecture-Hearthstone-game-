package view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start extends JFrame {
private JButton Hunter;
private JButton Mage;
private JButton Paladin;
private JButton Priest;
private JButton Warlock;
private JTextArea j;
private JButton start;
public Start(){
super();
setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setSize(1000,1000);
        setVisible(true);
        setTitle("HearthStone");
        Hunter=new JButton("Rexxar");
        Hunter.setIcon(new ImageIcon("images/HunterFinal.png"));
        Mage=new JButton("Jaina Proudmoore");
        Mage.setIcon(new ImageIcon("images/MageFinal.png"));
        Paladin=new JButton("Uther Lightbringer");
        Paladin.setIcon(new ImageIcon("images/PaladinFinal.png"));
        Priest=new JButton("Anduin Wrynn");
        Priest.setIcon(new ImageIcon("images/PriestFinal.png"));
        Warlock=new JButton("Gul'dan");
        Warlock.setIcon(new ImageIcon("images/WarlockFinal.png"));
        j=new JTextArea();
        j.setEditable(false);
        start=new JButton();
        start.setText("Start \n The \n Battle");
        start.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        //start.addActionListener(this);
        j.setText("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n For Every Player Choose a Hero");
        j.setSize(200,this.getHeight());
        j.setFont(new Font("Comic Sans MS",Font.BOLD, 12));
        add(j,new BorderLayout().EAST);
        setLayout(new GridLayout(0,7));
        add(Hunter);
        add(Mage);
        add(Paladin);
        add(Priest);
        add(Warlock);
        add(start);
        this.revalidate();
        this.repaint();
        
}

public JButton getHunter() {
return Hunter;
}

public JButton getMage() {
return Mage;
}

public JButton getPaladin() {
return Paladin;
}

public JButton getPriest() {
return Priest;
}

public JButton getWarlock() {
return Warlock;
}
public JButton getStart(){
	return start;
}


public static void main(String[] args) {
new Start();
}


/*public void actionPerformed(ActionEvent e) {
if(e.getActionCommand().equals("Start Game")){
x.setVisible(true);
this.setVisible(false);
}*/




}

	

