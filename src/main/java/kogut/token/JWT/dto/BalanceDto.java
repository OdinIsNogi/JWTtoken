package kogut.token.JWT.dto;

import java.time.LocalDate;

public class BalanceDto {
    private LocalDate localDate;
    private double balance;

    public BalanceDto() {
    }

    public BalanceDto(LocalDate localDate, double balance) {
        this.localDate = localDate;
        this.balance = balance;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
