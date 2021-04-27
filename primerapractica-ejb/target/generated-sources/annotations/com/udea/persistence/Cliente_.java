package com.udea.persistence;

import com.udea.persistence.Tarjeta;
import com.udea.persistence.Transaccion;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-25T21:13:07")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile CollectionAttribute<Cliente, Tarjeta> tarjetaCollection;
    public static volatile SingularAttribute<Cliente, Integer> cedula;
    public static volatile SingularAttribute<Cliente, String> nombre;
    public static volatile SingularAttribute<Cliente, String> email;
    public static volatile CollectionAttribute<Cliente, Transaccion> transaccionCollection;

}