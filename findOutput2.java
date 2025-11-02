public class findOutput2 {
    
    public static void main(String[] args) {

        Vehicle v1 = new Car();
        v1.print1(); // not valid

        Vehicle v2 =  new Vehicle();
        v2.print();


    }
    
}

class Vehicle {

   void  print(){ 

        System.out.println(" vehicle class");
    }

}

class Car extends Vehicle{
 void  print1(){
        System.out.println(" Car class");
    }
}
