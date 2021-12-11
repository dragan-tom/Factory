
package main.factory;

/**
 *
 * @author Dragan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        
        Car fiat=new Car("Fiat Punto", 2010, "black", 6, 20, 45);
        fiat.showData();

        Car ford=new Car("Ford Fiesta", 2015, "yellow", 58, 32, 7);
        ford.showData();
        
        Car lada=new Car("Lada Niva", 1980, "green", 50, 40, 12, 40000);
        lada.showData();
        
      }

}
