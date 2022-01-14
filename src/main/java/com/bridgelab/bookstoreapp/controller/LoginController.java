package com.bridgelab.bookstoreapp.controller;

import com.bridgelab.bookstoreapp.dto.LoginDto;
import com.bridgelab.bookstoreapp.services.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import com.bridgelab.bookstoreapp.entity.ResponseEntity;

/**
 * Purpose : To demonstrate different HTTP methods
 *
 * @author ASIM AHAMMED
 * @version : 0.0.1-SNAPSHOT
 * @since 2021-12-03
 */
@RestController
@RequestMapping(value = "/login")
public class LoginController {

        public String welcomeMessage = "Success, Welcome to book store app";


        @Autowired
        private ILoginService loginService;

        @GetMapping(value = {"", "/"})
        public ResponseEntity getWelcomeMessage() {
            return new ResponseEntity(welcomeMessage,null , HttpStatus.OK);
        }

        /**
         * Purpose : To add books into database.
         * @param loginDto : Having input data to be added into database.
         * @return ResponseEntity : Having success message, Added data &
         *                          success status response code indicates that the request has succeeded.
         */
        @PostMapping(value = "/")
        public ResponseEntity addLoginUser(@Valid @RequestBody LoginDto loginDto) {
            String successMessage = loginService.addLogin(loginDto);
            return new ResponseEntity(successMessage, loginDto, HttpStatus.OK);
        }

    }

