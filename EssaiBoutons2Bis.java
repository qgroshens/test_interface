package test_interface;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class BoutonArdoise extends JButton implements ActionListener {
    private Ardoise ardoise;
    private boolean existe;
    
    BoutonArdoise(String nom, Ardoise ardoise, boolean existe) {
	super(nom);
	this.ardoise = ardoise;
	addActionListener(this);
	this.existe = existe;
    }
    
    public void actionPerformed(ActionEvent e) {
	ardoise.setPossedeDisque(existe);
	ardoise.repaint();
    }
}

 class Boutons2Bis extends JFrame {
    public Boutons2Bis() {  
	Ardoise ardoise = new Ardoise();
	BoutonArdoise trace = new BoutonArdoise("trace",  ardoise, true);
	BoutonArdoise efface = new BoutonArdoise("efface", ardoise, false);
	JPanel lesBoutons = new JPanel();
	
	lesBoutons.add(trace);
	lesBoutons.add(efface);
	add(lesBoutons, BorderLayout.NORTH);
	add(ardoise, BorderLayout.CENTER);

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLocation(200,200);
	pack();
	setVisible(true);
    } 
}

 public class EssaiBoutons2Bis {
    public static void main(String[] arg) {
	new Boutons2Bis();
    }
}

//Ouvre une fenetre avec deux boutons "trace" et "efface"
//situes cote a cote en bas, au milieu
//un clic sur trace :trace un disque rouge au centre
//un clic sur efface : efface