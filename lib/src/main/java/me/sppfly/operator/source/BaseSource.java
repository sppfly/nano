package me.sppfly.operator.source;


public class BaseSource extends AbstractSource<String> {

	private Integer seq;

	public BaseSource(String name, Integer id) {
		super(name, id);
		super.supplier = () -> {
			return String.format("String-%d", seq++);
		};
		this.seq = 0;
		
	}



}
