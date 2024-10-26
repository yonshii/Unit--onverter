package App;

public class Main {
    public static void main(String[] args) {
        System.out.println("App Converter");
        double miles = 14;
        double kilometres = 23;
        double km = convMilesToKm(miles);
        double mi = convKilometresToMi(kilometres);
        System.out.println(miles + " миль = " + km + " км");
        System.out.println(kilometres + " км = " + mi + " миль");
    }
    private static double convMilesToKm(double miles) {
        return miles * 1.60934;
    }
    private static double convKilometresToMi(double kilometres){
        return kilometres / 1.60934;
    }

}