package com.sammidev.entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor
public class Employee {
    public Employee(String name, String nip, String career, STATUS status, Date createAt) {
        this.name = name;
        this.nip = nip;
        this.career = career;
        this.status = status;
        this.createAt = createAt;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "nip")
    private String nip;

    @Column(name = "career")
    private String career;

    @Column(name = "status")
    private STATUS status;

    @Column(name = "created_at")
    private Date createAt;

    @Column(name = "updated_at")
    private Date updatedAt;
}