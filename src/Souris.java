
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
        this.esperanceVie = (autreSouris.esperanceVie * 4) / 5;
        this.clonee = true;
        System.out.println("Clonage d'une souris !");
    }

    //Constucteur avec poids et couleur
    public Souris(int poids, String couleur) {
        this(poids, couleur, 0, ESPERANCE_VIE_PAR_DEFAUT);
    }

    //Constructeur avec poids, couleur et age
    public Souris(int poids, String couleur, int age) {
        this(poids, couleur, age, ESPERANCE_VIE_PAR_DEFAUT);
    }

    //Méthodes
    public int vieillir () {
        age++;
        return age;
    }

    public void evolue() {
        while (age < esperanceVie) {
            vieillir();
        }
        System.out.println("La souris a évolué !");
    }

    public String toString() {
        return "Souris de couleur " + couleur + (clonee ? " (clonee)" : "") + ", age : " + age + ", poids : " + poids + "kg, esperance de vie : " + esperanceVie + " mois.";
    }

    //Getters et Setters
    public int getPoids() {
        return poids;
    }

    public int getAge() {
        return age;
    }

    public String getCouleur() {
        return couleur;
    }

    public int getEsperanceVie() {
        return esperanceVie;
    }

    public boolean isClonee() {
        return clonee;
    }
}
