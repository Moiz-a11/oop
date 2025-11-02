public class superKeyword {
    public static void main(String[] args) {
        Horse h = new Horse(); // h is obj so assigning memory by new keyword and h stores address and points to obj memory  
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
