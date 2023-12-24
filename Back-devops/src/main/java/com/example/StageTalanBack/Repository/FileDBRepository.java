package com.example.StageTalanBack.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.StageTalanBack.Model.FileDB;
@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {
}