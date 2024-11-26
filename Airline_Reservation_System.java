package Airline_Reservation_System;
import java.util.*;
public class Airline_Reservation_System {
 public static void main (String[]args)
 {
System.out.println ("The following are the available flights: \n"); 

System.out.println
 ("--------------------------------------------------------------------------------------\r\n"
 		+ "---------------------------\n");

System.out.println
 ("| SJ101 | Spicejet | BOM to PNQ | 04:50 | 05/04/2024 \r\n"
 		+ "|\n");

System.out.println
 ("| EM108 | Emirates | BLR to DXB | 22:00 | 06/04/2024 |");
System.out.println("| VS205 | Vistaras | DEL to BOM | 11:15 | 07/04/2024 |");
System.out.println
 ("| AI133 | AirIndia | BLR to HYD | 09:25 | 08/04/2024 |");
System.out.println
 ("| SJ106 | Spicejet | AMD to DXB | 23:00 | 09/04/2024 |");
System.out.println
 ("-----------------------------------------------------------------------------------------------------------------");
Airline a = new Airline ();
Scanner sc = new Scanner (System.in);
int ch;
do
 {
System.out.println
 ("Enter\n1 Select flight\n2 Booking tickets\n3 Cancelling ticket\n4 Searching a passenger\n0 Exit\n");
ch = sc.nextInt ();
switch (ch)
 {
 case 1:
a.accept_fd ();
a.display_fd ();
System.out.println
 ("-----------------------------------------------------------------------------------------------------------------");
break;
case 2:a.Booking ();
break;
case 3:a.cancelBooking ();
break;
case 4:a.search ();
break;
 }
 }
while (ch != 0);
sc.close ();
 }
}
interface flightinfo{
String accept_fd();
void display_fd();
void search ();
void Booking ();
void cancelBooking ();
 
}
class Airline implements flightinfo
{
 List < String > names = new ArrayList <> ();
 List < String > ages = new ArrayList <> ();
 List < Integer > price =
new ArrayList <> (Arrays.asList (1000, 
2000, 3000, 4000, 5000));
 int sum = 0;
 int discountedprice = 0;
 String flight_number;
 int i;
 Scanner sc = new Scanner (System.in);
 List < String > fnumber =
new ArrayList <>
(Arrays.asList ("SJ101", "EM108", "VS205", 
"AI133", "SJ106"));
 List < String > fname =
new ArrayList <>
(Arrays.asList
("Spicejet", "Emirates", "Vistaras", 
"AirIndia", "Spicejet"));
 List < String > fdestination =
new ArrayList <>
(Arrays.asList
("BOM to PNQ", "BLR to DXB", "DEL to BOM", 
"BLR to HYD", "AMD to DXB"));
 List < String > ftime =
new ArrayList <>
(Arrays.asList ("04:50", "22:00", "11:15", 
"09:25", "23:00"));
 List < String > fdate =
new ArrayList <>
(Arrays.asList
("05/04/2024", "06/04/2024", "07/04/2024", 
"08/04/2024", "09/04/2024"));
public String accept_fd ()
 {
System.out.println ("Enter the flight number: ");
flight_number = sc.nextLine ();
return flight_number;
 }
public void display_fd ()
 {
try
{
 int found = 1;
 for (i = 0; i < fnumber.size (); i++)
{
 if (flight_number.equals (fnumber.get 
(i)))
{
 System.out.println
("-----------------------------------------------------------------------------------------------------------------");
 System.out.println ("FLIGHT DETAILS: \n");
 System.out.println ("FLIGHT NUMBER:" + "\t " + fnumber.get (i));
 System.out.println ("\nFLIGHT NAME:" + "\t " + fname.get (i));
 System.out.println ("\nFLIGHT ROUTE:" + "\t " +
 
fdestination.get (i));
 System.out.println ("\nFLIGHT TIME:" + "\t " + ftime.get (i));
 System.out.println ("\nFLIGHT DATE:" + "\t " + fdate.get (i));
 found = 0;
}
}
 if (found == 1)
{
 throw new Exception ();
}
}
catch (Exception e)
{
 System.out.println ("invalid flight id");
 accept_fd ();
 display_fd ();
}
 }
public void Booking ()
 {
sum = 0;
discountedprice = 0;
names.clear ();
ages.clear ();
System.out.println ("Enter number of passengers: ");
int no_passengers = sc.nextInt ();
sc.nextLine ();
for (int i = 0; i < no_passengers; i++)
 {
System.out.println ("Enter your name: ");
names.add (sc.nextLine ());
System.out.println ("Enter your age: ");
ages.add (Integer.toString (sc.nextInt 
()));
sc.nextLine ();
 }
System.out.println
 ("-----------------------------------------------------------------------------------------------------------------");
System.out.println
 ("----------------------------------------TICKET DETAILS-----------------------------------------------------------");
System.out.println
 ("-----------------------------------------------------------------------------------------------------------------");
System.out.println ("FLIGHT DETAILS: \n");
display_fd ();
System.out.println ("\n\nPASSENGER DETAILS: \n");
for (int j = 0; j < no_passengers; j++) {
 System.out.println("Passenger name: "
+ names.get(j) + ", Passenger age: " + 
ages.get(j));
 
System.out.println(this.flight_number);
 }
 for (int j = 0; j < 5; j++) {
 if
(this.flight_number.equals(fnumber.get(j))) {
 for (i = 0; i < no_passengers; 
i++) {
 if
(Integer.parseInt(ages.get(i)) < 18) {
 sum += price.get(j) - 100;
 } else {
 sum += price.get(j);
 }
 }
 }
 }
 System.out.println("Total charges: "
+sum);
System.out.println ("\n\nTotal charges after taxes: " + (1.18 * sum));
System.out.println
 ("-----------------------------------------------------------------------------------------------------------------");
 }
 public void cancelBooking ()
 {
Scanner sc = new Scanner (System.in);
System.out.println ("Enter the passenger name to cancel the booking: ");
String passengerName = sc.nextLine ();
boolean found = false;
for (int i = 0; i < names.size (); i++)
 {
if (names.get (i).equals 
(passengerName))
 {
names.remove (i);
ages.remove (i);
if (flight_number.equals 
(fnumber.get (i)))
 {
if (Integer.parseInt (ages.get 
(i)) < 18)
 {
sum -= (price.get (i) -
100);
 }
else
 {
sum -= price.get (i);
 }
 }
System.out.println ("Booking for passenger " + passengerName +" canceled successfully.");
found = true;
break;
 }
 }
if (!found)
 {
System.out.println ("Passenger not found. No booking canceled.");
 }
 }
public void search ()
 {
int found = 0;
System.out.println ("Enter the name of the passenger to be searched: ");
String search_name = sc.nextLine ();
for (int i = 0; i < names.size (); i++)
 {
if (search_name.equals (names.get (i)))
 {
System.out.println ("\nPASSENGER NAME: " + names.get (i));
System.out.println ("\nPASSENGER AGE: " + ages.get (i));
display_fd ();
found = 1;
 }
 }
if (found == 0)
 {
System.out.println ("Passenger name not found");
 }
 }
 
}