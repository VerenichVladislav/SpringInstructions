package ru.javabegin.training.springlibrary.objects;

public class Instruction {
    private Section section;
    private User publisher;
    private String name;
    private byte[] content;
    private byte[] image;
    private String descr;
    private Integer rating;
    private Long voteCount;

    public Instruction() {
    }

    public Instruction(Section section, User publisher, String name, byte[] content, byte[] image, String descr, Integer rating, Long voteCount) {
        this.section = section;
        this.publisher = publisher;
        this.name = name;
        this.content = content;
        this.image = image;
        this.descr = descr;
        this.rating = rating;
        this.voteCount = voteCount;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public User getPublisher() {
        return publisher;
    }

    public void setPublisher(User publisher) {
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Long getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Long voteCount) {
        this.voteCount = voteCount;
    }
}
