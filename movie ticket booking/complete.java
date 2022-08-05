package phase1.project;

import java.util.Scanner;

public class complete 
{
	
	dates d1= new dates();
	dates d2= new dates();
	dates d3= new dates();
	dates d4= new dates();
	dates d5= new dates();
	dates d6= new dates();
	dates d7= new dates();
public  void call()
{
	Scanner s = new Scanner(System.in);
	
	char ch;
	do{
	System.out.println("MOVIE DATES :  10TH-AUG-2022  TO     16TH-AUG-2022 ");
	int day;
	day =s.nextInt();
if(day==10)
{
	d1.date();
}
else if(day==11)
{
	d2.date();
}
else if(day==12)
{
	d3.date();
}
else if(day==13)
{
	d4.date();
}
else if(day==14)
{
	d5.date();
}
else if(day==15)
{
	d6.date();
}
else if(day==16)
{
	d7.date();
}
else
{
System.out.println("Invalid Date");	
}
System.out.println("::::::::::  WANNA BOOK ANY OTHER MOVIE TIMING  :::::::::::: PRESS (Y/y)");
ch = s.next().charAt(0);

	}while(ch=='y'||ch=='Y');




}
}
