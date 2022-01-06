package io.github.devmarodrigues.repository;

import io.github.devmarodrigues.domain.Vote;
import org.springframework.data.repository.CrudRepository;

public interface VoteRepository extends CrudRepository<Vote, Long> {
}
