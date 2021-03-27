/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import metier.Compte;

import javax.jws.WebService;

/**
 *
 * @author Admin
 */

@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "ConversionEuroToDH")
    public double conversion(double montant)
    {
        return montant*11;
    }
    @WebMethod
    public Compte getCompte(int code)
    {
        return new Compte(1, Math.random()*9000, new Date());
    }
    
    @WebMethod
    public List<Compte> listComptes()
    {
        List<Compte> comptes = new ArrayList<Compte>();
        comptes.add(new Compte(1, Math.random()*9000, new Date()));
        comptes.add(new Compte(2, Math.random()*9000, new Date()));
        comptes.add(new Compte(3, Math.random()*9000, new Date()));
        
        return comptes;
    }
}
