package com.fintech.demo

import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import org.junit.Test
import org.w3c.dom.Document

import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class XmlDemoSpec {

    def setup() {
    }

    def cleanup() {
    }


    @Test
    void "test something"() {

        String aListApartXML = "<daily-values> " +
                "  <total-fat units=\"g\">65</total-fat> " +
                "  <saturated-fat units=\"g\">20</saturated-fat> " +
                "  <cholesterol units=\"mg\">300</cholesterol> " +
                "  <sodium units=\"mg\">2400</sodium> " +
                "  <carb units=\"g\">300</carb> " +
                "  <fiber units=\"g\">25</fiber> " +
                "  <protein units=\"g\">50</protein> " +
                "</daily-values> ";

        Document xml = parse(aListApartXML);
        assertThat(xml, hasXPath("/daily-values/saturated-fat", equalTo("10")));
    }

    private static Document parse(String xml) throws Exception {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(false);
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        return documentBuilder?.parse(new ByteArrayInputStream(xml.getBytes()));
    }
}