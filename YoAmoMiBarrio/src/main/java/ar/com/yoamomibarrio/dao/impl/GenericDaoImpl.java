/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.yoamomibarrio.dao.impl;

import ar.com.yoamomibarrio.dao.GenericDao;
import ar.com.yoamomibarrio.dao.HibernateUtil;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Matias
 */
public abstract class GenericDaoImpl<T> implements GenericDao<T>{
    
	private Class<T> type;
	
	protected Class<T> getType()
	{
		return this.type;
	}
	
	protected String getClassName()
	{
		return type.getName();
	}

	@SuppressWarnings("unchecked")
	public GenericDaoImpl()
	{
		Type t = getClass().getGenericSuperclass();
		//ParameterizedType pt = (ParameterizedType) t;
                System.out.println(t);
		type = (Class)t;
	}

	
        @Override
	public void borrar(T objeto)
	{
		getHibernateSession().delete(objeto);
	}

	
        @Override
	public T buscarPorId (Long id)
	{
		return (T)getHibernateSession().load(type, id);
	}

	
        @Override
	public void guardar (T objeto)
	{
		getHibernateSession().saveOrUpdate(objeto);
	}
	
	@Override
	public List<T> buscarTodos()
	{
		return getHibernateSession().createCriteria(type.getName()).list();
	}
	
	
        @Override
	public Integer contarTodos()
	{
		return getHibernateSession().createCriteria(type.getName()).list().size();
	}

	protected Session getHibernateSession(){
             return HibernateUtil.getSessionFactory().openSession();
	}
}
