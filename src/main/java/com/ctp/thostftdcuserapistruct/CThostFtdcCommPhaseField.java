package com.ctp.thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u901a\u8baf\u9636\u6bb5<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:1110</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
 
public class CThostFtdcCommPhaseField extends StructObject {
	/**
	 * \u4ea4\u6613\u65e5<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(0) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \u901a\u8baf\u65f6\u6bb5\u7f16\u53f7<br>
	 * C type : TThostFtdcCommPhaseNoType
	 */
	@Field(1) 
	public short CommPhaseNo() {
		return this.io.getShortField(this, 1);
	}
	/**
	 * \u901a\u8baf\u65f6\u6bb5\u7f16\u53f7<br>
	 * C type : TThostFtdcCommPhaseNoType
	 */
	@Field(1) 
	public CThostFtdcCommPhaseField CommPhaseNo(short CommPhaseNo) {
		this.io.setShortField(this, 1, CommPhaseNo);
		return this;
	}
	/**
	 * \u7cfb\u7edf\u7f16\u53f7<br>
	 * C type : TThostFtdcSystemIDType
	 */
	@Array({21}) 
	@Field(2) 
	public Pointer<Byte > SystemID() {
		return this.io.getPointerField(this, 2);
	}
	public CThostFtdcCommPhaseField() {
		super();
	}
	public CThostFtdcCommPhaseField(Pointer pointer) {
		super(pointer);
	}
}
