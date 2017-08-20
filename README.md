Generex
=======
A Java library for generating String that match  a given regular expression. it help you generate all Strings that matches a given Regex, random one , or one String from the matched String based on it's index.
Generex is based on the library http://www.brics.dk/~amoeller/automaton/.

[![Build Status](https://travis-ci.org/mifmif/Generex.png)](https://travis-ci.org/mifmif/Generex)


**Features :**
-

-Generate Random String that match the Regex.

-Specify the min/max length  of the random generated String.

-Generate a list of all Strings that matches the Regex, if the number of String that matches the Regex is greater then Integer.MAX_VALUE , the returned list will contains Strings up to the size limit of java.util.List which is Integer.MAX_VALUE (see iterator's feature in this case). 

-generate a sublist of the Strings that matches the Regex based on the lexicographical order.

-Given an index 'n' , generate the n'th element in lexicographical order of the list of Strings that matches the Regex.

-Prepare an iterator that loop over all the Strings that matches the Regex. even if the set of String that matches the given Regex is infinite.
 

**How to use it :**
-

If you use [Maven](http://maven.apache.org) you can include this library to your project by adding the following dependency: 
```xml
<dependency>
  <groupId>com.github.mifmif</groupId>
  <artifactId>generex</artifactId>
  <version>1.0.2</version>
</dependency>
```

The list of all available versions can be found at [Maven Central](http://search.maven.org/#browse|588844112).

**License**
-

Generex is licensed under the Apache License, Version 2.0.  
http://www.apache.org/licenses/LICENSE-2.0


 
