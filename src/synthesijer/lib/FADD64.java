package synthesijer.lib;

import synthesijer.hdl.HDLModule;
import synthesijer.hdl.HDLPort.DIR;
import synthesijer.hdl.HDLPrimitiveType;

public class FADD64 extends HDLModule{
	
	public double a;
	public double b;
	public double result;
	public boolean valid;
	public boolean nd;
	
	public FADD64(){
		super("synthesijer_fadd64", "clk", "reset");
		newPort("a",      DIR.IN,  HDLPrimitiveType.genVectorType(64));
		newPort("b",      DIR.IN,  HDLPrimitiveType.genVectorType(64));
		newPort("nd",     DIR.IN,  HDLPrimitiveType.genBitType());
		newPort("result", DIR.OUT, HDLPrimitiveType.genVectorType(64));
		newPort("valid",  DIR.OUT, HDLPrimitiveType.genBitType());
	}

}
