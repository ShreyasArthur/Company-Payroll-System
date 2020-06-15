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
@Table(name = "leave_details", catalog = "dbms_project_047", schema = "")
@NamedQueries({
    @NamedQuery(name = "LeaveDetails.findAll", query = "SELECT l FROM LeaveDetails l")
    , @NamedQuery(name = "LeaveDetails.findByLeaveid", query = "SELECT l FROM LeaveDetails l WHERE l.leaveid = :leaveid")
    , @NamedQuery(name = "LeaveDetails.findByEmpid", query = "SELECT l FROM LeaveDetails l WHERE l.empid = :empid")
    , @NamedQuery(name = "LeaveDetails.findByLeavetype", query = "SELECT l FROM LeaveDetails l WHERE l.leavetype = :leavetype")
    , @NamedQuery(name = "LeaveDetails.findByStartingleave", query = "SELECT l FROM LeaveDetails l WHERE l.startingleave = :startingleave")
    , @NamedQuery(name = "LeaveDetails.findByEndingleave", query = "SELECT l FROM LeaveDetails l WHERE l.endingleave = :endingleave")
    , @NamedQuery(name = "LeaveDetails.findByTotalleave", query = "SELECT l FROM LeaveDetails l WHERE l.totalleave = :totalleave")})
public class LeaveDetails implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Leave_id")
    private String leaveid;
    @Column(name = "Emp_id")
    private String empid;
    @Column(name = "Leave_type")
    private String leavetype;
    @Column(name = "Starting_leave")
    @Temporal(TemporalType.DATE)
    private Date startingleave;
    @Column(name = "Ending_leave")
    @Temporal(TemporalType.DATE)
    private Date endingleave;
    @Column(name = "Total_leave")
    private String totalleave;

    public LeaveDetails() {
    }

    public LeaveDetails(String leaveid) {
        this.leaveid = leaveid;
    }

    public String getLeaveid() {
        return leaveid;
    }

    public void setLeaveid(String leaveid) {
        String oldLeaveid = this.leaveid;
        this.leaveid = leaveid;
        changeSupport.firePropertyChange("leaveid", oldLeaveid, leaveid);
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        String oldEmpid = this.empid;
        this.empid = empid;
        changeSupport.firePropertyChange("empid", oldEmpid, empid);
    }

    public String getLeavetype() {
        return leavetype;
    }

    public void setLeavetype(String leavetype) {
        String oldLeavetype = this.leavetype;
        this.leavetype = leavetype;
        changeSupport.firePropertyChange("leavetype", oldLeavetype, leavetype);
    }

    public Date getStartingleave() {
        return startingleave;
    }

    public void setStartingleave(Date startingleave) {
        Date oldStartingleave = this.startingleave;
        this.startingleave = startingleave;
        changeSupport.firePropertyChange("startingleave", oldStartingleave, startingleave);
    }

    public Date getEndingleave() {
        return endingleave;
    }

    public void setEndingleave(Date endingleave) {
        Date oldEndingleave = this.endingleave;
        this.endingleave = endingleave;
        changeSupport.firePropertyChange("endingleave", oldEndingleave, endingleave);
    }

    public String getTotalleave() {
        return totalleave;
    }

    public void setTotalleave(String totalleave) {
        String oldTotalleave = this.totalleave;
        this.totalleave = totalleave;
        changeSupport.firePropertyChange("totalleave", oldTotalleave, totalleave);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (leaveid != null ? leaveid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LeaveDetails)) {
            return false;
        }
        LeaveDetails other = (LeaveDetails) object;
        if ((this.leaveid == null && other.leaveid != null) || (this.leaveid != null && !this.leaveid.equals(other.leaveid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "splash.screen.LeaveDetails[ leaveid=" + leaveid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
