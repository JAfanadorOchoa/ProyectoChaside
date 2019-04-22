package vista;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelImagen extends JPanel {

	
	private BufferedImage imagen;
	private JLabel label;
	
	public PanelImagen() throws IOException {
		imagen = ImageIO.read(new File("..\\Chaside\\src\\vista\\trabajo.jpg"));
		
		label = new JLabel(new ImageIcon(imagen));
		add(label);
		
	}

	
}
