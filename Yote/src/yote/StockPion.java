

package yote;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
/**
 *
 * @author elmou
 */
public class StockPion extends JPanel{
    Case[][] monStockPion;
    Case[][] monStockPion2;
    CouleurPion couleur;
    //boolean s = true;
    
        public StockPion(CouleurPion c){
            
            couleur = c;
            
            this.setLayout(new GridLayout(6,2));
            
            //if(s = true){
                
                monStockPion = new Case[6][2];
                for(int i = 0; i < 6; i++){
                    for(int j = 0; j < 2; j++){
                        monStockPion[i][j] = new Case(Color.black, i, j, 1);
                        this.add(monStockPion[i][j]);
                    }
                }
                
            //}
                
            
            /*if(s = false){
                
                monStockPion2 = new Case[6][2];
                for(int i = 0; i < 6; i++){
                    for(int j = 0; j < 2; j++){
                    monStockPion2[i][j] = new Case(Color.blue, i, j, 1);
                    this.add(monStockPion2[i][j]);
                    }
                }
            }*/
            
            
        }
        
        
        

   
}
