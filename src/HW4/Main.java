package HW4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        HardDisk hardDisk1 = new HardDisk("model1",Type.SSD,120,Producer.KOREA);
        HardDisk hardDisk2 = new HardDisk("model2",Type.HHD,200,Producer.CHINA);
        HardDisk hardDisk3 = new HardDisk("model3",Type.SSD,180,Producer.KOREA);
        HardDisk hardDisk4 = new HardDisk("model4",Type.SSD,500,Producer.USA);
        HardDisk hardDisk5 = new HardDisk("model5",Type.HHD,1200,Producer.INDIA);
        HardDisk hardDisk6 = new HardDisk("model6",Type.SSD,250,Producer.CHINA);
        HardDisk hardDisk7 = new HardDisk("model7",Type.SSD,1000,Producer.KOREA);
        HardDisk hardDisk8 = new HardDisk("model8",Type.HHD,600,Producer.USA);
        HardDisk hardDisk9 = new HardDisk("model9",Type.SSD,560,Producer.INDIA);
        HardDisk hardDisk10 = new HardDisk("model10",Type.SSD,120,Producer.USA);

        CPU cpu1 = new CPU("Intell Core i7",8,Producer.USA);
        CPU cpu2 = new CPU("Intell Core i5",6,Producer.CHINA);
        CPU cpu3 = new CPU("Intell Core i3",4,Producer.USA);
        CPU cpu4 = new CPU("Intell Core i7",8,Producer.INDIA);
        CPU cpu5 = new CPU("AMD",8,Producer.KOREA);

        List<Comp> comps = new LinkedList();
        comps.add(new Comp("model1",2015,16,1200,hardDisk1,cpu2));
        comps.add(new Comp("model2",2010,16,1000,hardDisk2,cpu1));
        comps.add(new Comp("model3",2015,128,1400,hardDisk3,cpu3));
        comps.add(new Comp("model4",2009,8,700,hardDisk4,cpu4));
        comps.add(new Comp("model5",2011,16,900,hardDisk5,cpu2));
        comps.add(new Comp("model6",2017,64,1000,hardDisk6,cpu1));
        comps.add(new Comp("model7",2018,16,1500,hardDisk7,cpu5));
        comps.add(new Comp("model8",2007,8,900,hardDisk8,cpu3));
        comps.add(new Comp("model9",2006,32,1000,hardDisk9,cpu1));
        comps.add(new Comp("model10",2005,16,1200,hardDisk10,cpu4));
        comps.add(new Comp("model11",2015,64,1300,hardDisk1,cpu4));
        comps.add(new Comp("model12",2017,16,1600,hardDisk2,cpu2));
        comps.add(new Comp("model13",2014,32,1100,hardDisk3,cpu3));
        comps.add(new Comp("model14",2013,16,1200,hardDisk4,cpu1));
        comps.add(new Comp("model15",2019,16,1000,hardDisk5,cpu5));
        comps.add(new Comp("model16",2011,8,800,hardDisk6,cpu5));
        comps.add(new Comp("model17",2015,16,950,hardDisk7,cpu1));
        comps.add(new Comp("model19",2013,64,8500,hardDisk8,cpu5));
        comps.add(new Comp("model19",2012,16,1200,hardDisk9,cpu3));
        comps.add(new Comp("model20",2006,8,500,hardDisk10,cpu2));

        //. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
        for (Comp comp : comps) {
            if (comp.getYear() > 2010){
                System.out.println(comp);
            }
        }
        System.out.println("--------------------");
        //2. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
        //та країну виробник Китай
        for (Comp comp : comps) {
            if (comp.getYear() > 2010 && comp.getCpu().getProducer() == Producer.CHINA){
                System.out.println(comp);
            }
        }
        System.out.println("--------------------");
        //3. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
        //та країну виробник дисків не Китай
        for (Comp comp : comps) {
            if (comp.getYear() > 2010 && comp.getHardDisk().getProducer() != Producer.CHINA){
                System.out.println(comp);
            }
        }
        System.out.println("--------------------");
        //4. Знайти всі комп'ютери які мають жорсткий диск більше 500гб
        for (Comp comp : comps) {
            if (comp.getHardDisk().getVolume() > 500){
                System.out.println(comp);
            }
        }
        System.out.println("--------------------");
        //5. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7
        for (Comp comp : comps) {
            if (comp.getHardDisk().getVolume() > 500 && comp.getCpu().getType() == "Intell Core i7"){
                System.out.println(comp);
            }
        }
        System.out.println("--------------------");
        //6. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб
        //та процессор і7 посортувати за ціною
        Set<Comp> compSet = new TreeSet<>();
        for (Comp comp : comps) {
            if (comp.getHardDisk().getVolume() > 500 && comp.getCpu().getType() == "Intell Core i7"){
                compSet.add(comp);
            }
        }
        System.out.println(compSet);
    }
}
