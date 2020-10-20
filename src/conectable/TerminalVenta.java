
package conectable;


public class TerminalVenta extends Sobremesa {

    public TerminalVenta(String nombre, String descripcion, double precio) {
        super(nombre, descripcion, precio);
    }

    @Override
    public void conecta() {
        System.out.println("Encendiendo terminal de venta");
    }

    @Override
    public void desconecta() {
        System.out.println("Apagando terminal de venta");
    }
    
    
}
