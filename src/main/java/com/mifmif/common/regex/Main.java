/*
 * Copyright 2014 y.mifrah
 *

 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mifmif.common.regex;

import java.io.*;
import regex.GenerexIterator;


public class Main
{
	public static void main(String[] args)
	{	
	    try
	    {
			FileInputStream in = new FileInputStream(args[0]);
			FileOutputStream ou = new FileOutputStream(args[1],true);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));

	    	
	    	
	    	while (in.read()!=0)
	    	{

	    		String ip = br.readLine();
	    		System.out.println(ip);

	    		Generex generex = new Generex(ip);
	    		
	    		// Using Generex iterator
	    		GenerexIterator iterator = (GenerexIterator) generex.iterator();
	    		
	    		//Printing output with desired formatting.		
	    		int i=0;
	    		while(iterator.hasNext())
	    		{
	    			String op = iterator.next();
	    			System.out.println(op);
	    			byte b[] = op.getBytes();
	    			ou.write(b);
	    			ou.write("\n".getBytes());
	    		}
	    	}
	    	if (in != null)
	    	{
	    		in.close();
	    	}
	    	if (ou != null)
	    	{
	    		ou.close();
	    	}
	    }
	    catch(IOException e)
	    {
	    	System.err.println("asd");
	    }
	}
}
