/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exponn;

import static java.lang.Math.random;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Suleman
 */
public class Exponn {

    /**
     * @param args the command line arguments
     */
    static boolean  ele_isMoving = false;
        static boolean c1 = false;
    static boolean c2 = false;
    static boolean c3 = false;
    static boolean c4 = false;
    static boolean c5 = false;

    static double a, sum = 0 ,time= 0;
    static int size = 0 ;
    static int ele_flr = 1;
    static boolean direc_up = false;
static double all_delays = 0;
    static boolean direc_down = false;
    
    static ArrayList<People> g_ind_delay = new ArrayList<People>();
    
    static ArrayList<People> working_person = new ArrayList<People>();
    static ArrayList<People> e1 = new ArrayList<People>();   
    static ArrayList<People> e2 = new ArrayList<People>();
    static ArrayList<People> e3 = new ArrayList<People>();
    static ArrayList<People> e4 = new ArrayList<People>();
    static ArrayList<People> e5 = new ArrayList<People>();

    static ArrayList<People> f1 = new ArrayList<People>();
    static ArrayList<People> f2 = new ArrayList<People>();
    static ArrayList<People> f3 = new ArrayList<People>();
    static ArrayList<People> f4 = new ArrayList<People>();
    static ArrayList<People> f5 = new ArrayList<People>();
    static ArrayList<People> logg = new ArrayList<People>();
    static ArrayList<People> ele = new ArrayList<People>(6);

