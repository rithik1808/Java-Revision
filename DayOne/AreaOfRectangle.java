package DayOne;

public class AreaOfRectangle{
    public static void main(String[] args) {
        System.out.println(findArea(2, 3, "rectangle"));
    }

    public static double findArea(double a,double b,String areaOf){
        if(areaOf.equals("rectangle")){
            return a*b;
        }
        return 0;
    }
}