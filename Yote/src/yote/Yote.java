package yote;

public class Yote {
    
    public static Fenetre mafenetre;
    public static Plateau monplateau;
    public static StockPion monStockPion;
    public static StockPion monStockPion2;
    
    
    
    public static void main(String[] args){
        mafenetre = new Fenetre("Yote");
        mafenetre.ajouterComposant(mafenetre.getContentPane());
        mafenetre.pack();
        mafenetre.setVisible(true);
    }
}