    enum td {
        fr, se, th, fo, fif
    };
    public static void main(String[] args) {
        
        
        int count = 0;
        long seed = 12357;
        Random s = new Random();
        double sum = 0, a = 0;
     
        int my_flr;
        int nxtflr;
        ArrayList<Integer> Pasngr_cnt = new ArrayList<Integer>(6);
        double abso = 0;
        LinkedList<Integer> al = new LinkedList<Integer>();

    
        while (sum < 5) {
            a = (double) getExpo(s, 1);
            sum += a;
            
            System.out.println("s " + sum);
            abso = abso + a;
            
            People peeps = new People();
            peeps.ab_ar_tm = abso;
            peeps.my_flr = 1;
            
            logg.add(peeps);
            count++;
          //         System.out.println("count"+count);
//            if (sum <= 10)//sum > 1199 ||
//            {
//                break;
//            }
        }

        
//               
boolean first = true;       
while(time <=1200)
        {
        generation_inside();
//        if(first == true)
//        {
        if(ele.size() > 0)
        {
            move_elevator();
//            first = false;
        }
        if(ele.size() == 0 && ele_flr > 1)
        {
            move_elevator();
        }
        else if(Every_Queue_Chk() || Every_E_Chk()) // also check for e arrays
        {
            move_elevator();
        }
//        }
//        else
//            move_elevator();
//        
//String f = new DecimalFormat("#.##").format(time);
//         if(new DecimalFormat("#.##").format(time).equals(sum+""))
//         {
//             System.out.println("equal");   
//         }

//if((int)time % 60 == 0)
           //     System.out.println("TIME "+time);
        time+=0.01;
        //System.out.println("time "+time);
        }


// for delays in the queue outside the elevator
if(ele.size() > 0)
{
    for(int i = 0 ; i <  ele.size() ; i++)
    {
        all_delays+=ele.get(i).tot_delay;
    }
}
if(f1.size() > 0)
{
    for(int i = 0 ; i <  f1.size() ; i++)
    {
        all_delays+=f1.get(i).tot_delay;
    }
}
if(f2.size() > 0)
{
    for(int i = 0 ; i <  f2.size() ; i++)
    {
        all_delays+=f2.get(i).tot_delay;
    }
}
if(f3.size() > 0)
{
    for(int i = 0 ; i <  f3.size() ; i++)
    {
        all_delays+=f3.get(i).tot_delay;
    }
}
if(f4.size() > 0)
{
    for(int i = 0 ; i <  f4.size() ; i++)
    {
        all_delays+=f4.get(i).tot_delay;
    }
}
if(f5.size() > 0)
{
    for(int i = 0 ; i <  f5.size() ; i++)
    {
        all_delays+=f5.get(i).tot_delay;
    }
}
if(e1.size() > 0)
{
    for(int i = 0 ; i <  e1.size() ; i++)
    {
        all_delays+=e1.get(i).tot_delay;
    }
}
if(e2.size() > 0)
{
    for(int i = 0 ; i <  e2.size() ; i++)
    {
        all_delays+=e2.get(i).tot_delay;
    }
}if(e3.size() > 0)
{
    for(int i = 0 ; i <  e3.size() ; i++)
    {
        all_delays+=e3.get(i).tot_delay;
    }
}if(e4.size() > 0)
{
    for(int i = 0 ; i <  e4.size() ; i++)
    {
        all_delays+=e4.get(i).tot_delay;
    }
}if(e5.size() > 0)
{
    for(int i = 0 ; i <  e5.size() ; i++)
    {
        all_delays+=e5.get(i).tot_delay;
    }
}

        System.out.println("ALL delays" + all_delays);
        
//        Line abd  = new Line();
//       abd.main(args);
System.out.println("from expoon" + g_ind_delay.size());
       D_Line dL = new D_Line();//g_ind_delay, count);
        //System.out.println("from expoon" + g_ind_delay.size());
//      dL.g_ind_delays = g_ind_delay;
        dL.bulao(g_ind_delay, count);
//      dL.person_count = 2; 
      dL.main(args);
       
//ArrayList<LinkedList> Pasngr_cnt =new ArrayList<LinkedList>();
//
//do
//{
//    if(sum <= 1200)
//    {
//      Add_person();          
//    }
//    if(logg.get(0).prsnt_to_f1 == 1)
//    {
//     go_to_ele(logg.get(0));   
//    }
//    
//}
//while(Every_Queue_Chk());
//
//
//int i = 0 ;
//do
//{
//    System.out.println("sum "+sum());
//i++;
//}
//while(i <10);

int[] states = {0,0,0,0,0};
//while(true)
//{ 
//    a = (double) getExpo(s , 1);
//    sum += a;
//    System.out.println("s " + a);
//    abso = abso+a;
//    People peeps = new People();
//    
//    peeps.ab_ar_tm =abso;
//     peeps.my_flr = 1;
//    logg.add(peeps);
//    //logg.get(count).ab_ar_tm = abso;
//    count++;
//    
//    //Double.compare(a, a)
//    
//    //db p = new db();
////    my_flr=1;
//   // p.update();
////    //System.out.println("elevator is at floor "+p.output());
////   if(ele_flr == my_flr && size < 6)
////   {
////       size++;
////       nxtflr = p.getflr();
////   while(ele_flr <= nxtflr)
////   {   
////       ele_flr++;
////       
////   }
////   }
////   else
////   {
////       
////       // arraylist of type queue
////   }
//////   nxtflr = p.getflr();
//////   while(ele_flr <= nxtflr)
//////   {
//////       
//////       ele_flr++;
//////   }
//   
//    //states[p.output().ordinal()]++;
//    if(sum >= 2 )//sum > 1199 ||
//    {
//     break;   
//    }
//}
//
//
//
//
//
//       
//sum = sum-a;
//        System.out.println("sum = "+ sum);
//        System.out.println("mean "+sum/(double)(count-1));
//        System.out.println("count(total persons)"+(count));
//        sum = 0;
////        System.out.println("fr = "+states[0]+"\nse = "+states[1]
////                +"\nthird = "+states[2]+"\nfourth = "+states[3]
////        +"\nfifth = "+states[4]);    
//    
//    //clk loop
//    
////        for (int j = 0; j < logg.size() ; j++) {
////            //System.out.println("sdsd"+ logg.get(j).ab_ar_tm );     
////            //System.out.println("Clk :: "+i);
////            System.out.println("OSama :: "+(logg.get(j).ab_ar_tm));
////        }
////        
////    for(double i = 0 ; i < 800 ; i+=0.1)
////    {
////      //  System.out.println("i :: "+i);
////      
////        for (int j = 0; j < logg.size() ; j++) {
////       // System.out.println(new DecimalFormat("#.#").format(logg.get(j).ab_ar_tm));
////            if(new DecimalFormat("#.#").format(logg.get(j).ab_ar_tm).equals(new DecimalFormat("#.#").format(i)))
////         {  
////             System.out.println("true at clk="+new DecimalFormat("#.#").format(i));
////             System.out.println("Arrival :; "+new DecimalFormat("#.#").format(logg.get(j).ab_ar_tm));
////         }
////        }
////    }
//            //System.out.println("sdsd"+ logg.get(j).ab_ar_tm );     
//          /*  System.out.println("Clk :: "+i);
//            System.out.println("OSama :: "+(logg.get(j).ab_ar_tm));
//            if(new DecimalFormat("#.##").format(logg.get(j).ab_ar_tm).equals(i+""))
//            {
//                  System.out.println("true"); //:: "+logg.get(j).ab_ar_tm);
//           
//                if (logg.get(j).my_flr == ele_flr)
//                        {
//                  db p = new db();
//                People ele_peeps = new People();
//                p.update();
//                
//                ele_peeps.dest_flr = p.getflr();
//                ele_peeps.stay_time = peeps_time();
//                System.out.println("ele_peeps.dest_flr "+ele_peeps.dest_flr);
//               // ele.get(size).dest_flr = p.getflr();
//                ele.add(ele_peeps);
//                size++;
//                move_elevator();
//                size--;
//                add_to_flr_queue(ele.get(j).dest_flr, ele_peeps);
//                logg.remove(j);
//                                                         
//                        }
//            }
//        }
//        
//    }*/
//    
//        for (int i = 0; i < logg.size(); i++) {
//            db p = new db();
//            logg.get(i).dest_flr = p.getflr();
//            if (logg.get(i).my_flr == ele_flr && size < 6) {
//                People ele_peeps = new People();
//                p.update();
//                
//                ele_peeps.dest_flr = p.getflr();
//                ele_peeps.stay_time = peeps_time();
//                System.out.println("ele_peeps.dest_flr "+ele_peeps.dest_flr);
//               // ele.get(size).dest_flr = p.getflr();
//                ele.add(ele_peeps);
//                size++;
//                move_elevator();
//               // chk_ele_call();
//            } else {
//                System.out.println("no place in lift bcoz"+ele.size());
//               // if(ele.get(i).time())
//                //{
//                    add_to_flr_queue(logg.get(i).my_flr, logg.get(i));
//                //}
//                System.out.println("addedd to the standing floor");
//            }
//        }
//    }

    
    }    
    public static void clk_ele()
    {
        
        
        
        
        
        
        
        
    }
            
    
    public static double uniform_person_time()
    {
            Random rand=new Random();
            double randomNum = rand.nextInt((2 - 1) + 1) +1;
            return randomNum;
    }
    
