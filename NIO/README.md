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

    Move will fail if the targetDirectory is NOT empty even if the flas StandardOption.REPLACE_EXISTING was definied 
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
    
    * The FileVisitor methods return a FileVisitResult value. You can abort the file walking process or control whether a directory is visited by the values you return in the FileVisitor methods:

     CONTINUE – Indicates that the file walking should continue. If the preVisitDirectory method returns CONTINUE, the directory is visited.


     TERMINATE – Immediately aborts the file walking. No further file walking methods are invoked after this value is returned.


     SKIP_SUBTREE – When preVisitDirectory returns this value, the specified directory and its subdirectories are skipped. This branch is "pruned out" of the tree.


     SKIP_SIBLINGS – When preVisitDirectory returns this value, the specified directory is not visited, postVisitDirectory is not invoked, and no further unvisited siblings are visited. If returned from the postVisitDirectory method, no further siblings are visited. Essentially, nothing further happens in the specified directory.

     Files.walkFileTree(Path,FileVisitor) Throws IOException
	   
     Methods
     
     postVisitResult(T dir, IOException)


     preVisitResult(T dir, BasicFileAttributes)

     visitFile(T dir, BasicFileAttributes)

     visitFileFiled(T file, IOException)

+  **Item 5**: Find a file by using the PathMatcher class.

  * Finding Files
    boolean matches(Path p)
    FileSystems.getPathMatcher()
    "syntax:pattern"
    
  * What is a Glob?

+  **Item 6**: Watch a directory for changes by using WatchService.

  * Watching a Directory for Changes

  StandardWatchEventKinds.ENTRY_CREATE
  WHEN A FILE/DIRECTORY created,moved,renamed

  StandardWatchEventKinds.ENTRY_DELETE
  WHEN A FILE/DIRECTORY deleted,moved or renamde

  StandardWatchEventKinds.ENTRY_MODIFY
  Platform dependent.

  StandardWatchEventKinds.OVERFLOW

  WatchServices watcher=FileSystems.getDefaul().newWatchServices();
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
