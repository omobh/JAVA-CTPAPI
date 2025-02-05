/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostmduserapi;

public class CThostFtdcBrokerUserPasswordField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcBrokerUserPasswordField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerUserPasswordField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcBrokerUserPasswordField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcBrokerUserPasswordField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcBrokerUserPasswordField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmduserapiJNI.CThostFtdcBrokerUserPasswordField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmduserapiJNI.CThostFtdcBrokerUserPasswordField_UserID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    thostmduserapiJNI.CThostFtdcBrokerUserPasswordField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return thostmduserapiJNI.CThostFtdcBrokerUserPasswordField_Password_get(swigCPtr, this);
  }

  public void setLastUpdateTime(String value) {
    thostmduserapiJNI.CThostFtdcBrokerUserPasswordField_LastUpdateTime_set(swigCPtr, this, value);
  }

  public String getLastUpdateTime() {
    return thostmduserapiJNI.CThostFtdcBrokerUserPasswordField_LastUpdateTime_get(swigCPtr, this);
  }

  public void setLastLoginTime(String value) {
    thostmduserapiJNI.CThostFtdcBrokerUserPasswordField_LastLoginTime_set(swigCPtr, this, value);
  }

  public String getLastLoginTime() {
    return thostmduserapiJNI.CThostFtdcBrokerUserPasswordField_LastLoginTime_get(swigCPtr, this);
  }

  public void setExpireDate(String value) {
    thostmduserapiJNI.CThostFtdcBrokerUserPasswordField_ExpireDate_set(swigCPtr, this, value);
  }

  public String getExpireDate() {
    return thostmduserapiJNI.CThostFtdcBrokerUserPasswordField_ExpireDate_get(swigCPtr, this);
  }

  public void setWeakExpireDate(String value) {
    thostmduserapiJNI.CThostFtdcBrokerUserPasswordField_WeakExpireDate_set(swigCPtr, this, value);
  }

  public String getWeakExpireDate() {
    return thostmduserapiJNI.CThostFtdcBrokerUserPasswordField_WeakExpireDate_get(swigCPtr, this);
  }

  public CThostFtdcBrokerUserPasswordField() {
    this(thostmduserapiJNI.new_CThostFtdcBrokerUserPasswordField(), true);
  }

}
