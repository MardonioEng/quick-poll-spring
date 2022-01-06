package io.github.devmarodrigues.repository;

import io.github.devmarodrigues.domain.Poll;
import org.springframework.data.repository.CrudRepository;

public interface PollReporitory extends CrudRepository<Poll, Long> {
}
