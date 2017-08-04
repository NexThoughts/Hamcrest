package com.fintech.demo

class Employee {
    String name
    String identificationNumber
    String position
    Integer age

    Employee() {

    }

    Employee(String name, String identificationNumber, String position, Integer age) {
        this.name = name
        this.identificationNumber = identificationNumber
        this.position = position
        this.age = age
    }

    public String toString() {
        return this?.name + " " + this?.age
    }
}
