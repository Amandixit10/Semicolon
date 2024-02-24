package com.psl.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.psl.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByEmail(String email);

	@Query(value = "select * from Users u where u.email =:email", nativeQuery = true)
	Optional<User> validateCredentials(@Param("email") String email);
	
	@Query(value = "select * from Users u where u.roles =:role", nativeQuery = true)
	Optional<User> checkAdminRole(@Param("role") String role);

	@Query(value = "select * from users u inner join score s on u.user_name=s.student_name where quiz_id=:quizId order by obtained_score desc limit 3", nativeQuery = true)
	List<User> getTopScores(Long quizId);
	
}
