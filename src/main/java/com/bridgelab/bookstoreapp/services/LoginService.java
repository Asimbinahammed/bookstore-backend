package com.bridgelab.bookstoreapp.services;

import com.bridgelab.bookstoreapp.dto.LoginDto;
import com.bridgelab.bookstoreapp.entity.Login;
import com.bridgelab.bookstoreapp.repository.LoginRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

/**
 * Purpose : To demonstrate business logic which implements all the methods in controller layer
 *
 * @author ASIM AHAMMED
 * @version : 0.0.1-SNAPSHOT
 * @since 2021-12-03
 */
@Service
public class LoginService implements ILoginService {

    @Autowired
    private LoginRepository loginRepository;
    @Autowired
    private ModelMapper modelMapper;

    public String ADDED_DATA_SUCCESSFULLY = "ADDED Login into database";
    public String DELETED_DATA_SUCCESSFULLY = "DELETED Login from database";
    public String UPDATED_DATA_SUCCESSFULLY = "UPDATED Login in database";


    @Override
    public String addLogin(LoginDto loginDTO) {
        Login loginData = modelMapper.map(loginDTO, Login.class);
        loginRepository.save(loginData);
        return ADDED_DATA_SUCCESSFULLY;
    }

}
