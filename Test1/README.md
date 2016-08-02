A program ends when all no-daemon threads end.

Remember that if the number of pattern letters is 4 or more, the full form is used; otherwise a short or abbreviated form is used if available. For parsing, both forms are accepted, independent of the number of pattern letters.
Similarly, if you use MMMM, it will produce the full text month name.

Remember java.io.IOException

Ojo case null

java.nio.file.StandardOpenOption: 
APPEND If the file is opened for WRITE access then bytes will be written to the end of the file rather than the beginning.
CREATE Create a new file if it does not exist.
CREATE_NEW Create a new file, failing if the file already exists.
DELETE_ON_CLOSE Delete on close.
DSYNC Requires that every update to the file's content be written synchronously to the underlying storage device.
READ Open for read access
SPARSE Sparse file. 
SYNC Requires that every update to the file's content or metadata be written synchronously to the underlying storage device. 
TRUNCATE_EXISTING If the file already exists and it is opened for WRITE access, then its length is truncated to 0.
WRITE Open for write access.

If you change it to glob:*.{pdf,rtf}, it will match any file that ends with .pdf or .rtf, in which case expensesrtf will not match. If you use glob:*{pdf,rtf}, it will match all four names given in the question.

This is same as option 3. The WRITE option is redundant in this case because the file already exists. Had the file not been present, it would have thrown java.nio.file.NoSuchFileException.

1. It allows you to tokenize a string based on the delimiters that you provide. If you don't provide any delimiters, a default set of delimiters will be used, which are " \t\n\r\f".  2. It has three constructors - StringTokenizer(String str): Default delimiters, delimiters not returned as tokens StringTokenizer(String str, String delim): custom delimiters, delimiters not returned as tokens. StringTokenizer(String str, String delim, boolean returnDelims): custom delimiters, delimiters returned as tokens if returnDelims is true.  The basic usage of this class is as follows:      StringTokenizer st = new StringTokenizer("this is a test");      while (st.hasMoreTokens()) {          System.out.println(st.nextToken());      }  3. Remember that the delimiter string itself doesn't act as a delimiter but each character in the delim String acts as a delimiter. So StringTokenizer("abcde", "bd") will return a, c, and e and not abcde because b and d both act as delimiter


1. Since the argument to resolve starts with \\, the result will be the same as the argument. If the argument doesn't start with a \ and it doesn't start with a root such as c:, the output is the result on appending the argument to the path on which the method is invoked..

Data Access Object pattern abstracts the data storage and provides a uniform way to access the data. This is very useful in situations when the data storage may change like from file-based to LDAP to relational database and so forth.



http://www.oracle.com/us/technologies/java/locale-140624.html

What will the following code snippet print when run using the command line arguments: \s[\d]*\s   "12 3abc ab23"  (There are only single spaces in the second argument.)

(Assume that there are no errors in the code.)





   Pattern p = Pattern.compile(args[0]);

   Matcher m = p.matcher(args[1]);

   boolean b = false;

   while(b = m.find())

   {

       System.out.println(m.start()+" "+m.group());

   }

Deque is an important class for the exam. To answer the questions, you must remember that a Deque can act as a Queue as well as a Stack. Based on this fact, you can deduce the following:
 pollFirst()/pollLast() - poll is a Queue method. Therefore pollFirst and pollLast will remove elements from the front and from the end respectively. offerFirst(e)/offerLast(e) - offer is a Queue method. Therefore offerFirst and offerLast will add elements to the front and to the end respectively. addFirst(e)/addLast(e) - add is a Queue method. Therefore addFirst and addLast will add elements to the front and to the end respectively. 

https://docs.oracle.com/javase/7/docs/technotes/guides/collections/reference.html


Since there is no string of length 2 in sa, nothing in sa matches the string "cc". So the return value has to be negative. Further, if the value "cc" were to be inserted in sa, it would have to be inserted after "d" i.e. at index 1. Thus, the return value will be -(index+1) = -2.


1. The general syntax is %[arg_index$][flags][width][.precision]conversion char Argument numbering starts with 1 (not 0). So to print the first argument, you should use 1$ (if you are using explicit ordering).  2. A format specification must start with a % and end with a conversion char ( b boolean, c char,  d integer, f floating point, and s string). Anything before a % and after the conversion character is printed as it is. For example, printf("xxx%1$dyyy%2$dzzz", 10, 20) will be print xxx10yyy20zzz. Arg-index, flags, width, and .precision are all optional.  3. You need to remember the following flags:     a. "-" Left justify this argument - Must specify width as well.     b. "+" Include a sign (+ or -) with this argument - Applicable only if conversion char is d or f (i.e. for numbers).     c. "0" Pad this argument with zeroes  - Applicable only if conversion char is d or f (i.e. for numbers). Must specify width as well.     d. "," Use locale-specific grouping separators (i.e., the comma in 123,456)  - Applicable only if conversion char is d or f (i.e. for numbers).     e. "(" Enclose negative numbers in parentheses  - Applicable only if conversion char is d or f (i.e. for numbers).
