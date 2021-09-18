import java.util.Scanner;
public class SphereVolume
{
    public static void main(String[] args)
    {
        //Scanner class
        Scanner keyboard= new Scanner(System.in);
        //Explaining the purpose of the program to the user
        System.out.println("This Program is built to help the user calculating the volume of a sphere.");
        //Declaring variables
        double sphereDiameter;
        //Asking the user for the information.
        System.out.println("Please enter the sphere diameter below.");
        //Reading diameter.
        sphereDiameter= keyboard.nextDouble();
        //Declaring variables
        double sphereRadius;
        double sphereVolume;
        //sphere radius formula
        sphereRadius=sphereDiameter/2.0;
        //Sphere volume formula
        sphereVolume=(4/3.0) * Math.PI * Math.pow (sphereRadius, 3.0);

        System.out.println("The volume of the sphere is " + sphereVolume);


    }
}
