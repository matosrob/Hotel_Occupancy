/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week_5;

import java.util.Scanner;

/**
 *
 * @author Rob
 */
public class HotelOccupancyD 

{//Begin class

    public static void main(String[] args)
    {//Begin main method

			
    Scanner input = new Scanner(System.in);
    HotelOccupancyC hotel = new HotelOccupancyC();



    int floors = 0;
    int totalOccupied = 0;
    int totalRooms = 0;

    System.out.print("How many floors does the hotel have?  ");
    floors = input.nextInt();

    while (floors < 1)
    {
        System.out.print("You must enter 1 or more: ");
        floors = input.nextInt();
    }
    
    hotel.setFloors(floors);

    for (int i = 1; i <= floors; i++)
    {
        System.out.print("How many rooms does floor " + i + " have? ");
        int rooms = input.nextInt();

        while (rooms < 10)
        {
            System.out.print("You must enter 10 or more: ");
            rooms = input.nextInt();
        }

        hotel.setRooms(rooms);
    
        totalRooms += rooms;
        hotel.setTotalRooms(totalRooms);
        System.out.print("How many occupied rooms does floor " + i  + " have? ");
        int occupied = input.nextInt();

        while (occupied > rooms)
        {
            System.out.print("You must enter " + rooms + " or less. Re-enter: ");
            occupied = input.nextInt();
        }

         totalOccupied += occupied;
         hotel.setTotalOccupied(totalOccupied);
    }

      // Calculate the number of vacant rooms.
    hotel.setVacantRooms(hotel.getTotalRooms() - hotel.getTotalOccupied());

      // Calculate the occupancy rate.
    hotel.setOccupancy((double)hotel.getTotalOccupied() / hotel.getTotalRooms()); 

    System.out.println("Number of rooms: " + hotel.getTotalRooms());
    System.out.println("Occupied rooms: " + hotel.getTotalOccupied());
    System.out.println("Vacant rooms: " + hotel.getVacantRooms());
    System.out.println("Occupancy rate: " + hotel.getOccupancy() * 100 + "%");
    
    
   }
}

