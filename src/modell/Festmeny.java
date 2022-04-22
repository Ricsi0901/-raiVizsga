
package modell;

import java.io.File;
import java.text.Collator;
import java.time.LocalDate;
import java.util.Comparator;

class keszitojeComparator implements Comparator<Festmeny>{

    @Override
    public int compare(Festmeny egyik, Festmeny masik) {
        /* ékezethez, ld compareTo */
        Collator col = Collator.getInstance();
        return col.compare(egyik.getKeszitoje(), masik.getKeszitoje());
    } 
}

public class Festmeny extends KiallitasTargy implements Comparable<Festmeny>{
     private String elérisiutvonal;
    public Festmeny(String targy, String keszitoje,String elerisiutvonal, String dátum) {
        super(targy, keszitoje, dátum);
        this.elérisiutvonal=elerisiutvonal;
    }
    
    public Festmeny(String targy, String keszitoje,String elerisiutvonal) {
        super(targy, keszitoje);
        this(elerisiutvonal);
    }

    public String getElérisiutvonal() {
        return elérisiutvonal;
    }

    public LocalDate getDatuma() {
        
        return datuma;
    }

    public String getTargy() {
        return targy;
    }

    public String getKeszitoje() {
        return keszitoje;
    }

    
    
    public void megjelenit(){
      
      File myObj = new File(this.elérisiutvonal);
      if(myObj.exists()){
          
          System.out.println("megjelenités folyamatban");
      }else{
          System.out.println("nem lehet megjeleniteni");
      }
      
        
    }
    public static keszitojeComparator keszitoRendezo(){
        return new keszitojeComparator();
    }

    @Override
    public int compareTo(Festmeny o) {
       Collator col = Collator.getInstance();
        return col.compare(this.getTargy(), o.getTargy());
    }

    @Override
    public String toString() {
        return "Festmeny{" + "el\u00e9risiutvonal=" + elérisiutvonal + '}';
    }

    
    
    
}
