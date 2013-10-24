/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.yoamomibarrio.dao;

import java.util.List;

/**
 *
 * @author Matias
 */
public interface GenericDao<T>{
    
        void borrar(T objeto);
        
	T buscarPorId(Long id);
        
	void guardar (T objeto);
        
	List<T> buscarTodos();
        
	Integer contarTodos();
       
}
