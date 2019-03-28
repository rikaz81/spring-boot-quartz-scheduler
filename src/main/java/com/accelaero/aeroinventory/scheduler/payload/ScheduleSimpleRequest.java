package com.accelaero.aeroinventory.scheduler.payload;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;

public class ScheduleSimpleRequest {


    @NotEmpty
    private String jobName;

    @NotEmpty
    private String serviceName;


    private Date jobScheduleTime; //yyyy/MM/dd HH:mm

    private String cronExpression;


    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Date getJobScheduleTime() {
        return jobScheduleTime;
    }

    public void setJobScheduleTime(Date jobScheduleTime) {
        this.jobScheduleTime = jobScheduleTime;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
