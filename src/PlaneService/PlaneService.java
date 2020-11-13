package PlaneService;

import Plane.Plane;

import java.util.Scanner;

public class PlaneService {
    Scanner mms = new Scanner(System.in);

    public Plane create() {

        System.out.println("Enter Plane's name!");
        String planeName = mms.next();
        if (planeName.isEmpty())
            System.out.println("ENTER ANY NOT EMPTY STRING");
        System.out.println("Enter the name of country the plane belongs to ");
        String belong = mms.next();
        System.out.println("Enter the year of publishing  (from 1903 to 2020)");
        int year;
        do {
            System.out.println("Please enter number from 1903 to 2020");
            year = mms.nextInt();
        } while (year<1903&&year>2020);
        System.out.println("Enter the hours in air");
        double hours = mms.nextDouble();
        System.out.println("Is it military or not 'y' or 'n'.");
        boolean isMil = mms.nextBoolean();
        System.out.println("Enter the weight of plane");
        int weight = mms.nextInt();
        System.out.println("Enter the the maximum extent across the wings of an aircraft");
        int wingspan = mms.nextInt();
        System.out.println("Enter the maximal speed per hour");
        int topSpeed = mms.nextInt();
        System.out.println("Enter the number of seats");
        int seats = mms.nextInt();
        System.out.println("Enter the cost of the plane.");
        double cost = mms.nextDouble();
        Plane plane = new Plane(planeName, belong, year, hours, isMil, weight, wingspan, topSpeed, seats, cost);
        return plane;
    }

    //    Task 1. (score 5)
//    Create function:
//    Parameter one Plane
//    Result: print all information of the plane
    public void printPlaneInfo(Plane plain){
        System.out.println(plain.toString());
    }


    //Task 2. (score 5)
    //Create function:
    //Parameter one Plane
    //Result: print cost and topSpeed if the plane is military otherwise print model and country

    public void task2(Plane plain){
        System.out.println("Plain coast: "+ plain.getCost());
        System.out.println("Plain top speed" + plain.getTopSpeed());
        if (plain.isMil()){
            System.out.println("Plain model : "+ plain.getModel());
            System.out.println("Plain country" + plain.getCountry());
        }
    }

    public Plane task3(Plane plain1, Plane plain2){
        if (plain1.getYear()>=plain2.getYear())
            return plain1;
            else
                return plain2;
    }
    public String task4(Plane plain1, Plane plain2){
        if (plain1.getWingspan()>plain2.getWingspan())
            return plain1.getModel();
        else
            return plain2.getModel();
    }

    public void task5(Plane plain1, Plane plain2,Plane plain3){
        if (plain1.getSeats()>=plain2.getSeats()&&plain1.getSeats()>=plain3.getSeats())
            System.out.println("Plain country" + plain1.getCountry());
        else if (plain2.getSeats()>plain1.getSeats()&&plain2.getSeats()>plain3.getSeats())
            System.out.println("Plain country" + plain2.getCountry());
        else System.out.println("Plain country" + plain3.getCountry());
    }
    public void task6(Plane [] arr_plane){
        for(int i=0;i<arr_plane.length;i++)
        {
            if (!arr_plane[i].isMil())
                System.out.println(arr_plane[i].toString());
        }
    }

    public void task7(Plane [] arr_plane){
        for(int i=0;i<arr_plane.length;i++)
        {
            if (arr_plane[i].isMil()){
                if (arr_plane[i].getHours()>=100);
                    System.out.println(arr_plane[i].toString());
            }

        }
    }

    public Plane task8(Plane [] arr_plane){
        Plane tempPlain=arr_plane[0];
        for(int i=1;i<arr_plane.length;i++)
        {
            if (arr_plane[i].getWeight()<tempPlain.getWeight())
                tempPlain=arr_plane[i];
        }
        return tempPlain;
    }

    public Plane task9(Plane [] arr_plane){
        Plane tempPlain=arr_plane[arr_plane.length];
        for(int i=arr_plane.length-1;i>0;i--)
        {
            if (arr_plane[i].isMil()){
            if (arr_plane[i].getCost()<tempPlain.getCost())
                tempPlain=arr_plane[i];
        }
        return tempPlain;
    }




}
