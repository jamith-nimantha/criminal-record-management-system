package lk.ijse.gdse.server.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recordID;
    private String recordName;
    private String recordCategory;
    private String incidentLocation;
    @Temporal(TemporalType.DATE)
    private Date incidentDate;
    @Temporal(TemporalType.TIME)
    private Date incidentTIme;
    private String VictimsName;
    private String recordDec;
    @OneToMany(mappedBy = "record")
    private List<CriminalRecordDetails> criminalRecordDetails=new ArrayList<>();

    public Record() {
    }

    public Record(String recordName, String recordCategory, String incidentLocation, Date incidentDate, Date incidentTIme, String victimsName, String recordDec) {
        this.recordName = recordName;
        this.recordCategory = recordCategory;
        this.incidentLocation = incidentLocation;
        this.incidentDate = incidentDate;
        this.incidentTIme = incidentTIme;
        VictimsName = victimsName;
        this.recordDec = recordDec;
    }

    public Record(String recordName, String recordCategory, String incidentLocation, Date incidentDate, Date incidentTIme, String victimsName, String recordDec, List<CriminalRecordDetails> criminalRecordDetails) {
        this.recordName = recordName;
        this.recordCategory = recordCategory;
        this.incidentLocation = incidentLocation;
        this.incidentDate = incidentDate;
        this.incidentTIme = incidentTIme;
        VictimsName = victimsName;
        this.recordDec = recordDec;
        this.criminalRecordDetails = criminalRecordDetails;
    }


    public int getRecordID() {
        return recordID;
    }

    public void setRecordID(int recordID) {
        this.recordID = recordID;
    }

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public String getRecordCategory() {
        return recordCategory;
    }

    public void setRecordCategory(String recordCategory) {
        this.recordCategory = recordCategory;
    }

    public String getIncidentLocation() {
        return incidentLocation;
    }

    public void setIncidentLocation(String incidentLocation) {
        this.incidentLocation = incidentLocation;
    }

    public Date getIncidentDate() {
        return incidentDate;
    }

    public void setIncidentDate(Date incidentDate) {
        this.incidentDate = incidentDate;
    }

    public Date getIncidentTIme() {
        return incidentTIme;
    }

    public void setIncidentTIme(Date incidentTIme) {
        this.incidentTIme = incidentTIme;
    }

    public String getVictimsName() {
        return VictimsName;
    }

    public void setVictimsName(String victimsName) {
        VictimsName = victimsName;
    }

    public String getRecordDec() {
        return recordDec;
    }

    public void setRecordDec(String recordDec) {
        this.recordDec = recordDec;
    }

    public List<CriminalRecordDetails> getCriminalRecordDetails() {
        return criminalRecordDetails;
    }

    public void setCriminalRecordDetails(List<CriminalRecordDetails> criminalRecordDetails) {
        this.criminalRecordDetails = criminalRecordDetails;
    }
}
