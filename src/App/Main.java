package App;

public class Main {
    public static void main(String[] args) {
        System.out.println("App Converter");
        double miles = 14;
        double km = convMilesToKm(miles);
        System.out.println(miles + " миль = " + km + " км");
    }
    private static double convMilesToKm(double miles) {
        return miles * 1.60934;
    }
}