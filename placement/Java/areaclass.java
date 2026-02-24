package placement.Java;


class FindArea {
    float pi = 3.14f;  


    int radius;
    public FindArea(int radius) {
        this.radius = radius;
    }


    public int area() {
        int result = (int)(pi * radius * radius);
        System.out.println("Area = " + result);
        return result;
    }


    public int circumference() {
        int result = (int)(2 * pi * radius);
        System.out.println("Circumference = " + result);
        return result;
    }
}


public class areaclass {
    public static void main(String[] args) {
        FindArea circle = new FindArea(5); 
        circle.area();
        circle.circumference();
    }
}
