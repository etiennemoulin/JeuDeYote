package yote;

public class Pion {
    int mvt, mvtPrise;
    CouleurPion couleur;
    
    public Pion(CouleurPion c){
        couleur = c;
        mvt = 1;
        mvtPrise = 2;
    }
}