    public static void chk_elevator() {

        // first floor remaining
        for (int i = 0; i < ele.size(); i++) {

            if (ele.get(i).dest_flr == ele_flr) {
                // size--;
                if (ele.get(i).dest_flr == 1) {
                    ele_isMoving = false;
                    System.out.println("EXITED " + ele.get(i).ab_ar_tm);
                    all_delays +=  ele.get(i).tot_delay;
                    g_ind_delay.add(ele.get(i));
                    ele.remove(i);

                } else {
                    ele.get(i).my_flr = ele_flr;
                    //staying time
                    ele_isMoving = false;
                    System.out.println("Out from the lift at floor " + ele_flr + " " + ele.get(i).ab_ar_tm);

                    add_to_flr_queue(ele.get(i).my_flr, ele.get(i), time, uniform_person_time());
                    System.out.println("added to floor queue " + ele.get(i).dest_flr);

                    ele.remove(i);
                    System.out.println("ele size " + ele.size());
                }
            }
        }
        boolean no = false;
      //  while(ele.size()<6)
        //{
            if(ele_flr == 1)
            {
                if(!e1.isEmpty())
                {
                 while(ele.size() < 6 && !e1.isEmpty())
                 {
                db p = new db(1);
                p.update();
                if(p.getflr() ==1)
                    System.out.println("STATE 1");
                e1.get(0).dest_flr = p.getflr();
                    System.out.println("e1.get(0).dest_flr"+e1.get(0).dest_flr);
                double cal_delay = time - e1.get(0).ct;//queue main lagnay wala time
                e1.get(0).delay = cal_delay;
                e1.get(0).e_size ++;
                if(e1.get(0).delay > 0)
                    e1.get(0).no_of_delays++;
                
                e1.get(0).tot_delay = e1.get(0).tot_delay + e1.get(0).delay; 
                
                System.out.println(e1.get(0).ab_ar_tm+" delay" + e1.get(0).delay+"t"+time);
                ele.add(e1.get(0));
                System.out.println("add to ele " + e1.get(0).ab_ar_tm);
                e1.remove(0);
                no = true;
                }
                }
                else no = false;
                }
            if(ele_flr == 2)
            {
                if(!e2.isEmpty())
                {
                    while(ele.size() < 6 && !e2.isEmpty())
                 {
                db p = new db(2);
                p.update();
                if(p.getflr() ==1)
                    System.out.println("STATE 1");
                e2.get(0).dest_flr = p.getflr();
                System.out.println("e2.get(0).dest_flr"+e2.get(0).dest_flr);
                double cal_delay = time - e2.get(0).ct;//queue main lagnay wala time
                e2.get(0).delay = cal_delay;
                  e2.get(0).e_size ++;
                if(e2.get(0).delay > 0)
                    e2.get(0).no_of_delays++;
                
                e2.get(0).tot_delay = e2.get(0).tot_delay + e2.get(0).delay;
                
                 System.out.println(e2.get(0).ab_ar_tm+" delay" + e2.get(0).delay+"t"+time);
                ele.add(e2.get(0));
                System.out.println("add to ele"+e2.get(0).ab_ar_tm);
                e2.remove(0);
                no = true;
                }
                }
                else no = false;
                }
          else  if(ele_flr == 3)
            {
                if(!e3.isEmpty())
                {
                    while(ele.size() < 6 && !e3.isEmpty())
                 {
                db p = new db(3);
                p.update();
                 if(p.getflr() ==1)
                    System.out.println("STATE 1");
                 
                e3.get(0).dest_flr = p.getflr();
                System.out.println("e3.get(0).dest_flr"+e3.get(0).dest_flr);
                double cal_delay = time - e3.get(0).ct;//queue main lagnay wala time
                e3.get(0).delay = cal_delay;
                  e3.get(0).e_size ++;
                if(e3.get(0).delay > 0)
                    e3.get(0).no_of_delays++;
                
                e3.get(0).tot_delay = e3.get(0).tot_delay + e3.get(0).delay;
                
                 System.out.println(e3.get(0).ab_ar_tm+" delay" + e3.get(0).delay+"t"+time);
                ele.add(e3.get(0));
                System.out.println("add to ele "+e3.get(0).ab_ar_tm);
                e3.remove(0);
                no  = true;
                }
                }
                else no  = false;
                }
          else if(ele_flr == 4)
            {
                if(!e4.isEmpty())
                {
                    while(ele.size() < 6 && !e4.isEmpty())
                 {
                db p = new db(4);
                p.update();
                 if(p.getflr() ==1)
                    System.out.println("STATE 1");
                e4.get(0).dest_flr = p.getflr();
                System.out.println("e4.get(0).dest_flr"+e4.get(0).dest_flr);
                double cal_delay = time - e4.get(0).ct;//queue main lagnay wala time
                  e4.get(0).e_size ++;
                if(e4.get(0).delay > 0)
                    e4.get(0).no_of_delays++;
                
                e4.get(0).tot_delay = e4.get(0).tot_delay + e4.get(0).delay;
                
                System.out.println(e4.get(0).ab_ar_tm+" delay" + e4.get(0).delay+"t"+time);
                e4.get(0).delay = cal_delay;
                ele.add(e4.get(0));
                System.out.println("add to ele "+e4.get(0).ab_ar_tm);
                e4.remove(0);
                no  = true;
                }
                }
          else no  = false;      
                }
          
          else if(ele_flr == 5)
            {
                if(!e5.isEmpty())
                {
                    while(ele.size() < 6 && !e5.isEmpty())
                 {
                db p = new db(5);
                p.update();
                 if(p.getflr() ==1)
                    System.out.println("STATE 1");
                e5.get(0).dest_flr = p.getflr();
                System.out.println("e5.get(0).dest_flr"+e5.get(0).dest_flr);
                double cal_delay = time - e5.get(0).ct;//queue main lagnay wala time
                e5.get(0).delay = cal_delay;
                  e5.get(0).e_size ++;
                if(e5.get(0).delay > 0)
                    e5.get(0).no_of_delays++;
                
                e5.get(0).tot_delay = e5.get(0).tot_delay + e5.get(0).delay;
                
                System.out.println(e5.get(0).ab_ar_tm+" delay" + e5.get(0).delay+"t"+time);
                ele.add(e5.get(0));
                System.out.println("add to ele "+e5.get(0).ab_ar_tm);
                e5.remove(0);
                no = true;
                }        
                }
                else no = false;
                }
//        if(no ==false)
//        {
//            break;
//        }
       // }
    }
    
