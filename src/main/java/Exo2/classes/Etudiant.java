package Exo2.classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Etudiant {
    private String classe;

    public Etudiant(String nom, String prenom, String classe) {
        super(nom, prenom);
        this.classe = classe;
    }

    public Etudiant() {
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "classe='" + classe + '\'' +
                ", id=" + this.getId() +
                ", nom='" + this.getNom() + '\'' +
                ", prenom='" + this.getPrenom() + '\'' +
                '}';
    }
}
