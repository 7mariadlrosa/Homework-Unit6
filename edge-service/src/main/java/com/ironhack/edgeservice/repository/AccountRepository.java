package com.ironhack.edgeservice.repository;

import com.ironhack.edgeservice.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//NO ENTIENDO POR QUÉ DA FALLO EN TODAS :(
@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
}
