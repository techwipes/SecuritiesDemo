package net.techwipes.securities.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name= "securities")
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "security_name")
    private String securityName;
    @Column(name = "short_name")
    private String shortName;
    @Column(name = "security_id")
    private String secId;
    @Column(name = "reg_number")
    private String regNumber;
    @Column(name = "emitent_title")
    private String emitentTitle;
}


