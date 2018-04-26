package BO2;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "people", schema = "test")
public class PeopleBO {
    private Integer id;
    private Date dateTime;
    private String age;
    private String description;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Date_time")
    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    @Basic
    @Column(name = "age")
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PeopleBO peopleBO = (PeopleBO) o;

        if (id != null ? !id.equals(peopleBO.id) : peopleBO.id != null) return false;
        if (dateTime != null ? !dateTime.equals(peopleBO.dateTime) : peopleBO.dateTime != null) return false;
        if (age != null ? !age.equals(peopleBO.age) : peopleBO.age != null) return false;
        if (description != null ? !description.equals(peopleBO.description) : peopleBO.description != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dateTime != null ? dateTime.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
