/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.ejb;

import com.udea.persistence.Tarjeta;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alito
 */
@Stateless
public class TarjetaManager implements TarjetaManagerLocal {

    @PersistenceContext(unitName = "com.udea.practica_primerapractica-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;
   
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void AddCreditCard(Tarjeta tarjeta) {
        em.persist(tarjeta);
    }
}
