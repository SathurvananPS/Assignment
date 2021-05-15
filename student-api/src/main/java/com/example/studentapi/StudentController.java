package com.example.studentapi;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    StudentRepository repository = new InMemoryStudentRepository();

    //REST endpoints
    //create a student
    @PostMapping("/student")
    public void  createStudent(@RequestBody Student student){


        repository.save(student);


        }
        @GetMapping("/student/:id")
    public Student getStudent(@PathVariable String id){
        return repository.get(id);
            }

    //delete a student
    //update a student


}
