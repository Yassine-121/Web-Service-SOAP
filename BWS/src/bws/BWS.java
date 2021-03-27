/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bws;

import javax.xml.ws.Endpoint;

/**
 *
 * @author Admin
 */
public class BWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8686/";
        Endpoint.publish(url, new BanqueService());
        System.err.println("Web service déployé : "+url);
    }
    
}
