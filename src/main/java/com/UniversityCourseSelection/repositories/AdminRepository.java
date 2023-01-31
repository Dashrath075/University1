package com.UniversityCourseSelection.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.UniversityCourseSelection.entities.Admin;


@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {

}
