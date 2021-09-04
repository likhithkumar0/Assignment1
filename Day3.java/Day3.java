import java.util.*;

class Cab {
    int fare;
    int d; //distance travelld by pacenger

public Cab(){
    fare = 20;
}

public Cab(int atm){       
    fare = atm;
}

    void showFare(){
        System.out.println("Total Amount:" + fare + "Rs");
    }
}


class Day3Cab {
     public static void main(String[] args) {
        int cd; //distance to pacenger
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the distance from cab to paceger: ");
     cd = sc.nextInt();
     if(cd > 5){
         Cab ob = new Cab(20 + 5 * (cd - 5));

         System.out.println("Enter the travelled distance: ");
          ob.d = sc.nextInt();

          ob.fare = ob.fare + 5 * ob.d;
          ob.showFare();

        }
     else{
         Cab ob = new Cab();

         System.out.println("Enter the travelled distance: ");
         ob.d = sc.nextInt();

         ob.fare = ob.fare + 5 * ob.d;
         ob.showFare();

        }
     
    }
    
}