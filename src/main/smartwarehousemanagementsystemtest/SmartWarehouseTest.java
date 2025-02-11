package smartwarehousemanagementsystemtest;

import org.junit.Assert;
import org.junit.Test;
import smartwarehousemanagementsystem.Electronics;
import smartwarehousemanagementsystem.Storage;

public class SmartWarehouseTest {
        @Test
        public void tester1(){
            Electronics television1=new Electronics("Lenovo");
            Storage<Electronics> storageElectronics=new Storage<>();
            storageElectronics.addItem(television1);
            Assert.assertEquals(1,storageElectronics.getList().size());
        }

        @Test
        public void tester2(){
            Electronics television1=new Electronics("Lenovo");
            Storage<Electronics> storageElectronics=new Storage<>();
            storageElectronics.addItem(television1);

            Assert.assertEquals("Lenovo",storageElectronics.getList().get(0).getName());

        }

    }


