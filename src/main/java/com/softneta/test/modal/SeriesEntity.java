package com.softneta.test.modal;

import com.softneta.test.modal.sqlite.ITables;

import javax.persistence.*;

@Entity(name = "series")
@Table(name = "series", schema = "main")
public class SeriesEntity implements ITables {
    private String uuid;
    private String studyuid;
    private String description;
    private String seriesdate;
    private String seriestime;
    private String department;
    private String stationname;
    private String modality;
    private String bodypart;
    private String seriesnumber;
    private String instances;
    private String protocolname;

    @Id
    @Column(name = "uuid")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "studyuid")
    public String getStudyuid() {
        return studyuid;
    }

    public void setStudyuid(String studyuid) {
        this.studyuid = studyuid;
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
    @Column(name = "seriesdate")
    public String getSeriesdate() {
        return seriesdate;
    }

    public void setSeriesdate(String seriesdate) {
        this.seriesdate = seriesdate;
    }

    @Basic
    @Column(name = "seriestime")
    public String getSeriestime() {
        return seriestime;
    }

    public void setSeriestime(String seriestime) {
        this.seriestime = seriestime;
    }

    @Basic
    @Column(name = "department")
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Basic
    @Column(name = "stationname")
    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname;
    }

    @Basic
    @Column(name = "modality")
    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    @Basic
    @Column(name = "bodypart")
    public String getBodypart() {
        return bodypart;
    }

    public void setBodypart(String bodypart) {
        this.bodypart = bodypart;
    }

    @Basic
    @Column(name = "seriesnumber")
    public String getSeriesnumber() {
        return seriesnumber;
    }

    public void setSeriesnumber(String seriesnumber) {
        this.seriesnumber = seriesnumber;
    }

    @Basic
    @Column(name = "instances")
    public String getInstances() {
        return instances;
    }

    public void setInstances(String instances) {
        this.instances = instances;
    }

    @Basic
    @Column(name = "protocolname")
    public String getProtocolname() {
        return protocolname;
    }

    public void setProtocolname(String protocolname) {
        this.protocolname = protocolname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SeriesEntity that = (SeriesEntity) o;

        if (uuid != null ? !uuid.equals(that.uuid) : that.uuid != null) return false;
        if (studyuid != null ? !studyuid.equals(that.studyuid) : that.studyuid != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (seriesdate != null ? !seriesdate.equals(that.seriesdate) : that.seriesdate != null) return false;
        if (seriestime != null ? !seriestime.equals(that.seriestime) : that.seriestime != null) return false;
        if (department != null ? !department.equals(that.department) : that.department != null) return false;
        if (stationname != null ? !stationname.equals(that.stationname) : that.stationname != null) return false;
        if (modality != null ? !modality.equals(that.modality) : that.modality != null) return false;
        if (bodypart != null ? !bodypart.equals(that.bodypart) : that.bodypart != null) return false;
        if (seriesnumber != null ? !seriesnumber.equals(that.seriesnumber) : that.seriesnumber != null) return false;
        if (instances != null ? !instances.equals(that.instances) : that.instances != null) return false;
        if (protocolname != null ? !protocolname.equals(that.protocolname) : that.protocolname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uuid != null ? uuid.hashCode() : 0;
        result = 31 * result + (studyuid != null ? studyuid.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (seriesdate != null ? seriesdate.hashCode() : 0);
        result = 31 * result + (seriestime != null ? seriestime.hashCode() : 0);
        result = 31 * result + (department != null ? department.hashCode() : 0);
        result = 31 * result + (stationname != null ? stationname.hashCode() : 0);
        result = 31 * result + (modality != null ? modality.hashCode() : 0);
        result = 31 * result + (bodypart != null ? bodypart.hashCode() : 0);
        result = 31 * result + (seriesnumber != null ? seriesnumber.hashCode() : 0);
        result = 31 * result + (instances != null ? instances.hashCode() : 0);
        result = 31 * result + (protocolname != null ? protocolname.hashCode() : 0);
        return result;
    }
}
