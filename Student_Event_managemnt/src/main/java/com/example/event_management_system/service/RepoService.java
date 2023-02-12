package com.example.event_management_system.service;

import com.example.event_management_system.model.Event;
import com.example.event_management_system.model.Student;

import java.util.List;

public interface RepoService {
    public List<Student> getAllStudents();

    public void addStudent(Student student);

    public Student findStudentById(int id);

    public void updateStudent(int id, Student newstudent);
    public void deleteStudent(int studentId);




    public List<Event> getAllEvents();

    public void addEvent(Event event);


    public Event findEventById(int eventId);
    public void updateEvent(int eventId, Event newevent);

    public void deleteEvent(int eventId);

}
