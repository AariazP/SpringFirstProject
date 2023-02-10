package com.openbootcamp.spingtest.service;

import com.openbootcamp.spingtest.models.Bootcamper;
import org.jvnet.hk2.annotations.Service;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Service
@Component
public class BootcamperService {

    private ArrayList<Bootcamper> bootcampers;


    public BootcamperService() {
        bootcampers = new ArrayList<>();
        bootcampers.add(new Bootcamper("Juan"));
        bootcampers.add(new Bootcamper("Pedro"));
        bootcampers.add(new Bootcamper("Maria"));
    }


    public ArrayList<Bootcamper> getBootcampers() {
        return bootcampers;
    }

    public void addBootcamper(Bootcamper bootcamper) {
        bootcampers.add(bootcamper);
    }



}
