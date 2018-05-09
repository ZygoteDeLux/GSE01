
package gse01;
import java.util.Scanner;
public class Produkt {
    String antal1;
    String a;
    Scanner input = new Scanner(System.in);
    public void go(){
        commands();
    }
    public String commands(){
        System.out.println("Hvor mange mangoer");
        while (!"q".equals(a = input.next())) {
            antal1 = a;
            System.out.println("registreret press q to quit");
            
        }if("q".equals(a)){
                  System.out.println("done");
        }
        return antal1;
    }
}
        

    
