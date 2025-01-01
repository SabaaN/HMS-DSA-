/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.ArrayList;

public class BillingInfo {
    private int patientID;
    private ArrayList<Integer> medicineID;
    private int fee;
    private String date, rec; 

    public BillingInfo() {
        this.patientID = 0;
        this.medicineID = new ArrayList<>();
        this.fee = 0;
        this.date = "";
        this.rec = "";
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public ArrayList<Integer> getMedicineID() {
        return this.medicineID;
    }

    public void setMedicineID(int medicineID) {
        this.medicineID.add(medicineID);
    }
    
    
    
    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRec() {
        return rec;
    }

    public void setRec(String rec) {
        this.rec = rec;
    }
    
    
}
