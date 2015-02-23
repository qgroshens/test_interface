package test_interface;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Boutons1 extends JPanel implements ActionListener {  
	private JButton trace = new JButton("trace");
	private JButton efface = new JButton("efface");
	private JButton rouge = new JButton("rouge");
	private JButton vert = new JButton("vert");
	private JButton HG = new JButton("haut à gauche");
	private JButton HD = new JButton("haut à droite");
	private JButton BG = new JButton("bas à gauche");
	private JButton BD = new JButton("bas à droite");
	private Ardoise  ardoise = new Ardoise();
	static final long serialVersionUID = 1;

	public Boutons1() {
		setLayout(new BorderLayout(5, 5));
		JPanel lesBoutons = new JPanel();
		JPanel lesBoutons2 = new JPanel();
		lesBoutons.add(trace);
		lesBoutons.add(efface);
		lesBoutons.add(rouge);
		lesBoutons.add(vert);
		lesBoutons2.add(HG);
		lesBoutons2.add(HD);
		lesBoutons2.add(BG);
		lesBoutons2.add(BD);
		add(lesBoutons2, BorderLayout.SOUTH);
		add(lesBoutons, BorderLayout.NORTH);
		add(ardoise, BorderLayout.CENTER);
		trace.addActionListener(this);
		efface.addActionListener(this);
		rouge.addActionListener(this);
		vert.addActionListener(this);
		HG.addActionListener(this);
		HD.addActionListener(this);
		BG.addActionListener(this);
		BD.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == trace) ardoise.setPossedeDisque(true);
		else if (e.getSource() == efface) ardoise.setPossedeDisque(false);
		else if (e.getSource() == rouge) ardoise.setCouleurDisque("rouge");
		else if (e.getSource() == vert) ardoise.setCouleurDisque("vert");
		else if (e.getSource() == HG) ardoise.setPositionDisque(1);
		else if (e.getSource() == HD) ardoise.setPositionDisque(2);
		else if (e.getSource() == BG) ardoise.setPositionDisque(3);
		else if (e.getSource() == BD) ardoise.setPositionDisque(4);
		
		ardoise.repaint();      
	}
}
