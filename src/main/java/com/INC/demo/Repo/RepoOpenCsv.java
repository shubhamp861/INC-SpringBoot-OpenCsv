package com.INC.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.INC.demo.Model.ModelInc;

@Repository
public interface RepoOpenCsv extends JpaRepository<ModelInc, Integer> {

}
