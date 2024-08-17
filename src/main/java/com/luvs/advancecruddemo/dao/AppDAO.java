package com.luvs.advancecruddemo.dao;

import com.luvs.advancecruddemo.entity.Instructor;

public interface AppDAO {

    void save(Instructor theInstructor);
    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);
}
