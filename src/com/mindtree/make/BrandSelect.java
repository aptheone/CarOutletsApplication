/**
 * 
 */
package com.mindtree.make;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LabAdmin
 *
 */
public class BrandSelect {
	
	public List getAvailableBrands(BrandType brandType){

        List brands = new ArrayList();

        if(brandType.equals(BrandType.ACURA)){
            brands.add("Acura RDX");
            brands.add(("Acura MDX"));

        }else if(brandType.equals(BrandType.FERRARI)){
            brands.add("Ferrari convertible 2018");

        }else if(brandType.equals(BrandType.HONDA)){
            brands.add("Honda Civic LE");
            brands.add("Honda Accord");
            brands.add("Honda CR-V SE");

        } else if(brandType.equals(BrandType.MERCEDES_BENZ)){
            brands.add("Mercedese-Benz A class");
            brands.add("Mercedese-Benz c class");

        } else if(brandType.equals(BrandType.TESLA)){
            brands.add("Tesla-model-s-sedan");
            brands.add("Tesla Model S 85 Electric Sedan 2018");
            

        } else if(brandType.equals(BrandType.TOYOTA)){
            brands.add("Camry LE");
            brands.add("Corrola SE");

        }else {
            brands.add("No Brand Available");
        }
    return brands;
    }

}
