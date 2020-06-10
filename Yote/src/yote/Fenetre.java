package yote;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static yote.CouleurPion.blanc;
import static yote.CouleurPion.noir;


public class Fenetre extends JFrame {
    
    public Fenetre(String name){
        super(name);
    }

    public void ajouterComposant(final Container pane) {
        JPanel fondstock1 = new JPanel();
        JPanel fondplateau = new JPanel();
        JPanel fondstock2 = new JPanel();
        fondplateau.setLayout(new FlowLayout(FlowLayout.CENTER));
        fondstock1.setLayout(new FlowLayout(FlowLayout.RIGHT));
        fondstock2.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        Yote.monplateau = new Plateau();
        Yote.monStockPion = new StockPion(blanc);
        
        Yote.monStockPion2 = new StockPion(noir);
        fondplateau.add(Yote.monplateau);
        fondstock1.add(Yote.monStockPion);
        fondstock2.add(Yote.monStockPion2);
        pane.add(fondplateau, BorderLayout.CENTER);
        pane.add(fondstock1, BorderLayout.EAST);
        pane.add(fondstock2, BorderLayout.WEST);
        
    }
}
