package SQL;



import java.sql.*;

public class SQLproviding {
    static Connection dbConnection;
    static String dbHost = "localhost";
    static String dbPort = "3306";
    static String dbUser = "root";
    static String dbPass = "12345678";
    static String dbName = "website_2";
    static final String TABLE = "products";
    static final String PRODUCT_ID = "id";
    static final String PRODUCT_SERIALNUMBER = "serialnumber";
    static final String PRODUCT_NAME = "name";
    static final String PRODUCT_TYPE = "type";
    static final String PRODUCT_PRIMECOST = "primecost";
    static final String PRODUCT_PRICE = "price";
    static final String PRODUCT_COL = "productscol";



    public static Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":" +
                dbPort + "/" + dbName;
        Class.forName("com.mysql.cj.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbConnection;
    }

    public static void insertProducts(String id, String serialnumber, String name, String type, String primecost, String price, String col) throws SQLException, ClassNotFoundException {
        String insert = "INSERT INTO " + TABLE + "(" +
                PRODUCT_ID + "," + PRODUCT_SERIALNUMBER + "," +
                PRODUCT_NAME + "," + PRODUCT_TYPE + "," +
                PRODUCT_PRIMECOST + "," +
                PRODUCT_PRICE + "," +
                PRODUCT_COL + ")" +
                "VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, id);
            prSt.setString(2, serialnumber);
            prSt.setString(3, name);
            prSt.setString(4, type);
            prSt.setString(5, primecost);
            prSt.setString(6, price);
            prSt.setString(7, col);
            
            prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        String prSt=getDbConnection().getSchema();
        System.out.println(prSt);


        }

    public static ResultSet getProducts() {
        ResultSet resSet=null;
        String select="SELECT * FROM " + TABLE;
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);

           resSet= prSt.executeQuery();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("I am in catch now");
        }

        return resSet;
       }

    public static String createProducts() throws SQLException {
        String products=new String("<tbody>\n" +
                "                     <tr class=\"table-rows\">");



        ResultSet products_from_sql=SQLproviding.getProducts();

        



        int j=0;
        try {
        while (products_from_sql.next()) {
            if (j>0){
                products=products+"<tr>";
            }
            products=products+"<td>"+products_from_sql.getString(SQLproviding.PRODUCT_ID)+"</td>\n" +
                    "                        <td>"+products_from_sql.getString(SQLproviding.PRODUCT_SERIALNUMBER)+"</td>\n" +
                    "                        <td>"+products_from_sql.getString(SQLproviding.PRODUCT_NAME)+"</td>\n" +
                    "                        <td>"+products_from_sql.getString(SQLproviding.PRODUCT_TYPE)+"</td>\n" +
                    "                        <td>"+products_from_sql.getString(SQLproviding.PRODUCT_PRIMECOST)+"</td>\n" +
                    "                        <td>"+products_from_sql.getString(SQLproviding.PRODUCT_PRICE)+"</td>\n" +
                    "                        <td class=\"cells-status1\">??????</td>\n" +
                    "                        <td>2022-10-23 16:15:00</td>\n" +
                    "                        <td class=\"cells-btn\">\n" +
                    "                           <a href=\"\" class=\"cells-btn1\">??????</a>\n" +
                    "                           <a href=\"\" class=\"cells-btn2\">??????</a>\n" +
                    "                        </td>\n" +
                    "                     </tr>";

            j++;
        }} catch (SQLException e) {
            throw new RuntimeException(e);
        }


        products=products+"</tbody>";

        return products;

    }
}
