public class VendingMachine {
    private String selectedProduct;
    private double productPrice;
    private double balance;

    public VendingMachine(String product, double price) {
        selectedProduct = product;
        productPrice = price;
        balance = 0.0;
    }

    public void insertCoin(double amount) {
        balance += amount;
    }

    public void selectProduct(String product, double price) {
        selectedProduct = product;
        productPrice = price;
    }

    public void dispenseProduct() {
        if (balance >= productPrice) {
            System.out.println("Dispensing " + selectedProduct);
            double change = balance - productPrice;
            if (change > 0) {
                System.out.println("Returning change: $" + change);
            }
            balance = 0.0;
        } else {
            System.out.println("Insufficient balance. Returning payment: $" + balance);
            balance = 0.0;
        }
    }

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine("Potato",20);
        vendingMachine.insertCoin(30);
        vendingMachine.dispenseProduct();
    }
}
