package functionalinterface;

//Supplier

// represents the supplier of results

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {

        // Gets DB Connection
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlsSupplier.get());

    }
    // supplier returns any value you want
    // returns a value for database link
    static String getDBConnectionUrl () {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<List<String>> getDBConnectionUrlsSupplier = ()
            -> List.of(
            "jdbc://localhost:5432/users",
            "jdbc://localhost:5432/users");
}
