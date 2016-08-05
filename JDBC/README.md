#Important interfaces
 Driver
 Connection
 ResultSet
 PreparedStatement
 

# RowSet
A resulset with a JavaBean View

 execute()
 
Could be connected or disconnected

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

-execute()
-executeQuery()
-executeUpdate()

For DDL operation could use executeUpdate()


# Statement

-executeQuery(String)
-executeUpdate(String)
-execute(String)
# Constants

TYPES_FORWARD_ONLY
TYPES_SCROLL_SENSITIVE
TYPES_SCROLL_INSENSITIVE
CONCUR_READ_ONLY
CONDUR_UPDATABLE

using with Connection methods


