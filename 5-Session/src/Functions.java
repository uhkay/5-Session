public class Functions {
    public static void main(String[] args) {

       /* calculateArea();
        calcArea(6);
        calcuArea(100, 900);
        calArea(10,8,300);*/
       //String name = "RectArea";
       recArea(10, 90, "RectArea");
    }
    /*
    public static void calculateArea() {
        int a = 10;
        int b = 90;
        int area = a * b;
        System.out.println("The area is " + area);
    }

    public static void calcArea(int num1){
        int b = 20;
        int area = num1 * b;
        System.out.println("The area is " + area);
    }

    public static void calcuArea(int num1, int num2){
        int area = num1 * num2;
        System.out.println("The area is " + area);
    }

    public static void calArea(int num1, int num2, int area){
        area = num1 * num2;
        System.out.println("The area is " + area);
    }
    */
    public static void recArea(int x, int y,String str){
        int area = x * y;
        System.out.println("The area of " + str + " is " + area);
    }

}