package com.myapp.theagrim.agrimaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class pieChart extends AppCompatActivity {

    int  attendence1[]={9,4};
    int  attendence2[]={4,3};
    int  attendence3[]={9,5};
    int  attendence4[]={9,42};
    int  attendence5[]={93,45};
    String went[]={"present","absent"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);
        setupPieChart();
    }

    private void setupPieChart() {
        List<PieEntry> pie =new ArrayList<>();
        for(int i=0;i<attendence1.length;i++)
        {
            pie.add(new PieEntry(attendence1[i],went[i]));
        }
        PieDataSet dataset =new PieDataSet(pie,"your attendence");
        dataset.setColors(ColorTemplate.COLORFUL_COLORS);
        PieData data =new PieData(dataset);

        PieChart chart=findViewById(R.id.char1);
        chart.setData(data);
        chart.animate();
        chart.invalidate();

        //1st pie

        List<PieEntry> pie2 =new ArrayList<>();
        for(int i=0;i<attendence2.length;i++)
        {
            pie2.add(new PieEntry(attendence2[i],went[i]));
        }
        PieDataSet dataset2 =new PieDataSet(pie2,"your attendence");
        dataset2.setColors(ColorTemplate.COLORFUL_COLORS);
        PieData data2 =new PieData(dataset2);


        PieChart chart2=findViewById(R.id.char2);
        chart2.setData(data2);
        chart2.animate();
        chart2.invalidate();


        //2nd pie

        List<PieEntry> pie3 =new ArrayList<>();
        for(int i=0;i<attendence3.length;i++)
        {
            pie3.add(new PieEntry(attendence3[i],went[i]));
        }
        PieDataSet dataset3 =new PieDataSet(pie3,"your attendence");
        dataset3.setColors(ColorTemplate.COLORFUL_COLORS);
        PieData data3 =new PieData(dataset3);


        PieChart chart3=findViewById(R.id.char3);
        chart3.setData(data3);
        chart3.animate();
        chart3.invalidate();



        //3rd


        List<PieEntry> pie4 =new ArrayList<>();
        for(int i=0;i<attendence4.length;i++)
        {
            pie4.add(new PieEntry(attendence4[i],went[i]));
        }
        PieDataSet dataset4 =new PieDataSet(pie4,"your attendence");
        dataset4.setColors(ColorTemplate.COLORFUL_COLORS);
        PieData data4 =new PieData(dataset4);


        PieChart chart4=findViewById(R.id.char4);
        chart4.setData(data4);
        chart4.animate();
        chart4.invalidate();

        //4th

        List<PieEntry> pie5 =new ArrayList<>();
        for(int i=0;i<attendence5.length;i++)
        {
            pie5.add(new PieEntry(attendence5[i],went[i]));
        }
        PieDataSet dataset5 =new PieDataSet(pie5,"your attendence");
        dataset5.setColors(ColorTemplate.COLORFUL_COLORS);
        PieData data5 =new PieData(dataset5);


        PieChart chart5=findViewById(R.id.char5);
        chart5.setData(data5);
        chart5.animate();
        chart5.invalidate();


    }
}