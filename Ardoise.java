package test_interface;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Ardoise extends JPanel {
	static final long serialVersionUID = 1;
	private boolean possedeDisque = true;
	private int couleur=1;//1=rouge;2=vert
	private int position=1;//1=haut à gauche;2=haut à droite;3=bas à gauche;4=bas à droite

	public Ardoise() {
		setBackground(Color.YELLOW);
		setPreferredSize(new Dimension(200, 150));

	} 

	public void setPossedeDisque(boolean possedeDisque) {
		this.possedeDisque = possedeDisque;
	}
	public void setCouleurDisque(String couleur){
		if(couleur.equals("rouge")){
			this.couleur=1;
		}else if(couleur.equals("vert")){
			this.couleur=2;
		}else{
			this.couleur=1;//par defaut rouge
		}
	}
	public void setPositionDisque(int pos){
		this.position=pos;
	}

	public void dessiner(Graphics g) {
		if(couleur==1){
			g.setColor(Color.RED);
		}else if(couleur==2){
			g.setColor(Color.GREEN);
		}else{
			g.setColor(Color.RED);
		}
		switch (position){
		case 1:
			g.fillOval(100, 30, 80, 80);
			break;
		case 2:
			g.fillOval(300, 30, 80, 80);
			break;
		case 3:
			g.fillOval(100, 90,80, 80);
			break;
		case 4:
			g.fillOval(300, 90, 80, 80);
			break;
		}

	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (possedeDisque) dessiner(g);
	}
}
