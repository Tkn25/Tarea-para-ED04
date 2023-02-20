package Entornos4;

/**
 *
 * @author shash
 */
public class eCesta {

    /*Propiedades de la Clase eCesta*/

    private String comercio;

    private double bono;

    private String usuario;
    
    private double extra = 10;

  

    /* Constructor sin argumentos */

    public eCesta ()

    {

    }

    /*Constructor con parámetros*/

    public eCesta (String c, double b, String u)

    {
     this.comercio = c;
     this.bono = b + extra;
     this.usuario = u;

    }
    

   /*Método para fijar el comercio*/

    public String getComercio() {
        return comercio;
    }

    public void setComercio(String comercio) {
        this.comercio = comercio;
        System.out.println("El nuevo comercio es:" + getComercio());
    }

    /* Método que indica el usuario de la cesta electrónica */

    public String getUsuario() {
        return usuario;
    }
    
    /*Método de consulta de bonificación*/

    public double getBono() {
        return bono;
    }

    /* Método para actualizar el bono */

    public void setBono (double bono) throws Exception {
        if (bono<0)

            throw new Exception("No es posible actualizar bono");

        this.bono= bono;

    }
    
    /* Método para comprar */

    public void comprar (double total) throws Exception {

        if (total<= 0)

            throw new Exception ("Imposible la compra");

        if (getBono()< total)

            throw new Exception ("Su bono es insuficiente para la compra");

        bono = bono-total;

    }
}

 