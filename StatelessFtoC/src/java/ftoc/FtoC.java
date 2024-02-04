/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ftoc;

import javax.ejb.Stateless;

/**
 *
 * @author alongkornvanzoh
 */
@Stateless
public class FtoC implements FtoCRemote {

    @Override
    public double fToC(double fahrenheit) {
        return (5/9) * (fahrenheit -32);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
