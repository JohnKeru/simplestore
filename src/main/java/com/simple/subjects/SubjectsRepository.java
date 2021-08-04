package com.simple.subjects;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectsRepository extends JpaRepository<Subjects, Integer> {
	public boolean existsBysubjectId(int subjectId);
	public List<Subjects> findByStudentId(int id);
	public boolean existsByStudentId(int id);
}
