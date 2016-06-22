package javaapplication1;

import java.util.Arrays;
import java.util.List;
import java.awt.*;
import java.util.Random;
import javax.swing.*;
/**
 *
 * @author Kevin
 */
public class RandomGenerator extends JFrame{
    
    JTable table;
    
    public RandomGenerator() {
        setLayout(new FlowLayout());
        String[] columnNames = {"Name","Dates"}; 
        String[] classMates = {"David Betancourt","Zachary Bolden","Randy Brown","Jeff Cain","Chris Clifton","Ethan Crotwell",
            "David Levy","Albert Gonzalez","Shawn Gore","Joshua Jones","Kevin Love","Micheal Markley","Ryan Moody","Tam Nguyen",
            "Cory Policht","Johnathan Reyna","Jacob Riojas","Bo Ritter","Brett Smith","Brian Witucki"};
        String[] dateGroups = {"27 June - 1 July","4 July - 8 July","11 July - 15 July","18 July - 22 July","25 July - 29 July",
            "1 August - 5 August","8 August - 12 August","15 August - 19 August","22 August - 26 August","29 August - 2 September",
        "5 September - 9 September","12 Septemeber - 16 September","19 Septemeber - 23 September","26 September - 30 September"
        ,"3 October - 7 October","10 October - 14 October","17 October - 21 October","24 October - 28 October","31 October - 4 November",
        "7 November - 11 November"};
       
       List<String> names = Arrays.asList(classMates);
       List<String> dates = Arrays.asList(dateGroups);
       String anyDate = "";
       String anyName = "";
       for (int j = 0; j <=names.size();j++){
       int i = new Random().nextInt(dates.size());
       anyDate = dates.get(i);
       
       int index = new Random().nextInt(names.size()); 
       anyName = names.get(index);
       }
       
       
       Object[][] data = {{anyName,anyDate},{anyName,anyDate},{anyName,anyDate},{anyName,anyDate},{anyName,anyDate},{anyName,anyDate},
       {anyName,anyDate},{anyName,anyDate},{anyName,anyDate},{anyName,anyDate},{anyName,anyDate},{anyName,anyDate},{anyName,anyDate},
       {anyName,anyDate},{anyName,anyDate},{anyName,anyDate},{anyName,anyDate},{anyName,anyDate},{anyName,anyDate},{anyName,anyDate},};
       
        table = new JTable(data, columnNames);
       
        table.setPreferredScrollableViewportSize(new Dimension(340,330));
        table.setFillsViewportHeight(true);// look up to see what this does
        
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
    }
    public static void main(String args[]){
        RandomGenerator gui = new RandomGenerator();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(400,400);
        gui.setVisible(true);
        gui.setTitle("Daily Standup Chart");
    }
}
