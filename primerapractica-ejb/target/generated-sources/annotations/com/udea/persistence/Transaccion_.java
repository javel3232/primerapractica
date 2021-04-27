package com.udea.persistence;

import com.udea.persistence.Cliente;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-25T21:13:07")
@StaticMetamodel(Transaccion.class)
public class Transaccion_ { 

    public static volatile SingularAttribute<Transaccion, Date> fecha;
    public static volatile SingularAttribute<Transaccion, Integer> codtrans;
    public static volatile SingularAttribute<Transaccion, Cliente> cedula;
    public static volatile SingularAttribute<Transaccion, Float> valor;

}