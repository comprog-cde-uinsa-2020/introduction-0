/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author webme
 */
public class InputData extends JFrame implements ActionListener{
  
  // no. 5  
  // JTextField 
  static JTextField tfState;
  static JTextField tfPatient;
  // no. 5

  // JFrame 
  static JFrame coronaChart; 

  // no. 6
  // JButton 
  static JButton bSubmit; 

  // label to display text 
  static JLabel lState; 
  static JLabel lPatient; 
  // no. 6
  
  // default constructor 
  InputData() { } 
  
  // main class 
  public static void main(String[] args) { 
    // create a new frame to store text field and button 
    coronaChart = new JFrame("Corona Chart"); 

    // no.7    
    // create a label to display text 
    lState = new JLabel("nothing entered of state's corona"); 
    lPatient = new JLabel("nothing entered of patient's corona"); 

    // create a new button 
    bSubmit = new JButton("submit"); 

    // create a object of the text class 
    InputData te = new InputData(); 

    // addActionListener to button 
    bSubmit.addActionListener(te); 

    // create a object of JTextField with 16 columns and a given initial text 
    tfState = new JTextField("State", 16); 
    tfPatient = new JTextField("Patient", 16); 

    // create a panel to add buttons and textfield 
    JPanel panel = new JPanel(); 

    // add buttons and textfield to panel 
    panel.add(tfState);
    panel.add(tfPatient);
    panel.add(bSubmit); 
    panel.add(lState);
    panel.add(lPatient);
    // no.7

    // add panel to frame 
    coronaChart.add(panel); 

    // set the size of frame 
    coronaChart.setSize(300, 300); 

    coronaChart.show(); 
  } 
  
    // if the vutton is pressed 
  @Override
  public void actionPerformed(ActionEvent e) { 
      // no. 4    
      String s = e.getActionCommand(); 
      if (s.equals("submit")) { 
          // set the text of the label to the text of the field 
          lState.setText(tfState.getText());
          lPatient.setText(tfPatient.getText());

          // set the text of field to blank 
          tfState.setText("  ");
          tfPatient.setText("  ");
      }
      // no. 4
  } 
}
