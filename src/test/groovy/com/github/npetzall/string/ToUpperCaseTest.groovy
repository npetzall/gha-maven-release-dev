package com.github.npetzall.string

import spock.lang.Specification

class ToUpperCaseTest extends Specification {

    def "Lower case to Upper case" () {
        given: "Lower case string"
        def input = "lowercase only"
        expect: "ToUpperCase to upper case it"
        ToUpperCase.toUpperCase(input) == "LOWERCASE ONLY"
    }

    def "Upper case still Upper case" () {
        given: "Upper case string"
        def input = "I ARE UPPER"
        expect: "To Be unchanged by ToUpperCase"
        ToUpperCase.toUpperCase(input) == "I ARE UPPER"
    }

    def "Mixed case to Upper case" () {
        given: "A Mixed case string"
        def input = "mIxEd CaSE STRinG"
        expect: "ToUpperCase will upper case all lower case"
        ToUpperCase.toUpperCase(input) == "MIXED CASE STRING"
    }
}
