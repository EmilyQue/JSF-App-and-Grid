package business;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

/**
 * Session Bean implementation class OrdersBusinessService
 */
@Stateless
@LocalBean
@Alternative
public class OrdersBusinessService {

    /**
     * Default constructor. 
     */
    public OrdersBusinessService() {
        // TODO Auto-generated constructor stub
    }
    
    public void test() {
    	System.out.println("=======> Hello from OrderBusinessService.test()");
    }

}
