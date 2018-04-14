package com.softneta.test.modal;

import com.softneta.test.modal.sqlite.ITables;

import javax.persistence.*;

@Entity(name = "study")
@Table(name = "study", schema = "main")
public class StudyEntity implements ITables {
    private String uuid;
    private String id;
    private String patientid;
    private String studydate;
    private String studytime;
    private String accessionnum;
    private String modalities;
    private String referringphysician;
    private String description;
    private String readingphysician;
    private String admittingdiagnoses;
    private String interpretationauthor;
    private String privates;
    private String received;
    private String sourceae;
    private String reviewed;
    private String compressed;
    private String matched;
    private String studymatchworklist;
    private String requestingphysician;
    private String updated;

    @Id
    @Column(name = "uuid")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "patientid")
    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    @Basic
    @Column(name = "studydate")
    public String getStudydate() {
        return studydate;
    }

    public void setStudydate(String studydate) {
        this.studydate = studydate;
    }

    @Basic
    @Column(name = "studytime")
    public String getStudytime() {
        return studytime;
    }

    public void setStudytime(String studytime) {
        this.studytime = studytime;
    }

    @Basic
    @Column(name = "accessionnum")
    public String getAccessionnum() {
        return accessionnum;
    }

    public void setAccessionnum(String accessionnum) {
        this.accessionnum = accessionnum;
    }

    @Basic
    @Column(name = "modalities")
    public String getModalities() {
        return modalities;
    }

    public void setModalities(String modalities) {
        this.modalities = modalities;
    }

    @Basic
    @Column(name = "referringphysician")
    public String getReferringphysician() {
        return referringphysician;
    }

    public void setReferringphysician(String referringphysician) {
        this.referringphysician = referringphysician;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "readingphysician")
    public String getReadingphysician() {
        return readingphysician;
    }

    public void setReadingphysician(String readingphysician) {
        this.readingphysician = readingphysician;
    }

    @Basic
    @Column(name = "admittingdiagnoses")
    public String getAdmittingdiagnoses() {
        return admittingdiagnoses;
    }

    public void setAdmittingdiagnoses(String admittingdiagnoses) {
        this.admittingdiagnoses = admittingdiagnoses;
    }

    @Basic
    @Column(name = "interpretationauthor")
    public String getInterpretationauthor() {
        return interpretationauthor;
    }

    public void setInterpretationauthor(String interpretationauthor) {
        this.interpretationauthor = interpretationauthor;
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
    @Column(name = "received")
    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    @Basic
    @Column(name = "sourceae")
    public String getSourceae() {
        return sourceae;
    }

    public void setSourceae(String sourceae) {
        this.sourceae = sourceae;
    }

    @Basic
    @Column(name = "reviewed")
    public String getReviewed() {
        return reviewed;
    }

    public void setReviewed(String reviewed) {
        this.reviewed = reviewed;
    }

    @Basic
    @Column(name = "compressed")
    public String getCompressed() {
        return compressed;
    }

    public void setCompressed(String compressed) {
        this.compressed = compressed;
    }

    @Basic
    @Column(name = "matched")
    public String getMatched() {
        return matched;
    }

    public void setMatched(String matched) {
        this.matched = matched;
    }

    @Basic
    @Column(name = "studymatchworklist")
    public String getStudymatchworklist() {
        return studymatchworklist;
    }

    public void setStudymatchworklist(String studymatchworklist) {
        this.studymatchworklist = studymatchworklist;
    }

    @Basic
    @Column(name = "requestingphysician")
    public String getRequestingphysician() {
        return requestingphysician;
    }

    public void setRequestingphysician(String requestingphysician) {
        this.requestingphysician = requestingphysician;
    }

    @Basic
    @Column(name = "updated")
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudyEntity that = (StudyEntity) o;

        if (uuid != null ? !uuid.equals(that.uuid) : that.uuid != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (patientid != null ? !patientid.equals(that.patientid) : that.patientid != null) return false;
        if (studydate != null ? !studydate.equals(that.studydate) : that.studydate != null) return false;
        if (studytime != null ? !studytime.equals(that.studytime) : that.studytime != null) return false;
        if (accessionnum != null ? !accessionnum.equals(that.accessionnum) : that.accessionnum != null) return false;
        if (modalities != null ? !modalities.equals(that.modalities) : that.modalities != null) return false;
        if (referringphysician != null ? !referringphysician.equals(that.referringphysician) : that.referringphysician != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (readingphysician != null ? !readingphysician.equals(that.readingphysician) : that.readingphysician != null)
            return false;
        if (admittingdiagnoses != null ? !admittingdiagnoses.equals(that.admittingdiagnoses) : that.admittingdiagnoses != null)
            return false;
        if (interpretationauthor != null ? !interpretationauthor.equals(that.interpretationauthor) : that.interpretationauthor != null)
            return false;
        if (privates != null ? !privates.equals(that.privates) : that.privates != null) return false;
        if (received != null ? !received.equals(that.received) : that.received != null) return false;
        if (sourceae != null ? !sourceae.equals(that.sourceae) : that.sourceae != null) return false;
        if (reviewed != null ? !reviewed.equals(that.reviewed) : that.reviewed != null) return false;
        if (compressed != null ? !compressed.equals(that.compressed) : that.compressed != null) return false;
        if (matched != null ? !matched.equals(that.matched) : that.matched != null) return false;
        if (studymatchworklist != null ? !studymatchworklist.equals(that.studymatchworklist) : that.studymatchworklist != null)
            return false;
        if (requestingphysician != null ? !requestingphysician.equals(that.requestingphysician) : that.requestingphysician != null)
            return false;
        if (updated != null ? !updated.equals(that.updated) : that.updated != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uuid != null ? uuid.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (patientid != null ? patientid.hashCode() : 0);
        result = 31 * result + (studydate != null ? studydate.hashCode() : 0);
        result = 31 * result + (studytime != null ? studytime.hashCode() : 0);
        result = 31 * result + (accessionnum != null ? accessionnum.hashCode() : 0);
        result = 31 * result + (modalities != null ? modalities.hashCode() : 0);
        result = 31 * result + (referringphysician != null ? referringphysician.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (readingphysician != null ? readingphysician.hashCode() : 0);
        result = 31 * result + (admittingdiagnoses != null ? admittingdiagnoses.hashCode() : 0);
        result = 31 * result + (interpretationauthor != null ? interpretationauthor.hashCode() : 0);
        result = 31 * result + (privates != null ? privates.hashCode() : 0);
        result = 31 * result + (received != null ? received.hashCode() : 0);
        result = 31 * result + (sourceae != null ? sourceae.hashCode() : 0);
        result = 31 * result + (reviewed != null ? reviewed.hashCode() : 0);
        result = 31 * result + (compressed != null ? compressed.hashCode() : 0);
        result = 31 * result + (matched != null ? matched.hashCode() : 0);
        result = 31 * result + (studymatchworklist != null ? studymatchworklist.hashCode() : 0);
        result = 31 * result + (requestingphysician != null ? requestingphysician.hashCode() : 0);
        result = 31 * result + (updated != null ? updated.hashCode() : 0);
        return result;
    }
}