 public static void move_elevator()
 {
     int go_to_floor = flr_elevator();
    
     
     if(go_to_floor == ele_flr)
     {
         chk_elevator();
     }
    else if(go_to_floor == 0)
     {
         generation_inside();
     //            time+= 0.01;
       //      ele_isMoving = true;    
                 chk_floor();
             chk_call();
     }
     else
     {
     if(direc_up)
         
     { System.out.println("go_to_floor with up " + go_to_floor);
         while(ele_flr < go_to_floor)
         {
             //loop of fifteen
             
             for( int i = 0 ; i < 15 ; i++)
             {
                 generation_inside();
                 time+= 0.01;
             ele_isMoving = true;    
                  chk_floor();
             chk_call();
             }
             ele_flr++;
             System.out.println("elevator is at "+ele_flr+" going up");
             chk_elevator();        
             
         }
     }
     else if(direc_down)
     { System.out.println("go_to_floor with down" + go_to_floor);
         while(ele_flr > go_to_floor)
         {
                 for( int i = 0 ; i < 15 ; i++)
             {
                    generation_inside();
                 time+= 0.01;
                 ele_isMoving = true; 
                 chk_floor();
             chk_call();
             }
             ele_flr--;
             System.out.println("elevator is at "+ele_flr+" going down");
             chk_elevator();
         }
         
     }
     }
 }
 
 public static void chk_call()
 {
     if(!e1.isEmpty())
     {
         c1 = true;
     }
     else 
         c1 = false;
     
     if(!e2.isEmpty())
     {
       c2  = true;  
     }
     else 
         c2 = false;
     
       if(!e3.isEmpty())
     {
         c3 = true;
     }
       else 
         c3 = false;
     
       if(!e4.isEmpty())
     {
         c4 = true;
     } 
       else 
         c4 = false;
     
       if(!e5.isEmpty())
     {
         c5 = true;
     }else 
         c5 = false;
     
 }
     
