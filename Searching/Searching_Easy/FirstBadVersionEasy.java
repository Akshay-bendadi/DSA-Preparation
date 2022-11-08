package Searching;
// The isBadVersion API is defined in the parent c
//      class lass VersionControl.
//      boolean isBadVersion(int version);

public class FirstBadVersionEasy {
        public int firstBadVersion(int n) {
            int start = 1;
            int end = n;
            while(start < end)
            {
                int mid = start + (end - start) / 2;
                if(isBadVersion(mid)){
                    end=mid;
                }
                else{
                    start=mid+1;
                }
            }
            return start;
        }

}
