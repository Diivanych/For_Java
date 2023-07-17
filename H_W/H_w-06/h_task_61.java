import java.util.List;
import java.util.Scanner;

public class h_task_61 
{
    public static void main(String[] args) throws NumberFormatException
    {
        System.out.print("\033[H\033[2J");
        Notebook ACER_EX215 = new Notebook("ACER", "EX215", "BLACK", "LINUX", 8, "SSD", 512);
        Notebook ASUS_A516 = new Notebook("ASUS", "A516", "GREY", "WINDOWS-10", 6, "SSD", 256);
        Notebook DELL_INSPIRION = new Notebook("DELL", "INSPIRION", "RED", "WINDOWS-11", 16, "HDD", 1024);
        Notebook HP_DW3170 = new Notebook("HP", "DW3170", "BLACK", "WINDOWS-10", 12, "HDD", 512);
        Notebook LENOVO_PAD_L3 = new Notebook("LENOVO", "PAD_L3", "BLUE", "LINUX", 6, "SSD", 256);
        Notebook MSI_GF63 = new Notebook("MSI", "GF63", "RED", "WINDOWS-11", 32, "SSD", 512);
        Notebook SAMSUNG_S150 = new Notebook("SAMSUNG", "S150", "GREY", "DINDOWS-10", 16, "SSD", 1024);

        List<Notebook> notebookList = List.of(ACER_EX215, ASUS_A516, DELL_INSPIRION, HP_DW3170, LENOVO_PAD_L3, MSI_GF63, SAMSUNG_S150);
        
        System.out.println("По какому признаку будем искать? \nПо Бренду -> 1,   По цвету -> 2,   По RAM -> 3,   По размеру диска -> 4,   Выход -> 0");
        Scanner scan = new Scanner(System.in);
        var choice = scan.nextInt();
        while (choice != 0) 
        {
            switch (choice) 
            {
            case 1: System.out.println("Напишите интересующий вас Бренд: ");
                Scanner brendScan = new Scanner(System.in);
                String brendChoice = brendScan.next();
                for (Notebook brand : notebookList) 
                {
                    if (brand.getBrand().equalsIgnoreCase(brendChoice)) 
                    {
                        System.out.println(brand.printInfo());
                    }
                }
                break;

            case 2: System.out.println("Напишите интересующий вас Цвет: ");
                Scanner colorScan = new Scanner(System.in);
                String colorChoice = colorScan.next();
                for (Notebook color : notebookList) 
                {
                    if (color.getColor().equalsIgnoreCase(colorChoice)) 
                    {
                        System.out.println(color.printInfo());
                    }
                }
                break;

            case 3: System.out.println("Какой объём оперативной памяти?: ");
                Scanner ramScan = new Scanner(System.in);
                int ramChoice = ramScan.nextInt();
                for (Notebook ram : notebookList) 
                {
                    if (ram.getRam() == ramChoice) 
                    {
                        System.out.println(ram.printInfo());
                    }
                }
                break;            

            case 4: System.out.println("Какой объём диска Вам нужен?: ");
                Scanner diskScan = new Scanner(System.in);
                int diskChoice = diskScan.nextInt();
                for (Notebook diskSize : notebookList) 
                {
                    if (diskSize.getDiskSize() == diskChoice) 
                    {
                        System.out.println(diskSize.printInfo());
                    }
                }
                break;            

            case 0: break;
            }
            break;
        }
    }
}
