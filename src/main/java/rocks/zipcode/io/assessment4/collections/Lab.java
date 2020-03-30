package rocks.zipcode.io.assessment4.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {

    String labName;
    LabStatus labStatus;

    public Lab() {
        this.labName = null;
        this.labStatus = LabStatus.PENDING;
    }
    public Lab(String labName) {

        this.labName = labName;
        this.labStatus = LabStatus.PENDING;
    }

    public String getName() {
        return labName;
    }

    public void setStatus(LabStatus labStatus) {
        this.labStatus = labStatus;
    }

    public LabStatus getStatus() {
        return labStatus;
    }
}
