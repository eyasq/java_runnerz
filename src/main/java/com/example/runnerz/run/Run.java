package com.example.runnerz.run;

import org.springframework.cglib.core.Local;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

public class Run {
    private Integer id;
    private String title;
    private LocalDateTime startedOn;
    private LocalDateTime completedOn;
    private Integer miles;
    private Location location;


    public Run(Integer id, String title, LocalDateTime startedOn, LocalDateTime completedOn, Integer miles, Location location){
        this.id = id;
        this.title = title;
        this.startedOn = startedOn;
        this.completedOn = completedOn;
        this.location = location;
        this.miles = miles;

        if(!completedOn.isAfter(startedOn)){
            throw new IllegalArgumentException("Completed on must be after started on.");
        }
    }

    public Duration getDuration(){
        return Duration.between(startedOn, completedOn);
    }

    public Integer getAvgPace(){
        return Math.toIntExact(getDuration().toMinutes()/miles);
    }
    public Integer getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public LocalDateTime getStartedOn(){
        return startedOn;
    }
    public LocalDateTime getCompletedOn(){
        return completedOn;
    }

    public Integer getMiles(){
        return miles;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setStartedOn(LocalDateTime startedOn){
        this.startedOn = startedOn;
    }
    public void setCompletedOn(LocalDateTime completedOn){
        this.completedOn = completedOn;
    }
    public void setMiles(Integer miles){
        this.miles=miles;
    }
    public void setLocation(Location location){
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Run run = (Run) o;
        return Objects.equals(id, run.id) && Objects.equals(title, run.title) && Objects.equals(startedOn, run.startedOn) && Objects.equals(completedOn, run.completedOn) && Objects.equals(miles, run.miles) && Objects.equals(location, run.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, startedOn, completedOn, miles, location);
    }

    @Override
    public String toString() {
        return "Run{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", startedOn=" + startedOn +
                ", completedOn=" + completedOn +
                ", miles=" + miles +
                ", location=" + location +
                '}';
    }
}
