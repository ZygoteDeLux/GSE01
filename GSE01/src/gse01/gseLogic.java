package gse01;
public class gseLogic {
    private ProduktBeskrivelse mango;
    private int tempAntal;
    private double tempPris;
    public void start(){
       Produkt p1 = new Produkt();
       Kurv k1 = new Kurv(); 
        
       mango = new ProduktBeskrivelse();
       mango.setProduktID("1234wfafwa");
       mango.setProduktBeskrivels("Det her er en dejlig mango");
       mango.setPris(60.37);
       mango.setLagerAntal(150);
       mango.setStandardmeangde(8);
       
       mango.faaProduktID();
       mango.faaProduktBeskrivelse();
       mango.faaPris();
       mango.faaMeangde();
       mango.faaLagerAntal();
       p1.go();
       
       tempAntal = (mango.faaLagerAntal()) - (Integer.parseInt(p1.antal1));
       mango.setLagerAntal(tempAntal);
       tempPris = ((mango.faaPris())*(Integer.parseInt(p1.antal1)));
        System.out.println("stock left: " + mango.faaLagerAntal());
        System.out.println("toal price: " + tempPris);
       
        k1.kurv1.put(mango.faaProduktID(), (Integer.parseInt(p1.antal1)));
        System.out.println("id: " + k1.kurv1.toString());
    }
}
