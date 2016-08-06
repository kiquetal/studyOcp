#Important interfaces
 Driver
 Connection
 ResultSet
 PreparedStatement
 RowSet (javax.sql.rowset) 

# RowSet
A resulset with a JavaBean View

 execute()
 
Could be connected or disconnected

 CachedRowSet
 JdbcRowSet
 WebRowSet
 FilteredRowSet

from javax.sql.RowSet

we need factory gtom javax.sql.rowset.RowSetProvider
Factory f=RowSetProvider.newFactory();

javax.sql.rowset.Factory

createCachedRowSet
createJdbcRowSet
createWebRowSet
createFilteredRowSet


## Connected
 

# Connection

 CallableStatement    con.prepareCall(String)-con.prepareCall(String,int,int)
 
 
 PreparedStatement    con.prepareStatement(String)-con.prepareStatement(String,int,int)_

 Statement con.createStatement() - con.createStatement(int,int)


# CallableStatement

Types of OUT must be registered prior to executing

      String sql = "{call pro_row_count(?,?)}";
	  CallableStatement cs=con.prepareCall(sql);
      cs.setString(1,authorname);
	  cs.registerOutParameter(2,Types.NUMERIC);

      cs.execute


# PreparedStatement

Are pre-compiled faster that Statement

Method withoutString for methods:

-execute():boolean
-executeQuery()
-executeUpdate()

getUpdateCount()
For DDL operation could use executeUpdate()


# Statement

-executeQuery(String) will raise exception if the sentence won't return RS
-executeUpdate(String)
-execute(String)
# Constants

TYPES_FORWARD_ONLY
TYPES_SCROLL_SENSITIVE
TYPES_SCROLL_INSENSITIVE
CONCUR_READ_ONLY
CONDUR_UPDATABLE

using with Connection methods


