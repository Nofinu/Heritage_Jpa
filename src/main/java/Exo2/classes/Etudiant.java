package Exo2.classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class Etudiant extends Personne{
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
                ", id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
