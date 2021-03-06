/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2004, by Object Refinery Limited and Contributors.
 *
 * Project Info:  http://www.jfree.org/jfreechart/index.html
 *
 * This library is free software; you can redistribute it and/or modify it under the terms
 * of the GNU Lesser General Public License as published by the Free Software Foundation;
 * either version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * library; if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA 02111-1307, USA.
 *
 * [Java is a trademark or registered trademark of Sun Microsystems, Inc. 
 * in the United States and other countries.]
 *
 * --------------------
 * DynamicDataDemo.java
 * --------------------
 * (C) Copyright 2002-2004, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited).
 * Contributor(s):   -;
 *
 * $Id: DynamicDataDemo.java,v 1.12 2004/05/07 16:09:03 mungady Exp $
 *
 * Changes
 * -------
 * 28-Mar-2002 : Version 1 (DG);
 *
 */

package app;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 * A demonstration application showing a time series chart where you can dynamically add
 * (random) data by clicking on a button.
 *
 */
public class InputChartPlot extends ApplicationFrame implements ActionListener {
    
    private String[] label;
    private String[] patient;
    
    public TextField tfLabel;
    public TextField tfPatient;
    public JLabel titleForm;

    private void setLabel(String label) {
      String[] tmpLabel = label.split(",");
      for (int i = 0; i < tmpLabel.length; i++) {
        label = tmpLabel[i];      
      }
    }
    
    private String[] getLabel() {
      return label;
    }

    private void setPatient(String patient) {
      String[] tmpPatient = patient.split(",");
      for (int i = 0; i < tmpPatient.length; i++) {
        patient = tmpPatient[i];      
      }
    }

    private String[] getPatient() {
      return patient;
    }
    
    private DefaultCategoryDataset createDataset(String[] label, String[] patient) {
      DefaultCategoryDataset dataset = new DefaultCategoryDataset();
      
      System.out.println(label);
      System.out.println(patient);
      
      String[] tmpLabel = new String[label.length];
      String[] tmpPatient = new String[patient.length];
      
      System.out.println(tmpLabel);
      System.out.println(tmpPatient);
      
      for (int i = 0; i < tmpLabel.length; i++){
        dataset.addValue(Integer.parseInt(tmpPatient[i]), "corona" , tmpLabel[i]);
      }
    
      return dataset;
    }
   
    /**
     * Constructs a new demonstration application.
     *
     * @param title  the frame title.
     */
    public InputChartPlot(final String title) {
        super(title);
                
        System.out.println(createDataset(getLabel(), getPatient()));
        
        if (getLabel().equals(null) && getPatient().equals(null)) {

          titleForm = new JLabel("Input Data Corona");
          tfLabel = new TextField("Input state");
          tfPatient = new TextField("Input patient");
          final JButton btnShowCorona = new JButton("Show Data Corona");
          btnShowCorona.setActionCommand("ADD_DATA");
          btnShowCorona.addActionListener(this);

          final JPanel inputForm = new JPanel(new FlowLayout());
          inputForm.add(titleForm);
          inputForm.add(tfLabel);
          inputForm.add(tfPatient);
          inputForm.add(btnShowCorona);

          final JPanel content = new JPanel(new BorderLayout());
          setContentPane(content);
        } else {
          final JFreeChart chart = createChart((XYDataset) createDataset(getLabel(), getPatient()));

          final ChartPanel chartPanel = new ChartPanel(chart);
          final JLabel titleForm = new JLabel("Input Data Corona");
          final TextField tfLabel = new TextField("Input state");
          final TextField tfPatient = new TextField("Input patient");
          final JButton btnShowCorona = new JButton("Show Data Corona");
          btnShowCorona.setActionCommand("ADD_DATA");
          btnShowCorona.addActionListener(this);

          final JPanel inputForm = new JPanel(new FlowLayout());
          inputForm.add(titleForm);
          inputForm.add(tfLabel);
          inputForm.add(tfPatient);
          inputForm.add(btnShowCorona);

          final JPanel content = new JPanel(new BorderLayout());
          content.add(chartPanel, BorderLayout.NORTH);
          content.add(inputForm, BorderLayout.SOUTH);
          chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
          setContentPane(content);
        }
        
    }

    /**
     * Creates a sample chart.
     * 
     * @param dataset  the dataset.
     * 
     * @return A sample chart.
     */
    private JFreeChart createChart(final XYDataset dataset) {
        final JFreeChart result = ChartFactory.createTimeSeriesChart(
            "Dynamic Data Demo", 
            "Time", 
            "Value",
            dataset, 
            true, 
            true, 
            false
        );
        
        final XYPlot plot = result.getXYPlot();
        ValueAxis axis = plot.getDomainAxis();
        axis.setAutoRange(true);
        axis.setFixedAutoRange(60000.0);  // 60 seconds
        axis = plot.getRangeAxis();
        axis.setRange(0.0, 200.0); 
        return result;
    }
    
    // ****************************************************************************
    // * JFREECHART DEVELOPER GUIDE                                               *
    // * The JFreeChart Developer Guide, written by David Gilbert, is available   *
    // * to purchase from Object Refinery Limited:                                *
    // *                                                                          *
    // * http://www.object-refinery.com/jfreechart/guide.html                     *
    // *                                                                          *
    // * Sales are used to provide funding for the JFreeChart project - please    * 
    // * support us so that we can continue developing free software.             *
    // ****************************************************************************
    
    /**
     * Handles a click on the button by adding new (random) data.
     *
     * @param e  the action event.
     */
    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getActionCommand().equals("ADD_DATA")) {
          
          setLabel(tfLabel.getText());
          setPatient(tfPatient.getText());
        }
    }

    /**
     * Starting point for the demonstration application.
     *
     * @param args  ignored.
     */
    public static void main(final String[] args) {

        final InputChartPlot demo = new InputChartPlot("Dynamic Data Demo");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }

}
