/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.yoamomibarrio.action.local;

import ar.com.yoamomibarrio.dao.GenericDao;
import ar.com.yoamomibarrio.dao.impl.LocalDao;
import ar.com.yoamomibarrio.model.Local;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.actions.DispatchAction;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

/**
 *
 * @author Matias
 */
public class LocalAction extends DispatchAction {

    private final static String LOCAL = "local";

    
    public ActionForward getLocal(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        try{
        LocalDao localDao = new LocalDao();      
        Local local = (Local) localDao.buscarPorId(Long.parseLong(request.getParameter("idLocal")));
            request.setAttribute("local", local);            
            request.setAttribute("listaFotos", localDao.getFotos(this.getServlet().getServletContext().getRealPath("/img/locales/"+local.getIdLocal())));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return mapping.findForward(LOCAL);
    }

   
}
