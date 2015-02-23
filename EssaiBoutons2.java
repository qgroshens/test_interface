package test_interface;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class BoutonTrace extends JButton implements ActionListener {
    private Ardoise ardoise;
    
    BoutonTrace(String nom, Ardoise ardoise) {
	super(nom);
	this.ardoise = ardoise;
	addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
	ardoise.setPossedeDisque(true);
	ardoise.repaint();
    }
}

class BoutonEfface extends JButton implements ActionListener {
    private Ardoise ardoise;
    
    BoutonEfface(String nom, Ardoise ardoise) {
	super(nom);
	this.ardoise = ardoise;
	addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
	ardoise.setPossedeDisque(false);
	ardoise.repaint();
    }
}

class Boutons2 extends JPanel {
    public Boutons2() {  
	Ardoise ardoise = new Ardoise();
	BoutonTrace trace = new BoutonTrace("trace",  ardoise);
	BoutonEfface efface = new BoutonEfface("efface", ardoise);
	JPanel lesBoutons = new JPanel();
	
	lesBoutons.add(trace);
	lesBoutons.add(efface);
	setLayout(new BorderLayout(5, 5));
	add(lesBoutons, BorderLayout.NORTH);
	add(ardoise, BorderLayout.CENTER);
    }
}

public class EssaiBoutons2 {
    public static void main(String[] argv) {
	JFrame monCadre = new JFrame();
	monCadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	monCadre.setLocation(200,200);
	monCadre.setContentPane(new Boutons2());
	monCadre.pack();
	monCadre.setVisible(true);
    }
}

