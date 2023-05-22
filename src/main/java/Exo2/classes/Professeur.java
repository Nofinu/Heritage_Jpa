package Exo2.classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Professeur extends Personne{
    private String matiere;

    public Professeur(String nom, String prenom, String matiere) {
        super(nom, prenom);
        this.matiere = matiere;
    }

    public Professeur() {
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    @Override
    public String toString() {
        return "Professeur{" +
                "matiere='" + matiere + '\'' +
                ", id=" + this.getId() +
                ", nom='" + this.getNom() + '\'' +
                ", prenom='" + this.getPrenom() + '\'' +
                '}';
    }
}
