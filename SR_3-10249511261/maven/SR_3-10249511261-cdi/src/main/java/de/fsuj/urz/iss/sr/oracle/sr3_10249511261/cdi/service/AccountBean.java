/**
 * @author Copyright (c) 2008,2013, Oracle and/or its affiliates. All rights reserved.
 *  
 */
package de.fsuj.urz.iss.sr.oracle.sr3_10249511261.cdi.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import de.fsuj.urz.iss.sr.oracle.sr3_10249511261.cdi.entity.Account;
import de.fsuj.urz.iss.sr.oracle.sr3_10249511261.cdi.interceptor.OnDeposit;

/**
 * CDI Managed Bean Class
 */
@Named
@RequestScoped
public class AccountBean{

  private String name;
  
  private float amount;
  
  private String msg;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getAmount() {
    return amount;
  }

  public void setAmount(float amount) {
    this.amount = amount;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  @Inject
  private AccountManager accountManager;

  @OnDeposit
  public void deposit() {
    accountManager.depositOnAccount(name, amount);
    Account account = accountManager.findAccount(name);
    msg = "The money have been deposited to " + account.getName() + ", the balance of the account is " + account.getAmount();
  }
}
