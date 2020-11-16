import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.EventQueue;

import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.*;


public class BarChart extends JFrame {

    public BarChart() {

        initUI();
    }

    private void initUI() {

        CategoryDataset dataset = createDataset();

        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(20, 15, 20, 15));
        chartPanel.setBackground(Color.white);
        add(chartPanel);

        pack();
        setTitle("My Bar chart");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private CategoryDataset createDataset() {

        var dataset = new DefaultCategoryDataset();
        dataset.setValue(78, "2012", "Printers");
        dataset.setValue(13, "2013", "Printers");
        dataset.setValue(90, "2014", "Printers");
        dataset.setValue(14, "2015", "Printers");
        dataset.setValue(12, "2012", "Monitor");
        dataset.setValue(10, "2013", "Monitor");
        dataset.setValue(17, "2014", "Monitor");
        dataset.setValue(15, "2015", "Monitor");
        dataset.setValue(20, "2012", "Desktop Computers");
        dataset.setValue(12, "2013", "Desktop Computers");
        dataset.setValue(13, "2014", "Desktop Computers");
        dataset.setValue(12, "2015", "Desktop Computers");
        dataset.setValue(34, "2012", "Laptop");
        dataset.setValue(45, "2013", "Laptop");
        dataset.setValue(40, "2014", "Laptop");
        dataset.setValue(39, "2015", "Laptop");
        
        
        return dataset;
    }

    private JFreeChart createChart(CategoryDataset dataset) {

        JFreeChart barChart = ChartFactory.createBarChart("","","",dataset,
                PlotOrientation.VERTICAL,
                true, true, false);
        return barChart;
    }
    
    
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new BarChart();
            ex.setVisible(true);
        });
    }
}
