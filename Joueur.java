public class Joueur {
    private String m_Nom; private String m_Prenom; private int m_Age;

    Joueur(String Prenom, String Nom, int Age){
        this.m_Nom = Nom; this.m_Age = Age; this.m_Prenom = Prenom;
    }


    public String toString() {
        return this.m_Prenom + " "+ this.m_Nom +" est agé de " + String.valueOf(this.m_Age);
    }
}
