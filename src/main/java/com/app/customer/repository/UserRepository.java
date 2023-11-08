package com.app.customer.repository;

import com.app.customer.entity.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> , JpaSpecificationExecutor<User> {
    public List<User> findAll();
    //public List<User>  findAll(@Nullable Specification<User> specification);
}
