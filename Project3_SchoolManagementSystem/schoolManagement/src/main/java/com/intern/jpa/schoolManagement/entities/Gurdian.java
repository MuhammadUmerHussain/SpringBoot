package com.intern.jpa.schoolManagement.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Embeddable

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@AttributeOverrides({


        @AttributeOverride(

                name="name",
                column = @Column(

                        name = "gurdianName"
                )
        ),
        @AttributeOverride(

                name="email",
                column = @Column(

                        name = "gurdianEmail"
                )
        ),
        @AttributeOverride(

                name="mobile",
                column = @Column(

                        name = "gurdianMobile"
                )
        )
}
)
public class Gurdian {

    private String name;
    private String email;
    private String mobile;
}
