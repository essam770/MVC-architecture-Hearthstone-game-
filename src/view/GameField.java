package view;

import javax.swing.*;

import model.heroes.Hero;

import java.awt.*;

public class GameField extends JFrame{
    private JPanel up;
    private JPanel down;
    private JPanel Upcards;
    private JPanel downcards;
	private JPanel firstHero;
    private JPanel secondHero;
    private JPanel firstHero_Deck;
    private JPanel secondHero_Deck;
    private JPanel firstHero_field;
    private JPanel secondHero_field;
    JButton b1=new JButton();
    JPanel b2=new JPanel();
    JPanel b3=new JPanel();
    JPanel b4=new JPanel();
    JPanel b5=new JPanel();
    JButton b6=new JButton();
	JButton x1=new JButton();
	JButton x2 =new JButton();
	JButton Ahmed=new JButton();
	JButton player1=new JButton();
	JButton player2=new JButton();
	
	
	public JButton getHerop1(){
		return player1;
	}
	public JButton getHerop2(){
		return player2;
	}
	
	
	public JButton getB1() {
		return b1;
	}

	public JPanel getB2() {
		return b2;
	}


	public JPanel getB3() {
		return b3;
	}


	public JPanel getB4() {
		return b4;
	}


	public JPanel getB5() {
		return b5;
	}


	public JButton getB6() {
		return b6;
	}

	public GameField(){
		super();
		setLayout(new GridLayout(0,1));
		//setVisible(true);
		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
		up=new JPanel();
		down=new JPanel();
		Upcards=new JPanel();
		downcards=new JPanel();
		firstHero=new JPanel();
		secondHero=new JPanel();
		firstHero_Deck=new JPanel();
		secondHero_Deck=new JPanel();
		firstHero_field=new JPanel();
		secondHero_field=new JPanel();
		up.setLayout(new GridLayout(0,1));
		this.add(up);
		//up.add(herop2);
		up.add(b1);
		b1.add(x2);
		//b1.add(herop2);
		up.add(b2);
		b2.add(player2);
		up.add(b3);
		//herop2.setText("USE HERO POWER");
		down.setLayout(new GridLayout(0,1));
		this.add(x1);
		x1.setBackground(Color.RED);
		x1.setText("End turn");
		x1.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
		this.add(down);
		down.add(b4);
		down.add(b5);
		b5.add(player1);
		down.add(b6);
		b6.add(Ahmed,BorderLayout.WEST);
		//b6.add(player1);
		//player1.setText("current Player");
		//b6.add(herop1,BorderLayout.EAST);
		//down.add(herop1);
		//herop1.setText("USE HERO POWER");
		
		this.revalidate();
		this.repaint();
		
	}

	public JPanel getFirstHero() {
		return firstHero;
	}

	public JPanel getSecondHero() {
		return secondHero;
	}

	public JPanel getFirstHero_Deck() {
		return firstHero_Deck;
	}

	public JPanel getSecondHero_Deck() {
		return secondHero_Deck;
	}

	public JPanel getFirstHero_field() {
		return firstHero_field;
	}

	public JPanel getSecondHero_field() {
		return secondHero_field;
	}
	public JButton getx1(){
		return x1;
	}
	public JButton getx2(){
		return x2;
	}
	public JButton getAhmed(){
		return Ahmed;
	}
	public JPanel getUp(){
		return up;
	}
	public JPanel getdown(){
		return down;
	}
	
public static void main(String[] args) {
	new GameField();
}
}
	

