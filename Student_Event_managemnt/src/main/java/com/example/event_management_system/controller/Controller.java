package com.example.event_management_system.controller;

import com.example.event_management_system.model.Event;
import com.example.event_management_system.model.Student;
import com.example.event_management_system.service.RepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/event_management_system/")
public class Controller {
    @Autowired
    private RepoService repoService;

    @GetMapping("findAllEvents")
    public List<Event> findAllEvents(){
        return repoService.getAllEvents();
    }

    @GetMapping("find_Event_by_id/id/{id}")
    public Event findEventByid(@PathVariable int id){
        return repoService.findEventById(id);
    }



    @PutMapping("add_event")
    public void addEvent(@RequestBody Event event){
        repoService.addEvent(event);
    }

    @PutMapping("update_event/id/{id}/event/{event}")
    public void updateEvent(@PathVariable int id,@RequestBody Event event){
        repoService.updateEvent(id,event);
    }

    @DeleteMapping("deleteevent/id/{id}")
    public void deleteevent(@PathVariable int id){
        repoService.deleteEvent(id);
    }

    @GetMapping("findAllStudents")
    public List<Student> findAllStudents(){
        return repoService.getAllStudents();
    }

    @GetMapping("find_Student_by_id/id/{id}")
    public Student findStudentByid(@PathVariable int id){
        return repoService.findStudentById(id);
    }

    @PutMapping("add_student")
    public void addStudent(@RequestBody Student student){
        repoService.addStudent(student);
    }

    @PutMapping("update_student/id/{id}/student/{student}")
    public void updateStudent(@PathVariable int id,@RequestBody Student student){
        repoService.updateStudent(id,student);
    }

    @DeleteMapping("deletestudent/id/{id}")
    public void deletestudent(@PathVariable int id){
        repoService.deleteStudent(id);
    }

}
