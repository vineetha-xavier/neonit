//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.31 at 11:14:46 AM IST 
//


package com.neon.filegenerator.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Instruction3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Instruction3Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CHQB"/>
 *     &lt;enumeration value="HOLD"/>
 *     &lt;enumeration value="PHOB"/>
 *     &lt;enumeration value="TELB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Instruction3Code")
@XmlEnum
public enum Instruction3Code {

    CHQB,
    HOLD,
    PHOB,
    TELB;

    public String value() {
        return name();
    }

    public static Instruction3Code fromValue(String v) {
        return valueOf(v);
    }

}
