import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectTest {
    public static void main(String[] args) {
        //JDBC - Java Database Connectivity
        try {
            //1. load the jdbc driver
            // DriverManager.registerDriver( new oracle.jdbc.OracleDriver());
            DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
            System.out.println("Driver loaded...");

           // Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "vijaya", "pratima");
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
            System.out.println("Connected to the database "+conn);
            //apple(hsqldb) / dell(oracle)
            Statement st = conn.createStatement();
            System.out.println("statement created...");
            ResultSet rs = st.executeQuery("select  * from dept");
            System.out.println("Query executed...and got the result....");

            while(rs.next()) {
                System.out.println("deptno   : "+rs.getInt(1));
                System.out.println("dname    : "+rs.getString(2));
                System.out.println("location : "+rs.getString(3));
                System.out.println("--------------");
            }

        }
        catch(Exception e) {
            System.out.println("Some problem "+e);
        }
        //2. establish the database connection

        //3. type the query - select * from dept;
        //4. and get the result from above query
        //5. run a loop to print the result

    }
}
/*
    WHICH DATABASE TO CONNECT ? ORACLE, MYSQL, SYBASE, MSSQL, HSQLDB
                                ?                               ?
                     oracle.jdbc.OracleDriver           org.hsqldb.jdbc.JDBCDriver
                     there is a .jar file               there is a .jar file
                     shipped with oracle                shipped with hsqldb       mssql
                     |                                  |                           |
                     .jar                               *.jar                       *.jar

                 [abc.java pqr.java xyz.java] = myfiles.zip

                                    oracle
        Java        jdbc            sybase
                                    mysql
                                    sybase
                                    MSsql
                                    IBMdb2
                                    ..
                                    ..
                                   oracle
        Java        ORM            sybase
                                    mysql
                                    sybase
                                    MSsql
                                    IBMdb2
                                    ..
                                    ..

       -----------------------------
                                   oracle
       Spring       ORM            sybase
        |                          mysql
      Angular                       sybase
                                    MSsql
                                    IBMdb2

     30 [8]   40 50

      Vishal
      |
      Vijay

        -----------------------------


                                    ..
                                    ..


jar - means [J]AVA [AR]CHIEVE
                       |
                       bundle of so many resources [ .class, .txt, .jpeg, .gif ]
                       |
                       packaging Jenkins | Maven

                       .war - WEB ARCHIEVE - web project related .jar file
                       .ear - Enterprise Archieve -






                       right nostril and left nostril - meditation
                       Anulom Vilom

                       your breathing is your mind

























 */
