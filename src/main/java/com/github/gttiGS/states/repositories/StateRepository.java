package com.github.gttiGS.states.repositories;

import com.github.gttiGS.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
