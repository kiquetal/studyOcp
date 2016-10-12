## Understanding multiple flavors of data

To read and write characteres and text data,JAVA I/O
uses readers and writters referred to as character streams.

ByteStream can be used to read and write all
kinds of data.

Character stream are used to read and write character data.

## Use streams to read from and write to files by using classes in the java.io package

### File

File are inmutable, pathname
can't be changed

#### Methods

    boolean createNewFile IOException
    boolean mkdir() SecutiryException
    boolean mkdirs() SecurityException
    
## Using byte stream I/O

### InputStream
    
    has channel
    
#### Methods

    int abstract read() read Byte IOException
    int read(byte[]) count of bytes read
    int read(byte[],int offset,int len)
    close()

##### Extends

    FileInputStream
    BufferedInputStream
    DataInputStream
    ObjectInputStream
    
### OutputStream

#### Methods

    abstract void write(int) single byte
    void write(byte[])
    void write(bytep[],int offset,int len)
    close()
    flush()
    
##### Extends

    FileOutputStream
    BufferedOutputStream
    DataOutputStream
    ObjectOutputStream
    
###### FileInputStream

    FileInputStream(File fi) throws FileNotFoundException
    FileInputStream(String) throws FileNotFoundException
    
###### FileOutputStream

    FileOuputStram(File)
    FileOutputStream(File,boolean) throws FileNotFoundException
    FileOuputStream(String)
    FileOutputStream(String,boolean) 

###### DataInputStream and DataOutputStream

    DataInputStream(InputStream in)
    DataOutputStream(OutputStream out)
    Let you read and write primitives types and string
    Any read opeartion past the end will flow
    EOFException
    
###### ObjectInputStream and ObjectOutputStream

####### Methods

    readObject could throw ClassNotFoundException
    OptionDataException where primitive was read.
    
    Ojo static and transient no son persistidos
    al file,pero son cargados con los valores de la clase
    
    Lo mismo sucede con variables de una clase sin implementar
    Serializable no son almacenados solo obtienen
    el valor por defecto luego de la deserializacion
    
    
 
 
    
