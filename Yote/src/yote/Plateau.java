package yote;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class Plateau extends JPanel {
    
        Case[][] plateau;
        public Plateau(){
            
            this.setLayout(new GridLayout(6,5));
            
            
            plateau = new Case[6][5];
            for(int i = 0; i < 6; i++){
                for(int j = 0; j < 5; j++){
                    plateau[i][j] = new Case(Color.black, i, j, 0);
                    this.add(plateau[i][j]);
                }
            }
            
            
            
        }
    
        boolean isIn(Case c){
        return true;
        }
        
        boolean verifieDeplacementHor(Case dep,Case arr){
        return true;
        }
        
        boolean verifieDeplacmentVert(Case dep, Case arr){
        return true;
        }
        
        boolean deplacementValide(Case dep, Case arr){
        return true;
        }
        
        boolean jouerCoup(Case dep, Case arr){
        return true;
        }
        
        boolean jouerCoupPrise(Case dep, Case arr){
        return true;
        }
}
