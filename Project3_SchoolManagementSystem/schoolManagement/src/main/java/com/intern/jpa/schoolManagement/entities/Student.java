package com.intern.jpa.schoolManagement.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="Student_P"
        ,uniqueConstraints = @UniqueConstraint(
                name="emailUnique",
        columnNames = "email"
))
public class Student {


    @Id
    @SequenceGenerator(
            name="student_sequence",sequenceName = "student_sequence",allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private long stduentid;
    private String firstName;
    private String lastName;

    private String email;


    @Embedded
    Gurdian g;
}
