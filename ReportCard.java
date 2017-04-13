package com.example.android.miwok;


public class ReportCard {
    private String mStudentName;
    private String mStudentID;
    private int mEnglishDegree;
    private int mSecondaryLanguageDegree;
    private int mMathDegree;
    private int mChemistryDegree;
    private int mPhysicsDegree;

    public String getmStudentName() {
        return mStudentName;
    }

    public void setmStudentName(String mStudentName) {
        this.mStudentName = mStudentName;
    }

    public String getmStudentID() {
        return mStudentID;
    }

    public void setmStudentID(String mStudentID) {
        this.mStudentID = mStudentID;
    }

    public int getmSecondaryLanguageDegree() {
        return mSecondaryLanguageDegree;
    }

    public void setmSecondaryLanguageDegree(int mSecondaryLanguageDegree) {
        this.mSecondaryLanguageDegree = mSecondaryLanguageDegree;
    }

    public int getmEnglishDegree() {
        return mEnglishDegree;
    }

    public void setmEnglishDegree(int mEnglishDegree) {
        this.mEnglishDegree = mEnglishDegree;
    }

    public int getmMathDegree() {
        return mMathDegree;
    }

    public void setmMathDegree(int mMathDegree) {
        this.mMathDegree = mMathDegree;
    }

    public int getmChemistryDegree() {
        return mChemistryDegree;
    }

    public void setmChemistryDegree(int mChemistryDegree) {
        this.mChemistryDegree = mChemistryDegree;
    }

    public int getmPhysicsDegree() {
        return mPhysicsDegree;
    }

    public void setmPhysicsDegree(int mPhysicsDegree) {
        this.mPhysicsDegree = mPhysicsDegree;
    }

    public int getmBiologyDegree() {
        return mBiologyDegree;
    }

    public void setmBiologyDegree(int mBiologyDegree) {
        this.mBiologyDegree = mBiologyDegree;
    }

    private int mBiologyDegree;

    public ReportCard(String mStudentName, String mStudentID) {
        this.mStudentName = mStudentName;
        this.mStudentID = mStudentID;
    }

    public ReportCard(String mStudentName, String mStudentID, int mEnglishDegree, int mSecondaryLanguageDegree,
                      int mMathDegree, int mChemistryDegree, int mPhysicsDegree, int mBiologyDegree) {

        this.mStudentName = mStudentName;
        this.mStudentID = mStudentID;
        this.mEnglishDegree = mEnglishDegree;
        this.mSecondaryLanguageDegree = mSecondaryLanguageDegree;
        this.mMathDegree = mMathDegree;
        this.mChemistryDegree = mChemistryDegree;
        this.mPhysicsDegree = mPhysicsDegree;
        this.mBiologyDegree = mBiologyDegree;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "mStudentName='" + mStudentName + '\'' +
                ", mStudentID='" + mStudentID + '\'' +
                ", mEnglishDegree=" + mEnglishDegree +
                ", mSecondaryLanguageDegree=" + mSecondaryLanguageDegree +
                ", mMathDegree=" + mMathDegree +
                ", mChemistryDegree=" + mChemistryDegree +
                ", mPhysicsDegree=" + mPhysicsDegree +
                ", mBiologyDegree=" + mBiologyDegree +
                '}';
    }
}
