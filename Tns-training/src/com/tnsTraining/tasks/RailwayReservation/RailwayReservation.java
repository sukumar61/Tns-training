package com.tnsTraining.tasks.RailwayReservation;

import java.util.Scanner;
abstract class Train {

    final String RAILWAY_NAME = "Indian Railways";

    protected int trainNumber;
    protected String trainName;
    protected int availableSeats;

    Train(int trainNumber, String trainName, int availableSeats) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.availableSeats = availableSeats;
    }

    abstract void bookTicket();

    abstract void cancelTicket();

    abstract void displayTrain();
}


class ExpressTrain extends Train {

    static int totalBookings = 0;

    ExpressTrain(int trainNumber,
                 String trainName,
                 int availableSeats) {

        super(trainNumber, trainName, availableSeats);
    }

    @Override
    void bookTicket() {

        if (availableSeats > 0) {
            availableSeats--;
            totalBookings++;

            System.out.println("Ticket Booked Successfully");
        } else {
            System.out.println("No Seats Available");
        }
    }

    @Override
    void cancelTicket() {

        availableSeats++;
        totalBookings--;

        System.out.println("Ticket Cancelled Successfully");
    }

    @Override
    void displayTrain() {

        System.out.println("\nTrain Number : " + trainNumber);
        System.out.println("Train Name : " + trainName);
        System.out.println("Available Seats : " + availableSeats);
    }
}

class Passenger {

    private int passengerId;
    private String passengerName;

    Passenger(int passengerId,
              String passengerName) {

        this.passengerId = passengerId;
        this.passengerName = passengerName;
    }

    void displayPassenger() {

        System.out.println("\nPassenger ID : "
                + passengerId);

        System.out.println("Passenger Name : "
                + passengerName);
    }
}
public class RailwayReservation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ExpressTrain train =
                new ExpressTrain(
                        12704,
                        "Falaknuma Express",
                        5);

        Passenger passenger =
                new Passenger(
                        101,
                        "Sukumar");

        int choice;

        do {
        	 System.out.println("");
            System.out.println("RAILWAY RESERVATION");
            System.out.println("1. View Train");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. View Passenger");
            System.out.println("5. Total Bookings");
            System.out.println("6. Exit");
            System.out.println("");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    train.displayTrain();
                    break;

                case 2:
                    train.bookTicket();
                    break;

                case 3:
                    train.cancelTicket();
                    break;

                case 4:
                    passenger.displayPassenger();
                    break;

                case 5:
                    System.out.println(
                            "Total Bookings : "
                                    + ExpressTrain.totalBookings);
                    break;

                case 6:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);

        sc.close();
    }

}
