/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.yoamomibarrio.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
        
/**
 *
 * @author Matias
 */
public abstract class CommonAction extends DispatchAction {

    
    protected static  String DISPATCH ;

   
    
    @Override
   public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        DISPATCH=request.getParameter("do");
       this.dispatchMethod(mapping, form, request, response, DISPATCH);
        System.out.println("1");
       return null;
    }
}
