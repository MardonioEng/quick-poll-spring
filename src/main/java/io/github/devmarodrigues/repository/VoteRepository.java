package io.github.devmarodrigues.repository;

import io.github.devmarodrigues.domain.Vote;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface VoteRepository extends CrudRepository<Vote, Long> {

    @Query(value = "select v.* from Option o, Vote v where o.id = ?1 and v.option_id = o.id", nativeQuery = true)
    public Iterable<Vote> findByPoll(Long pollId);

}