 public static int flr_elevator()
 { 
     int temp = 0, max_flr,min_flr;
     if (ele_flr == 1) {
         direc_up = true;
         direc_down = false;
         if(!ele.isEmpty()){
         temp = ele.get(0).dest_flr;
         System.out.println("temp"+temp);
         for (int i = 1; i < ele.size(); i++) {
             if (ele.get(i).dest_flr > temp) {
                 temp = ele.get(i).dest_flr;
             }
         }
         // c wala kam
         chk_call();
          if (c5) {
               direc_up = true;
                   direc_down = false;
             temp = 5;
         } else if (c4) {
              direc_up = true;
                   direc_down = false;
             temp = 4;
         } else if (c3) {
              direc_up = true;
                   direc_down = false;
             temp = 3;
         }
          else if (c2) {
              direc_up = true;
                   direc_down = false;
              temp = 2;
         }
          
          
         max_flr = temp;
         System.out.println("with direc UP max_flr in lift "+max_flr);
         return max_flr;}
else
{
         chk_call();
          if (c5) {
              direc_up = true;
                   direc_down = false;
              temp = 5;
         } else if (c4) {
              direc_up = true;
                   direc_down = false;
             temp = 4;
         } else if (c3) {
              direc_up = true;
                   direc_down = false;
             temp = 3;
         }
          else if (c2) {
              direc_up = true;
                   direc_down = false;
              temp = 2;
         }
         max_flr = temp;
         //System.out.println("with direc UP max_flr in lift "+max_flr);
         return max_flr;
}
     } else if (ele_flr == 5) {
         direc_up = false;
         direc_down = true;
if(!ele.isEmpty()){
         temp = ele.get(0).dest_flr;
         for (int i = 1; i < ele.size(); i++) {
             if (ele.get(i).dest_flr < temp) {
                 temp = ele.get(i).dest_flr;
             }
         }
         chk_call();
          if (c1) {
             direc_up = false;
                   direc_down = true;
              temp = 1;
         } else if (c2) {
              direc_up = false;
                   direc_down = true;
             temp = 2;
         } else if (c3) {
              direc_up = false;
                   direc_down = true;
             temp = 3;
         }
           else if (c4) {
              direc_up = false;
                   direc_down = true;
               temp = 4;
         }
          else if (c5) {
          
              temp = 5;
//    direc_up = true;
//    direc_down = false;

              //ele.add(e5.get(0));
//          chk_elevator();
         // move_elevator();
          }
//          else
//             temp  = 0 ;
         return temp;
}
else
{
    chk_call();
          if (c1) {
              direc_up = false;
                   direc_down = true;
              temp = 1;
         } else if (c2) {
              direc_up = false;
                   direc_down = true;
             temp = 2;
         } else if (c3) {
              direc_up = false;
                   direc_down = true;
             temp = 3;
         }
           else if (c4) {
              direc_up = false;
                   direc_down = true;
               temp = 4;
         }
else if (c5) {
//    direc_up = true;
//    direc_down = false;
             temp = 5;
//chk_elevator();
         // move_elevator();         
}
         return temp;}
     
     }

     //  floor 4
     else if (ele_flr == 4) {
         if (direc_up) {
             if (!ele.isEmpty()) {
                 for (int i = 0; i < ele.size(); i++) {
                     if (ele.get(i).dest_flr > 4) {
                       temp = 5;
                      direc_up = true;
                   direc_down = false;
                     }
                 }
                 chk_call();
                 if (c5 == true) {
                 direc_up = true;
                   direc_down = false;
                     temp = 5;
                 }
                 else if (c4) {
             temp = 4;
//  chk_elevator();
        //  move_elevator();
                 }
             }
             chk_call();
             if (c5 == true) {
            direc_up = true;
                   direc_down = false;
                 temp =  5;
             }
             else if (c4) {
             temp = 4;
//         chk_elevator();
         // move_elevator();
             }
             if( temp > 4)
                 {direc_up = true;
                    direc_down = false;
                 return temp;}
                else if(temp <4 && temp > 0)
                 {
                  direc_down = true;
             direc_up =false;
                  return temp;   
                 }
                else if (temp > 0) {
                 return temp;
             }
         }
     
//         else //  bad main hata dena
//         {
     if(temp == 0 || direc_up == false)
     {
//             direc_down = true;
//             direc_up = false;
//             if (direc_down = true) {
                 if (!ele.isEmpty()) {
                     temp = ele.get(0).dest_flr;
                     for (int i = 1; i < ele.size(); i++) {
                         if (ele.get(i).dest_flr < temp) {
                             temp = ele.get(i).dest_flr;
                         }
                     }
                     chk_call();
                     if (c1) {
                     direc_up = false;
                   direc_down = true;
                         temp = 1;
                 
                     } else if (c2) {
                     direc_up = false;
                   direc_down = true;
                         temp = 2;
                     } else if (c3) {
                          direc_up = false;
                   direc_down = true;
                         temp = 3;
                     }
                     else if (c4) {
             temp = 4;
//         chk_elevator();
          //move_elevator();
                     }
                     if(temp > 4)
                     {
                         direc_up = true;
                          direc_down = false;
                         return temp;
                     }
                      else if(temp <4 && temp > 0)
                 {
                  direc_down = true;
             direc_up =false;
                  return temp;   
                 }
                     return temp;
                 } else {
                     chk_call();
                     if (c1) {
                          direc_up = false;
                   direc_down = true;
                         temp = 1;
                     } else if (c2) {
                          direc_up = false;
                   direc_down = true;
                         temp = 2;
                     } else if (c3) {
                          direc_up = false;
                   direc_down = true;
                         temp = 3;
                     }
                     else if (c4) {
             temp = 4;
//         chk_elevator();
         // move_elevator();
                     }
                     if (temp == 0) {
                         chk_call();
                         if (c5 == true) {
                            direc_up = true;
                            direc_down = false;
                             temp = 5;
                         } else if (c4) {
                            direc_up = true;
                            direc_down = false;
                             temp = 4;
                         }
                     }
                     return temp;
                // }
             }
        }

     } // floor 3
     else if (ele_flr == 3)
     {
         if (direc_up) 
         {
             if (!ele.isEmpty()) {
                 temp = ele.get(0).dest_flr;
                 for (int i = 1; i < ele.size(); i++) {
                     if (ele.get(i).dest_flr > temp) {
                         temp = ele.get(i).dest_flr;
                     }
                 }
                 chk_call();
                 if (c5 == true) {
                     direc_up = true;
                   direc_down = false;
                     temp = 5;
                 } else if (c4 == true) {
                     direc_up = true;
                   direc_down = false;
                     temp = 4;
                 }
                 else if (c3) {
             temp = 3;
//         chk_elevator();
         // move_elevator();
                 }
                 if( temp > 3)
                 {direc_up = true;
                    return temp;}
                else if(temp <3 && temp > 0)
                 {
                  direc_down = true;
                  direc_up = false;
                    return temp;   
                 }
                else if(temp > 0)
                     return temp;
             }
             chk_call();
             if (c5 == true) {
                 direc_up = true;
                   direc_down = false;
                 temp =  5;
             }
             if (c4 == true) {
                direc_up = true;
                   direc_down = false;
                 temp = 4;
             }
             else if (c3) {
             temp = 3;
//         chk_elevator();
         // move_elevator();
             }
             
             if(temp > 0)
             {
                 return temp;
             }
//down floor
         }
//         else
//         {
       if(temp == 0 || direc_up == false)
          {
//              direc_down = true;
//             direc_up = false;
            // if (direc_down = true) {
                 if (!ele.isEmpty()) {
                     temp = ele.get(0).dest_flr;
                     for (int i = 1; i < ele.size(); i++) {
                         if (ele.get(i).dest_flr < temp) {
                             temp = ele.get(i).dest_flr;
                         }
                     }
                     chk_call();
                     if (c1 == true) {
                          direc_up = false;
                   direc_down = true;
                         temp = 1;
                     } else if (c2 == true) {
                          direc_up = false;
                   direc_down = true;
                         temp = 2;
                     } 
                       else if (c3) {
             temp = 3;
//         chk_elevator();
         // move_elevator();
                       }
                     return temp;
                 
                 }
               else
                 { chk_call();
                     if (c1 == true) {
                 direc_up = false;
                   direc_down = true;
                         return    temp = 1;
                 } else if (c2 == true) {
                 direc_up = false;
                   direc_down = true;
                     return    temp = 2;
                 }
                       else if (c3) {
            return temp = 3;
//         chk_elevator();
         // move_elevator();
                       }
                     if (temp == 0) {
                         chk_call();
              
                         if (c5 == true) {
                         direc_up = true;
                         direc_down = false;
                             return temp = 5;
                         }
                         if (c4 == true) {
                         
                         direc_up = true;
                         direc_down = false;
                             return temp = 4;
                         } else if (c3) {
                            
                         direc_up = true;
                         direc_down = false;
                             return temp = 3;
//         chk_elevator();
                             // move_elevator();
                         }
                     }
                     return temp;
                 //}
             }
         }
     }
     else if (ele_flr == 2) {
         if (direc_up) {
             if (!ele.isEmpty()) {
                 temp = ele.get(0).dest_flr;
                 for (int i = 1; i < ele.size(); i++) {
                     if (ele.get(i).dest_flr > temp) {
                         temp = ele.get(i).dest_flr;
                     }
                 }

                 chk_call();
                 if (c5 == true) {
                    direc_up = true;
                    direc_down = false;
                     temp = 5;
                 }
                else if (c4 == true) {
                   direc_up = true;
                   direc_down = false;
                    temp =  4;
                 }
                else if (c3 == true) {
                   direc_up = true;
                   direc_down = false;
                    temp = 3;
                 }
                   else if (c2) {
                 temp = 2;
//         chk_elevator();
          //move_elevator();
                   }
                 if( temp > 2)
                 {direc_up = true;
                    return temp;}
                else if(temp < 2 && temp > 0)
                 {
                  direc_down = true;
                  direc_up = false;
                    return temp;   
                 }
                else if(temp > 0)
                 return temp;
             }
             else
             {
             chk_call();
             if (c5 == true) {
                 direc_up = true;
                   direc_down = false;
                 temp = 5;
             }
             else if (c4 == true) {
                 direc_up = true;
                   direc_down = false;
                 temp = 4;
             }
            else if (c3 == true) {
                direc_up = true;
                   direc_down = false; 
                temp = 3;
             }
             else if (c2) {
             temp = 2;
//         chk_elevator();
         // move_elevator();
             }
             if(temp > 0)
             return temp;
             }
         }
//         else
//         {   //down
if(temp == 0 || direc_up == false)
{
                //direc_down = true;
                //direc_up = false;
              // if (direc_down = true) {
                    if (!ele.isEmpty()) {
                        temp = ele.get(0).dest_flr;
                        for (int i = 1; i < ele.size(); i++) {
                            if (ele.get(i).dest_flr < temp) {
                                temp = ele.get(i).dest_flr;
                            }
                        }
                        chk_call();
                        if (c1 == true) {
                      direc_up = false;
                   direc_down = true;
                            temp = 1;
                        }
                        else if (c2) {
             temp = 2;
//         chk_elevator();
          //move_elevator();
                        }
                        if(temp > 2)
                        {        direc_down = false;
                        direc_up = true;
                        return temp;
                        }
                        else if (temp <2 && temp>0)
                        {
                          direc_down = true;
                        direc_up = false;
                        return temp;  
                        }
                    
                    
                    }
                    else
                    {
                    chk_call();
                    if (c1 == true) {
                         direc_up = false;
                   direc_down = true;
                        temp = 1;
                    }
                    else if (c2) {
             temp = 2;
//         chk_elevator();
          //move_elevator();
                     }
                     if (temp == 0) {
                         chk_call();
          
                         if (c5 == true) {
                            direc_up = true;
                         direc_down = false;
                             return temp = 5;
                         } else if (c4 == true) {
                             direc_up = true;
                         direc_down = false;
                             return temp = 4;
                         } else if (c3 == true) {
                             direc_up = true;
                         direc_down = false;
                             return temp = 3;
                         } else if (c2) {
                             direc_up = true;
                         direc_down = false;
                             return temp = 2;
//         chk_elevator();
                             // move_elevator();
                         }
                     }
                     return temp;
                 //}
//              }
             }
         }
//         else
//             
//         {   
//             direc_down = true;
//             direc_up = false;
//             chk_call();
//                    if (c1 == true) {
//                        temp = 1;
//                    }
//
//         }
//         
         
        }

        return 0;
    }
 
