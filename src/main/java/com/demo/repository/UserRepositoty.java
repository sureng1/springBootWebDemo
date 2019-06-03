package com.demo.repository;

import com.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoty extends JpaRepository<User,String> {

    @Query("select t from User t where t.name = :name")
    User findByUserName(@Param("name") String name);
    @Query("select t from User t where t.id = :id")
    User findByUserId(@Param("id") String id);

}
