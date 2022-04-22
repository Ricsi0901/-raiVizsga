
package modell;

import java.util.ArrayList;

public class galéria {
    
    private ArrayList<Festmeny> raktar;

    public galéria() {
        raktar=new ArrayList();
    }
    
    public void galériában(){
        for (Festmeny festmeny : raktar) {
            System.out.println(festmeny.toString());
        }
    }
    
}
