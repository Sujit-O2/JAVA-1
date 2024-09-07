import java.io.*;
import java.util.Calendar;

public class calendarja {
    public static void main(String[] args) throws Exception {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int year,month,date;
      String hh=br.readLine();
      month=Integer.parseInt(hh.substring(0,2));
      date=Integer.parseInt(hh.substring(3,5));
      year=Integer.parseInt(hh.substring(6));
      Calendar cc= Calendar.getInstance();
      cc.set(year,month-1,date);
      int day=cc.get(Calendar.DAY_OF_WEEK);
      switch(day){
    case 1:{
    System.out.println("SUNDAY");
    break;}
     case 2:{
   System.out.println("MONDAY");
    break;}
     case 3:{
  System.out.println("TUESDAY");
    break;}
     case 4:{
  System.out.println("WEDNESDAY");
    break;}
    case 5:{
    System.out.println("THURSDAY");
    break;}
    case 6:{
    System.out.println("FRIDAY");
    break;}
    case 7:{
    System.out.println("SATURDAY");
    break;}}
}}
