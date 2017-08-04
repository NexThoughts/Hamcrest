package com.fintech.demo

import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import org.hamcrest.collection.IsIterableContainingInAnyOrder
import org.hamcrest.collection.IsIterableContainingInOrder
import org.hamcrest.collection.IsIterableWithSize
import org.junit.Test
import spock.lang.Specification
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class CollectionMatcherSpec {

    def setup() {
    }

    def cleanup() {
    }

    @Test
    void "test something"() {
     /*   List<Integer> ages = [21, 25, 30, 18];
        assertThat(ages, everyItem(greaterThanOrEqualTo(18)));

        List<Integer> list = [5, 2, 4]

//        assertThat(list, hasSize(4));
        List<String> cloths = ["shirts", "shoes", "pants", "socks"];

        assertThat(cloths, IsIterableWithSize.<String> iterableWithSize(4));
//        assertThat(cloths, IsIterableContainingInOrder.<String> contains("shoes", "pants", "shirts", "socks"));
        assertThat(cloths, IsIterableContainingInAnyOrder.<String> containsInAnyOrder("shoes", "pants", "shirts", "socks"));
//        assertThat(list, contains(5, 2, 4));

//        assertThat(list, containsInAnyOrder(2, 4, 5));

//        assertThat(list, everyItem(greaterThan(1)));
        List<String> fruit = ["apple", "banana", "pear", "blackberry", "grape"];

        assertThat("pear", isOneOf(fruit.toArray()))

        assertThat(fruit, not(empty()))*/
        //TODO : Map

        Map test = [:]
        test.put("name", "anubhav")
        test.put("contactNo", "9999999999")
        test.put("worksIn", "Fintechlabs")

        assertThat(test, hasEntry("name", "anubhav"))
        assertThat(test, hasKey("contactNo"))
        assertThat(test, hasValue("Fintechlabs"))
    }
}
