package pl.developerpi91.bank;

public interface BankTransfer {
    void transfer(BankAccount from, BankAccount to, int amount);
}
