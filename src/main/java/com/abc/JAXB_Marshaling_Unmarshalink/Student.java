package com.abc.JAXB_Marshaling_Unmarshalink;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

import static javax.xml.bind.annotation.XmlAccessType.FIELD;


@XmlRootElement (name = "employee")
@XmlAccessorType ( FIELD)
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String firstName;
    private String lastName;

    private Department department;

    @XmlElementWrapper (name="hobbies")
    @XmlElement (name="hobby")
    private List<String> hobbies;

    public Student () {
        super();
    }

    public Student ( int id, String fName, String lName, Department department) {
        super();
        this.id = id;
        this.firstName = fName;
        this.lastName = lName;
        this.department = department;
    }

    public Integer getId ( ) {
        return id;
    }

    public void setId ( Integer id ) {
        this.id = id;
    }

    public String getFirstName ( ) {
        return firstName;
    }

    public void setFirstName ( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName ( ) {
        return lastName;
    }

    public void setLastName ( String lastName ) {
        this.lastName = lastName;
    }

    public Department getDepartment ( ) {
        return department;
    }

    public void setDepartment ( Department department ) {
        this.department = department;
    }

    public List< String > getHobbies ( ) {
        return hobbies;
    }

    public void setHobbies ( List< String > hobbies ) {
        this.hobbies = hobbies;
    }

    public Student ( Integer id, String firstName, String lastName, Department department, List< String > hobbies ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.hobbies = hobbies;
    }

    @Override
    public String toString ( ) {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department=" + department +
                ", hobbies=" + hobbies +
                '}';
    }
//Setters and Getters
}
