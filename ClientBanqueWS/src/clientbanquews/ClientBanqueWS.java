/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientbanquews;
import bws.BanqueService;
import bws.BanqueWS;
/**
 *
 * @author Admin
 */
public class ClientBanqueWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println(stub.conversionEuroToDH(10));
    }
    
}
