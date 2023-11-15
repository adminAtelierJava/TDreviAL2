/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author wiemhjiri
 */
public class ListVoitures {
    private List<Voiture> voitures;

    public ListVoitures(List<Voiture> voitures) { 

this.voitures=voitures;
    }
public ListVoitures() {
//à compléter

    voitures=new ArrayList<>();
}
public List<Voiture> getVoitures() {
return voitures;
}
public void setVoitures(List<Voiture> voitures) {
this.voitures=voitures;
}
public void ajoutVoiture(Voiture v) throws VoitureException{
//à compléter
  if(!voitures.contains(v))
      voitures.add(v);
  else throw new VoitureException("La voiture existe");
}

public void supprimeVoiture(Voiture v) throws VoitureException{
// à compléter

    if(voitures.contains(v))
        voitures.remove(v);
    else throw new VoitureException("la voiture n'existe pas");
}

public int size(){

        return voitures.size();
}
public void affiche(){
      //  for (int i=0;i<voitures.size();i++)
        //    System.out.println(voitures.get(i));
        for (Voiture v:voitures)
            System.out.println(v);
}

    @Override
    public String toString() {
        String str="L'ensemble des voitures :";
        for (Voiture v:voitures)
            str+=v;

        return str;
    }

}
