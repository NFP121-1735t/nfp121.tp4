package question2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IHMQuestion2_2 extends JFrame {

    private JButton boutonA = new JButton("A");
    private JButton boutonB = new JButton("B");
    private JButton boutonC = new JButton("C");
    //declarer les variables qui sont responsables aux
    // boutons et la souris
    private JButtonObserver jbo1;
    private JButtonObserver jbo2;
    private JButtonObserver jbo3;
    
    private JMouseObserver mo1;
    private JMouseObserver mo2;
    private JMouseObserver mo3;
    
    private TextArea contenu = new TextArea(30, 80);

 
    public IHMQuestion2_2() {
        super("IHM Question2_2");
        JPanel enHaut = new JPanel();
        enHaut.add(boutonA);
        enHaut.add(boutonB);
        enHaut.add(boutonC);
        setLayout(new BorderLayout(5, 5));
        add("North", enHaut);
        add("Center", contenu); // contenu sera transmis aux observateurs, voir
                                // la description des constructeurs
        setLocation(150,150);pack();show();
        enHaut.setBackground(Color.magenta);
        

        jbo1 = new JButtonObserver("jbo1" , contenu);
        jbo2 = new JButtonObserver("jbo2" , contenu);
        jbo3 = new JButtonObserver("jbo3" , contenu);
        
        //la bouton A admet 3 observateurs
        boutonA.addActionListener(jbo1);
        boutonA.addActionListener(jbo2);
        boutonA.addActionListener(jbo3);
        
        //la bouton B admet 2 observateurs
        boutonB.addActionListener(jbo1);
        boutonB.addActionListener(jbo2);
        
        //la bouton C admet un seul observateur
        boutonC.addActionListener(jbo1);
        
        //declaration de JMouse
        mo1 = new JMouseObserver("mo1" , contenu);
        mo2 = new JMouseObserver("mo2" , contenu);
        mo3 = new JMouseObserver("mo3" , contenu);
        
        // chaque bouton admet une seule entree au souris
        
        boutonA.addMouseListener(mo1);
        boutonB.addMouseListener(mo2);
        boutonC.addMouseListener(mo3);
        
    }
    
     public static void main(String[] args){
        new IHMQuestion2_1();
        new IHMQuestion2_2();
    }


}
