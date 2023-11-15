/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wiemhjiri
 */
public class CritereMarque implements Critere{

    private String marque;

    public CritereMarque(String ms)
    {
        marque=ms;
    }

    @Override
    public boolean estSatisfaitPar(Voiture v) {

     return v.getMarque().equalsIgnoreCase(marque);
    }
    
}
