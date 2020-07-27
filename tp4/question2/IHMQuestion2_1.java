package question2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IHMQuestion2_1 extends JFrame {

    private JButton boutonA = new JButton("A");
    private JButton boutonB = new JButton("B");
    private JButton boutonC = new JButton("C");
    //definition des bouttons
    private JButtonObserver button1;
    private JButtonObserver button2;
    private JButtonObserver button3;

    private TextArea contenu = new TextArea(30, 80);

 
    public IHMQuestion2_1() {
        super("IHM Question2_1");
        JPanel enHaut = new JPanel();
        enHaut.add(boutonA);
        enHaut.add(boutonB);
        enHaut.add(boutonC);
        setLayout(new BorderLayout(5, 5));
        add("North", enHaut);
        add("Center", contenu); 
        enHaut.setBackground(Color.blue);
        setLocation(100,100);
        pack();show();
        
        
        button1 = new JButtonObserver("b1",contenu);
        button2 = new JButtonObserver("b2" , contenu);
        button3 = new JButtonObserver("b3" , contenu);
        
        
        boutonA.addActionListener(button1);//Le bouton A a 3 observateurs jbo1 , 2 et 3
        boutonA.addActionListener(button2);
        boutonA.addActionListener(button3);//addActionListener will bind/register
                                           //the Button with the Listener
        boutonB.addActionListener(button1);// le bouton B a 2 observateurs jbo1 et jbo2
        boutonB.addActionListener(button2);
        
        boutonC.addActionListener(button1);//le bouton C a un seul observateur jbo1
        


      
    }
    
    public static void main(String[] args){
        new IHMQuestion2_1();
    }

}
