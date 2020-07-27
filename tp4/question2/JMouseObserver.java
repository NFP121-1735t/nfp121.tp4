package question2;

import java.awt.event.MouseListener;// à compléter
import java.awt.event.MouseEvent;
import java.awt.TextArea;

/**
 * Décrivez votre classe JButtonObserver ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class JMouseObserver implements MouseListener { // pour que les action du souris "RUN" normalemenet

	private String nom;
	private TextArea contenu;

	public JMouseObserver(String nom, TextArea contenu) {
		this.nom = nom;
		this.contenu = contenu;
	}

	public void mouseClicked(MouseEvent e) {
	}

	/**
	 * affichage d'un message dans la zone de texte ce message est de la forme
	 * observateur this.nom : souris entrée en (X,Y) exemple : observateur jmo1
	 * : souris entrée en (15,20)
	 * 
	 * @param
	 */
	public void mouseEntered(MouseEvent e) {
	    String message = "Lobservateur "+ this.nom + " : " + "Entree au souris( " + e.getX()+ "," + e.getY() + " )";
		contenu.append(message + "\n");
	}

	public void mouseExited(MouseEvent e) {}

	public void mousePressed(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {}

}
