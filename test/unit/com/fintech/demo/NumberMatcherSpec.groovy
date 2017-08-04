package com.fintech.demo

import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin

import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.*

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class NumberMatcherSpec {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        assertThat(200.24, is(closeTo(200, 0.0)))
//        assertThat(20, greaterThan(18))
        List<Integer> ages = [21, 25, 30]
        assertThat(ages, everyItem(greaterThan(18)))
        assertThat([21,43,56,18], everyItem(greaterThanOrEqualTo(18)))
        assertThat(ages, everyItem(lessThan(35)))
        assertThat([21,43,56,18], everyItem(lessThanOrEqualTo(56)))
    }

}
