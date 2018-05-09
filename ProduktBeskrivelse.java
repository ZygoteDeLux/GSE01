package gse01;
public class ProduktBeskrivelse {
    private String produktID;
    private String beskrivelse;
    private double pris;
    private int standardmeangde;
    private int antalPaaLager;
    public void setProduktID(String produktID){
        this.produktID = produktID;
    }
    public String faaProduktID(){
         return produktID;  
    }
    public void setProduktBeskrivels(String beskrivelse){ 
        this.beskrivelse = beskrivelse;   
    }
    public String faaProduktBeskrivelse(){
        return beskrivelse;
    }
    public void setPris(double pris){
        this.pris = pris;
    }
    public double faaPris(){
        return pris;
    }
    public void setStandardmeangde(int meangde){
        this.standardmeangde = meangde;
    }
    public double faaMeangde(){
        return standardmeangde;
    }
    public void setLagerAntal(int antal){
        this.antalPaaLager = antal;
    }
    public int faaLagerAntal(){
        return antalPaaLager;
    }
}
