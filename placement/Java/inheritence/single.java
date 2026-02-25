package placement.Java.inheritence;



 class  dog {
    void eat(){
        System.out.println("Dog eat pizza");
    }
}

 class puppy extends dog {

    void sleep(){
        System.out.println("puppy clss dog is sleeping");
    }
}



public class single extends puppy  {
    public static void main(String[] args) {
        // puppy obj  = new puppy();
        // obj.eat();
        // obj.sleep();

        single obs = new single();
        obs.eat();
        obs.sleep();
    }
}
