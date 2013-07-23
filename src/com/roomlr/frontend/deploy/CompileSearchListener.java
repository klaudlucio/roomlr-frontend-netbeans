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
        id = "com.roomlr.frontend.deploy.CompileSearchListener")
@ActionRegistration(
        iconBase = "com/roomlr/frontend/deploy/happy-icon.png",
        displayName = "#CTL_CompileSearchListener")
@ActionReference(path = "Toolbars/Deploy", position = -100)
@Messages("CTL_CompileSearchListener=Compile Search")
public final class CompileSearchListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Process process = null;
        try {
            // TODO implement action body
            process = Runtime.getRuntime().exec("python /home/user/NetBeansProjects/roomlr-frontend-dev/deploy/compile-search.py");
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }
}
