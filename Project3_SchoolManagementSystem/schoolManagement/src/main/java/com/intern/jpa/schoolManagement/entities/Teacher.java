package com.intern.jpa.schoolManagement.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Teacher {

    @Id
    @SequenceGenerator(
            name="TeacherSquence",
            sequenceName = "TeacherSquence",
            allocationSize = 1
    )
    @GeneratedValue(

            strategy = GenerationType.SEQUENCE,
            generator = "TeacherSquence"
    )
    long teacherId;
    String firstName;

    String lastName;

    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name="teacher_id",
            referencedColumnName = "teacherId"
    )

    List<Course> courseList;
}
