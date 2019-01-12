package dayHibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity(name = "Title")
@Table(name = "titles")
public class Title implements Serializable {

    @EmbeddedId
    private TitleId titleId;

    @Column(name = "to_date")
    private java.sql.Date toDate;

    @MapsId("empNumber")
    @ManyToOne
    private Employee employee;


    public Title() {
    }

    public Title(TitleId titleId, Date toDate) {
        this.titleId = titleId;
        this.toDate = toDate;
    }

    public java.sql.Date getToDate() {
        return toDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setToDate(java.sql.Date toDate) {
        this.toDate = toDate;
    }

    public TitleId getTitleId() {
        return titleId;
    }

    public void setTitleId(TitleId titleId) {
        this.titleId = titleId;
    }

}