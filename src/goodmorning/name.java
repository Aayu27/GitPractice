/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goodmorning;

/**
 *
 * @author aayu9
 */
public class name {
    
    private String n;

    public name() {
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }
    
    public String toString(){
        return String.format("Good Morning %s", n);
    }
}
