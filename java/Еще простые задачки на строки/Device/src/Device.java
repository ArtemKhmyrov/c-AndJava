import java.io.*;

import java.util.*;

class Device
{
    private String companyManufacturer;
    private String model;
    private String name;
    private int powerConsumption;
    private int permissibleMainsVoltage;

    /*1 Задание*/
    /*Конструктор без параметров*/

    public Device() {
    }

    /*Конструктор с параметрами*/

    public Device (String nt, String qt, String st, int et, int n) {
        companyManufacturer = nt;
        model = qt;
        name = st;
        powerConsumption = et;
        permissibleMainsVoltage = n;
    }

    /*Конструктор копия*/

    public Device (Device device) {
        companyManufacturer = device.companyManufacturer;
        model = device.model;
        name = device.name;
        powerConsumption = device.powerConsumption;
        permissibleMainsVoltage = device.permissibleMainsVoltage;
    }

    public String GetCompanyManufacturer(){
        return companyManufacturer;
    }

    public String GetModel(){
        return model;
    }

    public String GetName(){
        return name;
    }

    public int GetPowerConsumption(){
        return powerConsumption;
    }

    public int GetPermissibleMainsVoltage(){
        return permissibleMainsVoltage;
    }

    public void ReductionInPowerConsumption(int percentageReduction){
        powerConsumption = powerConsumption*(1-(percentageReduction/100));
    }

    public int compareTo(Device d) {
        return companyManufacturer.compareTo(d.GetCompanyManufacturer());
    }
    /*3 Задание*/
    /*Реализация сравнения*/
}
class DeviceComparator implements Comparator<Device>
{
    public int compare(Device a, Device b)
    {
        if(a.GetPowerConsumption()> b.GetPowerConsumption())
            return 1;
        else if(a.GetPowerConsumption()< b.GetPowerConsumption())
            return -1;
        else
        { if(a.GetPermissibleMainsVoltage()> b.GetPermissibleMainsVoltage())
            return 1;
        else if(a.GetPermissibleMainsVoltage()< b.GetPermissibleMainsVoltage())
            return -1;
        }
        return 0;
    }
}

class Main
{
    public static void main(String[] args) throws Exception {
        FileReader in = new FileReader("input.txt");
        Scanner scan = new Scanner(in);

        ArrayList <Device> devices = new ArrayList<>();

        while ( scan.hasNextLine() )
            devices.add(get_devices(scan));
        scan.close();
        in.close();

        DeviceComparator myDeviceComparator = new DeviceComparator();
        devices.sort(myDeviceComparator);

        for (Device t : devices){
            System.out.println(t.GetCompanyManufacturer() + " " + t.GetModel() + " " + t.GetName() + " " + t.GetPowerConsumption() + " " + t.GetPermissibleMainsVoltage());
        }
    }

    private static Device get_devices(Scanner scan) {
        String nt = scan.nextLine(); // фирма-производитель
        String qt = scan.nextLine(); // модель
        String st = scan.nextLine(); // название
        String et = scan.nextLine(); // мощность
        String n = scan.nextLine(); // напряжение сети

        return new Device(nt,qt, st, Integer.parseInt(et), Integer.parseInt(n));
    }
}