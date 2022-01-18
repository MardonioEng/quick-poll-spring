package io.github.devmarodrigues.dto;

public class OptionCount {

    private Long optionId;
    private Integer count;

    public OptionCount() {
    }

    public OptionCount(Long optionId, Integer count) {
        this.optionId = optionId;
        this.count = count;
    }

    public Long getOptionId() {
        return optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
