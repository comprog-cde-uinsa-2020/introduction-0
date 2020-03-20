/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import static app.InputData.coronaChart;
import static app.InputData.lState;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author webme
 */

public class InputChartPlot extends ApplicationFrame implements ActionListener{
  
    // no. 5  
  // JTextField 
  static JTextField tfState;
  static JTextField tfPatient;
  // no. 5
  
  // no. 6
  // JButton 
  static JButton bSubmit; 

  // label to display text 
  static JLabel lState; 
  static JLabel lPatient; 
  // no. 6
  
  // no.7
  // put variable array in here  
  static String state;
  static String patient;
  // no.7  
  
  public InputChartPlot(String title, String chartTitle, JFreeChart lineChart) {
    super(title);
    
        // create a label to display text 
      lState = new JLabel("nothing entered of state's corona"); 
      lPatient = new JLabel("nothing entered of patient's corona"); 

      // create a new button 
      bSubmit = new JButton("submit");  

      // create a object of JTextField with 16 columns and a given initial text 
      tfState = new JTextField("State", 16); 
      tfPatient = new JTextField("Patient", 16); 

      // create a panel to add buttons and textfield 
      JPanel panel = new JPanel(); 
    
      ChartPanel chartPanel = new ChartPanel(lineChart);
      chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );
      
      // add buttons and textfield to panel 
      panel.add(tfState);
      panel.add(tfPatient);
      panel.add(bSubmit); 
      panel.add(lState);
      panel.add(lPatient);
      panel.add(chartPanel);
    
      setContentPane(panel);
    }  
  
    @Override
    public void actionPerformed(ActionEvent e) {

      // no. 4      
      String s = e.getActionCommand(); 
      if (s.equals("submit")) { 
        state = tfState.getText();
        patient = tfPatient.getText();

        lState.setText(tfState.getText());
        lPatient.setText(tfPatient.getText());

        // set the text of field to blank 
        tfState.setText("  ");
        tfPatient.setText("  ");
      }
      // no. 4
    }
    
    public static void main(String[] args) {
      // TODO code application logic here

      // put code of ChartPlot.java and InputData.java in here
      // check all error code make sure no error code 

      String[] listState = state.split(",");
      
      String[] tmpPatient = patient.split(",");
      
      int[] listPatient = new int[tmpPatient.length];
      
      DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    
      for (int i = 0; i < listState.length; i++){
        dataset.addValue(listPatient[i], "corona" , listState[i]);
      }
      
      JFreeChart lineChart = ChartFactory.createLineChart(
        "Corona",
        "Patient of Corona","State of Corona",
        dataset,
        PlotOrientation.VERTICAL,
        true,true,false);
        
      
      // create a object of the text class 
      // no. 1    
      InputChartPlot chart = new InputChartPlot("Corona in the World", 
              "Country Of Corona", lineChart
      );

      chart.pack( );
      RefineryUtilities.centerFrameOnScreen(chart);
      chart.setVisible(true); 

      // addActionListener to button 
      bSubmit.addActionListener(chart);
    }
}
