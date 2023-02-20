package Entornos4;

/**
 *
 * @author shash
 */
public class Main {

    public static void main(String[] args) throws Exception {

        eCesta cesta;

        cesta = new eCesta("Apellidos del alumno", 100, "dni del alumno");

        try {

            NuevoMetodo(cesta, 50, 100);

        } catch (Exception e) {

            System.out.println("No se puede pagar  ");

        }
        
        cesta.setBono(100);

        System.out.println("Su bono actual es  " + cesta.getBono());

    }

    public static void NuevoMetodo(eCesta cesta, double cantidad, double recargarCantidad) throws Exception {
        
        cesta.comprar(cantidad);
        
        System.out.println("Solicitar actualización de bono");
        cesta.setBono(recargarCantidad);
        
    }

}