 public static void add_to_flr_queue(int floor ,People p ,double time,double urt)
 {
        if (floor == 1) {
            p.ct = time;
            f1.add(p);
            System.out.println("added to floor 1 = " + p.ab_ar_tm);
            //f1.add(p)
        } else if (floor == 2) {

            System.out.println("added to floor 2 = " + p.ab_ar_tm);
            p.stay_time = urt + time;
            System.out.println("URT"+ urt);
            System.out.println("Stay TIME"+ p.stay_time+ " of" +p.ab_ar_tm );
            f2.add(p);
        } else if (floor == 3) {
            System.out.println("added to floor 3 = " + p.ab_ar_tm);
            // p.ct = time;
            p.stay_time = urt + time;
            System.out.println("URT"+ urt);
            System.out.println("Stay TIME"+ p.stay_time+ " of p.ab_ar_tm" );
            f3.add(p);
        } else if (floor == 4) {
            System.out.println("added to floor 4 = " + p.ab_ar_tm);
            //p.ct = time;
            p.stay_time = urt + time;
             System.out.println("URT"+ urt);
            System.out.println("Stay TIME"+ p.stay_time+ " of p.ab_ar_tm" );
            f4.add(p);
        } else if (floor == 5) {
            System.out.println("added to floor 5 = " + p.ab_ar_tm);
            //p.ct = time;
            p.stay_time = urt + time;
             System.out.println("URT"+ urt);
            System.out.println("Stay TIME"+ p.stay_time+ " of p.ab_ar_tm" );
            f5.add(p);
        }
    }
public static void add_to_ele_queue(int floor , People p , double urt)
{
    if(floor == 1)
     {
    
         p.ct = time;
         System.out.println("ct "+p.ct + "of" +p.ab_ar_tm);
         //e1.add(p);
         System.out.println("added to floor 1 elequeue= "+ p.ab_ar_tm);
         e1.add(p);
         
     }
     else if(floor == 2)
     {
         //p.ct = time;
        // p.stay_time = urt + time;
          
        System.out.println("added to floor 2 elequeue = "+p.ab_ar_tm);
        
        p.ct = time;
        System.out.println("ct "+p.ct + "of" +p.ab_ar_tm);
        e2.add(p);
         //for more floors
         
        
     }
     else if(floor == 3)
     {
          System.out.println("added to floor 3 elequeue= "+ p.ab_ar_tm);
         p.ct = time;
        // p.stay_time = urt;
        System.out.println("ct "+p.ct + "of" +p.ab_ar_tm);
        e3.add(p);
     }
     else if(floor == 4)
     {
          System.out.println("added to floor 4 elequeue= "+ p.ab_ar_tm);
         p.ct = time;
          //p.stay_time = urt;
        System.out.println("ct "+p.ct + "of" +p.ab_ar_tm);
          e4.add(p);
     }
     else if(floor == 5)
     {
          System.out.println("added to floor 5 elequeue= "+ p.ab_ar_tm);
         p.ct = time;
         // p.stay_time = urt;
         System.out.println("ct "+p.ct + "of" +p.ab_ar_tm);
         e5.add(p);
     }
}
 
