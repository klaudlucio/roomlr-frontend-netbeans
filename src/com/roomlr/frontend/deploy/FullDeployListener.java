/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roomlr.frontend.deploy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Deploy",
        id = "com.roomlr.frontend.deploy.DeployListener")
@ActionRegistration(
        iconBase = "com/roomlr/frontend/deploy/foolish-icon.png",
        displayName = "#CTL_DeployListener")
@ActionReference(path = "Toolbars/Deploy", position = 0)
@Messages("CTL_DeployListener=Full deploy (both dev and stable including tests)")
public final class FullDeployListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Process process = null;
        try {
            // TODO implement action body
            process = Runtime.getRuntime().exec("python /home/user/NetBeansProjects/roomlr-frontend/deploy/full-deploy.py");
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }
}
