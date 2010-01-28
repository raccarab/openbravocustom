//    GreenPressing POS is a point of sales application designed for touch screens.
//    Copyright (C) 2007-2009 Openbravo, S.L.
//    http://code.google.com/p/openbravocustom/
//
//    This file is part of GreenPressing POS.
//
//    GreenPressing POS is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//    GreenPressing POS is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with GreenPressing POS.  If not, see <http://www.gnu.org/licenses/>.

package com.openbravo.pos.util;

/**
 *
 * @author Mikel Irurita
 */
public class LuhnAlgorithm {
    
    /** Creates a new instance of LuhnAlgorithm */
    private LuhnAlgorithm() {
    } 
    
    public static boolean checkCC(String cardNumber){
        int sum = 0;
        
        if ( !StringUtils.isNumber(cardNumber) ){
            return false;
        }
        
        for (int i = 0; i < cardNumber.length(); i++) {
            int k = Integer.parseInt(cardNumber.substring(i, i+1));
            if ( i % 2 == 0 ) {
                k *= 2;
                if (k > 9) {
                    k -= 9;
                }
            }
            sum += k;
        }
        return (sum % 10 == 0);
    }
    
}