 public static void chk_floor()
 {
     
        double end_tme;
        //first floor
        
        for (int i = 0; i < f2.size(); i++) {
            end_tme = f2.get(i).stay_time;
            String b = new DecimalFormat("#.##").format(time);
            String c = new DecimalFormat("#.##").format(end_tme);
            
            if (b.equalsIgnoreCase(c)) // double wali matching
            {
                add_to_ele_queue(f2.get(i).my_flr, f2.get(i), uniform_person_time());
                f2.remove(i);
            }
            end_tme = 0;
        }
        for (int i = 0; i < f3.size(); i++) {
            end_tme =  f3.get(i).stay_time;
            String b = new DecimalFormat("#.##").format(time);
            String c = new DecimalFormat("#.##").format(end_tme);
            
            if (b.equalsIgnoreCase(c)) // double wali matching
            {
                add_to_ele_queue(f3.get(i).my_flr, f3.get(i), uniform_person_time());
            f3.remove(i);
            }
            end_tme = 0;
        }
        for (int i = 0; i < f4.size(); i++) {
            end_tme =  f4.get(i).stay_time;
            String b = new DecimalFormat("#.##").format(time);
            String c = new DecimalFormat("#.##").format(end_tme);
            
            if (b.equalsIgnoreCase(c)) // double wali matching
            {
                add_to_ele_queue(f4.get(i).my_flr, f4.get(i), uniform_person_time());
              f4.remove(i);  
            }
            end_tme = 0;
        }
        for (int i = 0; i < f5.size(); i++) {
            end_tme =  f5.get(i).stay_time;
            String b = new DecimalFormat("#.##").format(time);
            String c = new DecimalFormat("#.##").format(end_tme);
            
            if (b.equalsIgnoreCase(c)) // double wali matching
            {
                add_to_ele_queue(f5.get(i).my_flr, f5.get(i), uniform_person_time());
                f5.remove(i);
            }
            end_tme = 0;
        }
    }
    

 
 public static boolean Every_Queue_Chk()
 {
     if(f1.isEmpty())
     {
         if(f2.isEmpty())
         {
             if(f3.isEmpty())
             {
              if(f4.isEmpty())
               {
                 if(f5.isEmpty())
                 {
                 return false;
                 }
               }   
            }
        }
    }
     return true;
}
 
