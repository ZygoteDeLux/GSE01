package gse01;
public class GSE01 {
    public static void main(String[] args) {
       GSE01 platform1 = new GSE01();
       platform1.init();
    }
    public void init(){
       gseLogic logic = new gseLogic(); 
       logic.start();
    }
}
