package com.example.jpa;

import javax.persistence.*;

@Entity(name = "Student")
@Table(name = "student",
uniqueConstraints = {
        @UniqueConstraint(name = "student_email_unique",
                columnNames = "email")
})

public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    @Column(name = "id", updatable = false)
    private Long id;
    @Column(name = "first_name",
            nullable = false,
            columnDefinition = "TEXT")
    private String firsName;
    @Column(name = "last_name",
            nullable = false,
            columnDefinition = "TEXT")
    private String lastName;
    @Column(name = "email",
            nullable = false,
            columnDefinition = "TEXT"
            )
    private String email;
    @Column(name = "age",
            nullable = false)
    private Integer age;

    public Student() {
    }

    public Student( String firsName, String lastName, String email, Integer age) {

        this.firsName = firsName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public Long getId() {
        return id;
    }



    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
