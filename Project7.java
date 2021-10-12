public class Project7{

    public static void printArea(double [] X, double [] Y){
        double area = Math.abs(X[0]*(Y[1]-Y[2]) + X[1]*(Y[2]-Y[0]) + X[2]*(Y[0]-Y[1]))/2;
        System.out.println("Area of Triangle: " + area);
    }

    public static void main(String[] args) {
        double [] x_coordinates = {10,10,80};
        double [] y_coordinates = {20, 60, 20};
        printArea(x_coordinates, y_coordinates);
    }
}