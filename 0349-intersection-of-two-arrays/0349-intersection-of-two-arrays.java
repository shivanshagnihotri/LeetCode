class Solution 
{
    public int[] intersection(int[] nums1, int[] nums2)
    {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> intersect=new HashSet<>();
        for(Integer i:nums1)
        {
            set.add(i);
        }
        for(Integer i:nums2)
        {
            if(set.contains(i))
            {
                intersect.add(i);
            }
        }
        int size=intersect.size();
        int result[]=new int[size];
        int index=0;
        for(Integer i:intersect)
        {
            result[index++]=i;
        }
         return result;
    }
}