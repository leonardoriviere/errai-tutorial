package org.jboss.errai.demo.server.dao;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class TicketsDao {

    @PersistenceContext(unitName = "forge-default")
    private EntityManager em;



}
