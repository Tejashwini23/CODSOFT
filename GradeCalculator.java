/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradecalculator;

import java.util.Scanner;

/**
 *
 * @author Tejteju
 */
class Student
{
    int marks[];
    int sum;
    int average;
    String grade;
    int n;
    Student()
    {
        marks=new int[6];
        sum=0;
        average=0;
        grade=new String();
      
    }
    void read()
        {
            Scanner s =new Scanner(System.in);
            System.out.println("Enter the details");
            System.out.println("Enter the no of subjects");
            n=s.nextInt();
            System.out.println("Enter the marks obtained in each subject");
            for(int i=0;i<n;i++)
            {
                marks[i]=s.nextInt();
            }
            
        }
    void totalmarks()
    {
       for(int i=0;i<n;i++)
       {
           sum = sum+marks[i];
       }
    }
    void average()
    {
      average=sum/n;
    }
    public void gradecalculate()
    {
        if(average>=90)
        {
            System.out.println("The students has obtained  a A grade");
        }
        else if(average>=80&&average<=89)
                {
                    System.out.println("The students has obtained  a B grade");
                }
        else if(average>=60&&average<=79)
        {
            System.out.println("The students has obtained  a C grade");
        }
        else if(average>=40 && average<=59)
        {
            System.out.println("The students has obtained  a D grade");
        
        }
        else
        {
            System.out.println("The students has obtained  a F grade");
            
        }
    }
    void display()
    {
        System.out.println("The summary of the students performance is:");
        System.out.println("The marks are:");
        for(int i=0;i<n;i++)
        {
            System.out.println( marks[i]);
        }
        System.out.println("The sum of all the subjects is:"+ sum );
        System.out.println("The average is "+average + "Percentage");
        
    }
}
public class GradeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s=new Student();
        s.read();
        s.totalmarks();
        s.average();
        s.display();
        s.gradecalculate();
        
    }
    
}
