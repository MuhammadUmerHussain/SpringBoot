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
public class Course {

    @Id
    @SequenceGenerator(
            name="course_sequence",sequenceName = "course_sequence",allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_sequence"
    )
    private int courseId;
    private String title;
    private String credit;

    @OneToOne(
            mappedBy = "c"
    )
    CourseMaterial cM;

}
