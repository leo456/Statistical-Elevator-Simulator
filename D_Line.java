/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exponn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/**
 *
 * @author Suleman
 */


public class D_Line  extends Application {

int person_count;
static ArrayList<People> g_ind_delays = new ArrayList<People>();

 public static void setMyVariable(String myVariable) {
     //   MyClass.myVariable = myVariable;
 //= myVariable;   
 }
public void bulao (ArrayList<People> g_ind , int count)
{
D_Line.g_ind_delays = g_ind;   
     System.out.println("bulao"+g_ind_delays.size());
        person_count = count;
sort();
for(int  i = 0 ;  i < g_ind_delays.size() ; i++)
{        System.out.println(g_ind_delays.get(i).ab_ar_tm);
    }
//launch(args);
}

public void sort()
{
    Collections.sort(g_ind_delays, new Comparator<People>() {
    @Override
    public int compare(People c1, People c2) {
        return Double.compare(c1.ab_ar_tm, c2.ab_ar_tm);
    }
});
    System.out.println("sorted");
}

  public void main(String[] args) {
    launch(args);
    //  System.out.println("main");
  }

  //@Override
  public void start(Stage primaryStage  ) {
    CategoryAxis xAxis = new CategoryAxis();
    NumberAxis yAxis = new NumberAxis();
    LineChart lineChart = new LineChart(xAxis, yAxis);
    
      System.out.println("size from start"+g_ind_delays.size());
    lineChart.setData(getChartData());
    lineChart.setTitle("Chart");
    // g_ind_delays = g_ind; 
    StackPane root = new StackPane();
    root.getChildren().add(lineChart);
    primaryStage.setScene(new Scene(root, 1366, 768));
    primaryStage.show();
  }

  private ObservableList<XYChart.Series<String, Double>> getChartData() {
    double aValue = 10;
    double cValue = 20;
    // g_ind;
    ObservableList<XYChart.Series<String, Double>> answer = FXCollections
        .observableArrayList();
    Series<String, Double> aSeries = new Series<String, Double>();
    Series<String, Double> cSeries = new Series<String, Double>();
    Series<String, Double> dSeries = new Series<String, Double>();
    Series<String, Double> sSeries = new Series<String, Double>();
    aSeries.setName("Absolute time");
    cSeries.setName("Total delay per individual");
     dSeries.setName("Ele-size");
     sSeries.setName("Stay Time");
   
// sort();
System.out.println("person"+person_count);
      System.out.println("size from getchar" + g_ind_delays.size());
//for(int  i = 0 ;  i < g_ind_delays.size() ; i++)
//{        System.out.println(g_ind_delays.get(i).ab_ar_tm);
//    }

//   Collections.sort(g_ind_delays, new Comparator<People>() {
//    @Override
//    public int compare(People c1, People c2) {
//        return Double.compare(c1.ab_ar_tm, c2.ab_ar_tm);
//    }
//});
    for (int i = 0; i <g_ind_delays.size(); i++) {
      aSeries.getData().add(new XYChart.Data(Integer.toString(i),g_ind_delays.get(i).ab_ar_tm));
      //aValue = aValue + Math.random()*100 -50;
       // System.out.println("tot"+g_ind_delays.get(0).e_size);
      cSeries.getData().add(new XYChart.Data(Integer.toString(i), g_ind_delays.get(i).tot_delay));
//      cValue = cValue + Math.random()*100 -50 ;
     dSeries.getData().add(new XYChart.Data(Integer.toString(i), g_ind_delays.get(i).e_size)); 
     sSeries.getData().add(new XYChart.Data(Integer.toString(i), g_ind_delays.get(i).stay_time)); 
    }
    answer.addAll(aSeries, cSeries, dSeries, sSeries);
    return answer;
  }

}
