package com.bridgelab.bookstoreapp.services;


import com.bridgelab.bookstoreapp.dto.LoginDto;
import com.bridgelab.bookstoreapp.entity.Login;

/**
 * Purpose To Create Interface Class For Login Service
 *
 * @author : Asim Ahammed
 * @since : 13-12-2021
 */
public interface ILoginService {
    String addLogin(LoginDto loginDTO);

}