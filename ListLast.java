//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListLast
{
	public static boolean go( List<Integer> ray)
	{
	int test=ray.get(ray.size()-1);
    for(int i=0; i<ray.size();i++){
      if(ray.get(i)==test){
        return true;
      }
    }
    return false;
	}
}
