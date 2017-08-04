package com.fintech.demo

import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import org.junit.Test
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class BeanMatcherSpec {

    def setup() {
    }

    def cleanup() {
    }

    @Test
    void "test something"() {

        Employee employee = new Employee("Rohit", "fintech1234", "developer", 22)
//        assertThat(employee, hasProperty("name"))
//        assertThat(employee, hasProperty("name", equalTo("Rohit")))

        Employee newEmployee = new Employee("Rohit", "fintech1234", "developer", 29)
        assertThat(employee, samePropertyValuesAs(newEmployee))
    }
}
