package com.structa.bank.repositories;

import com.structa.bank.entities.Account;
import com.structa.bank.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Account> findByAccount(Account account);
}