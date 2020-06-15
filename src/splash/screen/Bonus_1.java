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
@Table(name = "bonus", catalog = "dbms_project_047", schema = "")
@NamedQueries({
    @NamedQuery(name = "Bonus_1.findAll", query = "SELECT b FROM Bonus_1 b")
    , @NamedQuery(name = "Bonus_1.findByBonusid", query = "SELECT b FROM Bonus_1 b WHERE b.bonusid = :bonusid")
    , @NamedQuery(name = "Bonus_1.findByEmpid", query = "SELECT b FROM Bonus_1 b WHERE b.empid = :empid")
    , @NamedQuery(name = "Bonus_1.findByBonuspayment", query = "SELECT b FROM Bonus_1 b WHERE b.bonuspayment = :bonuspayment")})
public class Bonus_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Bonus_id")
    private String bonusid;
    @Column(name = "Emp_id")
    private String empid;
    @Column(name = "Bonus_payment")
    private String bonuspayment;

    public Bonus_1() {
    }

    public Bonus_1(String bonusid) {
        this.bonusid = bonusid;
    }

    public String getBonusid() {
        return bonusid;
    }

    public void setBonusid(String bonusid) {
        String oldBonusid = this.bonusid;
        this.bonusid = bonusid;
        changeSupport.firePropertyChange("bonusid", oldBonusid, bonusid);
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        String oldEmpid = this.empid;
        this.empid = empid;
        changeSupport.firePropertyChange("empid", oldEmpid, empid);
    }

    public String getBonuspayment() {
        return bonuspayment;
    }

    public void setBonuspayment(String bonuspayment) {
        String oldBonuspayment = this.bonuspayment;
        this.bonuspayment = bonuspayment;
        changeSupport.firePropertyChange("bonuspayment", oldBonuspayment, bonuspayment);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bonusid != null ? bonusid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bonus_1)) {
            return false;
        }
        Bonus_1 other = (Bonus_1) object;
        if ((this.bonusid == null && other.bonusid != null) || (this.bonusid != null && !this.bonusid.equals(other.bonusid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "splash.screen.Bonus_1[ bonusid=" + bonusid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
