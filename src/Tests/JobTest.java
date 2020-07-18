package Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//NOTE: setup() will run before every test and create new objects so the IDs will get pretty large and not be what you'd expect
public class JobTest {
    Job job1;
    Job job2;
    Job job3;
    Job job4;
    Job job5;
    Job job6;
    Job job7;
    Job job8;

    @Before
    public void setup() {
        job1 = new Job("Lead", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        job3 = new Job();
        job4 = new Job();
        job5 = new Job("fifth", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job6 = new Job("Engineer", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job7 = new Job("Engineer", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job8 = new Job("Printer", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        assertEquals(false, job1.equals(job2));
    }

    @Test
    public void testSettingJobIdNoParams() {
        assertFalse(job3.equals(job4));
    }

    @Test
    public void testSettingJobIdSame() {
        assertEquals(true, job5.getId() == job6.getId() - 1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(job5.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(job5.getName() == "fifth");
        assertTrue(job5.getEmployer() instanceof Employer);
        assertTrue(job5.getLocation() instanceof Location);
        assertTrue(job5.getPositionType() instanceof PositionType);
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(job6.equals(job7));
    }

    @Test
    public void jobToString() {
        assertTrue(job8.toString().startsWith("\n"));
        assertTrue(job8.toString().endsWith("\n"));
        assertEquals(job8.toString(), "\n" +
                String.format("ID: %s",job8.getId()) + "\n" +
                "Name: Printer\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence" +
                "\n");
    }

    @Test
    public void emptyJobToString(){
        assertTrue(job3.toString() == "OOPS!  This job does not seem to exist.");
    }




}
