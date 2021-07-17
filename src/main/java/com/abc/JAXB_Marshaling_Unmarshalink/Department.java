package com.abc.JAXB_Marshaling_Unmarshalink;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import static javax.xml.bind.annotation.XmlAccessType.FIELD;

@XmlRootElement (name = "department")
@XmlAccessorType ( FIELD)
public class Department {
    private int id;
    private String dept;

    public int getId ( ) {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public String getDept ( ) {
        return dept;
    }

    public void setDept ( String dept ) {
        this.dept = dept;
    }

    public Department ( int id, String dept ) {
        this.id = id;
        this.dept = dept;
    }

    @Override
    public String toString ( ) {
        return "Department{" +
                "id=" + id +
                ", dept='" + dept + '\'' +
                '}';
    }

    public Department ( ) {
    }
}
