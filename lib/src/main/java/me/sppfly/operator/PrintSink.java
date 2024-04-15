package me.sppfly.operator;

public class PrintSink<T> extends AbstractActive implements Sink<T> {

	@Override
	public void to(T t) {
		System.out.println(t);
	}

	@Override
	public void enable() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'enable'");
	}

	@Override
	public void disable() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'disable'");
	}

}
