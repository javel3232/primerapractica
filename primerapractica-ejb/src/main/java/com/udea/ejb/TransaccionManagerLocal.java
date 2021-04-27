/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.ejb;

import com.udea.persistence.Transaccion;
import javax.ejb.Local;

/**
 *
 * @author alito
 */
@Local
public interface TransaccionManagerLocal {

   
    void AddTransaction(Transaccion transaction);
    
}
