package dayHibernate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Employee")
@Table(name = "employees") public class Employee {

    @Id
    @Column(name = "emp_no")
    private long empNo;

    @OneToMany(mappedBy="employee")
    private List<Title> titles = new ArrayList<>();

    public List<Title> getTitles() { return titles; }
    public void setTitles(List<Title> titles) { this.titles = titles; }

    @Column(name = "birth_date")
    private java.sql.Date birthDate;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "hire_date")
    private java.sql.Date hireDate;

    public long getEmpNo() {
        return empNo;
    }

    public void setEmpNo(long empNo) {
        this.empNo = empNo;
    }


    public java.sql.Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(java.sql.Date birthDate) {
        this.birthDate = birthDate;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public java.sql.Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(java.sql.Date hireDate) {
        this.hireDate = hireDate;
    }

}
