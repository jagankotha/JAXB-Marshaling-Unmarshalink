package com.abc.JAXB_Marshaling_Unmarshalink;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.Arrays;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class App
{
    public static void main(String[] args)
    {
        Student employee = new Student (1, "Lokesh", "Gupta", new Department(101, "IT"));

        employee.setHobbies(Arrays.asList("Swimming","Playing", "Karate"));

        jaxbObjectToXML(employee);
    }

    private static void jaxbObjectToXML( Student employee)
    {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

            //Print XML String to Console
            jaxbMarshaller.marshal(employee, new File("employee.xml"));
            jaxbMarshaller.marshal(employee, new PrintWriter ( System.out ) );
     String unmarshal="<employee>\n" +
             "    <id>1</id>\n" +
             "    <firstName>Lokesh</firstName>\n" +
             "    <lastName>Gupta</lastName>\n" +
             "    <department>\n" +
             "        <id>101</id>\n" +
             "        <dept>IT</dept>\n" +
             "    </department>\n" +
             "    <hobbies>\n" +
             "        <hobby>Swimming</hobby>\n" +
             "        <hobby>Playing</hobby>\n" +
             "        <hobby>Karate</hobby>\n" +
             "    </hobbies>\n" +
             "</employee>";

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Student student = (Student) jaxbUnmarshaller.unmarshal(new StringReader (unmarshal));
            System.out.println (student );
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
