package com.springapp.mvc.model;



import org.hibernate.annotations.GenericGenerator;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @GenericGenerator(name="gen",strategy="increment")
    @GeneratedValue(generator="gen")
    @Column(name = "ID", unique = true, nullable = false, precision = 15, scale = 0)
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "AGE", nullable = false)
    private long age;

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

}
