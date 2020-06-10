
package yote;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Case extends JButton implements ActionListener{
    
    ImageIcon image;
    Pion pion;
    Color couleurFond;
    boolean occupe;
    int abscisse, ordonnee;
    int typeCase;
    
    public Case(Color c, int x, int y, int type){
        couleurFond = c;
        abscisse = x;
        ordonnee = y;
        typeCase = type;
        occupe = false;
        pion = null;
        image = null;
        
        this.setBackground(couleurFond);
        
        addActionListener(this);
        this.setPreferredSize(new Dimension(100, 100));
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
}
