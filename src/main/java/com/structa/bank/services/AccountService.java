package com.structa.bank.services;

import com.structa.bank.entities.Account;
import com.structa.bank.entities.User;
import com.structa.bank.repositories.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    public void createDefaultAccounts(User user) {
        // Checking default
        Account checking = new Account();
        checking.setName("Checking");
        checking.setBalance(BigDecimal.ZERO);
        checking.setDefault(true);
        checking.setUser(user);

        // Savings default
        Account savings = new Account();
        savings.setName("Savings");
        savings.setBalance(BigDecimal.ZERO);
        savings.setDefault(true);
        savings.setUser(user);

        // Save both
        accountRepository.save(checking);
        accountRepository.save(savings);
    }

    // Read
    public List<Account> getAccountsByUser(User user) {
        return accountRepository.findByUser(user);
    }
}