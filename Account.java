public class Account {
    Customer customer; 
    double balance; 
    String[] transactions = new String[100]; 
    int transactionCount = 0;

    public Account(Customer customer) {
        this.customer = customer;
        this.balance = 0;
    }

    void deposit(double amount) {
        balance += amount;
        transactions[transactionCount++] = "Deposited: " + amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions[transactionCount++] = "Withdrew: " + amount;
        } else {
            transactions[transactionCount++] = "Failed withdrawal of: " + amount;
        }
    }

    void printStatement() {
        System.out.println("Statement for " + customer.name);
        for (int i = 0; i < transactionCount; i++) {
            System.out.println(transactions[i]);
        }
        System.out.println("Balance: " + balance);
    }
}
