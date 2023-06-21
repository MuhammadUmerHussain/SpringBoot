package com.intern.jpa.schoolManagement.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@ToString(exclude = "c")
public class CourseMaterial {

    @Id
    @SequenceGenerator(
            name="courseM_sequence",sequenceName = "courseM_sequence",allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "courseM_sequence"
    )
    private int courseMaterialId;
    private String URL;

    //for course material there should exist of a course so using this coulmn

    @OneToOne(
            cascade = CascadeType.ALL
            ,
            fetch = FetchType.LAZY //only fetch course material not course
    )
    @JoinColumn(
            name ="course_id" ,
            referencedColumnName = "courseId"
    )
    private Course c;
}
