package com.bridgelab.bookstoreapp.dto;


import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Purpose : To declare input and their regex for validations.
 *
 * @author ASIM AHAMMED
 * @version : 0.0.1-SNAPSHOT
 * @since 2021-12-03
 */
@Data
public class LoginDto {

    private String fullName;
    private String email;
    private String password;

}

