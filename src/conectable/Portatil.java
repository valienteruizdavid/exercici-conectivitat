
package conectable;

public class Portatil extends Mobiles {

    public Portatil(String nombre, String descripcion, double precio) {
        super(nombre, descripcion, precio);
    }

    @Override
    public void reset() {
        System.out.println("Reiniciando ordenador portatil...");
    }
    
    
    
}
