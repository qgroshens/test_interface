package test_interface;
import java.awt.GridLayout; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color; 

public class grid extends JFrame{
	
	static final long serialVersionUID = 1;

	public grid(){
		
		this.setTitle("Bouton en gille");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		this.setContentPane(panel);
		

		//On définit le layout à utiliser sur le content pane

		//On définit séparement le nombre de ligne et colonne de la grid
		GridLayout gl = new GridLayout();
		gl.setColumns(5);
		gl.setRows(1);
		this.setLayout(gl);
		
					//Trois lignes sur deux colonnes
				//this.setLayout(new GridLayout(3, 2));

		//On ajoute le bouton au content pane de la JFrame

		this.getContentPane().add(new JButton("1"));
		this.getContentPane().add(new JButton("2"));
		this.getContentPane().add(new JButton("3"));
		this.getContentPane().add(new JButton("4"));
		this.getContentPane().add(new JButton("5"));
		
		this.setVisible(true);

	}      

}