/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.ejb;

import com.udea.persistence.Tarjeta;
import javax.ejb.Local;

/**
 *
 * @author alito
 */
@Local
public interface TarjetaManagerLocal {

    void AddCreditCard(Tarjeta tarjeta);
    
}
