package me.sppfly.operator;


public class TextSource extends AbstractSource<String> {

	private Integer seq;

	protected TextSource(String name, Integer id) {
		super(name, id);
		super.supplier = () -> {
			return String.format("String-%d", seq++);
		};
		this.seq = 0;
		
	}

}
