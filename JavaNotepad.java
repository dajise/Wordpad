/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanotepad;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.BorderLayout;
/**
 *
 * @author saurav
 */
public class JavaNotepad extends JFrame{
    
    //all objects are to be declared globally
    JTextArea mainarea;
    JMenuBar mbar;
    
    //For uppermost File, Edit, Format and Help options:
    JMenu menuFile, menuEdit, menuFormat, menuHelp;
    
    //Options provided by the menuFile object, i.e. click on File:
    JMenuItem itemNew, itemOpen, itemSave;
    
//constructor:
    public JavaNotepad() {
        initComponent();
    }
    
    private void initComponent(){
        JTextArea mainarea = new JTextArea();
        getContentPane().add(mainarea);
        getContentPane().add(new JScrollPane(mainarea), BorderLayout.CENTER);
        setTitle("Untitled Notepad"); // title of initial tab
        setSize(800, 600); //size of initial tab
        //objects definitions here:
        //Menu bar:
        mbar = new JMenuBar();
        //Menu:
        menuFile = new JMenu("File");
        menuEdit = new JMenu("Edit");
        menuFormat = new JMenu("Format");
        menuHelp = new JMenu("Help");
       
        //add icon to menu item
        ImageIcon saveIcon = new ImageIcon(getClass().getResource("/img/notepad.gif"));
        ImageIcon newIcon = new ImageIcon(getClass().getResource("/img/new.gif"));
        ImageIcon openIcon = new ImageIcon(getClass().getResource("/img/open.gif"));
        
//Menu items:
        itemNew = new JMenuItem("New", newIcon);
        itemSave = new JMenuItem("Save", saveIcon);
        itemOpen = new JMenuItem("Open", openIcon);
       
        //link each of above object to their respective services: 
        //add Menu items:
        menuFile.add(itemNew);
        menuFile.add(itemOpen);
        menuFile.add(itemSave);
        
        //add menu items to menu bar:
        mbar.add(menuFile);
        mbar.add(menuEdit);
        mbar.add(menuFormat);
        mbar.add(menuHelp);
        
        //add menu bar to frame:
        setJMenuBar(mbar);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JavaNotepad jn = new JavaNotepad();
    }
    
}
