package com.ctp.thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u8d44\u91d1\u8d26\u6237\u57fa\u672c\u51c6\u5907\u91d1<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:8227</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
 
public class CThostFtdcTradingAccountReserveField extends StructObject {
	/**
	 * \u7ecf\u7eaa\u516c\u53f8\u4ee3\u7801<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \u6295\u8d44\u8005\u5e10\u53f7<br>
	 * C type : TThostFtdcAccountIDType
	 */
	@Array({13}) 
	@Field(1) 
	public Pointer<Byte > AccountID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u57fa\u672c\u51c6\u5907\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(2) 
	public double Reserve() {
		return this.io.getDoubleField(this, 2);
	}
	/**
	 * \u57fa\u672c\u51c6\u5907\u91d1<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(2) 
	public CThostFtdcTradingAccountReserveField Reserve(double Reserve) {
		this.io.setDoubleField(this, 2, Reserve);
		return this;
	}
	/**
	 * \u5e01\u79cd\u4ee3\u7801<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	@Array({4}) 
	@Field(3) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 3);
	}
	public CThostFtdcTradingAccountReserveField() {
		super();
	}
	public CThostFtdcTradingAccountReserveField(Pointer pointer) {
		super(pointer);
	}
}
