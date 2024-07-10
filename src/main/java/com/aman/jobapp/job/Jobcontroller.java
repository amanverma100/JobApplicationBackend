package com.aman.jobapp.job;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Jobcontroller {
    List<Job> jobs=new ArrayList<>();
    @GetMapping("/jobs")
    public List<Job>findall()
    {
        return jobs;
    }
    @PostMapping("/jobs")
    public String createjob(@RequestBody Job job)
    {
         jobs.add(job);
        return "job created successfully";
    }




}
