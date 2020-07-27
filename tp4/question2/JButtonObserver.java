package question2;

import java.awt.event.ActionListener; // à compléter
import java.awt.event.ActionEvent; // à compléter
import java.awt.TextArea;

/**
 * Décrivez votre classe JButtonObserver ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class JButtonObserver implements ActionListener{ // pour que la methode addActionListener soit verifiee

    private String nom;
    private TextArea contenu;

  
    public JButtonObserver(String nom, TextArea contenu) {
        this.nom = nom;
        this.contenu = contenu;
    }


    public void actionPerformed(ActionEvent event){
        String message = "l'observateur"+ this.nom +":"+"Click sur le boutton"+ event.getActionCommand(); //pour impliquer l'action
        contenu.append(message + "\n");
    }

}

