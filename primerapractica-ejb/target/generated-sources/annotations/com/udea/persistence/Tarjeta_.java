package com.udea.persistence;

import com.udea.persistence.Cliente;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-25T21:13:07")
@StaticMetamodel(Tarjeta.class)
public class Tarjeta_ { 

    public static volatile SingularAttribute<Tarjeta, String> cvv;
    public static volatile SingularAttribute<Tarjeta, Integer> numtar;
    public static volatile SingularAttribute<Tarjeta, String> nombretipo;
    public static volatile SingularAttribute<Tarjeta, Date> fechaven;
    public static volatile SingularAttribute<Tarjeta, Cliente> cedula;

}