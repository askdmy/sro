/**
 * @author Copyright (c) 2008,2013, Oracle and/or its affiliates. All rights reserved.
 *  
 */
package de.fsuj.urz.iss.sr.oracle.sr3_10249511261.cdi.service;

import de.fsuj.urz.iss.sr.oracle.sr3_10249511261.cdi.entity.Account;

/**
 * EJB Business Interface
 */
public interface AccountManager {

  public void depositOnAccount(String name, float amount);
  
  public Account findAccount(String name);
  
}
