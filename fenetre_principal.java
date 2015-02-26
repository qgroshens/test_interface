package test_interface;
import javax.swing.JFrame;



class fenetre_principal {
	public static void main(String[] arg) {
		JFrame monCadre = new JFrame();
		JFrame cadre_grid = new JFrame();

		cadre_grid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cadre_grid.setLocation(600,600);
		cadre_grid.setContentPane(new grid());
		cadre_grid.pack();
		cadre_grid.setVisible(true);


		monCadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		monCadre.setLocation(200,200);
		monCadre.setContentPane(new Boutons1());
		monCadre.pack();
		monCadre.setVisible(true);
		
		
	

		
	}
}

