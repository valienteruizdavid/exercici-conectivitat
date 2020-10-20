
package conectable;


public class Tablet extends Mobiles {

    public Tablet(String nombre, String descripcion, double precio) {
        super(nombre, descripcion, precio);
    }

    @Override
    public void reset() {
        System.out.println("Reiniciando tablet...");
    }
    
    
    
}
