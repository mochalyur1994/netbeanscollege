/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Al
 */
public class search_engineNGTest {
    
    public search_engineNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of main method, of class search_engine.
     */
    @Test
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String value=jTextArea1.getText();
        String lvalue=value.toLowerCase();
        String ltvalue=lvalue.replaceAll(" ","+");
        String ltfvalue=lvalue.replaceAll(" ","%20");
        if(jRadioButton1.isSelected())
        {
            if(jRadioButton1.isSelected()&&jComboBox1.getSelectedIndex()==0)
            {
                try {
                    String url="https://www.google.co.in/search?q="+ltvalue;
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (IOException ex) {
                    Logger.getLogger(search_engine.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(jRadioButton1.isSelected()&&jComboBox1.getSelectedIndex()==1)
            {
                try {
                    String url="https://duckduckgo.com/?q="+ltvalue;
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (IOException ex) {
                    Logger.getLogger(search_engine.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(jRadioButton1.isSelected()&&jComboBox1.getSelectedIndex()==2)
            {
                try {
                    String url="https://in.search.yahoo.com/search?p="+ltvalue;
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (IOException ex) {
                    Logger.getLogger(search_engine.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(jRadioButton1.isSelected()&&jComboBox1.getSelectedIndex()==3)
            {
                try {
                    String url="https://www.bing.com/search?q="+ltvalue;
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (IOException ex) {
                    Logger.getLogger(search_engine.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Please choose any of the Following\nXD");
            }
        }
        else if(jRadioButton2.isSelected())
        {
            if(jRadioButton2.isSelected()&&jComboBox2.getSelectedIndex()==0)
            {
                try {
                    String url="https://www.facebook.com/search/top/?q="+ltfvalue+"%20";
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (IOException ex) {
                    Logger.getLogger(search_engine.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(jRadioButton2.isSelected()&&jComboBox2.getSelectedIndex()==1)
            {
                try {
                    String url="https://twitter.com/search?q="+ltvalue;
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (IOException ex) {
                    Logger.getLogger(search_engine.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(jRadioButton2.isSelected()&&jComboBox2.getSelectedIndex()==2)
            {
                try {
                    String url="https://www.instagram.com/"+ltvalue;
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (IOException ex) {
                    Logger.getLogger(search_engine.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(jRadioButton2.isSelected()&&jComboBox2.getSelectedIndex()==3)
            {
                try {
                    String url="https://www.youtube.com/results?search_query="+ltvalue;
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (IOException ex) {
                    Logger.getLogger(search_engine.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Please choose any of the Following\nXD");
            }
        }
        else if(jRadioButton3.isSelected())
        {
            if(jRadioButton3.isSelected()&&jComboBox3.getSelectedIndex()==0)
            {
                try {
                    String url="https://www.quora.com/search?q="+ltvalue;
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (IOException ex) {
                    Logger.getLogger(search_engine.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(jRadioButton3.isSelected()&&jComboBox3.getSelectedIndex()==1)
            {
                try {
                    String url="https://medium.com/search?q="+ltvalue;
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                } catch (IOException ex) {
                    Logger.getLogger(search_engine.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Please choose any of the Following\nXD");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please select any one of the radio button\nXD");
        }
    }     
    }
    
}
