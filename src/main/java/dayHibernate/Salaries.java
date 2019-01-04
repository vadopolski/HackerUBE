package dayHibernate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "salaries")
public class Salaries {

  @Id
  @Column(name = "emp_no")
  private long empNo;

  @Column(name = "salary")
  private long salary;

  @Column(name = "from_date")
  private java.sql.Date fromDate;

  @Column(name = "to_date")
  private java.sql.Date toDate;

  public long getEmpNo() {
    return empNo;
  }
  public void setEmpNo(long empNo) {
    this.empNo = empNo;
  }
  public long getSalary() {
    return salary;
  }
  public void setSalary(long salary) {
    this.salary = salary;
  }
  public java.sql.Date getFromDate() {
    return fromDate;
  }
  public void setFromDate(java.sql.Date fromDate) {
    this.fromDate = fromDate;
  }
  public java.sql.Date getToDate() {
    return toDate;
  }
  public void setToDate(java.sql.Date toDate) {
    this.toDate = toDate;
  }

}
