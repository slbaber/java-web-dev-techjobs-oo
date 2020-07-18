package org.launchcode.techjobs_oo;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String nameString;
        String employerString;
        String locationString;
        String positionTypeString;
        String coreCompetencyString;
        int count = 0;

        if (name == null || name == ""){
            nameString = "Data not available";
            count ++;
        }else{
            nameString = name;
        }

        if (employer == null || employer.toString() == ""){
            employerString = "Data not available";
            count ++;
        }else{
            employerString = employer.toString();
        }

        if (location == null || location.toString() == ""){
            locationString = "Data not available";
            count ++;
        }else{
            locationString = location.toString();
        }

        if (positionType == null || positionType.toString() == ""){
            positionTypeString = "Data not available";
            count ++;
        }else{
            positionTypeString = positionType.toString();
        }

        if (coreCompetency == null || coreCompetency.toString() == ""){
            coreCompetencyString = "Data not available";
            count ++;
        }else{
            coreCompetencyString = coreCompetency.toString();
        }

        if (count != 5) {
            return "\n" +
                    "ID: " + id + "\n" +
                    "Name: " + nameString + "\n" +
                    "Employer: " + employerString + "\n" +
                    "Location: " + locationString + "\n" +
                    "Position Type: " + positionTypeString + "\n" +
                    "Core Competency: " + coreCompetencyString + "\n";
        }
        else{
            return "OOPS!  This job does not seem to exist.";
        }
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
