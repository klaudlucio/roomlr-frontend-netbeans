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
        category = "Build",
        id = "com.roomlr.frontend.deploy.CompileIntegrationTest")
@ActionRegistration(
        iconBase = "com/roomlr/frontend/deploy/cat-icon.png",
        displayName = "#CTL_CompileIntegrationTest")
@ActionReference(path = "Toolbars/Deploy", position = -50)
@Messages("CTL_CompileIntegrationTest=Compile For Integration Tests (both dev and test including tests)")
public final class CompileIntegrationTest implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Process process = null;
        try {
            // TODO implement action body
            process = Runtime.getRuntime().exec("python /home/user/NetBeansProjects/roomlr-frontend-test/deploy/full-deploy.py");
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }
}
