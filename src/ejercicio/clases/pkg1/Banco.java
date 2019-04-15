package ejercicio.clases.pkg1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jdiazga
 */
public class Banco {
    private String Dueño;
    private int Clave;
    private int Numero_de_Cuenta;
    private int Saldo;
    public boolean Consignar(int valor){
        if (valor>0){
            this.Saldo+=valor;
            return true;
        }
        else{
            return false;
                    }
    }
    public boolean Retirar(int valor){
        if (valor>0 && this.Saldo>=valor){
            this.Saldo-=valor;
            return true;
        }
        else{
            return false;
                    }
    }
    public boolean Cambiar_clave(int nueva_clave, int vieja_clave){
        if(vieja_clave==this.Clave){
            this.Clave=nueva_clave;
            return true;
        }else{
            return false;
        }
        
    }
    public int Consultar_Saldo(){
        return this.Saldo;
    }
    public Banco (String Dueño ,int Clave ,int Numero_de_Cuenta,int Saldo ){
    this.Dueño=Dueño;
    this.Numero_de_Cuenta=Numero_de_Cuenta;
    this.Saldo=Saldo;
    this.Clave=Clave;
      
}
    
}
