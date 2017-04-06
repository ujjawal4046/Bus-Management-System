package database;

import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class to handle the database component of the application.The class functions
 * reads the data from the file and send it to UI Manager
 *
 * @author ujjawal
 */
public class DataLoader {

    private static String[] stopArray;
    private static RouteClass[] routeArray;
    public static String CITY = "Kharagpur";

    /**
     * Opens files to read data
     */
    public static void openFile() {
        Scanner routesIn = null;
        Scanner stopIn = null;
        String stopsFile = null;
        String scheduleFile = null;

        if (CITY == "Kharagpur") {
            stopsFile = "/database/iitStop.txt";
            scheduleFile = "/database/iitRoute.txt";
        } else if (CITY == "Indore") {
            stopsFile = "/database/indoreStops.txt";
            scheduleFile = "/database/indoreRoutes.txt";
        }
        try {
            stopIn = new Scanner(new DataLoader().getClass().getResourceAsStream(stopsFile));
            routesIn = new Scanner(new DataLoader().getClass().getResourceAsStream(scheduleFile));
            setStopArray(stopIn);
            setRouteArray(routesIn);
        } finally {
            if (routesIn != null) {
                routesIn.close();
            }
            if (stopIn != null) {
                stopIn.close();
            }
        }
    }

    /**
     * Sets the value of StopArray from given input stream
     *
     * @param inputStream stream to read data
     */
    private static void setStopArray(Scanner inputStream) {
        stopArray = new String[Integer.parseInt(inputStream.next())];
        int i = 0;
        while (inputStream.hasNext()) {
            stopArray[i] = inputStream.next();
            ++i;
            //System.out.println(inputStream.next());
        }

    }

    /**
     * Sets the value of RouteArray from given input stream
     *
     * @param inputStream stream to read data
     */
    private static void setRouteArray(Scanner inputStream) {
        int size = Integer.parseInt(inputStream.nextLine());
        routeArray = new RouteClass[size];
        //System.out.println(Integer.parseInt(inputStream.nextLine()));
        int i = 0;
        while (inputStream.hasNext()) {
            routeArray[i] = new RouteClass();
            //System.out.println(routeArray[i].toString());
            String[] current = inputStream.nextLine().split("[ ]+");
            if (current[0].equals("")) {
                continue;
            }
            //for(String s:current)
            //System.out.print(s + " ");
            //System.out.println();

            routeArray[i].routeNo = current[0];
            int start = Integer.parseInt(current[2]) - 1;

            routeArray[i].source = stopArray[start];
            routeArray[i].start = Integer.parseInt(current[3]);
            for (int j = 2; j < current.length - 1; j = j + 2) {
                String currentStop = stopArray[Integer.parseInt(current[j]) - 1];
                routeArray[i].destination = currentStop;
                String currentTime = current[j + 1];
                //currentTime = currentTime.substring(0, 2) + ":" + currentTime.substring(2,4);
                //System.out.println(currentStop);
                routeArray[i].schedule.put(currentStop, currentTime);
            }

            ++i;
        }

    }

    /**
     * Returns all the Route No's in an array
     *
     * @return String array
     */
    public static String[] getAllRouteNO() {
        String[] routeNoArray = new String[routeArray.length];
        int i = 0;
        for (RouteClass r : routeArray) {
            routeNoArray[i] = r.routeNo;
            ++i;
        }
        return routeNoArray;
    }

    /**
     * Returns all the stop's names in an array
     *
     * @return String array
     */
    public static String[] getStopArray() {
        //for(String s:stopArray)
        //System.out.println(s);
        return stopArray;
    }

