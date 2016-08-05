#Important interfaces
 Driver
 Connection
 ResultSet
 PreparedStatement
 

# RowSet
A resulset with a JavaBean View

 execute()
 
Could be connected or disconnected


# Connection

 CallableStatement    con.prepareCall(String)-con.prepareCall(String,int,int)
 
 
 PreparedStatement    con.prepareStatement(String)-con.prepareStatement(String,int,int)_

 Statement con.createStatement() - con.createStatement(int,int)


# CallableStatement

Types of OUT must be registered prior to executing

      String sql = "{call getEmpName (?, ?)}";



# PreparedStatement



# Statement


