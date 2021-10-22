/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resource;

import DatAccess.Albums;
import DatAccess.Controllers;
import DatAccess.Genres;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Claudio Sánchez Juárez
 */
public class Operations extends javax.swing.JFrame {

    public static void comboBoxG(JComboBox jComboBoxG, JTextField jTextField) {
        Controllers controller = new Controllers();
        int item = Integer.parseInt(jComboBoxG.getSelectedItem().toString());
        List data = controller.selectAll();
        Iterator it = data.iterator();

        while (it.hasNext()) {
            Genres g = (Genres) it.next();
            if (g.getId() == item) {
                jTextField.setText(g.getName());
            }
        }
    }

    public static int comboBoxGI(JComboBox jComboBoxG) {
        Controllers controller = new Controllers();
        String name = jComboBoxG.getSelectedItem().toString();
        int id = 0;
        List data = controller.selectAll();
        Iterator it = data.iterator();

        while (it.hasNext()) {
            Genres g = (Genres) it.next();
            if (g.getName().equals(name)) {
                id = g.getId();
            }
        }
        return id;
    }

    public static void comboBoxA(JComboBox jComboBoxA, JTextField jTextField1, JTextField jTextField2, JTextField jTextField3) {
        Controllers controller = new Controllers();
        int item = Integer.parseInt(jComboBoxA.getSelectedItem().toString());
        List data = controller.selectAllA();
        Iterator it = data.iterator();

        while (it.hasNext()) {
            Albums a = (Albums) it.next();
            if (a.getId() == item) {
                jTextField1.setText(a.getName());
                jTextField2.setText(a.getAuthor());
                jTextField3.setText(String.valueOf(a.getGenres().getId()));
            }
        }
    }

    public static void fillComboBox(JComboBox jComboBoxG) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        jComboBoxG.setModel(model);

        Controllers controller = new Controllers();
        List data = controller.selectAll();
        Iterator it = data.iterator();

        while (it.hasNext()) {

            Genres g = (Genres) it.next();

            jComboBoxG.addItem(g.getId().toString());

        }
    }

    public static void fillComboBoxGN(JComboBox jComboBoxG) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        jComboBoxG.setModel(model);

        Controllers controller = new Controllers();
        List data = controller.selectAll();
        Iterator it = data.iterator();

        while (it.hasNext()) {

            Genres g = (Genres) it.next();

            jComboBoxG.addItem(g.getName());

        }
    }

    public static void fillComboBoxA(JComboBox jComboBoxG) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        jComboBoxG.setModel(model);

        Controllers controller = new Controllers();
        List data = controller.selectAllA();
        Iterator it = data.iterator();

        while (it.hasNext()) {

            Albums a = (Albums) it.next();

            jComboBoxG.addItem(a.getId().toString());

        }
    }

}
