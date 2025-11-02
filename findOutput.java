public class findOutput {
    public static void main(String[] args) {

        Vehicle v2 = new Car();
        v2.print();

        Vehicle v1 =  new Vehicle();
        v1.print();


    }
    
}

class Vehicle {

   void  print(){ // override

        System.out.println(" vehicle class");
    }

}

class Car extends Vehicle{
 void  print(){ // override
        System.out.println(" Car class");
    }
}