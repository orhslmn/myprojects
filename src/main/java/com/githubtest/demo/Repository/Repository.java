package com.githubtest.demo.Repository;

import com.githubtest.demo.Modul.Tables;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Tables, Long> {
}
