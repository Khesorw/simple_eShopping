package com.mycompany.shoppingcart.resources;

import Entities.Card;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author 
 */
@Path("cards")
@Stateless
public class JavaEE8Resource {
    
    @PersistenceContext(unitName = "myCart")
    private EntityManager em;
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response find(){
        CriteriaBuilder builder = em.getCriteriaBuilder();
        
        CriteriaQuery<Card> cq = builder.createQuery(Card.class);
        
        Root<Card> root = cq.from(Card.class);
        
        cq.select(root);
        
        TypedQuery<Card> tq = em.createQuery(cq);
        
        List<Card> result = tq.getResultList();
 
        
        return Response.ok(result).build();
    }
}
