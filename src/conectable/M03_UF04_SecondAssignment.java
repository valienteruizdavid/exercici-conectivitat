
package conectable;


public class M03_UF04_SecondAssignment {
    
     public static void main(String[] args) {
        Dispositivos d1 = new TerminalVenta("Terminal 1","Terminal muy practica",200.0);
        Mobiles m2 = new Tablet("Tablet s14","Tablet muy veloz",350.99);
        Dispositivos d3 = new Ordenador("PCGaming","Ordenador muy potente y muy luminoso",699.99);
        d1.conecta();
        d3.desconecta();
        m2.reset();
    }
    
}
