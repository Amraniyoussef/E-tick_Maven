package model;
/***********************************************************************
 * Module:  TypeEvenement.java
 * Author:  Oussama
 * Purpose: Defines the Class TypeEvenement
 ***********************************************************************/

import java.util.*;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
@Entity
public class TypeEvenement {

   public int numTypeEvenement;

   public String libelleTypeEvenementt;

 public int numgenre ;
   

   public int getNumTypeEvenement() {
	return numTypeEvenement;
}



public void setNumTypeEvenement(int numTypeEvenement) {
	this.numTypeEvenement = numTypeEvenement;
}



public String getLibelleTypeEvenementt() {
	return libelleTypeEvenementt;
}



public int getNumgenre() {
	return numgenre;
}

public void setNumgenre(int numgenre) {
	this.numgenre = numgenre;
}



public void setLibelleTypeEvenementt(String libelleTypeEvenementt) {
	this.libelleTypeEvenementt = libelleTypeEvenementt;
}



@OneToMany
public Collection<GenreEvenement> genreEvenement;
   
   
   /** @pdGenerated default getter */
   public Collection<GenreEvenement> getGenreEvenement() {
      if (genreEvenement == null)
         genreEvenement = new HashSet<GenreEvenement>();
      return genreEvenement;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorGenreEvenement() {
      if (genreEvenement == null)
         genreEvenement = new HashSet<GenreEvenement>();
      return genreEvenement.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newGenreEvenement */
   public void setGenreEvenement(Collection<GenreEvenement> newGenreEvenement) {
      removeAllGenreEvenement();
      for (Iterator iter = newGenreEvenement.iterator(); iter.hasNext();)
         addGenreEvenement((GenreEvenement)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newGenreEvenement */
   public void addGenreEvenement(GenreEvenement newGenreEvenement) {
      if (newGenreEvenement == null)
         return;
      if (this.genreEvenement == null)
         this.genreEvenement = new HashSet<GenreEvenement>();
      if (!this.genreEvenement.contains(newGenreEvenement))
         this.genreEvenement.add(newGenreEvenement);
   }
   
   /** @pdGenerated default remove
     * @param oldGenreEvenement */
   public void removeGenreEvenement(GenreEvenement oldGenreEvenement) {
      if (oldGenreEvenement == null)
         return;
      if (this.genreEvenement != null)
         if (this.genreEvenement.contains(oldGenreEvenement))
            this.genreEvenement.remove(oldGenreEvenement);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllGenreEvenement() {
      if (genreEvenement != null)
         genreEvenement.clear();
   }

}