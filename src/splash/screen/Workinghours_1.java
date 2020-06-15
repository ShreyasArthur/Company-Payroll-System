/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splash.screen;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author SSJ Shreyas
 */
@Entity
@Table(name = "workinghours", catalog = "dbms_project_047", schema = "")
@NamedQueries({
    @NamedQuery(name = "Workinghours_1.findAll", query = "SELECT w FROM Workinghours_1 w")
    , @NamedQuery(name = "Workinghours_1.findByEmpid", query = "SELECT w FROM Workinghours_1 w WHERE w.empid = :empid")
    , @NamedQuery(name = "Workinghours_1.findByPNo", query = "SELECT w FROM Workinghours_1 w WHERE w.pNo = :pNo")
    , @NamedQuery(name = "Workinghours_1.findByHours", query = "SELECT w FROM Workinghours_1 w WHERE w.hours = :hours")})
public class Workinghours_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Emp_id")
    private String empid;
    @Column(name = "PNo")
    private String pNo;
    @Column(name = "Hours")
    private Integer hours;

    public Workinghours_1() {
    }

    public Workinghours_1(String empid) {
        this.empid = empid;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        String oldEmpid = this.empid;
        this.empid = empid;
        changeSupport.firePropertyChange("empid", oldEmpid, empid);
    }

    public String getPNo() {
        return pNo;
    }

    public void setPNo(String pNo) {
        String oldPNo = this.pNo;
        this.pNo = pNo;
        changeSupport.firePropertyChange("PNo", oldPNo, pNo);
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        Integer oldHours = this.hours;
        this.hours = hours;
        changeSupport.firePropertyChange("hours", oldHours, hours);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empid != null ? empid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Workinghours_1)) {
            return false;
        }
        Workinghours_1 other = (Workinghours_1) object;
        if ((this.empid == null && other.empid != null) || (this.empid != null && !this.empid.equals(other.empid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "splash.screen.Workinghours_1[ empid=" + empid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
