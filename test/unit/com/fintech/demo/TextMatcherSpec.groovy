package com.fintech.demo

import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.*

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class TextMatcherSpec {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        String myTest = ""
        String myTest2 = "Test String"
        assertThat(myTest, isEmptyOrNullString())
        assertThat(myTest2, equalTo("Test String"))
        assertThat(myTest2, equalToIgnoringCase("TEST StrinG"))
        assertThat(myTest2, equalToIgnoringWhiteSpace("TEST StrinG"))
        assertThat(myTest, containsString("writing matcher"))
        assertThat(myTest, endsWith("y."))
        assertThat(myTest, startsWith("Hamcrest"))
        String cereal = "apple jacks"
        assertThat(cereal, stringContainsInOrder(["apple", "jacks"]))
    }
}
