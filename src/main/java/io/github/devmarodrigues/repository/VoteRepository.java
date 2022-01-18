package io.github.devmarodrigues.repository;

import io.github.devmarodrigues.domain.Vote;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface VoteRepository extends CrudRepository<Vote, Long> {

    @Query(value = "select v.* from Option o, Vote v where o.poll_id = ?1 and v.option_id = o.option_id", nativeQuery = true)
    public Iterable<Vote> findByPoll(Long pollId);

}
