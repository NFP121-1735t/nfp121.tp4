package question3;

import question3.tp3.PileI;
import question3.tp3.PilePleineException;
import question3.tp3.PileVideException;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Décrivez votre classe Controleur ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Controleur extends JPanel {

    private JButton push, add, sub, mul, div, clear;
    private PileModele<Integer> pile;
    private JTextField donnee;

    public Controleur(PileModele<Integer> pile) {
        super();
        this.pile = pile;
        this.donnee = new JTextField(8);

        this.push = new JButton("push");
        this.add = new JButton("+");
        this.sub = new JButton("-");
        this.mul = new JButton("*");
        this.div = new JButton("/");
        this.clear = new JButton("[]");

        setLayout(new GridLayout(2, 1));
        add(donnee);
        ButtonsActionListener actionL = new ButtonsActionListener();
        donnee.addActionListener(actionL);
        
        JPanel boutons = new JPanel();
        boutons.setLayout(new FlowLayout());
        boutons.add(push);  push.addActionListener(actionL /* null est à remplacer */);
        boutons.add(add);   add.addActionListener(actionL /* null est à remplacer */);
        boutons.add(sub);   sub.addActionListener(actionL /* null est à remplacer */);
        boutons.add(mul);   mul.addActionListener(actionL /* null est à remplacer */);
        boutons.add(div);   div.addActionListener(actionL /* null est à remplacer */);
        boutons.add(clear); clear.addActionListener(actionL/* null est à remplacer */);
        add(boutons);
        boutons.setBackground(Color.red);
        actualiserInterface();
    }

    public void actualiserInterface() {
        if(!pile.estPleine()){
            push.setEnabled(true);
        }
        else push.setEnabled(false);
        
        if(pile.taille()< 2){
            sub.setEnabled(false);
            add.setEnabled(false);
            div.setEnabled(false);
            mul.setEnabled(false);
        }else{
            sub.setEnabled(true);
            add.setEnabled(true);
            div.setEnabled(true);
            mul.setEnabled(true);
        }
    }

    private Integer operande() throws NumberFormatException {
        return Integer.parseInt(donnee.getText());
    }
 public class ButtonsActionListener implements ActionListener{//declaartion du classe BAL
	    public void actionPerformed(ActionEvent event){
	        String actionCommand = event.getActionCommand();
			
	        if(actionCommand.equals("push")){
	            try{
	                pile.empiler(operande());/// relever du 1er operande
	            } 
				catch(NumberFormatException nfe){//si la format du nombre est impossible
				}
				catch(PilePleineException ppe) {
					ppe.printStackTrace();
			 	}
	        } 
			
	   //declaration du operation de calcule
			else if(actionCommand.equals("+")||actionCommand.equals("-")||actionCommand.equals("*")||actionCommand.equals("/")){
	            int operande1 = 0;
	            int operande2 = 0;
	            //boolean divParZero = false;
	            try{
	                operande1 = pile.depiler();
	                operande2 = pile.depiler();
	            } 
				catch(PileVideException e){
					e.printStackTrace();
				}
                
	            int resultat = 0;
            
	            if(actionCommand.equals("+")){
					resultat = operande2 + operande1;
				}
	            else if(actionCommand.equals("-")){
					resultat = operande2 - operande1;
	            }
				else if(actionCommand.equals("*")) 
					resultat = operande2 * operande1;
	            
				else if(actionCommand.equals("/")) {
	                resultat = operande1 / operande2 ;
					}
	               
	            }
		
	        }
       
	        
	    }

}
