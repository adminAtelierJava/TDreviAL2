/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wiemhjiri
 */
public class CriterPrix implements Critere{

    private float prix;

    public CriterPrix(float pr)
    {
        prix=pr;
    }
    @Override
    public boolean estSatisfaitPar(Voiture v) {

// à compléter
   return v.getPrixLocation()>=prix;
    }
    
}
