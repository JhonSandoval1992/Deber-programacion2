/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.lenguajeprogramacion2.dao;

import ec.edu.itq.lenguajeprogramacion2.generico.Generico;
import ec.edu.itq.lenguajeprogramacion2.modelo.Puesto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class PuestoDao extends Generico<Puesto> {

    public PuestoDao() {
        super(Puesto.class);
    }
    
}
