
package conectable;


public abstract class Mobiles extends Dispositivos {

    public Mobiles(String nombre, String descripcion, double precio) {
        super(nombre, descripcion, precio);
    }

    abstract void reset();
    
    
    
    
}
