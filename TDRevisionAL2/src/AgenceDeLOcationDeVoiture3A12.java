/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author wiemhjiri
 */
public class AgenceDeLOcationDeVoiture3A12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Voiture v1=new Voiture(123,"fiat",90);
        Voiture v2=new Voiture(122,"fiat",80);

        Voiture v3=new Voiture(124,"peugeot",90);


        Voiture v4=new Voiture(125,"polo",100);
        Voiture v5=new Voiture(125,"polo",100);


Agence ag=new Agence("Tunis");
try {
    ag.ajoutVoiture(v1);
}catch (VoitureException ex)
{
    System.out.println(ex);
}
        try {
            ag.ajoutVoiture(v2);
        }catch (VoitureException ex)
        {
            System.out.println(ex);
        }
        try {
            ag.ajoutVoiture(v3);
        }catch (VoitureException ex)
        {
            System.out.println(ex);
        }
        try {
            ag.ajoutVoiture(v4);
        }catch (VoitureException ex)
        {
            System.out.println(ex);
        }
        try {
            ag.ajoutVoiture(v5);
        }catch (VoitureException ex)
        {
            System.out.println(ex);
        }


        List<Voiture> l1=ag.selectVoitureSelonCritere(new CritereMarque("fiat"));

        System.out.println(l1);


        List<Voiture> l2=ag.selectVoitureSelonCritere(new CriterPrix(90));
        System.out.println(l2);

        Critere cr=(Voiture v)->v.getPrixLocation()>=70&&v.getMarque().equals("fiat");


        List<Voiture> l3=ag.selectVoitureSelonCritere((Voiture v)->v.getPrixLocation()>=70&&v.getMarque().equals("fiat"));

        System.out.println(l3);

        List<Voiture> listV=new ArrayList<>();

        listV.add(v1);
        listV.add(v2);
        listV.add(v3);
        listV.add(v4);

        Collections.sort(listV,(Voiture vo1,Voiture vo2)
                ->{return  vo1.getMarque().compareTo(vo2.getMarque());});

        Collections.sort(listV,(vo1,vo2)->vo1.getMarque().compareTo(vo2.getMarque()));

        Collections.sort(listV,(Voiture vo1,Voiture vo2)
                ->{return  vo1.getImmariculation()-vo2.getImmariculation();});


        listV.forEach((Voiture v)-> System.out.println(v));

        listV.stream().filter(v->v.getPrixLocation()>90).
                forEach(e-> System.out.println(e));



    }
    
}
