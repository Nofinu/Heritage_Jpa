package Exo2;

import Exo2.classes.Etudiant;
import Exo2.classes.Professeur;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainExo2 {

    public static void  start(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exo_Heritage");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();


        Etudiant etudiant = new Etudiant("nometudiant1","prenometudiant1","classe1");
        Professeur professeur = new Professeur("nomprofesseur1","prenomProfeseur1","matiere1");

        em.persist(etudiant);
        em.persist(professeur);
        em.getTransaction().commit();
        em.close();

        em = emf.createEntityManager();
        System.out.println(em.find(Etudiant.class,1));
        System.out.println(em.find(Professeur.class,2));
        emf.close();
    }
}
