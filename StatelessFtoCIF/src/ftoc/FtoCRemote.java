/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionRemote.java to edit this template
 */
package ftoc;

import javax.ejb.Remote;

/**
 *
 * @author alongkornvanzoh
 */
@Remote
public interface FtoCRemote {

    double fToC(double fahrenheit);
    
}
