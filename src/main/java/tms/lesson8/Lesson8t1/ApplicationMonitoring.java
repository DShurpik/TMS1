package tms.lesson8.Lesson8t1;

public class ApplicationMonitoring {
    public static void main(String[] args){
        MonitoringSystem genind = new GeneralIndicatorMonitoringModule();
        genind.startMonotoring();

        ErrorMonitoringModule errmod = new ErrorMonitoringModule();
        errmod.startMonotoring();
    }
}
