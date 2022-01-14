package com.bridgelab.bookstoreapp.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Purpose : To declare inputs for connecting with database.
 *
 * @author ASIM AHAMMED
 * @version : 0.0.1-SNAPSHOT
 * @since 2021-12-03
 */
@Entity
@Table(name = "login_details")
@Getter
@Setter
public class Login {

    private String fullName;
    @Id
    private String email;
    private String password;
    @CreationTimestamp
    private LocalDateTime uploaded_time;

    @UpdateTimestamp
    private LocalDateTime updated_time;

}
