
import java.util.ArrayList;
import java.util.List;


enum Categorie{
    microSoccer4, microSoccer5, miniSoccer;
}

public class Equipe {
    private String m_NE; private int m_PG;
    private Categorie m_Categorie;

    private List<Joueur> m_Equipe = new ArrayList<>();

    Equipe(String NomEquipe, Categorie Cat){
        this.m_Categorie = Cat; this.m_NE = NomEquipe;
    }

    //acces

    public String getNomEquipe(){return this.m_NE;}
    public int getPartieGagne(){return  this.m_PG;}
    public Categorie getCategorie(){return this.m_Categorie;}
    public String getNomJoueur(int Numero){return m_Equipe.get(Numero).toString();}

    //mutateur

    public void mutNomEquipe(String NewName){this.m_NE = NewName;}

    public void mutPartieGagne(int NbNewPartieGagne){this.m_PG = NbNewPartieGagne;}

    public void mutCategorie(Categorie NewCategorie){this.m_Categorie = NewCategorie;}

    //methode
    public void ajoutPartiesGagnees(int ajoueGange){this.m_PG = this.m_PG + ajoueGange;}
    public int nombreJoeur(){return m_Equipe.size();}
    public void ajouteJoueur(Joueur Game){m_Equipe.add(Game);}
    public void supprimerJoueur(int NumeroJoueur){m_Equipe.remove(NumeroJoueur);}



}
