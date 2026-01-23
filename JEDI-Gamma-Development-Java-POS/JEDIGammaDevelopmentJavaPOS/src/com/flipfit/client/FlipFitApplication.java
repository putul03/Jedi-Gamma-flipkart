/**
 * 
 */
package com.flipfit.client;

import com.flipfit.business.*;

/**
 * 
 */
public class FlipFitApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initialize Business Interfaces
        UserBusiness userBusiness = new UserBusinessImpl();
        GymOwnerBusiness gymOwnerBusiness = new GymOwnerBusinessImpl();
        CustomerBusiness customerBusiness = new CustomerBusinessImpl();
        BookingBusiness bookingBusiness = new BookingBusinessImpl();
        NotificationBusiness notificationBusiness = new NotificationBusinessImpl();
        
        System.out.println("Flipfit application started...");
        // Client logic here
	}

}
