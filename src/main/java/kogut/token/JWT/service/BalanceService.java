package kogut.token.JWT.service;



import kogut.token.JWT.dto.BalanceDto;

import java.time.LocalDate;

public interface BalanceService {
    BalanceDto getBalance();

    BalanceDto getBalanceByDate(LocalDate localDate);


}
