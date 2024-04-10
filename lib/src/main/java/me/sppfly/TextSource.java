package me.sppfly;

public class TextSource implements Source<String> {

    private Integer seq;

    public TextSource() {
        this.seq = 0;
    }

    @Override
    public String get() {
        return String.format("String-%d", seq++);
    }
}
