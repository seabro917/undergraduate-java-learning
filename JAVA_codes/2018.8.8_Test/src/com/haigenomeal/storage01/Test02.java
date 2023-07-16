
package com.haigenomeal.storage01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Test02 {

	public static void main(String[] args) {
		ArrayList<HashMap> list = new ArrayList<HashMap>();
		
		HashMap map1 = new HashMap(); 
		HashMap map2 = new HashMap(); 
		HashMap map3 = new HashMap(); 
		
		map1.put("name","02");
		map1.put("age","19");
		map1.put("OppaiSize","36C");
		map1.put("Origin","是的我就是她的darling.jpg");
		
		map2.put("name","潮留美海");
		map2.put("age","15");
		map2.put("OppaiSize","36A");
		map2.put("Origin","小学生赛高！");
		
		map3.put("name","椎名真白");
		map3.put("age","18");
		map3.put("OppaiSize","36A");
		map3.put("Origin","别看了这个就是我前妻");
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		
		Iterator itr = list.iterator();
//		System.out.println("让我看看今天谁又成为了我的老婆。");
		while(itr.hasNext())
		{
			System.out.println(((HashMap)(itr.next())).get("Origin"));
		}
		
		
	}
}
