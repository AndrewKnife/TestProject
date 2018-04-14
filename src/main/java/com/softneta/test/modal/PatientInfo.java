package com.softneta.test.modal;

public class PatientInfo {
    private ImageEntity image;
    private PatientEntity patient;

    public PatientInfo() {
    }

    public PatientInfo(ImageEntity image, PatientEntity patient) {
        this.image = image;
        this.patient = patient;
    }

    public ImageEntity getImage() {
        return image;
    }

    public void setImage(ImageEntity image) {
        this.image = image;
    }

    public PatientEntity getPatient() {
        return patient;
    }

    public void setPatient(PatientEntity patient) {
        this.patient = patient;
    }
}
