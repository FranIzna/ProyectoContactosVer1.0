package com.example.chrno.proyecto2;

import java.util.*;

/**
 * Created by 2dam on 19/10/2015.
 */
public class ComparatorNombre implements java.util.Comparator<Contacto> {
    @Override
    public int compare(Contacto c, Contacto c1) {
        return c1.getNombre().compareTo(c.getNombre());
    }
}
