/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.ejb;

import com.udea.persistence.Cliente;
import javax.ejb.Local;

/**
 *
 * @author alito
 */
@Local
public interface ClienteManagerLocal {

    void AddCustomer(Cliente cliente);
    
}