    /**
     * Checks if given String is a valid Stop's name
     *
     * @param checkString String to be checked
     * @return boolean
     */
    public static boolean isStop(String checkString) {
        for (String s : stopArray) {
            if (s.equalsIgnoreCase(checkString)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if a given string is valid route no
     *
     * @param routeNo route no to be searched
     * @return boolean
     */
    public static boolean isRouteNo(String routeNo) {
        for (RouteClass r : routeArray) {
            if (r.routeNo.equals(routeNo)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Searches for all the routes between source and destination and returns
     * them
     *
     * @param source name of the source
     * @param destination name of the destination
     * @return data representation of routes between source and destination
     */
    public static Object[][] getPairSearch(String source, String destination) {
        int i = 0;
        ArrayList<Integer> idxArray = new ArrayList<Integer>();
        for (RouteClass r : routeArray) {
            if (r.schedule.containsKey(source) && r.schedule.containsKey(destination)) {
                if (Integer.parseInt(r.schedule.get(source)) < Integer.parseInt(r.schedule.get(destination))) {
                    idxArray.add(i);
                }
            }
            ++i;
        }

        Object[][] data = new Object[idxArray.size()][6];

        for (i = 0; i < idxArray.size(); i++) {
            data[i] = new Object[6];
            RouteClass r = routeArray[idxArray.get(i)];
            data[i][0] = i + 1;
            data[i][1] = r.routeNo;
            data[i][2] = r.source;
            data[i][3] = r.destination;
            data[i][4] = r.schedule.get(source) + " Hrs";
            data[i][5] = r.schedule.get(destination) + " Hrs";

        }
        return data;
    }

    /**
     * Returns the route details of given Route No
     *
     * @param routeNo route no of route to be searched
     * @return details of given route
     */
    public static Object[][] getRouteSearch(String routeNo) {
        Set queriedRoute = null;
        for (RouteClass r : routeArray) {
            if (r.routeNo.equals(routeNo)) {
                queriedRoute = r.schedule.entrySet();
            }
        }
        Iterator itr = queriedRoute.iterator();
        int size = queriedRoute.size();
        Object[][] data = new Object[size][3];
        int i = 0;
        // Display elements
        while (itr.hasNext()) {
            data[i] = new Object[3];
            Map.Entry me = (Map.Entry) itr.next();
            data[i][0] = i + 1;
            data[i][1] = me.getKey();
            data[i][2] = me.getValue() + " Hrs";
            ++i;
        }
        return data;
    }

    /**
     * Returns all routes passing through given Bus stop
     *
     * @param stopName name of the stop to be searched
     * @return Details of all routes through stopName
     */
    public static Object[][] getStopSearch(String stopName) {
        ArrayList<Integer> idxArray = new ArrayList<Integer>();
        for (int i = 0; i < routeArray.length; i++) {
            if (routeArray[i].schedule.containsKey(stopName)) {
                idxArray.add(i);
            }
        }
        Object[][] data = new Object[idxArray.size()][5];
        for (int i = 0; i < idxArray.size(); i++) {
            data[i] = new Object[5];
            int current = idxArray.get(i);
            data[i][0] = i + 1;
            data[i][1] = routeArray[current].routeNo;
            data[i][2] = routeArray[current].source;
            data[i][3] = routeArray[current].destination;
            data[i][4] = routeArray[current].schedule.get(stopName) + " Hrs";

        }

        return data;
    }

    /**
     * Searches and returns details of given list of routes
     *
     * @param selectedRoutes Route No's of routes to be searched
     * @return details of selectedRoutes
     */
    public static Object[][] getAllSelectedRoutes(List<String> selectedRoutes) {
        ArrayList<Integer> idxArray = new ArrayList<Integer>();
        int size = 1;
        for (int i = 0; i < routeArray.length; i++) {
            if (selectedRoutes.contains(routeArray[i].routeNo)) {
                idxArray.add(i);
            }
            size += 2 + routeArray[i].schedule.size();
        }
        Object[][] data = new Object[size][3];
        data[0] = new Object[]{"--------", "--------", "--------"};
        int rowIdx = 1;
        for (int i = 0; i < idxArray.size(); i++) {
            RouteClass currentRoute = routeArray[idxArray.get(i)];
            data[rowIdx] = new Object[]{"Route no:" + currentRoute.routeNo, "Source:" + currentRoute.source, "Destination:" + currentRoute.destination};
            rowIdx++;
            Set routeDetails = currentRoute.schedule.entrySet();
            Iterator itr = routeDetails.iterator();
            int j = 0;
            while (itr.hasNext()) {
                data[rowIdx] = new Object[3];
                Map.Entry me = (Map.Entry) itr.next();
                data[rowIdx][0] = j + 1;
                data[rowIdx][1] = me.getKey();
                data[rowIdx][2] = me.getValue() + " Hrs";
                ++rowIdx;
                ++j;
            }
            data[rowIdx] = new Object[]{"--------", "--------", "--------"};
            ++rowIdx;
        }
        return data;
    }
    /**
     * Writes the given complaint to a file
     * @param complaint complaint to write 
     */
    public static void writeComplaint(String complaint) {
        File f = new File("complaint.txt");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(f, true));
            writer.write(complaint);
            writer.close();
        } catch (IOException e) {
            System.out.println("exfdsj");
        }

    }

    /**
     * [DEBUG]Prints all the details of buses to console[DEBUG]
     */
    public static void printall() {
        for (RouteClass r : routeArray) {
            System.out.print(r.routeNo + " ");
            Set set = r.schedule.entrySet();
            System.out.println(set);
            System.out.println();
        }
    }

}

class RouteClass {

    String routeNo;
    String source;
    String destination;
    LinkedHashMap<String, String> schedule;
    int start;

    public RouteClass() {
        schedule = new LinkedHashMap<String, String>();
        routeNo = "";
        source = "";
        destination = "";
        start = -1;

    }

}
