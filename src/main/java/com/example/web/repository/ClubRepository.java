package com.example.web.repository;

import com.example.web.models.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClubRepository extends  JpaRepository<Club,Long> {
        @Query("Select c from Club c WHERE c.title LIKE CONCAT('%', :query ,'%')")
        List<Club> searchClub(String query);

}
