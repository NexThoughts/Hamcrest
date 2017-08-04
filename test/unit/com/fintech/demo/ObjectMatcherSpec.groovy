package com.fintech.demo

import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class ObjectMatcherSpec {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
//        assertThat("123", is(123))
        Employee employee = new Employee("Anubhav", "identi", "devloper", 24)
        assertThat(employee, hasToString("Anubhav 2"));

//        assertThat(employee, instanceOf(Employee.class))

//        assertThat(Employee.class, not(typeCompatibleWith(Number.class)))

//        assertThat(Employee.class, typeCompatibleWith(Object.class))

//        assertThat(employee, nullValue())
//        assertThat(employee, notNullValue())
    }
}
