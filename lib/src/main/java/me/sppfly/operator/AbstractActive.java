package me.sppfly.operator;
/// 
/// ! This sounds like an awful idea, it wastes the only chance for others to 
/// ! extends a parent class. But lets just keep it here.
/// 
public abstract class AbstractActive implements Active {

	private boolean active = false;

	@Override
	public void disable() {
		this.active = false;
	}

	@Override
	public void enable() {
		this.active = true;
	}

	@Override
	public boolean isEnabled() {
		return this.active;
	}

}
