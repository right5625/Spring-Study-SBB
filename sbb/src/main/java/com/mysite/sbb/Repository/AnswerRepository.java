package com.mysite.sbb.Repository;

import com.mysite.sbb.Domain.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}
