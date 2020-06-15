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
 * @author Shreyas
 */
@Entity
@Table(name = "employee", catalog = "dbms_project_047", schema = "")
@NamedQueries({
    @NamedQuery(name = "Employee_1.findAll", query = "SELECT e FROM Employee_1 e")
    , @NamedQuery(name = "Employee_1.findByEmpid", query = "SELECT e FROM Employee_1 e WHERE e.empid = :empid")
    , @NamedQuery(name = "Employee_1.findByEmpFName", query = "SELECT e FROM Employee_1 e WHERE e.empFName = :empFName")
    , @NamedQuery(name = "Employee_1.findByEmpLName", query = "SELECT e FROM Employee_1 e WHERE e.empLName = :empLName")
    , @NamedQuery(name = "Employee_1.findByAddress", query = "SELECT e FROM Employee_1 e WHERE e.address = :address")
    , @NamedQuery(name = "Employee_1.findByCity", query = "SELECT e FROM Employee_1 e WHERE e.city = :city")
    , @NamedQuery(name = "Employee_1.findBySex", query = "SELECT e FROM Employee_1 e WHERE e.sex = :sex")
    , @NamedQuery(name = "Employee_1.findByEmailid", query = "SELECT e FROM Employee_1 e WHERE e.emailid = :emailid")
    , @NamedQuery(name = "Employee_1.findByPhoneNo", query = "SELECT e FROM Employee_1 e WHERE e.phoneNo = :phoneNo")
    , @NamedQuery(name = "Employee_1.findByDesignation", query = "SELECT e FROM Employee_1 e WHERE e.designation = :designation")
    , @NamedQuery(name = "Employee_1.findByDeptNo", query = "SELECT e FROM Employee_1 e WHERE e.deptNo = :deptNo")})
public class Employee_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Emp_id")
    private String empid;
    @Column(name = "Emp_FName")
    private String empFName;
    @Column(name = "Emp_LName")
    private String empLName;
    @Column(name = "Address")
    private String address;
    @Column(name = "City")
    private String city;
    @Column(name = "Sex")
    private Character sex;
    @Column(name = "Email_id")
    private String emailid;
    @Column(name = "Phone_No")
    private String phoneNo;
    @Column(name = "Designation")
    private String designation;
    @Column(name = "Dept_No")
    private String deptNo;

    public Employee_1() {
    }

    public Employee_1(String empid) {
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

    public String getEmpFName() {
        return empFName;
    }

    public void setEmpFName(String empFName) {
        String oldEmpFName = this.empFName;
        this.empFName = empFName;
        changeSupport.firePropertyChange("empFName", oldEmpFName, empFName);
    }

    public String getEmpLName() {
        return empLName;
    }

    public void setEmpLName(String empLName) {
        String oldEmpLName = this.empLName;
        this.empLName = empLName;
        changeSupport.firePropertyChange("empLName", oldEmpLName, empLName);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        Character oldSex = this.sex;
        this.sex = sex;
        changeSupport.firePropertyChange("sex", oldSex, sex);
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        String oldEmailid = this.emailid;
        this.emailid = emailid;
        changeSupport.firePropertyChange("emailid", oldEmailid, emailid);
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        String oldPhoneNo = this.phoneNo;
        this.phoneNo = phoneNo;
        changeSupport.firePropertyChange("phoneNo", oldPhoneNo, phoneNo);
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        String oldDesignation = this.designation;
        this.designation = designation;
        changeSupport.firePropertyChange("designation", oldDesignation, designation);
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
        hash += (empid != null ? empid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee_1)) {
            return false;
        }
        Employee_1 other = (Employee_1) object;
        if ((this.empid == null && other.empid != null) || (this.empid != null && !this.empid.equals(other.empid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "splash.screen.Employee_1[ empid=" + empid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
