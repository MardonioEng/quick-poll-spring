package io.github.devmarodrigues.dto;

import java.util.Collection;

public class VoteResult {

    private Integer totalVotes;
    private Collection<OptionCount> results;

    public VoteResult() {
    }

    public VoteResult(Integer totalVotes, Collection<OptionCount> results) {
        this.totalVotes = totalVotes;
        this.results = results;
    }

    public Integer getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(Integer totalVotes) {
        this.totalVotes = totalVotes;
    }

    public Collection<OptionCount> getResults() {
        return results;
    }

    public void setResults(Collection<OptionCount> results) {
        this.results = results;
    }
}