 public static boolean Every_E_Chk()
 {
     if(e1.isEmpty())
     {
         if(e2.isEmpty())
         {
             if(e3.isEmpty())
             {
              if(e4.isEmpty())
               {
                 if(e5.isEmpty())
                 {
                 return false;
                 }
               }   
            }
        }
    }
     return true;
}
 public static double sum()
 {   Random s = new Random();
     a = (double) getExpo(s , 1);
    sum += a;
    return sum;
 }
 
 public static void Add_person()
 {
     People person = new People();
     logg.add(person);
             
 }
 
 
 public static void add_to_ele(People p)
 {
     ele.add(p);
     size++;
 }
 
 public static double getExpo(Random rng, double meanTime) {
 		return -meanTime * Math.log(rng.nextDouble());
	}
   
 public static void generation_inside() {
        int flr;
         
        for (int i = 0; i < logg.size(); i++) {
    String b = new DecimalFormat("#.##").format(time);
    String c = new DecimalFormat("#.##").format(logg.get(i).ab_ar_tm);
            if ( b.equalsIgnoreCase(c)) {
                db p = new db(logg.get(i).my_flr);
                       p.update();
                        if(p.getflr() ==1)
                    System.out.println("STATE 1");
                       
                        logg.get(i).dest_flr = p.getflr();
                
                       add_to_ele_queue(logg.get(i).my_flr, logg.get(i),uniform_person_time());
               
                System.out.println("added to ele_queue at time "+time);
                flr = logg.get(i).my_flr;
                
                logg.remove(i);
                if (flr == ele_flr && ele_isMoving == false) {
                    if (ele.size() < 6) {
         
                        System.out.println("added to the ele");
                       e1.get(0).ct = 0;
             
             e1.get(0).e_size++;
                       ele.add(e1.get(0));
                        e1.remove(0);
                    
                    }
                     
                }
            }
           // System.out.println("false");
        }
    }
}
