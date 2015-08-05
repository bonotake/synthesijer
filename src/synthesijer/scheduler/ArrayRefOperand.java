package synthesijer.scheduler;

import synthesijer.ast.Type;

public class ArrayRefOperand implements Operand{
	
	public final int depth;
	public final int words;
	
	//private final Type elemType;
	
	private final String name;
	
	private final Type type;
	
	public ArrayRefOperand(String name, Type type, int depth, int words){
		this.name = name;
		this.type = type;
		this.depth = depth;
		this.words = words;
	}
	
	@Override
	public Type getType(){
		return type;
	}
	
	@Override
	public boolean isChaining(SchedulerItem ctx) {
		return false;
	};

	@Override
	public String info(){
		return "ArrayRef<" + getType() + ">(depth=" + depth + ", words=" + words + ")";
	}
}
