package com.app.customer.service;

import com.app.customer.entity.User;
import com.app.customer.repository.UserRepository;
import com.app.customer.repository.spec.UserSpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> findAll(){
        return this.userRepository.findAll();

    }

    public void findUserBy(int id){
        Optional<User> user = this.userRepository.findById(id);
        //Assertions.equals(user.getFirstName(),"XYZ");
    }

    public List<User> searchUser(User user){
       // List<Criteria> criteriaAndClause = new ArrayList<>();
       // Criteria criteria = CriteriaBuilder.;
        return this.userRepository.findAll(UserSpecification.filterUser(user));
    }

}
