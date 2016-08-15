# Files and directory attributes
## Read and change file and directory attributes, focusing on the BasicFileAttributes,DosFilesAttributes, and PosixFileAttributes interafaces
    
    ### Method to Modify Path
       . public static Path setAttribute(Path, String,Object,LinkOption...)
        . public static Path setLastModifiedTime(Path,FileTime)
        . public static Path setOwner(Path,UserPrincipal)
        
## Group of attributes

    Files.getAttributeViews() or Files.readAttributes()
    Map<String,Object> m=Files.readAttributes(Path,string,LinkOption...)
    <A extends BasicFileAttributes> m=Files.readAttributes(Path,Class<A>,LinkOption...)
    Path =Files.setAttribute(Path,String,Objet,LinkOption)
    
    ### DosFileAttributes
    
# Recursive access a directory tree
## Reursively access a directory tree using the DirectoryStream and FileVisitor interfaces

### Breadth-firsh search and Depth search

     In breadth-first search algorithm, all the directories and files on the first level are accesseded before moving on to the members on the next level,and so on
     until no more are remaining.
     In depth-first search a direct subdirectory of the main directory is accessed recursively before moving forward with searching the next directory.
     
     
### Directory Stream

    You can use an Iterator or for-each construct to interate over a directory.
    Implements AutoCloseable
    Files.newDirectoryStream(Path,String glob) throw IOException
    
    
# Using PathMatcher
## Find a file with the PathMatcher interface.
 
    boolean matches(Path path)
    
    FileSystem.getPathMatcher(String syntaxAndPattern)
    ex.
    PathMatcher pm=FileSystems.getDefault().getPathMatcher("glob:*.{java}");
    pm.matches(Path p)
    
# Watch a Directory for changes
## Watch a directory for changes by using WatchServices interfaces

    WatchService w=FileSystems.getDefault().newWatchServices()
    
    ### Events
        .StandardWatchEventKinds.ENTRY_CREATE
        Created,modified or renamed
        .StandardWatchEventKinds.ENTRY_DELETE
        Deleted,moved,or renamed
        .StandardWatchEventKinds.ENTRY_MODIFY
        .StandardWatchEventKinds.ENTRY_OVERFLOW
        
