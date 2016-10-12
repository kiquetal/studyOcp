## Operate on file and directory paths with the Path class
    java.nio.file.Paths
    
    ` public static Path get(String) `
    java.nio.file.FileSystem  ` `
    java.io.File `public Path toPath`
    
    A path can refer to a NON existing file or directory.
    
    File f=new File("Hello.txt");
    Path p=f.toPath();
### Code Examples

[Path Components] (PathExamples.java)
    

### Annotations

    subPath().getNameCount().getName() don' t include root.
    
    Path.toAbsolutePath()
    
    Path are inmutables.
    
### Comments

    ATOMIC_MOVE
    COPY_ATTRIBUTES
    REPLACE_EXISTING
Resolving path using method resolve and resolveSibling


Resolve is utilize for joing path

Relativie construct a path between two Paths objects.

It cannot be using with only one component who has the
root component. IllegalArgumentException

## Check,delete copy or move a file or directory with the File class

    public static path createFile(Path,FileAttributes) IOException
        throws is file AlreadyExists or the Parent doesnt exists
    public static path createDirectory(Path,FileAttributes)IOException
        throws is the parent doenst exists or directory already exists or if there a file
    publiuc static path createDirectories(Path,FileAttributes)IOException
        throws is the directory already exists but is not a directory
    
### Annotations

    FileAttributes
    
    
### Copy

    public static long copy(InputStream,Path,CopyOption)
    public static long copy(Path,OutputStream,CopyOption)
    public static Path copy(Path,Path,CopyOption) IOException
    
    throws FileAreadyExistsException if FileExists
    
    Can copy only files not direcotires.
    Doesn't allow you to append data on an existing file.create new
    or replace
    
### Move
    
    public static Path move(Path,Path) throws IOException
    
    can only move empty directories 
    
### Delete
    
    public static void delete(Path) throws IOException
    If directory is not empty.
    public static boolean deleteIfExists(Path)
    Does not throw if directory IS not Empty.
    

## Files and Directoy Attribute

    Interfaces to read and modify attribute sets.
    Methods
    
        Files.readAttributes(Path,string,LinkOption...) throws IOException
        PosixFileAttributeView view=Files.getFileAtributerView(path,PosixFileAttributeView.class)
        PosixFileAttribute attribute=view.readAttributes();
        
        PosixFileAttribute attr=Files.readAttributes(path,PosixFileAttributes.class)
        
        
#### BasicFileAttributes
    creationTime()
    lastModifiedTime()
    lastAccessTime()
    isRegularFile()
    isSymbolicLink()
    isDirectory()
    isOther()
    isSize()
#### DosFileAttributes

    isArchive();
    isHidden();
    isReadOnly();
    isSystem()
    
#### PosixFileAtributes

    group()
    owner()
    permissions()

#### Views

##### BasicFileAttributeView
    readAttributes()
    setTimes(FileTime,FileTime,FileTime)

##### DosFileAttributeView
    readAttributes()
    setArchive(boolean)
    setHidden(boolean)
    setReadOnly(boolean)
    setSystem(boolean)

##### PosixFileAttributeView
    readAttributes()
    setGroup(GroupPrincipal)
    setPermissions(Set<PosixFilePermissions>)
    
##### AclFileAttributeView
    getAcl()
    setAcl(List<AclEntry>)
    
##### FileOwnerAttributeView
    getOwner()
    setOwner(userPrincipal)
    
##### UserDefinedFileAttributeView
    delete
    list
    read
    size
    write
## Recursively access a directory tree

### Methods

#### FileVisitResult postVisitDirectory(T dir, IOExceptionex)
    
    Invoked for a directory after entries in the directory,
    and all of their descendants,have been visited
    
#### FileVisitResult preVisitDirectory(T dir,BasicFileAttributes attrs)

    Invoked for a directory before entries  in the directory are 
    visited
    
#### FileVisitResult visitFile(T file,BasicFileAttributes )

    Invoked for a file in a directory
    
#### FileVistResult visitFileFailed(T file,IOExcpetion ex)

    Invoked for a file that could not be visited.
    
##### ENUMS

    CONTINUE
    SKIP_SIBLING
    SKIP_SUBTREE
    TERMINATE
    
## Find a file with the PathMatcher Interface

public abstract PathMatcher getPathMatcher(syntaxAndPattern)


## Watch directory for changes by using the WathService Interface

 FileSystesm.getDefault().newWatchService)IOException
 ()
### CONSTANTS

    ENTRY_DELETE
    ENTRY_CREATE
    ENTRY_MODIFY
    OVERFLOW
    
    
