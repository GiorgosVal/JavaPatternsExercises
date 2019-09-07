/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author giorgos
 */
public enum GeographicRegions {
    ATTICA("Attica"), CENTRAL_GREECE("Central Greece"), CENTRAL_MACEDONIA("Central Macedonia"),
    CRETE("Crete"), EASTERN_MACEDONIA_AND_THRACE("Eastern Macedonia and Thrace"),
    EPIRUS("Epirus"), IONIAN_ISLANDS("Ionian Islands"), NORTH_AEGEAN("North Aegean"),
    PELOPONNESE("Peloponnese"), SOUTH_AEGEAN("South Aegean"), THESSALY("Thessaly"),
    WESTERN_GREECE("Western Greece"), WESTERN_MACEDONIA("Western Macedonia");
    
    private String geographicRegion;

    private GeographicRegions(String geographicRegion) {
        this.geographicRegion = geographicRegion;
    }

    public String getGeographicRegion() {
        return geographicRegion;
    }
    
    
    
    
    
    
}
