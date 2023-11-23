package com.githubtest.demo.Repository;

import com.githubtest.demo.Modul.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<UserTable,Long> {
}
