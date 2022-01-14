package com.bridgelab.bookstoreapp.repository;

import com.bridgelab.bookstoreapp.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Purpose : To used for access & manage database.
 *
 * @author ASIM AHAMMED
 * @version : 0.0.1-SNAPSHOT
 * @since 2021-12-03
 */
public interface LoginRepository extends JpaRepository<Login, Integer> {

}

