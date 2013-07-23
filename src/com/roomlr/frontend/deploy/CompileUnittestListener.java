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
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Build",
        id = "com.roomlr.frontend.deploy.CompileUnittestListener")
@ActionRegistration(
        iconBase = "com/roomlr/frontend/deploy/stupid-icon.png",
        displayName = "#CTL_CompileUnittestListener")
@ActionReferences({
    @ActionReference(path = "Toolbars/Deploy", position = -200),
    @ActionReference(path = "Shortcuts", name = "DS-T")
})
@Messages("CTL_CompileUnittestListener=Compile Unit Test")
public final class CompileUnittestListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Process process = null;
        try {            
            process = Runtime.getRuntime().exec("python /home/user/NetBeansProjects/roomlr-frontend-dev/deploy/compile-unittest-js.py");
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }
}
