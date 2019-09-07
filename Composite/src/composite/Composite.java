/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author giorgos
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Region country = new Region("Greece");

        Region department = new Region("Attica");

        Region region = new Region("Athens A");
        department.addChild(region);
        region = new Region("Athens B");
        department.addChild(region);
        region = new Region("Piraeus A");
        department.addChild(region);
        region = new Region("Piraeus B");
        department.addChild(region);
        region = new Region("Attica");
        department.addChild(region);

        country.addChild(department);

        department = new Region("Central Greece");
        region = new Region("Boeotia");
        department.addChild(region);
        region = new Region("Euboea");
        department.addChild(region);
        region = new Region("Evrytania");
        department.addChild(region);
        region = new Region("Phocis");
        department.addChild(region);
        region = new Region("Phthiotis");
        department.addChild(region);

        country.addChild(department);

        department = new Region("Central Macedonia");
        region = new Region("Edessa");
        department.addChild(region);
        region = new Region("Giannitsa");
        department.addChild(region);
        region = new Region("Katerini");
        department.addChild(region);
        region = new Region("Kilkis");
        department.addChild(region);
        region = new Region("Naousa");
        department.addChild(region);

        country.addChild(department);

        department = new Region("Crete");
        region = new Region("Heraklion");
        department.addChild(region);
        region = new Region("Chania");
        department.addChild(region);
        region = new Region("Rethymno");
        department.addChild(region);
        region = new Region("Agios Nikolaos");
        department.addChild(region);

        country.addChild(department);

        Map<Region, List<Region>> departments = country.getChildren();
        Set<Region> depKeys = departments.keySet();
        Iterator<Region> depIt = depKeys.iterator();
        while (depIt.hasNext()) {
            Region depart = depIt.next();

            Map<Region, List<Region>> regions = depart.getChildren();
            Set<Region> regionKeys = regions.keySet();
            Iterator<Region> regionIt = regionKeys.iterator();
            while (regionIt.hasNext()) {
                System.out.println(depart.getRegionName() + " -> " + regionIt.next().getRegionName());
            }

        }

    }

}


/*
The Composite pattern is used when we need to treat a group of objects in similar
way as a signle object. It creates a tree structure of group of objects.

Composite pattern has:
- A class that contains a group of its own objects. Here, class Region is a
composite class as it contains a HashMap of other child objects.
In this example, we first create a Region "country" which contains a HashMap of
Region "departments" which in turn contain HasMaps of Region "regions".

One other solution would be to create classes Department and Cities that would
extend the Region class. In this way, these classes could have different behavior.


*/
