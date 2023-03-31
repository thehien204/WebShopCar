package com.example.shopcar.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employees {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "employees_id")
    private int employeesId;
    @Basic
    @Column(name = "last_name")
    private String lastName;
    @Basic
    @Column(name = "first_name")
    private String firstName;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "job_title")
    private String jobTitle;
    @Basic
    @Column(name = "office_id")
    private Integer officeId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return employeesId == employees.employeesId && Objects.equals(lastName, employees.lastName) && Objects.equals(firstName, employees.firstName) && Objects.equals(email, employees.email) && Objects.equals(jobTitle, employees.jobTitle) && Objects.equals(officeId, employees.officeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeesId, lastName, firstName, email, jobTitle, officeId);
    }
}
