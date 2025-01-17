package com.fagenius.fleetapp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String firstname;
    private String lastname;
    private String adress;
    private String city;
    @ManyToOne
    @JoinColumn(name = "countryid", insertable = false, updatable = false)
    private Country country;
    private Integer countryid;
    private String details;
    private String mobile;
    private String phone;
    @ManyToOne
    @JoinColumn(name = "stateid", insertable = false ,updatable = false)
    private State state;
    private Integer stateid;
    private String email;
    private String username;
    private String password;

}
