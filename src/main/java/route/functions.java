package route;

import javax.sound.midi.Soundbank;
import java.util.stream.Stream;

public class functions {
    public FlightDetails[] showDirectFlights(String fromCity,FlightDetails[] flightDetails)
    {int count=0;

        for(int i=0; i< flightDetails.length;i++)
        {
            if(flightDetails[i].getSource().equalsIgnoreCase(fromCity))
            {
                count++;
            }
        }

        FlightDetails[] DirectFlights=new FlightDetails[count];
        int j=0;

        for(int i=0; i< flightDetails.length;i++)
        {
            if(flightDetails[i].getSource().equalsIgnoreCase(fromCity))
            {
                DirectFlights[j]=flightDetails[i];
                j++;
            }
        } System.out.println("We are sorry. At this point of time, we do not have any information on flights originating from "+fromCity);
        return DirectFlights;
    }
    public FlightDetails[] showDirectFlights_destination (String toCity,FlightDetails[] flightDetails)
    {  int count=0;


        for(int i=0; i<flightDetails.length;i++)
        {
            if(flightDetails[i].getDestination().equalsIgnoreCase(toCity))
            {

               count++;

            }
        }
        FlightDetails[] DirectFlights=new FlightDetails[count];
        int j=0;

        for(int i=0; i<flightDetails.length;i++)
        {
            if(flightDetails[i].getDestination().equalsIgnoreCase(toCity))
            {
                DirectFlights[j]=flightDetails[i];
                j++;
            }
        }
        return DirectFlights;
    }

    public void sortDirectFlight(FlightDetails[] Directflight){
        FlightDetails temp;
        for (int i=0;i<Directflight.length-1;i++){
            for (int j=0;j< Directflight.length-i-1;j++){
                if(Directflight[j].getDestination().compareToIgnoreCase(Directflight[j+1].getDestination())>0)
                {
                    temp=Directflight[j];
                    Directflight[j]=Directflight[j+1];
                    Directflight[j+1]=temp;

                }
            }
        }
    }
public void showAllConnection(FlightDetails[] flightDetails,String source,String destination){
        FlightDetails[] sourceAll=showDirectFlights(source,flightDetails);
        FlightDetails[] destinationAll=showDirectFlights_destination(destination,flightDetails);
      //  FlightDetails[] connecting=new FlightDetails[sourceAll.length];
    System.out.println("Direct Flight list:");
    for (int i=0;i< sourceAll.length;i++){
        if ((flightDetails[i].getSource().equalsIgnoreCase(source))&&(flightDetails[i].getDestination().equalsIgnoreCase(destination)))
        {
            System.out.println(flightDetails[i]);
        }
    } System.out.println("We are sorry. At this point of time, we do not have any information on flights originating from "+source);
    System.out.println("connecting flight list: ");
    for (int i=0;i< sourceAll.length;i++)
        {
            for (int j=0;j< destinationAll.length;j++)
            {
               if (sourceAll[i].getDestination().equalsIgnoreCase(destinationAll[j].getSource()))
             {

                System.out.println(sourceAll[i]);
                System.out.println(destinationAll[j]);
             }

            }
        }

}
}
