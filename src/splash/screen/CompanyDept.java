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
@Table(name = "company_dept", catalog = "dbms_project_047", schema = "")
@NamedQueries({
    @NamedQuery(name = "CompanyDept.findAll", query = "SELECT c FROM CompanyDept c")
    , @NamedQuery(name = "CompanyDept.findByDeptNo", query = "SELECT c FROM CompanyDept c WHERE c.deptNo = :deptNo")
    , @NamedQuery(name = "CompanyDept.findByDeptName", query = "SELECT c FROM CompanyDept c WHERE c.deptName = :deptName")
    , @NamedQuery(name = "CompanyDept.findByDeptLoc", query = "SELECT c FROM CompanyDept c WHERE c.deptLoc = :deptLoc")})
public class CompanyDept implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Dept_No")
    private String deptNo;
    @Column(name = "Dept_Name")
    private String deptName;
    @Column(name = "Dept_Loc")
    private String deptLoc;

    public CompanyDept() {
    }

    public CompanyDept(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        String oldDeptNo = this.deptNo;
        this.deptNo = deptNo;
        changeSupport.firePropertyChange("deptNo", oldDeptNo, deptNo);
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        String oldDeptName = this.deptName;
        this.deptName = deptName;
        changeSupport.firePropertyChange("deptName", oldDeptName, deptName);
    }

    public String getDeptLoc() {
        return deptLoc;
    }

    public void setDeptLoc(String deptLoc) {
        String oldDeptLoc = this.deptLoc;
        this.deptLoc = deptLoc;
        changeSupport.firePropertyChange("deptLoc", oldDeptLoc, deptLoc);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (deptNo != null ? deptNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompanyDept)) {
            return false;
        }
        CompanyDept other = (CompanyDept) object;
        if ((this.deptNo == null && other.deptNo != null) || (this.deptNo != null && !this.deptNo.equals(other.deptNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "splash.screen.CompanyDept[ deptNo=" + deptNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
