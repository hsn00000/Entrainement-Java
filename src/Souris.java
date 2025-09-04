
public class Souris {
    //Constante de la classe
    public static final int ESPERANCE_VIE_PAR_DEFAUT = 36;

    // Attributs
    private int poids;
    private int age;
    private String couleur;
    private int esperanceVie;
    private boolean clonee;

    // Constructeurs
    public Souris(int poids, String couleur, int age, int esperanceVie) {
        this.poids = poids;
        this.couleur = couleur;
        this.age = age;
        this.esperanceVie = esperanceVie;
        this.clonee = false;
        System.out.println("Une nouvelle souris !");
    }

    // Construteur de copie
    public Souris(Souris autreSouris) {
        this.poids = autreSouris.poids;
        this.couleur = autreSouris.couleur;
        this.age = autreSouris.age;
        this.esperanceVie = autreSouris.esperanceVie;
        this.clonee = true;
        System.out.println("Clonage d'une souris !");
    }
}
