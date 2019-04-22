package Vista;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;


public class PanelImagen extends JPanel{
	
	public PanelImagen( ){
		JLabel etiquetaImagen = new JLabel( );
	    etiquetaImagen.setHorizontalAlignment( JLabel.CENTER );
	    etiquetaImagen.setVerticalAlignment( JLabel.CENTER );
	    etiquetaImagen.setIcon( new ImageIcon( "Imagen.PNG" ) );
	    setLayout( new BorderLayout( ) );
	    add( etiquetaImagen, BorderLayout.CENTER );
	    setBackground( Color.WHITE );
	    }
}

