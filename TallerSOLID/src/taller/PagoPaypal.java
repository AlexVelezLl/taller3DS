/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

/**
 *
 * @author Alexis
 */
public class PagoPaypal implements Pago{
    
    private boolean loggedIn;
    @Override
    public void realizarCobro(double monto) {
        if(!loggedIn){
            //log();
        }
        //Aqui se realiza el cobro
    }
    
}
