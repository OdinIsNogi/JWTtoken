package kogut.token.JWT.service;

import kogut.token.JWT.dto.BalanceDto;
import kogut.token.JWT.dto.TransactionDto;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class BalanceServiceImpl implements BalanceService {

    private final TransactionService transactionService;

    public BalanceServiceImpl(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @Override
    public BalanceDto getBalance() {
        double sum = transactionService.getAll()
                .stream()
                .mapToDouble(TransactionDto::getFlow)
                .sum();
        return new BalanceDto(LocalDate.now(), sum);
    }

    @Override
    public BalanceDto getBalanceByDate(LocalDate localDate) {

        //условие
        double sum = transactionService.getAll()
                .stream()
                .filter(t -> !t.getDate().isAfter(localDate))
                .mapToDouble(TransactionDto::getFlow)
                .sum();
        return new BalanceDto(localDate, sum);
    }
}
