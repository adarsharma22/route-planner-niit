package route;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class RouteExecution {
    public int countData(String fileNmae){
        int count=0;
        String line;
        try {
            BufferedReader br=new BufferedReader(new FileReader(fileNmae));
            while ((line= br.readLine())!=null){
                count++;
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
        return count;
    }
    public FlightDetails[] readFile(String filename,int count) throws IOException {
        FlightDetails[] arr1 =new FlightDetails[count];

        BufferedReader br=new BufferedReader(new FileReader(filename));
        String line;
        int j=0;
        while ((line= br.readLine())!=null){
            String arr[]=line.split(",");
            FlightDetails f1=new FlightDetails(arr[0],arr[1],arr[2],arr[3],arr[4]);
            arr1[j]=f1;
            j++;
        }br.close();

        return arr1;
    }
    public static void main(String[] args) throws IOException {
        RouteExecution routeExecution=new RouteExecution();

        int count=routeExecution.countData("src/main/resources/routes.csv");
        FlightDetails[] arr =routeExecution.readFile("src/main/resources/routes.csv",count);
        System.out.println("List of all flights");
        for (FlightDetails e:arr){
            System.out.println(e);
        }
        System.out.println();
       functions f1=new functions();
        Scanner inp=new Scanner(System.in);
       System.out.println("Enter source city to check direct flights");
        String source=inp.nextLine();
        FlightDetails[] directflight= f1.showDirectFlights(source,arr);
        System.out.println("Sorted list of flights:");
        System.out.println();
        f1.sortDirectFlight(directflight);
        for (FlightDetails s:directflight){
            System.out.println(s);
        }
        System.out.println();
        System.out.println();
        System.out.println("Enter source city to check all flights: ");
        String s1=inp.nextLine();
        System.out.println("Enter Destination city to check all flights: ");
        String s2=inp.nextLine();
        f1.showAllConnection(arr,s1,s2);
        System.out.println("Thankyou for flying with us!");







    }
}