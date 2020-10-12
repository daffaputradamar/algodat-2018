package abtractinterfacesignal;

abstract public class Computer {
    public String ipAddress;
    public int cpuClock, memory, storage;
    
    public void getInfo(){
        System.out.println("IP Address: " + ipAddress);
        System.out.println("CPU Clock: " + cpuClock);
        System.out.println("Memory: " + memory);
        System.out.println("Storage: " + storage);
    }
}
