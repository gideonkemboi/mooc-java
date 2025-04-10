/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gdn
 */
public class Timer {
    private ClockHand ms;
    private ClockHand seconds;
    
    public Timer() {
        this.ms = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public void advance() {
        this.ms.advance();
        
        if (this.ms.value() == 0) {
            this.seconds.advance();
        }
    }
    
    public String toString() {
        return (this.seconds + ":" + this.ms);
    }
}
