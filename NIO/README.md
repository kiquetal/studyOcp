# Lo que dice el gran Libro y sus fechorías.
===
+ **Item 1**: Use the Path class to operate on file and directory paths.

  * What Is a Path? (And Other File System Facts)
    * FileSystems.getDefault().getPath = > Paths.get
  * Path Operations

     * toRealPath throws IOException
     
     * toAbsolutePath doesn't remove redundancies
     
     * toUri self-explanatory

     * normalize
+ **Item 2**: Use the Files class to check, delete, copy, or move a file or directory.

  * File Operations

  * Checking a File or Directory

  * Deleting a File or Directory

  * Copying a File or Directory
    
    Throws IOException

  * Moving a File or Directory
    
    Throws IOException

+ **Item 3**: Read and change file and directory attributes.

  * Managing Metadata (File and File Store Attributes)
    
    
    * BasicFileAttributes bs=Files.readAttributes(Path,BasicFileAttributes.class);
    * BasicFileAttributeView= Files.getFileAttributeView(Path,BasicFileAttributeView.class)
    

    * Lectura de Attribute
      Files.getAttribute(Path,"size");
      Map<String,Objec>f= Files.readAttributes(Path,"*")   
 
* **Item 4**: Recursively access a directory tree.

  * Walking the File Tree

+  **Item 5**: Find a file by using the PathMatcher class.

  * Finding Files

  * What is a Glob?

+  **Item 6**: Watch a directory for changes by using WatchService.

  * Watching a Directory for Changes

## Checked Exceptions

+ IOException

  * java.nio.file.FileSystemException
  
    * AccessDeniedException
    * AtomicMoveNotSupportedException
    * DirectoryNotEmptyException
    * FileAlreadyExistsException
    * FileSystemLoopException
    * NoSuchFileException
    * NotDirectoryException
    * NotLinkException
  
  * InterruptedIOException
  
  * ProtocolException
 
  *  EOFException
 
  *  SocketException

## RuntimeExceptions

+ IllegalArgumentException
+ SecurityException
