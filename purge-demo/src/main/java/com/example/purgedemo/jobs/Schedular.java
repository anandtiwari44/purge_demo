package com.example.purgedemo.jobs;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.purgedemo.service.PurgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedular {
    @Autowired
    private PurgeService purgeService;

    //    @Scheduled(cron = "0/1 0 0 * * *")
    @Scheduled(fixedRate = 60000)
    public void execute() {
        purgeService.findAllStudents().forEach(mapper -> {
            System.out.println("| "+mapper.getId()+" | "+mapper.getStudentName()+" | "+mapper.getCreateTimestamp()+" | ");
        });
    }
}
