package placement.Java.inheritence;

interface Dog{
    public void say();
}
interface cat{
    public void maeoo();
}
interface lion{
    public void hello();
}
interface tiger{
    public void bye();
}

class animal implements lion , Dog, cat , tiger{
    public void say(){
        System.out.println("Dog say bhoo bhoo");
    }
    public void maeoo(){
        System.out.println("Cat say maeoo");
    }
    public void hello(){
        System.out.println("lion say hello");
    }
    public void bye(){
        System.out.println("tiger say bye");
    }
}




public class multipleinterface {

        public static void main(String[] args) {
        animal obj = new animal();
        obj.say();
        obj.maeoo();
        obj.hello();
        obj.bye();
        }
}
