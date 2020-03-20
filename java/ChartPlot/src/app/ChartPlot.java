 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

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
public class ChartPlot extends ApplicationFrame{

  
  public ChartPlot(String appTitle, String chartTitle, String[] label, int[] patient) {
    super(appTitle);
    
    JFreeChart lineChart = ChartFactory.createLineChart(
            chartTitle,
            "Patient of Corona","State of Corona",
            createDataset(label, patient),
            PlotOrientation.VERTICAL,
            true,true,false);
         
      ChartPanel chartPanel = new ChartPanel( lineChart );
      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
      setContentPane( chartPanel );
  }
  
  private DefaultCategoryDataset createDataset(String[] label, int[] patient) {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    
    for (int i = 0; i < label.length; i++){
      dataset.addValue(patient[i], "corona" , label[i]);
    }
    
    return dataset;
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    String[] state = new String[]{"Cina", "Amerika"};
    int[] patient = new int[]{10, 100};
    
    ChartPlot chart = new ChartPlot("Corona in the World", "Country Of Corona", state, patient);

    chart.pack( );
    RefineryUtilities.centerFrameOnScreen(chart);
    chart.setVisible(true);
  
  }
  
}
