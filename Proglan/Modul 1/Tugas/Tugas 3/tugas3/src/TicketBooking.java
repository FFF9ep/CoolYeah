import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketBooking {

    private static final double priceRegularAdult = 75000;
    private static final double priceRegularChild = 60000;
    private static final double pricePassAdult = 100000;
    private static final double pricePassChild = 85000;
    private static final double weekendPrice = 0.2; // 20% tambahan harga

    // Untuk menyimpan informasi pesanan
    private static ArrayList<Order> orders = new ArrayList<>();

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=============================================================");
        System.out.println("\t\tWelcome to Ticket Booking System");
        System.out.println("=============================================================");
        System.out.println("Choose a Type of Ticket");
        System.out.println("1. Regular Ticket");
        System.out.println("2. Pass Ticket");
        System.out.println("3. Exit & Generate Invoice");
        System.out.println("=============================================================");
        System.out.print("Input your ticket by number 1 - 2: ");
        try {
            int menuTicket = scanner.nextInt();
            switch (menuTicket) {
                case 1:
                    regularTicket();
                    break;
                case 2:
                    passTicket();
                    break;
                case 3:
                    generateInvoice(); // Menampilkan invoice dan keluar
                    break;
                default:
                    System.out.println("Invalid input! Please try again.");
                    menu();
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a number.");
            scanner.nextLine(); // Clear buffer
            menu();
        }
    }

    private static void regularTicket() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n");
        System.out.println("=============================================================");
        System.out.println("\t\tWelcome to Regular Ticket");
        System.out.println("=============================================================");
        System.out.println("Ticket Regular Price :\nAdult IDR 75.000\nChildren IDR 60.000\n");
        System.out.println("Choose your ticket");
        System.out.println("1. Adult Ticket");
        System.out.println("2. Children Ticket");
        System.out.println("3. Back to Main Menu");
        System.out.println("=============================================================");
        try {
            System.out.print("Input your ticket by number 1 - 2: ");
            int menuRegularChoice = scanner.nextInt();
            scanner.nextLine(); // handle newline after nextInt()

            String name, day;
            int date, quantity;

            switch (menuRegularChoice) {
                case 1:
                    name = getInput("Enter Your Name");
                    day = getInput("Day (e.g., Monday, Saturday)");
                    date = getIntInput("Date (e.g., 29)");
                    quantity = getIntInput("How many tickets do you want to buy?");
                    double totalRegularPriceAdult = calculatePrice(priceRegularAdult, day) * quantity;
                    orders.add(new Order(name, day, date, quantity, "Adult Regular Ticket", totalRegularPriceAdult));
                    break;
                case 2:
                    name = getInput("Enter Your Name");
                    day = getInput("Day (e.g., Monday, Saturday)");
                    date = getIntInput("Date (e.g., 29)");
                    quantity = getIntInput("How many tickets do you want to buy?");
                    double totalRegularPriceChild = calculatePrice(priceRegularChild, day) * quantity;
                    orders.add(new Order(name, day, date, quantity, "Child Regular Ticket", totalRegularPriceChild));
                    break;
                case 3:
                    menu();
                    return;
                default:
                    System.out.println("Invalid Input! Try Again!");
                    regularTicket();
            }

            addMoreTickets(); // Memberi opsi untuk menambah pesanan
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please try again.");
            scanner.nextLine(); // Clear buffer
            regularTicket();
        }
    }

    private static void passTicket() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n");
        System.out.println("=============================================================");
        System.out.println("\t\tWelcome to Pass Ticket");
        System.out.println("=============================================================");
        System.out.println("Pass Ticket Price :\nAdult IDR 100.000\nChildren IDR 85.000\n");
        System.out.println("Choose your ticket");
        System.out.println("1. Adult Ticket");
        System.out.println("2. Children Ticket");
        System.out.println("3. Back to Main Menu");
        System.out.println("=============================================================");
        try {
            System.out.print("Input your ticket by number 1 - 2: ");
            int menuPassChoice = scanner.nextInt();
            scanner.nextLine(); // handle newline after nextInt()

            String name, day;
            int date, quantity;

            switch (menuPassChoice) {
                case 1:
                    name = getInput("Enter Your Name");
                    day = getInput("Day (e.g., Monday, Saturday)");
                    date = getIntInput("Date (e.g., 29)");
                    quantity = getIntInput("How many tickets do you want to buy?");
                    double totalPassPriceAdult = calculatePrice(pricePassAdult, day) * quantity;
                    orders.add(new Order(name, day, date, quantity, "Adult Pass Ticket", totalPassPriceAdult));
                    break;
                case 2:
                    name = getInput("Enter Your Name");
                    day = getInput("Day (e.g., Monday, Saturday)");
                    date = getIntInput("Date (e.g., 29)");
                    quantity = getIntInput("How many tickets do you want to buy?");
                    double totalPassPriceChild = calculatePrice(pricePassChild, day) * quantity;
                    orders.add(new Order(name, day, date, quantity, "Child Pass Ticket", totalPassPriceChild));
                    break;
                case 3:
                    menu();
                    return;
                default:
                    System.out.println("Invalid Input! Try Again!");
                    passTicket();
            }

            addMoreTickets(); // Memberi opsi untuk menambah pesanan
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please try again.");
            scanner.nextLine(); // Clear buffer
            passTicket();
        }
    }

    private static String getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print(prompt + ": ");
            input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Data Harus diisi!");
            }
        } while (input.isEmpty());
        return input;
    }

    private static int getIntInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        boolean valid = false;
        do {
            System.out.print(prompt + ": ");
            try {
                input = scanner.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number!");
                scanner.nextLine(); // clear buffer
            }
        } while (!valid);
        return input;
    }

    private static double calculatePrice(double basePrice, String day) {
        if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
            return basePrice + (basePrice * weekendPrice);
        }
        return basePrice;
    }

    private static void addMoreTickets() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to add more tickets? (yes/no): ");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            menu();
        } else {
            generateInvoice();
        }
    }

    private static void generateInvoice() {
        System.out.println("\n=============================================================");
        System.out.println("\t\tYour Invoice");
        System.out.println("=============================================================");
        double grandTotal = 0;
        for (Order order : orders) {
            System.out.println("Name: " + order.getName());
            System.out.println("Day: " + order.getDay());
            System.out.println("Date: " + order.getDate());
            System.out.println("Ticket Type: " + order.getTicketType());
            System.out.println("Quantity: " + order.getQuantity());
            System.out.println("Total: IDR " + order.getTotal());
            System.out.println("-------------------------------------------------------------");
            grandTotal += order.getTotal();
        }
        System.out.println("Grand Total: IDR " + grandTotal);
        System.out.println("=============================================================");
        System.out.println("Thank you for your purchase!");
        System.exit(0);
    }

    public static void main(String[] args) {
        menu();
    }
}

// Kelas untuk menyimpan informasi pesanan
class Order {
    private String name;
    private String day;
    private int date;
    private int quantity;
    private String ticketType;
    private double total;

    public Order(String name, String day, int date, int quantity, String ticketType, double total) {
        this.name = name;
        this.day = day;
        this.date = date;
        this.quantity = quantity;
        this.ticketType = ticketType;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public String getDay() {
        return day;
    }

    public int getDate() {
        return date;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getTicketType() {
        return ticketType;
    }

    public double getTotal() {
        return total;
    }
}
