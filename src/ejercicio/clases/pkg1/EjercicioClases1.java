
package ejercicio.clases.pkg1;

import java.util.*;
public class EjercicioClases1 {

  
    public static void main(String[] args) {
      Banco M_S = new Banco ("Magdalena Sanchez",1234,1012,0);
      Banco J_P = new Banco ("Joselito Perez",9876,1013,500000);
      System.out.println ("Ingrese el dinero que quiere consignar:");
    Scanner lectura= new Scanner (System.in);
    int dinero_consignado = lectura.nextInt();
        boolean consignación=M_S.Consignar(dinero_consignado); 
        if(consignación==true){
            System.out.println ("Consignación exitosa");
        }else{
            System.out.println ("Consignación fallida");
        }
        System.out.println ("Ingrese su antigua clave:");
        int vieja_clave = lectura.nextInt();
        System.out.println ("Ingrese su nueva clave:");
        int nueva_clave = lectura.nextInt();
        boolean cambio_de_clave=J_P.Cambiar_clave(vieja_clave, nueva_clave);
        if(cambio_de_clave==true){
            System.out.println ("Cambio de clave exitosa");
        }else{
            System.out.println ("Cambio de clave fallida");
        }
        System.out.println ("Saldo de Joselito Sanchez");
        System.out.println (J_P.Consultar_Saldo());
    }
   
    
}
