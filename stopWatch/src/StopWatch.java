
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 61010707
 */
class StopWatch {

    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }
    
    public long getElapsedTime(){
        return endTime - startTime;
    }

}
