package dayHibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

@Embeddable
public class TitleId implements Serializable {
    @Column(name = "emp_no")
    private long empNumber;

    @Column(name = "title")
    private String title;

    @Column(name = "from_date")
    private java.sql.Date fromDate;

    public TitleId() {
    }

    public TitleId(long empNumber, String title, Date fromDate) {
        this.empNumber = empNumber;
        this.title = title;
        this.fromDate = fromDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TitleId)) return false;
        TitleId that = (TitleId) o;
        return Objects.equals(getEmpNumber(), that.getEmpNumber()) &&
               Objects.equals(getTitle(), that.getTitle()) &&
               Objects.equals(getFromDate(), that.getFromDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpNumber(), getTitle(), getFromDate());
    }


    public long getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(long empNumber) {
        this.empNumber = empNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }
}