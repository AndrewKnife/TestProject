package com.softneta.test.modal;

import com.softneta.test.modal.sqlite.ITables;

import javax.persistence.*;

@Entity(name = "patient")
@Table(name = "patient", schema = "main")
public class PatientEntity implements ITables {
    private String origid;
    private String lastname;
    private String firstname;
    private String middlename;
    private String studyuid;
    private String prefix;
    private String suffix;
    private String birthdate;
    private String birthtime;
    private String sex;
    private String otherid;
    private String othername;
    private String ethnicgroup;
    private String institution;
    private String address;
    private String comments;
    private String age;
    private String height;
    private String weight;
    private String occupation;
    private String history;
    private String privates;
    private String lastaccess;
    private String patientmatchworklist;
    private String wldata;

    @Basic
    @Column(name = "origid")
    public String getOrigid() {
        return origid;
    }

    public void setOrigid(String origid) {
        this.origid = origid;
    }

    @Basic
    @Column(name = "lastname")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "firstname")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "middlename")
    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    @Id
    @Column(name = "studyuid")
    public String getStudyuid() {
        return studyuid;
    }

    public void setStudyuid(String studyuid) {
        this.studyuid = studyuid;
    }

    @Basic
    @Column(name = "prefix")
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Basic
    @Column(name = "suffix")
    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    @Basic
    @Column(name = "birthdate")
    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @Basic
    @Column(name = "birthtime")
    public String getBirthtime() {
        return birthtime;
    }

    public void setBirthtime(String birthtime) {
        this.birthtime = birthtime;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "otherid")
    public String getOtherid() {
        return otherid;
    }

    public void setOtherid(String otherid) {
        this.otherid = otherid;
    }

    @Basic
    @Column(name = "othername")
    public String getOthername() {
        return othername;
    }

    public void setOthername(String othername) {
        this.othername = othername;
    }

    @Basic
    @Column(name = "ethnicgroup")
    public String getEthnicgroup() {
        return ethnicgroup;
    }

    public void setEthnicgroup(String ethnicgroup) {
        this.ethnicgroup = ethnicgroup;
    }

    @Basic
    @Column(name = "institution")
    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "comments")
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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
    @Column(name = "height")
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Basic
    @Column(name = "weight")
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "occupation")
    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Basic
    @Column(name = "history")
    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    @Basic
    @Column(name = "private")
    public String getPrivates() {
        return privates;
    }

    public void setPrivates(String privates) {
        this.privates = privates;
    }

    @Basic
    @Column(name = "lastaccess")
    public String getLastaccess() {
        return lastaccess;
    }

    public void setLastaccess(String lastaccess) {
        this.lastaccess = lastaccess;
    }

    @Basic
    @Column(name = "patientmatchworklist")
    public String getPatientmatchworklist() {
        return patientmatchworklist;
    }

    public void setPatientmatchworklist(String patientmatchworklist) {
        this.patientmatchworklist = patientmatchworklist;
    }

    @Basic
    @Column(name = "wldata")
    public String getWldata() {
        return wldata;
    }

    public void setWldata(String wldata) {
        this.wldata = wldata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PatientEntity that = (PatientEntity) o;

        if (origid != null ? !origid.equals(that.origid) : that.origid != null) return false;
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        if (middlename != null ? !middlename.equals(that.middlename) : that.middlename != null) return false;
        if (studyuid != null ? !studyuid.equals(that.studyuid) : that.studyuid != null) return false;
        if (prefix != null ? !prefix.equals(that.prefix) : that.prefix != null) return false;
        if (suffix != null ? !suffix.equals(that.suffix) : that.suffix != null) return false;
        if (birthdate != null ? !birthdate.equals(that.birthdate) : that.birthdate != null) return false;
        if (birthtime != null ? !birthtime.equals(that.birthtime) : that.birthtime != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (otherid != null ? !otherid.equals(that.otherid) : that.otherid != null) return false;
        if (othername != null ? !othername.equals(that.othername) : that.othername != null) return false;
        if (ethnicgroup != null ? !ethnicgroup.equals(that.ethnicgroup) : that.ethnicgroup != null) return false;
        if (institution != null ? !institution.equals(that.institution) : that.institution != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (comments != null ? !comments.equals(that.comments) : that.comments != null) return false;
        if (age != null ? !age.equals(that.age) : that.age != null) return false;
        if (height != null ? !height.equals(that.height) : that.height != null) return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;
        if (occupation != null ? !occupation.equals(that.occupation) : that.occupation != null) return false;
        if (history != null ? !history.equals(that.history) : that.history != null) return false;
        if (privates != null ? !privates.equals(that.privates) : that.privates != null) return false;
        if (lastaccess != null ? !lastaccess.equals(that.lastaccess) : that.lastaccess != null) return false;
        if (patientmatchworklist != null ? !patientmatchworklist.equals(that.patientmatchworklist) : that.patientmatchworklist != null)
            return false;
        if (wldata != null ? !wldata.equals(that.wldata) : that.wldata != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = origid != null ? origid.hashCode() : 0;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (middlename != null ? middlename.hashCode() : 0);
        result = 31 * result + (studyuid != null ? studyuid.hashCode() : 0);
        result = 31 * result + (prefix != null ? prefix.hashCode() : 0);
        result = 31 * result + (suffix != null ? suffix.hashCode() : 0);
        result = 31 * result + (birthdate != null ? birthdate.hashCode() : 0);
        result = 31 * result + (birthtime != null ? birthtime.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (otherid != null ? otherid.hashCode() : 0);
        result = 31 * result + (othername != null ? othername.hashCode() : 0);
        result = 31 * result + (ethnicgroup != null ? ethnicgroup.hashCode() : 0);
        result = 31 * result + (institution != null ? institution.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (occupation != null ? occupation.hashCode() : 0);
        result = 31 * result + (history != null ? history.hashCode() : 0);
        result = 31 * result + (privates != null ? privates.hashCode() : 0);
        result = 31 * result + (lastaccess != null ? lastaccess.hashCode() : 0);
        result = 31 * result + (patientmatchworklist != null ? patientmatchworklist.hashCode() : 0);
        result = 31 * result + (wldata != null ? wldata.hashCode() : 0);
        return result;
    }
}
