# Remember

## Conversion

    %f float
    %d integer
    %s string
    %% 

## Format
 
    %1$+20.4f
    %<.3f

## SimpledDateFormat
    
    G ========= Era designator
    y ========= Year
    Y ========= Week year
    M ========= month in year
    w ========= week in year
    W ========= week in month
    D ========= Day in year
    d ========= day in month
    F ========= Day of week in month
    E ========= Day name in week
    u ========= Day number week
    a ========= am/pm
    H ========= hour in day
    k ========= hour in day
    K ========= hour in am/pm
    h ========= hour in am/pm
    m ========= minute in hour
    s ========= second in minut
    S ========= millicon
    z ========= TimeZone
    Z ========= TimeZone
    X ========= TimeZone
    
## Examples from officialDocs

    "yyyy.MM.dd G 'at' HH:mm:ss z"	2001.07.04 AD at 12:08:56 PDT
    
    "EEE, MMM d, ''yy"	Wed, Jul 4, '01
    "h:mm a"	12:08 PM
    "hh 'o''clock' a, zzzz"	12 o'clock PM, Pacific Daylight Time
    "K:mm a, z"	0:08 PM, PDT
    "yyyyy.MMMMM.dd GGG hh:mm aaa"	02001.July.04 AD 12:08 PM
    "EEE, d MMM yyyy HH:mm:ss Z"	Wed, 4 Jul 2001 12:08:56 -0700
    "yyMMddHHmmssZ"	010704120856-0700
    "yyyy-MM-dd'T'HH:mm:ss.SSSZ"	2001-07-04T12:08:56.235-0700
    "yyyy-MM-dd'T'HH:mm:ss.SSSXXX"	2001-07-04T12:08:56.235-07:00
    "YYYY-'W'ww-u"	2001-W27-3
