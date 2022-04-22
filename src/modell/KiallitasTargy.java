

package modell;

import java.time.LocalDate;

class nagyobDatumIOException extends Exception{
    
}
public abstract class  KiallitasTargy {
   private LocalDate datuma;
    private String targy,keszitoje;

    public KiallitasTargy(String targy, String keszitoje) {
        this(targy,keszitoje,LocalDate.now());
    }
    public KiallitasTargy(String targy, String keszitoje,LocalDate dátum) {
        this.targy = targy;
        this.keszitoje = keszitoje;
        if(LocalDate.now()<dátum){
            try {
                new nagyobDatumIOException;
            } catch (nagyobDatumIOException e) {
            }
        }
        datuma = LocalDate.ofEpochDay(dátum);
        
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

    @Override
    public String toString() {
        return "KiallitasTargy{" + "datuma=" + datuma + ", targy=" + targy + ", keszitoje=" + keszitoje + '}';
    }
    
    
    
   
    
}
