/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.yoamomibarrio.dao.impl;

import ar.com.yoamomibarrio.model.Local;
import java.io.File;

/**
 *
 * @author Matias
 */
public class LocalDao extends GenericDaoImpl<Local>{
        
    public String[] getFotos(String path){
        File files = new File(path);
        return files.list();
    }
    
}
