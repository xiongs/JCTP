package com.ctp.thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u67e5\u8be2\u8d26\u6237\u4fe1\u606f\u8bf7\u6c42<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:6742</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
 
public class CThostFtdcReqQueryAccountField extends StructObject {
	/**
	 * \u4e1a\u52a1\u529f\u80fd\u7801<br>
	 * C type : TThostFtdcTradeCodeType
	 */
	@Array({7}) 
	@Field(0) 
	public Pointer<Byte > TradeCode() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \u94f6\u884c\u4ee3\u7801<br>
	 * C type : TThostFtdcBankIDType
	 */
	@Array({4}) 
	@Field(1) 
	public Pointer<Byte > BankID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u94f6\u884c\u5206\u652f\u673a\u6784\u4ee3\u7801<br>
	 * C type : TThostFtdcBankBrchIDType
	 */
	@Array({5}) 
	@Field(2) 
	public Pointer<Byte > BankBranchID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u671f\u5546\u4ee3\u7801<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(3) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \u671f\u5546\u5206\u652f\u673a\u6784\u4ee3\u7801<br>
	 * C type : TThostFtdcFutureBranchIDType
	 */
	@Array({31}) 
	@Field(4) 
	public Pointer<Byte > BrokerBranchID() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \u4ea4\u6613\u65e5\u671f<br>
	 * C type : TThostFtdcTradeDateType
	 */
	@Array({9}) 
	@Field(5) 
	public Pointer<Byte > TradeDate() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \u4ea4\u6613\u65f6\u95f4<br>
	 * C type : TThostFtdcTradeTimeType
	 */
	@Array({9}) 
	@Field(6) 
	public Pointer<Byte > TradeTime() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * \u94f6\u884c\u6d41\u6c34\u53f7<br>
	 * C type : TThostFtdcBankSerialType
	 */
	@Array({13}) 
	@Field(7) 
	public Pointer<Byte > BankSerial() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \u4ea4\u6613\u7cfb\u7edf\u65e5\u671f<br>
	 * C type : TThostFtdcTradeDateType
	 */
	@Array({9}) 
	@Field(8) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \u94f6\u671f\u5e73\u53f0\u6d88\u606f\u6d41\u6c34\u53f7<br>
	 * C type : TThostFtdcSerialType
	 */
	@Field(9) 
	public int PlateSerial() {
		return this.io.getIntField(this, 9);
	}
	/**
	 * \u94f6\u671f\u5e73\u53f0\u6d88\u606f\u6d41\u6c34\u53f7<br>
	 * C type : TThostFtdcSerialType
	 */
	@Field(9) 
	public CThostFtdcReqQueryAccountField PlateSerial(int PlateSerial) {
		this.io.setIntField(this, 9, PlateSerial);
		return this;
	}
	/**
	 * \u6700\u540e\u5206\u7247\u6807\u5fd7<br>
	 * C type : TThostFtdcLastFragmentType
	 */
	@Field(10) 
	public byte LastFragment() {
		return this.io.getByteField(this, 10);
	}
	/**
	 * \u6700\u540e\u5206\u7247\u6807\u5fd7<br>
	 * C type : TThostFtdcLastFragmentType
	 */
	@Field(10) 
	public CThostFtdcReqQueryAccountField LastFragment(byte LastFragment) {
		this.io.setByteField(this, 10, LastFragment);
		return this;
	}
	/**
	 * \u4f1a\u8bdd\u53f7<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(11) 
	public int SessionID() {
		return this.io.getIntField(this, 11);
	}
	/**
	 * \u4f1a\u8bdd\u53f7<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(11) 
	public CThostFtdcReqQueryAccountField SessionID(int SessionID) {
		this.io.setIntField(this, 11, SessionID);
		return this;
	}
	/**
	 * \u5ba2\u6237\u59d3\u540d<br>
	 * C type : TThostFtdcIndividualNameType
	 */
	@Array({51}) 
	@Field(12) 
	public Pointer<Byte > CustomerName() {
		return this.io.getPointerField(this, 12);
	}
	/**
	 * \u8bc1\u4ef6\u7c7b\u578b<br>
	 * C type : TThostFtdcIdCardTypeType
	 */
	@Field(13) 
	public byte IdCardType() {
		return this.io.getByteField(this, 13);
	}
	/**
	 * \u8bc1\u4ef6\u7c7b\u578b<br>
	 * C type : TThostFtdcIdCardTypeType
	 */
	@Field(13) 
	public CThostFtdcReqQueryAccountField IdCardType(byte IdCardType) {
		this.io.setByteField(this, 13, IdCardType);
		return this;
	}
	/**
	 * \u8bc1\u4ef6\u53f7\u7801<br>
	 * C type : TThostFtdcIdentifiedCardNoType
	 */
	@Array({51}) 
	@Field(14) 
	public Pointer<Byte > IdentifiedCardNo() {
		return this.io.getPointerField(this, 14);
	}
	/**
	 * \u5ba2\u6237\u7c7b\u578b<br>
	 * C type : TThostFtdcCustTypeType
	 */
	@Field(15) 
	public byte CustType() {
		return this.io.getByteField(this, 15);
	}
	/**
	 * \u5ba2\u6237\u7c7b\u578b<br>
	 * C type : TThostFtdcCustTypeType
	 */
	@Field(15) 
	public CThostFtdcReqQueryAccountField CustType(byte CustType) {
		this.io.setByteField(this, 15, CustType);
		return this;
	}
	/**
	 * \u94f6\u884c\u5e10\u53f7<br>
	 * C type : TThostFtdcBankAccountType
	 */
	@Array({41}) 
	@Field(16) 
	public Pointer<Byte > BankAccount() {
		return this.io.getPointerField(this, 16);
	}
	/**
	 * \u94f6\u884c\u5bc6\u7801<br>
	 * C type : TThostFtdcPasswordType
	 */
	@Array({41}) 
	@Field(17) 
	public Pointer<Byte > BankPassWord() {
		return this.io.getPointerField(this, 17);
	}
	/**
	 * \u6295\u8d44\u8005\u5e10\u53f7<br>
	 * C type : TThostFtdcAccountIDType
	 */
	@Array({13}) 
	@Field(18) 
	public Pointer<Byte > AccountID() {
		return this.io.getPointerField(this, 18);
	}
	/**
	 * \u671f\u8d27\u5bc6\u7801<br>
	 * C type : TThostFtdcPasswordType
	 */
	@Array({41}) 
	@Field(19) 
	public Pointer<Byte > Password() {
		return this.io.getPointerField(this, 19);
	}
	/**
	 * \u671f\u8d27\u516c\u53f8\u6d41\u6c34\u53f7<br>
	 * C type : TThostFtdcFutureSerialType
	 */
	@Field(20) 
	public int FutureSerial() {
		return this.io.getIntField(this, 20);
	}
	/**
	 * \u671f\u8d27\u516c\u53f8\u6d41\u6c34\u53f7<br>
	 * C type : TThostFtdcFutureSerialType
	 */
	@Field(20) 
	public CThostFtdcReqQueryAccountField FutureSerial(int FutureSerial) {
		this.io.setIntField(this, 20, FutureSerial);
		return this;
	}
	/**
	 * \u5b89\u88c5\u7f16\u53f7<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(21) 
	public int InstallID() {
		return this.io.getIntField(this, 21);
	}
	/**
	 * \u5b89\u88c5\u7f16\u53f7<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(21) 
	public CThostFtdcReqQueryAccountField InstallID(int InstallID) {
		this.io.setIntField(this, 21, InstallID);
		return this;
	}
	/**
	 * \u7528\u6237\u6807\u8bc6<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(22) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 22);
	}
	/**
	 * \u9a8c\u8bc1\u5ba2\u6237\u8bc1\u4ef6\u53f7\u7801\u6807\u5fd7<br>
	 * C type : TThostFtdcYesNoIndicatorType
	 */
	@Field(23) 
	public byte VerifyCertNoFlag() {
		return this.io.getByteField(this, 23);
	}
	/**
	 * \u9a8c\u8bc1\u5ba2\u6237\u8bc1\u4ef6\u53f7\u7801\u6807\u5fd7<br>
	 * C type : TThostFtdcYesNoIndicatorType
	 */
	@Field(23) 
	public CThostFtdcReqQueryAccountField VerifyCertNoFlag(byte VerifyCertNoFlag) {
		this.io.setByteField(this, 23, VerifyCertNoFlag);
		return this;
	}
	/**
	 * \u5e01\u79cd\u4ee3\u7801<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	@Array({4}) 
	@Field(24) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 24);
	}
	/**
	 * \u6458\u8981<br>
	 * C type : TThostFtdcDigestType
	 */
	@Array({36}) 
	@Field(25) 
	public Pointer<Byte > Digest() {
		return this.io.getPointerField(this, 25);
	}
	/**
	 * \u94f6\u884c\u5e10\u53f7\u7c7b\u578b<br>
	 * C type : TThostFtdcBankAccTypeType
	 */
	@Field(26) 
	public byte BankAccType() {
		return this.io.getByteField(this, 26);
	}
	/**
	 * \u94f6\u884c\u5e10\u53f7\u7c7b\u578b<br>
	 * C type : TThostFtdcBankAccTypeType
	 */
	@Field(26) 
	public CThostFtdcReqQueryAccountField BankAccType(byte BankAccType) {
		this.io.setByteField(this, 26, BankAccType);
		return this;
	}
	/**
	 * \u6e20\u9053\u6807\u5fd7<br>
	 * C type : TThostFtdcDeviceIDType
	 */
	@Array({3}) 
	@Field(27) 
	public Pointer<Byte > DeviceID() {
		return this.io.getPointerField(this, 27);
	}
	/**
	 * \u671f\u8d27\u5355\u4f4d\u5e10\u53f7\u7c7b\u578b<br>
	 * C type : TThostFtdcBankAccTypeType
	 */
	@Field(28) 
	public byte BankSecuAccType() {
		return this.io.getByteField(this, 28);
	}
	/**
	 * \u671f\u8d27\u5355\u4f4d\u5e10\u53f7\u7c7b\u578b<br>
	 * C type : TThostFtdcBankAccTypeType
	 */
	@Field(28) 
	public CThostFtdcReqQueryAccountField BankSecuAccType(byte BankSecuAccType) {
		this.io.setByteField(this, 28, BankSecuAccType);
		return this;
	}
	/**
	 * \u671f\u8d27\u516c\u53f8\u94f6\u884c\u7f16\u7801<br>
	 * C type : TThostFtdcBankCodingForFutureType
	 */
	@Array({33}) 
	@Field(29) 
	public Pointer<Byte > BrokerIDByBank() {
		return this.io.getPointerField(this, 29);
	}
	/**
	 * \u671f\u8d27\u5355\u4f4d\u5e10\u53f7<br>
	 * C type : TThostFtdcBankAccountType
	 */
	@Array({41}) 
	@Field(30) 
	public Pointer<Byte > BankSecuAcc() {
		return this.io.getPointerField(this, 30);
	}
	/**
	 * \u94f6\u884c\u5bc6\u7801\u6807\u5fd7<br>
	 * C type : TThostFtdcPwdFlagType
	 */
	@Field(31) 
	public byte BankPwdFlag() {
		return this.io.getByteField(this, 31);
	}
	/**
	 * \u94f6\u884c\u5bc6\u7801\u6807\u5fd7<br>
	 * C type : TThostFtdcPwdFlagType
	 */
	@Field(31) 
	public CThostFtdcReqQueryAccountField BankPwdFlag(byte BankPwdFlag) {
		this.io.setByteField(this, 31, BankPwdFlag);
		return this;
	}
	/**
	 * \u671f\u8d27\u8d44\u91d1\u5bc6\u7801\u6838\u5bf9\u6807\u5fd7<br>
	 * C type : TThostFtdcPwdFlagType
	 */
	@Field(32) 
	public byte SecuPwdFlag() {
		return this.io.getByteField(this, 32);
	}
	/**
	 * \u671f\u8d27\u8d44\u91d1\u5bc6\u7801\u6838\u5bf9\u6807\u5fd7<br>
	 * C type : TThostFtdcPwdFlagType
	 */
	@Field(32) 
	public CThostFtdcReqQueryAccountField SecuPwdFlag(byte SecuPwdFlag) {
		this.io.setByteField(this, 32, SecuPwdFlag);
		return this;
	}
	/**
	 * \u4ea4\u6613\u67dc\u5458<br>
	 * C type : TThostFtdcOperNoType
	 */
	@Array({17}) 
	@Field(33) 
	public Pointer<Byte > OperNo() {
		return this.io.getPointerField(this, 33);
	}
	/**
	 * \u8bf7\u6c42\u7f16\u53f7<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(34) 
	public int RequestID() {
		return this.io.getIntField(this, 34);
	}
	/**
	 * \u8bf7\u6c42\u7f16\u53f7<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(34) 
	public CThostFtdcReqQueryAccountField RequestID(int RequestID) {
		this.io.setIntField(this, 34, RequestID);
		return this;
	}
	/**
	 * \u4ea4\u6613ID<br>
	 * C type : TThostFtdcTIDType
	 */
	@Field(35) 
	public int TID() {
		return this.io.getIntField(this, 35);
	}
	/**
	 * \u4ea4\u6613ID<br>
	 * C type : TThostFtdcTIDType
	 */
	@Field(35) 
	public CThostFtdcReqQueryAccountField TID(int TID) {
		this.io.setIntField(this, 35, TID);
		return this;
	}
	/**
	 * \u957f\u5ba2\u6237\u59d3\u540d<br>
	 * C type : TThostFtdcLongIndividualNameType
	 */
	@Array({161}) 
	@Field(36) 
	public Pointer<Byte > LongCustomerName() {
		return this.io.getPointerField(this, 36);
	}
	public CThostFtdcReqQueryAccountField() {
		super();
	}
	public CThostFtdcReqQueryAccountField(Pointer pointer) {
		super(pointer);
	}
}