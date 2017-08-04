package com.fintech.demo

import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class CoreMatcherSpec {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {

        String test1 = "Lake Louie Brewery Company"
        assertThat(test1, allOf(startsWith("Lake"), containsString("Brew")))

        String test2 = "Grumpy Troll Brewery";
        assertThat(test2, anyOf(startsWith("breww"), containsString("Troll")))

        String test3 = "Miller Lite"
        assertThat(test3, both(containsString("Miller")).and(containsString("Lite")))

        String test4 = "Miller Brewing Company";
        assertThat("Miller Brewing Company", is(equalTo(test4)));
    }
}
