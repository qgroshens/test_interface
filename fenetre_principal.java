package test_interface;
import javax.swing.JFrame;



class fenetre_principal {
	public static void main(String[] arg) {
	      JFrame monCadre = new JFrame();
	      monCadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      monCadre.setLocation(200,200);
	      monCadre.setContentPane(new Boutons1());
	      monCadre.pack();
	      monCadre.setVisible(true);
	  }
}

