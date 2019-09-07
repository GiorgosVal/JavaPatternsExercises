/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author giorgos
 */
public class Region {
    
    private String regionName;
    private Map<Region, List<Region>> children;
    
    public Region(String regionName) {
        this.regionName = regionName;
        this.children = new HashMap();
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public Map<Region, List<Region>> getChildren() {
        return children;
    }

    public void setChildren(Map<Region, List<Region>> children) {
        this.children = children;
    }
    
    public void addChild(Region child) {
        children.put(child, child.children.get(child));
    }
    
    public void removeChild(Region child) {
        children.remove(child);
    }

    @Override
    public String toString() {
        return "Region{" + "regionName=" + regionName + '}';
    }
    
    
    
}
