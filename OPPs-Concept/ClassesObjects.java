public class ClassesObjects {
    public static void main(String[] args) {
        Pen p1 = new Pen("red", 0.5);
        p1.getColor();
        p1.getTip();
        Pen p2 = new Pen(p1);
        p2.setColor("black");
        p1.getColor();
        p2.getColor();
        // shallow copy
        Pen p3 = p1;
        p3.getColor();
    }
}

class Pen {
    private String color;
    private double tip;

    //* copy constructor
    // deep copy
    Pen(Pen p) {
        this.color = p.color;
        this.tip = p.tip;
    }

    // parameterized constructor
    Pen(String color, double tip) {
        this.color = color;
        this.tip = tip;
    }

    void getColor() {
        System.out.println("Pen color: " + color);
    }

    void getTip() {
        System.out.println("Tip size: " + tip);
    }

    void setColor(String color){
        this.color = color;
    }
    void settip(double tip){
        this.tip = tip;
    }
}