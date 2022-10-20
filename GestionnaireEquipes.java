public class GestionnaireEquipes {
    public static void main (String[] args){
        Joueur E1 = new Joueur("Damien", "Cappellini",23);
        Joueur E2 = new Joueur("Albert", "Camus",29);
        Joueur E3 = new Joueur("Jean", "Valjean",400);
        Joueur E4 = new Joueur("Phillipe", "Pichard",5);
        Joueur E5 = new Joueur("Dylan", "Marie",34);
        Joueur E6 = new Joueur("David", "Mazel",85);
        Joueur E7 = new Joueur("Tim", "McGe",45);
        Joueur E8 = new Joueur("Ziva", "David",96);
        Joueur E9 = new Joueur("John", "Reese",12);
        Joueur E10 = new Joueur("Samatha", "Groves",76);

        Equipe A1 = new Equipe("MHB",Categorie.microSoccer4);
        Equipe A2 = new Equipe("PS", Categorie.miniSoccer);

        A1.ajouteJoueur(E1);A1.ajouteJoueur(E3);A1.ajouteJoueur(E5);A1.ajouteJoueur(E7);A1.ajouteJoueur(E9);
        A2.ajouteJoueur(E2);A2.ajouteJoueur(E4);A2.ajouteJoueur(E6);A2.ajouteJoueur(E8);A2.ajouteJoueur(E10);
        A1.mutPartieGagne(5);A2.mutPartieGagne(3);
        System.out.println("L'équipe 1 a gagnée : " + String.valueOf(A1.getPartieGagne()) + " l'équipe 2 a gagnée : " + String.valueOf(A2.getPartieGagne()));
        A1.ajoutPartiesGagnees(1);
        System.out.println("L'équipe 1 a gagnée : " + String.valueOf(A1.getPartieGagne()) + " l'équipe 2 a gagnée : " + String.valueOf(A2.getPartieGagne()));
        if(A1.getPartieGagne() > A2.getPartieGagne()){
            System.out.println("L'équie(1) " +A1.getNomEquipe()+" a gagné plus de match que l'équipe(2) " + A2.getNomEquipe());
        } else if (A1.getPartieGagne() == A2.getPartieGagne()) {

            System.out.println("L'équie(1) " +A1.getNomEquipe()+" a gané le même nombre de match que l'équipe(2) " + A2.getNomEquipe());
        }else{
            System.out.println("L'équie(2) " +A2.getNomEquipe()+" a gagné plus de match que l'équipe(1) " + A1.getNomEquipe());
        }

        System.out.println("L'équipe(1) est composé de : " + String.valueOf(A1.nombreJoeur())+" les joueurs sont :");
        for(int i =0; i<A1.nombreJoeur(); i++){
            System.out.println("Le numero joueur est : " + String.valueOf(i) + " " + A1.getNomJoueur(i));
        }
        System.out.println("L'équipe(2) est composé de : " + String.valueOf(A2.nombreJoeur())+" les joueurs sont :");
        for(int i =0; i<A1.nombreJoeur(); i++){
            System.out.println("Le numero joueur est : " + String.valueOf(i) + " " + A1.getNomJoueur(i));
        }

        A1.supprimerJoueur(2);
        System.out.println("L'équipe(1) est composé de : " + String.valueOf(A1.nombreJoeur())+" les joueurs sont :");
        for(int i =0; i<A1.nombreJoeur(); i++){
            System.out.println("Le numero joueur est : " + String.valueOf(i) + " " + A1.getNomJoueur(i));
        }

    }
}
