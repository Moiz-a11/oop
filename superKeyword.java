public class superKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
       System.out.println(h.color); 
        
        
    }
    
}

class Animal{
    String color;
    Animal(){ // constructor
            System.out.println("animal class constructor");
    }

}

class Horse extends Animal{
  
Horse(){
    
     super(); // call parent class constructor
      super.color="red";
    System.out.println("horse class constructor");
}
}
