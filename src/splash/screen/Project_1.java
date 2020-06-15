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
@Table(name = "project", catalog = "dbms_project_047", schema = "")
@NamedQueries({
    @NamedQuery(name = "Project_1.findAll", query = "SELECT p FROM Project_1 p")
    , @NamedQuery(name = "Project_1.findByPNo", query = "SELECT p FROM Project_1 p WHERE p.pNo = :pNo")
    , @NamedQuery(name = "Project_1.findByPName", query = "SELECT p FROM Project_1 p WHERE p.pName = :pName")
    , @NamedQuery(name = "Project_1.findByDeptNo", query = "SELECT p FROM Project_1 p WHERE p.deptNo = :deptNo")})
public class Project_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PNo")
    private String pNo;
    @Column(name = "PName")
    private String pName;
    @Column(name = "Dept_No")
    private String deptNo;

    public Project_1() {
    }

    public Project_1(String pNo) {
        this.pNo = pNo;
    }

    public String getPNo() {
        return pNo;
    }

    public void setPNo(String pNo) {
        String oldPNo = this.pNo;
        this.pNo = pNo;
        changeSupport.firePropertyChange("PNo", oldPNo, pNo);
    }

    public String getPName() {
        return pName;
    }

    public void setPName(String pName) {
        String oldPName = this.pName;
        this.pName = pName;
        changeSupport.firePropertyChange("PName", oldPName, pName);
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        String oldDeptNo = this.deptNo;
        this.deptNo = deptNo;
        changeSupport.firePropertyChange("deptNo", oldDeptNo, deptNo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pNo != null ? pNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Project_1)) {
            return false;
        }
        Project_1 other = (Project_1) object;
        if ((this.pNo == null && other.pNo != null) || (this.pNo != null && !this.pNo.equals(other.pNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "splash.screen.Project_1[ pNo=" + pNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
