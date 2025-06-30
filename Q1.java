// Q1) Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)

enum House {
    SMALL(10000),
    MEDIUM(20000),
    LARGE(30000);

    private int price;

    House(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {
        for (House h : House.values()) {
            System.out.println(h + ": " + h.getPrice());
        }
    }
}
