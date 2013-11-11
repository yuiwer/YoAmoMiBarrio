/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.yoamomibarrio.dao.impl;

import ar.com.yoamomibarrio.dao.PalabraClave;
import java.util.List;

/**
 *
 * @author Matias
 */
public class PalabraClaveDao extends GenericDaoImpl<PalabraClave>{
    public List<PalabraClave> buscarPorDescripcion(char letra, String descripcion){
        return getHibernateSession().createQuery("from PalabraClave"+letra+" where descripcion like :desc").setParameter("desc", descripcion+"%").list();
    }
}
