package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue
    private int empId;
    @Size(min = 2, message = "Employee First Name Should be Atleat 2 Character")
    private String empFirstName;

    @Pattern(regexp = "[]A-Za-z]*", message = "Last name should not contain space and special characters")
    private String empLastName;

    private String empAddress;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date empDOB;

    @Size(min = 10, max = 10 , message = "Contact Number Must Be have 10 Digits")
    @Column(unique = true)
    private String empContactNumber;

    private double empSalary;

    @Email(message = "Email Id Must Be Valid")
    @Column(unique = true)
    private String empEmailId;

    @Size(min=4, message = "Password Should be Atleast 4 Characters")
    private String empPassword;


}
