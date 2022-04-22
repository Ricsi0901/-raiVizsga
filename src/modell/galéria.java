
package modell;

import java.util.ArrayList;

public class galéria {
    
    private ArrayList<Festmeny> raktar;

    public galéria() {
        raktar=new ArrayList();
         raktar.add(new Festmeny( "piroska", "Antal József"));
         raktar.add(new Festmeny( "piroska", "Antal József","C:\\Users\\szucs.r.david\\Documents\\oraimunka\\próbaVizsga"));
         raktar.add(new Festmeny( "piroska", "Antal József","C:\\Users\\szucs.r.david\\Documents\\oraimunka\\próbaVizsga", "2022-04-22"));
         raktar.add(new Festmeny( "piroska", "Antal József"));
         raktar.add(new Festmeny( "piroska", "Antal József"));
    }
    
    public void galériában(){
        for (Festmeny festmeny : raktar) {
            System.out.println(festmeny.toString());
        }
    }
    public void fesményfelvetel(String cime, String keszitoje,String elerisiutvonal){
        raktar.add(new Festmeny( cime, keszitoje, elerisiutvonal));
    }
    public void fesményfelvetel(String cime, String keszitoje,String elerisiutvonal, String dátum){
        raktar.add(new Festmeny( cime, keszitoje, elerisiutvonal,dátum));
    }
    
}
