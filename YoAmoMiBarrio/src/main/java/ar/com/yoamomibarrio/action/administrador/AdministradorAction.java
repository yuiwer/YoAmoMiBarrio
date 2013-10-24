/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.yoamomibarrio.action.administrador;

import ar.com.yoamomibarrio.action.CommonAction;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

/**
 *
 * @author Matias
 */
public class AdministradorAction  extends CommonAction {

   
    public ActionForward myAction1(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        System.out.println("2");
        return mapping.findForward("");
    }
}