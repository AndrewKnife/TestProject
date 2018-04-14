package com.softneta.test.modal;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "image")
@Table(name = "image", schema = "main")
public class ImageEntity {
    private String uuid;
    private String sopclass;
    private String seriesuid;
    private String xfersyntax;
    private String instancedate;
    private String instancetime;
    private String instance;
    private String overlay;
    private String curve;
    private String lut;
    private String samplesperpixel;
    private String numrows;
    private String numcolumns;
    private String bitsallocated;
    private String bitsstored;
    private String pixelrepresentation;
    private String photometric;
    private String path;
    private String completion;
    private String description;
    private String verification;
    private String contentdate;
    private String contenttime;
    private String observationdatetime;
    private String verificationdatetime;
    private String doseproduct;
    private String tagged;
    private String numframes;
    private String mimetype;
    private String pixelspacing;
    private String laterality;
    private String type;
    private String acquisitiondate;
    private String acquisitiontime;
    private String algorithm;

    @Id
    @Column(name = "uuid")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "sopclass")
    public String getSopclass() {
        return sopclass;
    }

    public void setSopclass(String sopclass) {
        this.sopclass = sopclass;
    }

    @Basic
    @Column(name = "seriesuid")
    public String getSeriesuid() {
        return seriesuid;
    }

    public void setSeriesuid(String seriesuid) {
        this.seriesuid = seriesuid;
    }

    @Basic
    @Column(name = "xfersyntax")
    public String getXfersyntax() {
        return xfersyntax;
    }

    public void setXfersyntax(String xfersyntax) {
        this.xfersyntax = xfersyntax;
    }

    @Basic
    @Column(name = "instancedate")
    public String getInstancedate() {
        return instancedate;
    }

    public void setInstancedate(String instancedate) {
        this.instancedate = instancedate;
    }

    @Basic
    @Column(name = "instancetime")
    public String getInstancetime() {
        return instancetime;
    }

    public void setInstancetime(String instancetime) {
        this.instancetime = instancetime;
    }

    @Basic
    @Column(name = "instance")
    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    @Basic
    @Column(name = "overlay")
    public String getOverlay() {
        return overlay;
    }

    public void setOverlay(String overlay) {
        this.overlay = overlay;
    }

    @Basic
    @Column(name = "curve")
    public String getCurve() {
        return curve;
    }

    public void setCurve(String curve) {
        this.curve = curve;
    }

    @Basic
    @Column(name = "lut")
    public String getLut() {
        return lut;
    }

    public void setLut(String lut) {
        this.lut = lut;
    }

    @Basic
    @Column(name = "samplesperpixel")
    public String getSamplesperpixel() {
        return samplesperpixel;
    }

    public void setSamplesperpixel(String samplesperpixel) {
        this.samplesperpixel = samplesperpixel;
    }

    @Basic
    @Column(name = "numrows")
    public String getNumrows() {
        return numrows;
    }

    public void setNumrows(String numrows) {
        this.numrows = numrows;
    }

    @Basic
    @Column(name = "numcolumns")
    public String getNumcolumns() {
        return numcolumns;
    }

    public void setNumcolumns(String numcolumns) {
        this.numcolumns = numcolumns;
    }

    @Basic
    @Column(name = "bitsallocated")
    public String getBitsallocated() {
        return bitsallocated;
    }

    public void setBitsallocated(String bitsallocated) {
        this.bitsallocated = bitsallocated;
    }

    @Basic
    @Column(name = "bitsstored")
    public String getBitsstored() {
        return bitsstored;
    }

    public void setBitsstored(String bitsstored) {
        this.bitsstored = bitsstored;
    }

    @Basic
    @Column(name = "pixelrepresentation")
    public String getPixelrepresentation() {
        return pixelrepresentation;
    }

    public void setPixelrepresentation(String pixelrepresentation) {
        this.pixelrepresentation = pixelrepresentation;
    }

    @Basic
    @Column(name = "photometric")
    public String getPhotometric() {
        return photometric;
    }

    public void setPhotometric(String photometric) {
        this.photometric = photometric;
    }

    @Basic
    @Column(name = "path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Basic
    @Column(name = "completion")
    public String getCompletion() {
        return completion;
    }

    public void setCompletion(String completion) {
        this.completion = completion;
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
    @Column(name = "verification")
    public String getVerification() {
        return verification;
    }

    public void setVerification(String verification) {
        this.verification = verification;
    }

    @Basic
    @Column(name = "contentdate")
    public String getContentdate() {
        return contentdate;
    }

    public void setContentdate(String contentdate) {
        this.contentdate = contentdate;
    }

    @Basic
    @Column(name = "contenttime")
    public String getContenttime() {
        return contenttime;
    }

    public void setContenttime(String contenttime) {
        this.contenttime = contenttime;
    }

    @Basic
    @Column(name = "observationdatetime")
    public String getObservationdatetime() {
        return observationdatetime;
    }

    public void setObservationdatetime(String observationdatetime) {
        this.observationdatetime = observationdatetime;
    }

    @Basic
    @Column(name = "verificationdatetime")
    public String getVerificationdatetime() {
        return verificationdatetime;
    }

    public void setVerificationdatetime(String verificationdatetime) {
        this.verificationdatetime = verificationdatetime;
    }

    @Basic
    @Column(name = "doseproduct")
    public String getDoseproduct() {
        return doseproduct;
    }

    public void setDoseproduct(String doseproduct) {
        this.doseproduct = doseproduct;
    }

    @Basic
    @Column(name = "tagged")
    public String getTagged() {
        return tagged;
    }

    public void setTagged(String tagged) {
        this.tagged = tagged;
    }

    @Basic
    @Column(name = "numframes")
    public String getNumframes() {
        return numframes;
    }

    public void setNumframes(String numframes) {
        this.numframes = numframes;
    }

    @Basic
    @Column(name = "mimetype")
    public String getMimetype() {
        return mimetype;
    }

    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    @Basic
    @Column(name = "pixelspacing")
    public String getPixelspacing() {
        return pixelspacing;
    }

    public void setPixelspacing(String pixelspacing) {
        this.pixelspacing = pixelspacing;
    }

    @Basic
    @Column(name = "laterality")
    public String getLaterality() {
        return laterality;
    }

    public void setLaterality(String laterality) {
        this.laterality = laterality;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "acquisitiondate")
    public String getAcquisitiondate() {
        return acquisitiondate;
    }

    public void setAcquisitiondate(String acquisitiondate) {
        this.acquisitiondate = acquisitiondate;
    }

    @Basic
    @Column(name = "acquisitiontime")
    public String getAcquisitiontime() {
        return acquisitiontime;
    }

    public void setAcquisitiontime(String acquisitiontime) {
        this.acquisitiontime = acquisitiontime;
    }

    @Basic
    @Column(name = "algorithm")
    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImageEntity that = (ImageEntity) o;

        if (uuid != null ? !uuid.equals(that.uuid) : that.uuid != null) return false;
        if (sopclass != null ? !sopclass.equals(that.sopclass) : that.sopclass != null) return false;
        if (seriesuid != null ? !seriesuid.equals(that.seriesuid) : that.seriesuid != null) return false;
        if (xfersyntax != null ? !xfersyntax.equals(that.xfersyntax) : that.xfersyntax != null) return false;
        if (instancedate != null ? !instancedate.equals(that.instancedate) : that.instancedate != null) return false;
        if (instancetime != null ? !instancetime.equals(that.instancetime) : that.instancetime != null) return false;
        if (instance != null ? !instance.equals(that.instance) : that.instance != null) return false;
        if (overlay != null ? !overlay.equals(that.overlay) : that.overlay != null) return false;
        if (curve != null ? !curve.equals(that.curve) : that.curve != null) return false;
        if (lut != null ? !lut.equals(that.lut) : that.lut != null) return false;
        if (samplesperpixel != null ? !samplesperpixel.equals(that.samplesperpixel) : that.samplesperpixel != null)
            return false;
        if (numrows != null ? !numrows.equals(that.numrows) : that.numrows != null) return false;
        if (numcolumns != null ? !numcolumns.equals(that.numcolumns) : that.numcolumns != null) return false;
        if (bitsallocated != null ? !bitsallocated.equals(that.bitsallocated) : that.bitsallocated != null)
            return false;
        if (bitsstored != null ? !bitsstored.equals(that.bitsstored) : that.bitsstored != null) return false;
        if (pixelrepresentation != null ? !pixelrepresentation.equals(that.pixelrepresentation) : that.pixelrepresentation != null)
            return false;
        if (photometric != null ? !photometric.equals(that.photometric) : that.photometric != null) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;
        if (completion != null ? !completion.equals(that.completion) : that.completion != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (verification != null ? !verification.equals(that.verification) : that.verification != null) return false;
        if (contentdate != null ? !contentdate.equals(that.contentdate) : that.contentdate != null) return false;
        if (contenttime != null ? !contenttime.equals(that.contenttime) : that.contenttime != null) return false;
        if (observationdatetime != null ? !observationdatetime.equals(that.observationdatetime) : that.observationdatetime != null)
            return false;
        if (verificationdatetime != null ? !verificationdatetime.equals(that.verificationdatetime) : that.verificationdatetime != null)
            return false;
        if (doseproduct != null ? !doseproduct.equals(that.doseproduct) : that.doseproduct != null) return false;
        if (tagged != null ? !tagged.equals(that.tagged) : that.tagged != null) return false;
        if (numframes != null ? !numframes.equals(that.numframes) : that.numframes != null) return false;
        if (mimetype != null ? !mimetype.equals(that.mimetype) : that.mimetype != null) return false;
        if (pixelspacing != null ? !pixelspacing.equals(that.pixelspacing) : that.pixelspacing != null) return false;
        if (laterality != null ? !laterality.equals(that.laterality) : that.laterality != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (acquisitiondate != null ? !acquisitiondate.equals(that.acquisitiondate) : that.acquisitiondate != null)
            return false;
        if (acquisitiontime != null ? !acquisitiontime.equals(that.acquisitiontime) : that.acquisitiontime != null)
            return false;
        if (algorithm != null ? !algorithm.equals(that.algorithm) : that.algorithm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uuid != null ? uuid.hashCode() : 0;
        result = 31 * result + (sopclass != null ? sopclass.hashCode() : 0);
        result = 31 * result + (seriesuid != null ? seriesuid.hashCode() : 0);
        result = 31 * result + (xfersyntax != null ? xfersyntax.hashCode() : 0);
        result = 31 * result + (instancedate != null ? instancedate.hashCode() : 0);
        result = 31 * result + (instancetime != null ? instancetime.hashCode() : 0);
        result = 31 * result + (instance != null ? instance.hashCode() : 0);
        result = 31 * result + (overlay != null ? overlay.hashCode() : 0);
        result = 31 * result + (curve != null ? curve.hashCode() : 0);
        result = 31 * result + (lut != null ? lut.hashCode() : 0);
        result = 31 * result + (samplesperpixel != null ? samplesperpixel.hashCode() : 0);
        result = 31 * result + (numrows != null ? numrows.hashCode() : 0);
        result = 31 * result + (numcolumns != null ? numcolumns.hashCode() : 0);
        result = 31 * result + (bitsallocated != null ? bitsallocated.hashCode() : 0);
        result = 31 * result + (bitsstored != null ? bitsstored.hashCode() : 0);
        result = 31 * result + (pixelrepresentation != null ? pixelrepresentation.hashCode() : 0);
        result = 31 * result + (photometric != null ? photometric.hashCode() : 0);
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (completion != null ? completion.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (verification != null ? verification.hashCode() : 0);
        result = 31 * result + (contentdate != null ? contentdate.hashCode() : 0);
        result = 31 * result + (contenttime != null ? contenttime.hashCode() : 0);
        result = 31 * result + (observationdatetime != null ? observationdatetime.hashCode() : 0);
        result = 31 * result + (verificationdatetime != null ? verificationdatetime.hashCode() : 0);
        result = 31 * result + (doseproduct != null ? doseproduct.hashCode() : 0);
        result = 31 * result + (tagged != null ? tagged.hashCode() : 0);
        result = 31 * result + (numframes != null ? numframes.hashCode() : 0);
        result = 31 * result + (mimetype != null ? mimetype.hashCode() : 0);
        result = 31 * result + (pixelspacing != null ? pixelspacing.hashCode() : 0);
        result = 31 * result + (laterality != null ? laterality.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (acquisitiondate != null ? acquisitiondate.hashCode() : 0);
        result = 31 * result + (acquisitiontime != null ? acquisitiontime.hashCode() : 0);
        result = 31 * result + (algorithm != null ? algorithm.hashCode() : 0);
        return result;
    }
}
