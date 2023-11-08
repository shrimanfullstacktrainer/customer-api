package com.app.customer.entity;

import lombok.Data;

import javax.persistence.*;

import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "USERS")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    @Column(name = "firstname", nullable = false)
    private String firstName;
    @Column(name = "lastname", nullable = false)
    private String lastName;

    @Column(name ="dateofbirth")
    private Date dateOfBirth;

    @Column(name ="last4Ssn")
    private String last4Ssn;
    @Column(name ="email")
    private String email;
    @Column(name ="phonenumber")
    private String phoneNumber;


}
