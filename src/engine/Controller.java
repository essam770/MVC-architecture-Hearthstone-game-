package engine;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import exceptions.CannotAttackException;
import exceptions.FullFieldException;
import exceptions.FullHandException;
import exceptions.HeroPowerAlreadyUsedException;
import exceptions.InvalidTargetException;
import exceptions.NotEnoughManaException;
import exceptions.NotSummonedException;
import exceptions.NotYourTurnException;
import exceptions.TauntBypassException;
import view.music;
import view.Start;
import view.GameField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;

import model.cards.minions.Minion;
import model.cards.spells.AOESpell;
import model.cards.spells.FieldSpell;
import model.cards.spells.HeroTargetSpell;
import model.cards.spells.LeechingSpell;
import model.cards.spells.MinionTargetSpell;
import model.cards.spells.Spell;
import model.heroes.*;

public class Controller implements ActionListener, GameListener {
	private Game game;
	private Start start;
	private GameField gameField;
	private JButton start_Game;
	private int i = 0;
	private Hero p1;
	private Hero p2;
	private Minion LastClicked;
	private Spell LastClicked2;
	private Hero LastClicked3;

	public static void main(String[] args) throws FullHandException,
			CloneNotSupportedException, IOException {
		new Controller();
		music music1 = new music();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Start \n The \n Battle")) {
			start.setVisible(false);
			gameField.setVisible(true);
			return;
		}
		if (i == 0) {
			if (e.getActionCommand().equals("Jaina Proudmoore")) {
				try {
					playSound("sounds/MAGEstart.wav");
					p1 = new Mage();
					String s = p1.getName() + " \n CurrentHp:" + " "
							+ p1.getCurrentHP() + " \n Total Mana Crystals:"
							+ " " + p1.getTotalManaCrystals()
							+ " \n Current Mana Crystals:" + " "
							+ p1.getCurrentManaCrystals() + " "
							+ "Cards left in deck:" + " " + p1.getDeck().size();
					gameField.getB6().setText(s);
					gameField.getAhmed().setIcon(
							new ImageIcon("images/Jaina.png"));
				} catch (IOException e1) {

				} catch (CloneNotSupportedException e1) {

				}
			}

			else if (e.getActionCommand().equals("Rexxar")) {
				try {
					playSound("sounds/HUNTERstart.wav");
					p1 = new Hunter();
					String s = p1.getName() + " \n CurrentHp:" + " "
							+ p1.getCurrentHP() + " \n Total Mana Crystals:"
							+ " " + p1.getTotalManaCrystals()
							+ " \n Current Mana Crystals:" + " "
							+ p1.getCurrentManaCrystals() + " "
							+ "Cards left in deck:" + " " + p1.getDeck().size();
					gameField.getB6().setText(s);
					gameField.getAhmed().setIcon(
							new ImageIcon("images/Rexxar(484).png"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (CloneNotSupportedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else if (e.getActionCommand().equals("Uther Lightbringer")) {
				try {
					playSound("sounds/PALADINstart.wav");
					p1 = new Paladin();
					String s = p1.getName() + " \n CurrentHp:" + " "
							+ p1.getCurrentHP() + " \n Total Mana Crystals:"
							+ " " + p1.getTotalManaCrystals()
							+ " \n Current Mana Crystals:" + " "
							+ p1.getCurrentManaCrystals() + " "
							+ "Cards left in deck:" + " " + p1.getDeck().size();
					gameField.getB6().setText(s);
					gameField.getAhmed().setIcon(
							new ImageIcon("images/Lightforged_Uther.png"));

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (CloneNotSupportedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else if (e.getActionCommand().equals("Gul'dan")) {
				try {
					playSound("sounds/WARLOCKstart.wav");
					p1 = new Warlock();
					String s = p1.getName() + " \n CurrentHp:" + " "
							+ p1.getCurrentHP() + " \n Total Mana Crystals:"
							+ " " + p1.getTotalManaCrystals()
							+ " \n Current Mana Crystals:" + " "
							+ p1.getCurrentManaCrystals() + " "
							+ "Cards left in deck:" + " " + p1.getDeck().size();
					gameField.getB6().setText(s);
					gameField.getAhmed().setIcon(
							new ImageIcon("images/warlock.png"));

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (CloneNotSupportedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			} else if (e.getActionCommand().equals("Anduin Wrynn")) {
				try {
					playSound("sounds/PRIESTstart.wav");
					p1 = new Priest();
					String s = p1.getName() + " \n CurrentHp:" + " "
							+ p1.getCurrentHP() + " \n Total Mana Crystals:"
							+ " " + p1.getTotalManaCrystals()
							+ " \n Current Mana Crystals:" + " "
							+ p1.getCurrentManaCrystals() + " "
							+ "Cards left in deck:" + " " + p1.getDeck().size();

					gameField.getB6().setText(s);
					gameField.getAhmed().setIcon(
							new ImageIcon("images/Anduin.png"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (CloneNotSupportedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		if (i == 1) {
			if (e.getActionCommand().equals("Jaina Proudmoore")) {
				try {
					playSound("sounds/MAGEstart.wav");
					p2 = new Mage();
					String s = p2.getName() + " \n CurrentHp:" + " "
							+ p2.getCurrentHP() + " \n Total Mana Crystals:"
							+ " " + p2.getTotalManaCrystals()
							+ " \n Current Mana Crystals:" + " "
							+ p2.getCurrentManaCrystals() + " "
							+ "Cards left in deck:" + " " + p2.getDeck().size();
					gameField.getB1().setText(s);
					gameField.getx2()
							.setIcon(new ImageIcon("images/Jaina.png"));

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (CloneNotSupportedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else if (e.getActionCommand().equals("Rexxar")) {
				try {
					playSound("sounds/HUNTERstart.wav");
					p2 = new Hunter();
					String s = p2.getName() + " \n CurrentHp:" + " "
							+ p2.getCurrentHP() + " \n Total Mana Crystals:"
							+ " " + p2.getTotalManaCrystals()
							+ " \n Current Mana Crystals:" + " "
							+ p2.getCurrentManaCrystals()
							+ "Cards left in deck:" + " " + p2.getDeck().size();
					gameField.getB1().setText(s);
					gameField.getx2().setIcon(
							new ImageIcon("images/Rexxar(484).png"));

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (CloneNotSupportedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else if (e.getActionCommand().equals("Uther Lightbringer")) {
				try {
					playSound("sounds/PALADINstart.wav");
					p2 = new Paladin();
					String s = p2.getName() + " \n CurrentHp:" + " "
							+ p2.getCurrentHP() + " \n Total Mana Crystals:"
							+ " " + p2.getTotalManaCrystals()
							+ " \n Current Mana Crystals:" + " "
							+ p2.getCurrentManaCrystals()
							+ "Cards left in deck:" + " " + p2.getDeck().size();
					gameField.getB1().setText(s);
					gameField.getx2().setIcon(
							new ImageIcon("images/Lightforged_Uther.png"));

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (CloneNotSupportedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else if (e.getActionCommand().equals("Gul'dan")) {
				try {
					playSound("sounds/WARLOCKstart.wav");
					p2 = new Warlock();
					String s = p2.getName() + " \n CurrentHp:" + " "
							+ p2.getCurrentHP() + " \n Total Mana Crystals:"
							+ " " + p2.getTotalManaCrystals()
							+ " \n Current Mana Crystals:" + " "
							+ p2.getCurrentManaCrystals()
							+ "Cards left in deck:" + " " + p2.getDeck().size();
					gameField.getB1().setText(s);
					gameField.getx2().setIcon(
							new ImageIcon("images/warlock.png"));

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (CloneNotSupportedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else if (e.getActionCommand().equals("Anduin Wrynn")) {
				try {
					playSound("sounds/PRIESTstart.wav");
					p2 = new Priest();
					String s = p2.getName() + " \n CurrentHp:" + " "
							+ p2.getCurrentHP() + " \n Total Mana Crystals:"
							+ " " + p2.getTotalManaCrystals()
							+ " \n Current Mana Crystals:" + " "
							+ p2.getCurrentManaCrystals()
							+ "Cards left in deck:" + " " + p2.getDeck().size();
					gameField.getB1().setText(s);
					gameField.getx2().setIcon(
							new ImageIcon("images/Anduin.png"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (CloneNotSupportedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		}

		i++;
		if (i == 1) {
			return;
		}

		try {
			X();
		} catch (FullHandException | CloneNotSupportedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		if (e.getActionCommand().equals("End turn")) {
			try {
				game.endTurn();
				LastClicked = null;
				LastClicked2 = null;
				LastClicked3 = null;
				try {
					X();
				} catch (FullHandException | CloneNotSupportedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				return;
			} catch (FullHandException | CloneNotSupportedException e1) {
				JOptionPane.showMessageDialog(gameField, e1.getMessage());
			}

		}
		if (LastClicked3 == null) {
			for (int i = 0; i < game.getCurrentHero().getHand().size(); i++) {
				if (e.getActionCommand().equals(
						game.getCurrentHero().getHand().get(i).toString())) {
					if (game.getCurrentHero().getHand().get(i) instanceof Minion) {
						try {
							game.getCurrentHero().playMinion(
									(Minion) game.getCurrentHero().getHand()
											.get(i));
							try {
								X();
							} catch (FullHandException
									| CloneNotSupportedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}

							return;
						} catch (NotYourTurnException e1) {
							JOptionPane.showMessageDialog(gameField,
									e1.getMessage());

						} catch (NotEnoughManaException e1) {
							//HERERERERE
							if(game.getCurrentHero().getName().equals("Jaina Proudmoore")){
								playSound("sounds/MAGEmana.wav");
							}else if(game.getCurrentHero().getName().equals("Rexxar")){
								playSound("sounds/HUNTERmana.wav");
							}else if(game.getCurrentHero().getName().equals("Uther Lightbringer")){
								playSound("sounds/PALADINmana.wav");
							}else if(game.getCurrentHero().getName().equals("Gul'dan")){
								playSound("sounds/WARLOCKmana.wav");
							}else if(game.getCurrentHero().getName().equals("Anduin Wrynn")){
								playSound("sounds/PRIESTmana.wav");
							}
							JOptionPane.showMessageDialog(gameField,
									e1.getMessage());

						} catch (FullFieldException e1) {
							JOptionPane.showMessageDialog(gameField,
									e1.getMessage());

						}

					}
				}
			}
		}
		if (LastClicked == null && LastClicked3 == null) {
			for (int i = 0; i < game.getCurrentHero().getField().size(); i++) {
				if (e.getActionCommand().equals(
						game.getCurrentHero().getField().get(i).toString())) {
					LastClicked = game.getCurrentHero().getField().get(i);
				}
			}
		} else if (LastClicked3 == null) {
			for (int j = 0; j < game.getOpponent().getField().size(); j++) {
				if (e.getActionCommand().equals(game.getOpponent().getField().get(j).toString())) {
					try {
						game.getCurrentHero().attackWithMinion(LastClicked,game.getOpponent().getField().get(j));
					} catch (CannotAttackException e1) {
						JOptionPane.showMessageDialog(gameField,e1.getMessage());
					} catch (NotYourTurnException e1) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(gameField,e1.getMessage());
					} catch (TauntBypassException e1) {
						if(game.getCurrentHero().getName().equals("Jaina Proudmoore")){
							playSound("sounds/MAGEtaunt.wav");
						}else if(game.getCurrentHero().getName().equals("Rexxar")){
							playSound("sounds/HUNTERtaunt.wav");
						}else if(game.getCurrentHero().getName().equals("Uther Lightbringer")){
							playSound("sounds/PALADINtaunt.wav");
						}else if(game.getCurrentHero().getName().equals("Gul'dan")){
							playSound("sounds/WARLOCKtaunt.wav");
						}else if(game.getCurrentHero().getName().equals("Anduin Wrynn")){
							playSound("sounds/PRIESTtaunt.wav");
						}
						JOptionPane.showMessageDialog(gameField,e1.getMessage());
					} catch (InvalidTargetException e1) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(gameField,e1.getMessage());
					} catch (NotSummonedException e1) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(gameField,e1.getMessage());
					}
					LastClicked = null;
				}
			}
			if (e.getSource().equals(gameField.getB1())) {
				try {
					onGameOver();
					game.getCurrentHero().attackWithMinion(LastClicked,game.getOpponent());
				} catch (CannotAttackException e1) {
					JOptionPane.showMessageDialog(gameField, e1.getMessage());
				} catch (NotYourTurnException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(gameField, e1.getMessage());
				} catch (TauntBypassException e1) {
					//HEREREEREREERERE
					if(game.getCurrentHero().getName().equals("Jaina Proudmoore")){
						playSound("sounds/MAGEtaunt.wav");
					}else if(game.getCurrentHero().getName().equals("Rexxar")){
						playSound("sounds/HUNTERtaunt.wav");
					}else if(game.getCurrentHero().getName().equals("Uther Lightbringer")){
						playSound("sounds/PALADINtaunt.wav");
					}else if(game.getCurrentHero().getName().equals("Gul'dan")){
						playSound("sounds/WARLOCKtaunt.wav");
					}else if(game.getCurrentHero().getName().equals("Anduin Wrynn")){
						playSound("sounds/PRIESTtaunt.wav");
					}
					JOptionPane.showMessageDialog(gameField, e1.getMessage());
				} catch (NotSummonedException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(gameField, e1.getMessage());
				} catch (InvalidTargetException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(gameField, e1.getMessage());
				}
				LastClicked = null;
			}
			if (e.getSource().equals(gameField.getB6())) {
				try {
					onGameOver();
					game.getCurrentHero().attackWithMinion(LastClicked,
							game.getOpponent());
				} catch (CannotAttackException e1) {
					JOptionPane.showMessageDialog(gameField, e1.getMessage());
				} catch (NotYourTurnException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(gameField, e1.getMessage());
				} catch (TauntBypassException e1) {
					//HEREREEREREERERE
					if(game.getCurrentHero().getName().equals("Jaina Proudmoore")){
						playSound("sounds/MAGEtaunt.wav");
					}else if(game.getCurrentHero().getName().equals("Rexxar")){
						playSound("sounds/HUNTERtaunt.wav");
					}else if(game.getCurrentHero().getName().equals("Uther Lightbringer")){
						playSound("sounds/PALADINtaunt.wav");
					}else if(game.getCurrentHero().getName().equals("Gul'dan")){
						playSound("sounds/WARLOCKtaunt.wav");
					}else if(game.getCurrentHero().getName().equals("Anduin Wrynn")){
						playSound("sounds/PRIESTtaunt.wav");
					}
					JOptionPane.showMessageDialog(gameField, e1.getMessage());
				} catch (NotSummonedException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(gameField, e1.getMessage());
				} catch (InvalidTargetException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(gameField, e1.getMessage());
				}
				LastClicked = null;
			}
		}

		for (int i = 0; i < game.getCurrentHero().getHand().size(); i++) {
			if (e.getActionCommand().equals(
					game.getCurrentHero().getHand().get(i).toString())) {
				if (game.getCurrentHero().getHand().get(i) instanceof AOESpell) {
					try {
						game.getCurrentHero().castSpell((AOESpell)game.getCurrentHero().getHand().get(i), game.getOpponent().getField());
					} catch (NotYourTurnException e1) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(gameField,
								e1.getMessage());
					} catch (NotEnoughManaException e1) {
						//HERERERERE
						if(game.getCurrentHero().getName().equals("Jaina Proudmoore")){
							playSound("sounds/MAGEmana.wav");
						}else if(game.getCurrentHero().getName().equals("Rexxar")){
							playSound("sounds/HUNTERmana.wav");
						}else if(game.getCurrentHero().getName().equals("Uther Lightbringer")){
							playSound("sounds/PALADINmana.wav");
						}else if(game.getCurrentHero().getName().equals("Gul'dan")){
							playSound("sounds/WARLOCKmana.wav");
						}else if(game.getCurrentHero().getName().equals("Anduin Wrynn")){
							playSound("sounds/PRIESTmana.wav");
						}
						JOptionPane.showMessageDialog(gameField,
								e1.getMessage());
					}
				}
			} else if (game.getCurrentHero().getHand().get(i) instanceof FieldSpell) {
				try {
					game.getCurrentHero().castSpell((FieldSpell) game.getCurrentHero().getHand().get(i));
				} catch (NotYourTurnException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(gameField, e1.getMessage());
				} catch (NotEnoughManaException e1) {
					//HERERERERE
					if(game.getCurrentHero().getName().equals("Jaina Proudmoore")){
						playSound("sounds/MAGEmana.wav");
					}else if(game.getCurrentHero().getName().equals("Rexxar")){
						playSound("sounds/HUNTERmana.wav");
					}else if(game.getCurrentHero().getName().equals("Uther Lightbringer")){
						playSound("sounds/PALADINmana.wav");
					}else if(game.getCurrentHero().getName().equals("Gul'dan")){
						playSound("sounds/WARLOCKmana.wav");
					}else if(game.getCurrentHero().getName().equals("Anduin Wrynn")){
						playSound("sounds/PRIESTmana.wav");
					}
					JOptionPane.showMessageDialog(gameField, e1.getMessage());
				}
			}
		}
		if (LastClicked3 == null) {
			if (LastClicked2 == null) {
				for (int i = 0; i < game.getCurrentHero().getHand().size(); i++) {
					if (e.getActionCommand().equals(game.getCurrentHero().getHand().get(i).toString())) {
						if (game.getCurrentHero().getHand().get(i) instanceof Spell) {
							LastClicked2 = (Spell) game.getCurrentHero().getHand().get(i);
						}
					}
				}
			} else {
				if (LastClicked2 instanceof LeechingSpell) {
					for (int j = 0; j < game.getOpponent().getField().size(); j++) {
						if (e.getActionCommand().equals(game.getOpponent().getField().get(j).toString())) {
							try {
								game.getCurrentHero().castSpell((LeechingSpell) LastClicked2,game.getOpponent().getField().get(j));
							} catch (NotYourTurnException e1) {
								JOptionPane.showMessageDialog(gameField,e1.getMessage());
							} catch (NotEnoughManaException e1) {
								//HERERERERE
								if(game.getCurrentHero().getName().equals("Jaina Proudmoore")){
									playSound("sounds/MAGEmana.wav");
								}else if(game.getCurrentHero().getName().equals("Rexxar")){
									playSound("sounds/HUNTERmana.wav");
								}else if(game.getCurrentHero().getName().equals("Uther Lightbringer")){
									playSound("sounds/PALADINmana.wav");
								}else if(game.getCurrentHero().getName().equals("Gul'dan")){
									playSound("sounds/WARLOCKmana.wav");
								}else if(game.getCurrentHero().getName().equals("Anduin Wrynn")){
									playSound("sounds/PRIESTmana.wav");
								}
								JOptionPane.showMessageDialog(gameField,e1.getMessage());
							}
						}
					}
					LastClicked2 = null;
				}
				if (LastClicked2 instanceof MinionTargetSpell) {
					for (int j = 0; j < game.getOpponent().getField().size(); j++) {
						if (e.getActionCommand().equals(game.getOpponent().getField().get(j).toString())) {
							try {
								game.getCurrentHero().castSpell((MinionTargetSpell) LastClicked2,game.getOpponent().getField().get(j));
							} catch (NotYourTurnException e1) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(gameField,e1.getMessage());
							} catch (NotEnoughManaException e1) {
								//HERERERERE
								if(game.getCurrentHero().getName().equals("Jaina Proudmoore")){
									playSound("sounds/MAGEmana.wav");
								}else if(game.getCurrentHero().getName().equals("Rexxar")){
									playSound("sounds/HUNTERmana.wav");
								}else if(game.getCurrentHero().getName().equals("Uther Lightbringer")){
									playSound("sounds/PALADINmana.wav");
								}else if(game.getCurrentHero().getName().equals("Gul'dan")){
									playSound("sounds/WARLOCKmana.wav");
								}else if(game.getCurrentHero().getName().equals("Anduin Wrynn")){
									playSound("sounds/PRIESTmana.wav");
								}
								JOptionPane.showMessageDialog(gameField,e1.getMessage());
							} catch (InvalidTargetException e1) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(gameField,e1.getMessage());
							}
						}
					}
					LastClicked2 = null;
				}
				if (LastClicked2 instanceof HeroTargetSpell) {
					for (int j = 0; j < game.getOpponent().getField().size(); i++) {
						if (e.getActionCommand().equals(game.getOpponent().toString())) {
							try {
								game.getCurrentHero().castSpell((HeroTargetSpell) LastClicked2,game.getOpponent());
							} catch (NotYourTurnException e1) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(gameField,e1.getMessage());
							} catch (NotEnoughManaException e1) {
								//HERERERERE
								if(game.getCurrentHero().getName().equals("Jaina Proudmoore")){
									playSound("sounds/MAGEmana.wav");
								}else if(game.getCurrentHero().getName().equals("Rexxar")){
									playSound("sounds/HUNTERmana.wav");
								}else if(game.getCurrentHero().getName().equals("Uther Lightbringer")){
									playSound("sounds/PALADINmana.wav");
								}else if(game.getCurrentHero().getName().equals("Gul'dan")){
									playSound("sounds/WARLOCKmana.wav");
								}else if(game.getCurrentHero().getName().equals("Anduin Wrynn")){
									playSound("sounds/PRIESTmana.wav");
								}
								JOptionPane.showMessageDialog(gameField,e1.getMessage());
							}
						}
					}
				}
				LastClicked2 = null;
			}
		}

		if (LastClicked3 == null) {
			if (e.getSource().equals(gameField.getB6())) {
				if (p1 == game.getCurrentHero()) {
					LastClicked3 = p1;
				}
			} else if (e.getSource().equals(gameField.getB1())) {
				if (p2 == game.getCurrentHero()) {
					LastClicked3 = p2;
				}
			}

			if (LastClicked3 == null) {
				try {
					X();
				} catch (FullHandException | CloneNotSupportedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				return;
			}

			if (LastClicked3 instanceof Hunter|| LastClicked3 instanceof Paladin|| LastClicked3 instanceof Warlock) {
				try {
					LastClicked3.useHeroPower();
				} catch (HeroPowerAlreadyUsedException e1) {
					//HEREREERE
					if(game.getCurrentHero().getName().equals("Rexxar")){
						playSound("sounds/HUNTERusedheropower.wav");
					}else if(game.getCurrentHero().getName().equals("Uther Lightbringer")){
						playSound("sounds/PALADINusedheropower.wav");
					}else if(game.getCurrentHero().getName().equals("Gul'dan")){
						playSound("sounds/WARLOCKusedheropower.wav");
					}
					JOptionPane.showMessageDialog(gameField, e1.getMessage());
				} catch (NotEnoughManaException e1) {
					//HEREERER
					if(game.getCurrentHero().getName().equals("Rexxar")){
						playSound("sounds/HUNTERmana.wav");
					}else if(game.getCurrentHero().getName().equals("Uther Lightbringer")){
						playSound("sounds/PALADINmana.wav");
					}else if(game.getCurrentHero().getName().equals("Gul'dan")){
						playSound("sounds/WARLOCKmana.wav");
					}
					JOptionPane.showMessageDialog(gameField, e1.getMessage());
				} catch (NotYourTurnException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(gameField, e1.getMessage());
				} catch (FullHandException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(gameField, e1.getMessage());
				} catch (FullFieldException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(gameField, e1.getMessage());
				} catch (CloneNotSupportedException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(gameField, e1.getMessage());
				}
				LastClicked3 = null;
			}
		} else { // lastClicked3 not null
			if (LastClicked3 instanceof Mage || LastClicked3 instanceof Priest) {
				for (int i = 0; i < game.getOpponent().getField().size(); i++) {
					if (e.getActionCommand().equals(game.getOpponent().getField().get(i).toString())) {
						try {
							if (LastClicked3 instanceof Mage)
								((Mage) LastClicked3).useHeroPower(game.getOpponent().getField().get(i));
							if (LastClicked3 instanceof Priest)
								((Priest) LastClicked3).useHeroPower(game.getOpponent().getField().get(i));
						} catch (NotEnoughManaException e1) {
							if(game.getCurrentHero().getName().equals("Jaina Proudmoore")){
								playSound("sounds/MAGEmana.wav");
							}else if(game.getCurrentHero().getName().equals("Anduin Wrynn")){
									playSound("sounds/PRIESTmana.wav");
								}	
							JOptionPane.showMessageDialog(gameField,e1.getMessage());
						} catch (HeroPowerAlreadyUsedException e1) {
							if(game.getCurrentHero().getName().equals("Jaina Proudmoore")){
								playSound("sounds/MAGEusedheropower.wav");
							}else if(game.getCurrentHero().getName().equals("Anduin Wrynn")){
									playSound("sounds/PRIESTusedheropower.wav");
								}
							JOptionPane.showMessageDialog(gameField,e1.getMessage());
						} catch (NotYourTurnException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(gameField,e1.getMessage());
						} catch (FullHandException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(gameField,e1.getMessage());
						} catch (FullFieldException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(gameField,e1.getMessage());
						} catch (CloneNotSupportedException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(gameField,e1.getMessage());
						} finally {
							LastClicked3 = null;
						}
					}
				}
			if (e.getSource().equals(gameField.getB1()) || e.getSource().equals(gameField.getB6())) {
					if (LastClicked3 instanceof Mage) {
						try {
							((Mage) LastClicked3).useHeroPower(game.getOpponent());
						} catch (NotEnoughManaException e1) {
							playSound("sounds/MAGEmana.wav");
							JOptionPane.showMessageDialog(gameField,e1.getMessage());
						} catch (HeroPowerAlreadyUsedException e1) {
							playSound("sounds/MAGEusedheropower.wav");
							JOptionPane.showMessageDialog(gameField,e1.getMessage());
						} catch (NotYourTurnException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(gameField,e1.getMessage());
						} catch (FullHandException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(gameField,e1.getMessage());
						} catch (FullFieldException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(gameField,e1.getMessage());
						} catch (CloneNotSupportedException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(gameField,e1.getMessage());
						} finally {
							LastClicked3 = null;
						}
					} else if (LastClicked3 instanceof Priest) {
						try {
							((Priest) LastClicked3).useHeroPower(game.getOpponent());
						} catch (NotEnoughManaException e1) {
							playSound("sounds/PRIESTmana.wav");
							JOptionPane.showMessageDialog(gameField,e1.getMessage());
						} catch (HeroPowerAlreadyUsedException e1) {
							playSound("sounds/PRIESTusedheropower.wav");
							JOptionPane.showMessageDialog(gameField,e1.getMessage());
						} catch (NotYourTurnException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(gameField,e1.getMessage());
						} catch (FullHandException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(gameField,e1.getMessage());
						} catch (FullFieldException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(gameField,e1.getMessage());
						} catch (CloneNotSupportedException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(gameField,e1.getMessage());
						} finally {
							LastClicked3 = null;
						}
					}
				}
				
			}
		}

		try {
			X();
		} catch (FullHandException | CloneNotSupportedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		gameField.revalidate();
		gameField.repaint();

	}

	public void X() throws FullHandException, CloneNotSupportedException {
		//System.out.println("a");
		if (game == null) {
			try {
				game = new Game(p1, p2);
				game.setListener(this);
			} catch (FullHandException e) {
				e.printStackTrace();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		}
		//System.out.println(p1.getHand().size());
		gameField.getB5().removeAll();
		gameField.getB2().removeAll();
		for (int i = 0; i < p1.getHand().size(); i++) {
			JButton b = new JButton();
			b.addActionListener(this);
			String s;
			if (game.getCurrentHero() != p1) {
				b.setBackground(Color.BLACK);
				s = "opponent hand";
			} else {
				b.setBackground(Color.LIGHT_GRAY);
				s = p1.getHand().get(i).toString();

			}
			b.setText(s);
			gameField.getB5().add(b);
		}
		for (int i = 0; i < p2.getHand().size(); i++) {
			JButton b = new JButton();
			b.addActionListener(this);
			String s;
			if (game.getCurrentHero() != p2) {
				b.setBackground(Color.BLACK);
				s = "opponent hand";
			} else {
				b.setBackground(Color.LIGHT_GRAY);

				s = p2.getHand().get(i).toString();

			}
			b.setText(s);
			gameField.getB2().add(b);
		}

		gameField.getB6().setText(
				p1.getName() + " \n CurrentHp:" + " " + p1.getCurrentHP()
						+ " \n Total Mana Crystals:" + " "
						+ p1.getTotalManaCrystals()
						+ " \n Current Mana Crystals:" + " "
						+ p1.getCurrentManaCrystals() + " "
						+ "Cards left in deck:" + " " + p1.getDeck().size());
		gameField.getB1().setText(
				p2.getName() + " \n CurrentHp:" + " " + p2.getCurrentHP()
						+ " \n Total Mana Crystals:" + " "
						+ p2.getTotalManaCrystals()
						+ " \n Current Mana Crystals:" + " "
						+ p2.getCurrentManaCrystals() + " "
						+ "Cards left in deck:" + " " + p2.getDeck().size());
		gameField.getB4().removeAll();
		gameField.getB3().removeAll();
		for (int i = 0; i < p1.getField().size(); i++) {
			JButton d = new JButton();
			d.addActionListener(this);
			d.setText(p1.getField().get(i).toString());
			gameField.getB4().add(d);
		}
		for (int i = 0; i < p2.getField().size(); i++) {
			JButton d = new JButton();
			d.addActionListener(this);
			d.setText(p2.getField().get(i).toString());
			gameField.getB3().add(d);
		}
		gameField.revalidate();
		gameField.repaint();

	}

	@Override
	public void onGameOver() {
		if (p1.getCurrentHP() <= 0) {
			gameField.setVisible(false);
			JFrame j1 = new JFrame();
			j1.setTitle("Winner");
			j1.setVisible(true);
			JLabel j2 = new JLabel("The winner is" + " " + p2.getName());
			j1.add(j2, BorderLayout.CENTER);
			j1.setSize(800, 800);
		} else if (p2.getCurrentHP() <= 0) {
			gameField.setVisible(false);
			JFrame j3 = new JFrame();
			j3.setTitle("Winner");
			j3.setVisible(true);
			JLabel j4 = new JLabel("The winner is" + " " + p1.getName());
			j3.add(j4, BorderLayout.CENTER);
			j3.setSize(800, 800);
		}

	}

	public void playSound(String filepath) {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File(filepath).getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();

		} catch (UnsupportedAudioFileException | IOException
				| LineUnavailableException e) {
		}
	}

	public Controller() throws FullHandException, CloneNotSupportedException,
			IOException {
		start = new Start();
		gameField = new GameField();
		start.getStart().addActionListener(this);
		start.getMage().addActionListener(this);
		start.getHunter().addActionListener(this);
		start.getPaladin().addActionListener(this);
		start.getPriest().addActionListener(this);
		start.getWarlock().addActionListener(this);
		gameField.getx1().addActionListener(this);
		gameField.getB1().addActionListener(this);
		gameField.getB6().addActionListener(this);

	}
}