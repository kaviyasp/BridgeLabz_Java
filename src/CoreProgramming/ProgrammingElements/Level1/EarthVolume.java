/*Write a Program to compute the volume of Earth in km^3 and miles^3
Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____
*/

package CoreProgramming.ProgrammingElements.Level1;

class EarthVolume {
    public static void main(String[] args) {

        // Radius of earth in kilometers and value of pi
        double radiusKm = 6378;
        double pi = 3.14159265359;

        // Calculate volume of earth in cubic kilometers
        double volumeKm = (4.0 / 3.0) * pi * radiusKm * radiusKm * radiusKm;

        // Convert radius to miles and calculate volume in cubic miles
        double radiusMiles = radiusKm / 1.6;
        double volumeMiles = (4.0 / 3.0) * pi * radiusMiles * radiusMiles * radiusMiles;

        // Display the final results
        System.out.println(
                "The volume of earth in cubic kilometers is " + volumeKm +
                        " and cubic miles is " + volumeMiles
        );
    }
}
