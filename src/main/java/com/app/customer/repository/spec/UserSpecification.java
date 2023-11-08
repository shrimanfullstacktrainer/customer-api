package com.app.customer.repository.spec;

import com.app.customer.entity.User;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

public class UserSpecification {
    public static Specification<User> filterUser(User user){
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            if(user.getId() > 0){
                predicates.add(criteriaBuilder.equal(root.get("id"), user.getId()));
            }
            if(StringUtils.hasText(user.getFirstName())){
                predicates.add(criteriaBuilder.like(root.get("firstName"), "%"+user.getFirstName()+"%"));
            }
            if(StringUtils.hasText(user.getLastName())){
                predicates.add(criteriaBuilder.like(root.get("lastName"), "%"+user.getLastName()+"%"));
            }
            if(StringUtils.hasText(user.getEmail())){
                predicates.add(criteriaBuilder.like(root.get("email"), "%"+user.getEmail()+"%"));
            }
            if(StringUtils.hasText(user.getPhoneNumber())){
                predicates.add(criteriaBuilder.like(root.get("phoneNumber"), "%"+user.getPhoneNumber()+"%"));
            }
          return criteriaBuilder.and(predicates.toArray(new Predicate[]{}));
        };
    }
}
