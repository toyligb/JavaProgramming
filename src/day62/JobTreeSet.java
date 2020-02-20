package day62;

import day61.Job;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.*;

public class JobTreeSet {

    public static void main(String[] args) {

        // Create a SortedSet of Job (from day 61) with TreeSet implementation
        // add 5 jobs and print the out vertically and see what you get

        SortedSet<Job> myFavJobs = new TreeSet();
        myFavJobs.add(new Job("CA", 125000, "DDSTech"));
        myFavJobs.add(new Job("AT", 100000, "Intel"));
        myFavJobs.add(new Job("CH", 115000, "Walgreens"));
        myFavJobs.add(new Job("TX", 120000, "DDSTech"));
        myFavJobs.add(new Job("CA", 125000, "DDSTech"));

        System.out.println("myFavJobs = " + myFavJobs);

        myFavJobs.forEach(each -> System.out.println(each));

//        for (Job each : myFavJobs) {
//            System.out.println("each = " + each);
//        }

        // How does HashSet decide 5 Person object

    }

}
