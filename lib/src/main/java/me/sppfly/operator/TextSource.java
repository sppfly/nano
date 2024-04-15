package me.sppfly.operator;

public class TextSource extends AbstractActive implements Source<String> {

	private Integer seq;

	public TextSource() {
		this.seq = 0;
	}

	@Override
	public String get() {
		return String.format("String-%d", seq++);
	}
}
