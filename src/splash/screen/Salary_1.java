/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splash.screen;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author SSJ Shreyas
 */
@Entity
@Table(name = "salary", catalog = "dbms_project_047", schema = "")
@NamedQueries({
    @NamedQuery(name = "Salary_1.findAll", query = "SELECT s FROM Salary_1 s")
    , @NamedQuery(name = "Salary_1.findByEmpid", query = "SELECT s FROM Salary_1 s WHERE s.empid = :empid")
    , @NamedQuery(name = "Salary_1.findBySalaryDate", query = "SELECT s FROM Salary_1 s WHERE s.salaryDate = :salaryDate")
    , @NamedQuery(name = "Salary_1.findByBonusid", query = "SELECT s FROM Salary_1 s WHERE s.bonusid = :bonusid")
    , @NamedQuery(name = "Salary_1.findBySalaryDeducted", query = "SELECT s FROM Salary_1 s WHERE s.salaryDeducted = :salaryDeducted")
    , @NamedQuery(name = "Salary_1.findByTotalSalary", query = "SELECT s FROM Salary_1 s WHERE s.totalSalary = :totalSalary")})
public class Salary_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Emp_id")
    private String empid;
    @Column(name = "Salary_Date")
    @Temporal(TemporalType.DATE)
    private Date salaryDate;
    @Column(name = "Bonus_id")
    private String bonusid;
    @Column(name = "Salary_Deducted")
    private Integer salaryDeducted;
    @Column(name = "Total_Salary")
    private Integer totalSalary;

    public Salary_1() {
    }

    public Salary_1(String empid) {
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

    public Date getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(Date salaryDate) {
        Date oldSalaryDate = this.salaryDate;
        this.salaryDate = salaryDate;
        changeSupport.firePropertyChange("salaryDate", oldSalaryDate, salaryDate);
    }

    public String getBonusid() {
        return bonusid;
    }

    public void setBonusid(String bonusid) {
        String oldBonusid = this.bonusid;
        this.bonusid = bonusid;
        changeSupport.firePropertyChange("bonusid", oldBonusid, bonusid);
    }

    public Integer getSalaryDeducted() {
        return salaryDeducted;
    }

    public void setSalaryDeducted(Integer salaryDeducted) {
        Integer oldSalaryDeducted = this.salaryDeducted;
        this.salaryDeducted = salaryDeducted;
        changeSupport.firePropertyChange("salaryDeducted", oldSalaryDeducted, salaryDeducted);
    }

    public Integer getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(Integer totalSalary) {
        Integer oldTotalSalary = this.totalSalary;
        this.totalSalary = totalSalary;
        changeSupport.firePropertyChange("totalSalary", oldTotalSalary, totalSalary);
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
        if (!(object instanceof Salary_1)) {
            return false;
        }
        Salary_1 other = (Salary_1) object;
        if ((this.empid == null && other.empid != null) || (this.empid != null && !this.empid.equals(other.empid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "splash.screen.Salary_1[ empid=" + empid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
